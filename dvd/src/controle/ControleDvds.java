/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.ModeloDvds;

/**
 *
 * @author Delfino
 */
public class ControleDvds {
    
    ConectaBanco conex = new ConectaBanco();
    
    
    public void salvar (ModeloDvds mod){
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.conn.prepareStatement("insert into dvds (titulo,quantidade,tipo)values(?,?,?)");
            
            pst.setString(1, mod.getTitulo());
            pst.setInt(2, mod.getQuantidade());
            pst.setString(3, mod.getTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
        } catch (SQLException ex) {
            
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        }
        conex.desconecta();
    }
    
     public void Alterar(ModeloDvds mod){
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.conn.prepareStatement("update  dvds set titulo=?,quantidade=?,tipo=? where id_dvd = ?");
            
            pst.setString(1, mod.getTitulo());
            pst.setInt(2, mod.getQuantidade());
            pst.setString(3, mod.getTipo());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            
            
            JOptionPane.showMessageDialog(null, "Erro ao alterar!"+ex);
        }
        conex.desconecta();
    }
     
      public void Excluir (ModeloDvds mod){
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.conn.prepareStatement("delete from dvds  where id_dvd =?");
            
            pst.setInt(1, mod.getCodigo());            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Excluidos!");
        } catch (SQLException ex) {
            
            
            JOptionPane.showMessageDialog(null, "Erro ao excluir!"+ex);
        }
        conex.desconecta();
    }
      
      public ModeloDvds Primeiro(){
          ModeloDvds mod = new ModeloDvds();
          
          conex.conexao();
          
          conex.execultasql("select * from dvds");
        try {
            conex.rs.first();
            
            mod.setCodigo(conex.rs.getInt("id_dvd"));
            mod.setTitulo(conex.rs.getString("titulo"));
            mod.setQuantidade(conex.rs.getInt("quantidade"));
            mod.setTipo(conex.rs.getString("tipo"));
           // mod.setImg(conex.rs.getString("img"));
            
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Clique no botão proximo !");
        }
        conex.desconecta();
          return mod;
      }
      public ModeloDvds Ultimo(){
          ModeloDvds mod = new ModeloDvds();
          
          conex.conexao();
          
          conex.execultasql("select * from dvds");
        try {
            conex.rs.last();
            
            mod.setCodigo(conex.rs.getInt("id_dvd"));
            mod.setTitulo(conex.rs.getString("titulo"));
            mod.setQuantidade(conex.rs.getInt("quantidade"));
            mod.setTipo(conex.rs.getString("tipo"));
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Clique no botão anterior !");
        }
        conex.desconecta();
          return mod;
      }
      
      public ModeloDvds Anterior(){
          ModeloDvds mod = new ModeloDvds();
          
          
          
          conex.execultasql("select * from dvds");
        try {
            conex.rs.previous();
            
            mod.setCodigo(conex.rs.getInt("id_dvd"));
            mod.setTitulo(conex.rs.getString("titulo"));
            mod.setQuantidade(conex.rs.getInt("quantidade"));
            mod.setTipo(conex.rs.getString("tipo"));
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Clique no botão proximo !");
        }
       
          return mod;
      }
      public ModeloDvds Proximo(){
          ModeloDvds mod = new ModeloDvds();
          
          
          
          conex.execultasql("select * from dvds");
        try {
            conex.rs.next();
            
            mod.setCodigo(conex.rs.getInt("id_dvd"));
            mod.setTitulo(conex.rs.getString("titulo"));
            mod.setQuantidade(conex.rs.getInt("quantidade"));
            mod.setTipo(conex.rs.getString("tipo"));
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Clique no botão anterior !");
        }
        
          return mod;
      }
} 

