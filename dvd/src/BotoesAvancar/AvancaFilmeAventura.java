/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BotoesAvancar;

import controle.ConectaBanco;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import modelo.ModeloDvds;

/**
 *
 * @author Eduardo
 */
public class AvancaFilmeAventura {
    
    ConectaBanco conex=new ConectaBanco();
    
    
     public ModeloDvds Primeiro(){
          ModeloDvds mod = new ModeloDvds();
          conex.conexao();
          
          conex.execultasql("select id_dvd from dvds where tipo='Aventura'");
        try {
            conex.rs.first();
           mod.setCodigo(conex.rs.getInt("id_dvd"));
            
           // mod.setImg(conex.rs.getString("img"));
            
           
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao buscar o primeiro!"+ ex);
        }
        conex.desconecta();
          return mod;
      }
     
     
     public ModeloDvds Ultimo(){
          ModeloDvds mod = new ModeloDvds();
          conex.conexao();
          
          conex.execultasql("select id_dvd from dvds where tipo='Aventura'");
        try {
            conex.rs.last();
           mod.setCodigo(conex.rs.getInt("id_dvd"));
           
           // mod.setImg(conex.rs.getString("img"));
            
           
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao buscar o Ultimo!"+ ex);
        }
        conex.desconecta();
          return mod;
      }
     
     
      
      
       public ModeloDvds Anterior(){
          ModeloDvds mod = new ModeloDvds();
          conex.conexao();
          
           conex.execultasql("select id_dvd from dvds where tipo='Aventura'");
        try {
            conex.rs.previous();
           mod.setCodigo(conex.rs.getInt("id_dvd"));
           
           // mod.setImg(conex.rs.getString("img"));
            
           
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao buscar o Anterior!"+ ex);
        }
       // conex.desconecta();
          return mod;
      }
       
       
       
       public ModeloDvds Proximo(){
          ModeloDvds mod = new ModeloDvds();
          conex.conexao();
          
          conex.execultasql("select id_dvd from dvds where tipo='Aventura'");
        try {
            conex.rs.next();
           mod.setCodigo(conex.rs.getInt("id_dvd"));
            
           // mod.setImg(conex.rs.getString("img"));
            
           
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao buscar o proximo!"+ ex);
        }
       // conex.desconecta();
          return mod;
          
          
          
          
          
          
      }
       
        
    
}
