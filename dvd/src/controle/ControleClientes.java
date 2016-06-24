/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ModeloClientes;

/**
 *
 * @author Delfino
 */
public class ControleClientes {
    ConectaBanco conex = new ConectaBanco();
     public void Salvar(ModeloClientes mod){
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.conn.prepareStatement("insert into clientes (nome_cl,cpf_cl,tel_cl,end_cl,bairro_cl) values(?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCpf());
            pst.setString(3, mod.getTelefone());
            pst.setString(4, mod.getEndereco());
            pst.setString(5, mod.getBairro());
            pst.execute();
             JOptionPane.showMessageDialog(null,"Dados salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao salvar!"+ ex);
        }
        
        conex.desconecta();
    }
     
      public void Alterar(ModeloClientes mod){
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.conn.prepareStatement("update  clientes set nome_cl=?,cpf_cl=?,tel_cl=?,end_cl=?,bairro_cl=? where id_cli=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCpf());
            pst.setString(3, mod.getTelefone());
            pst.setString(4, mod.getEndereco());
            pst.setString(5, mod.getBairro());
            pst.setInt(6, mod.getCodigo());
            pst.execute();
             JOptionPane.showMessageDialog(null,"Dados alterados com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro na alteração!"+ ex);
        }
        
        conex.desconecta();
    }
      
      public void Excluir(ModeloClientes mod){
        conex.conexao();
            try {
                //JOptionPane.showMessageDialog(null,mod.getCod());
                PreparedStatement pst = conex.conn.prepareStatement("delete from clientes where id_cli=?");
                pst.setInt(1, mod.getCodigo());
                pst.execute(); 
                 
                 JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na exclusão dos dados!");
            }                        
      conex.desconecta();
}
      
      public ModeloClientes Primeiro(){
          ModeloClientes mod = new ModeloClientes();
          conex.conexao();
          
          conex.execultasql("select * from clientes");
        try {
            conex.rs.first();
            
            mod.setCodigo(conex.rs.getInt("id_cli"));
            mod.setNome(conex.rs.getString("nome_cl"));
            mod.setCpf(conex.rs.getString("cpf_cl"));
            mod.setTelefone(conex.rs.getString("tel_cl"));
            mod.setEndereco(conex.rs.getString("end_cl"));
            mod.setBairro(conex.rs.getString("bairro_cl"));
           
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao buscar o primeiro!"+ ex);
        }
        conex.desconecta();
          return mod;
      }
       public ModeloClientes Ultimo(){
          ModeloClientes mod = new ModeloClientes();
          conex.conexao();
          
          conex.execultasql("select * from clientes");
        try {
            conex.rs.last();
            
            mod.setCodigo(conex.rs.getInt("id_cli"));
            mod.setNome(conex.rs.getString("nome_cl"));
            mod.setCpf(conex.rs.getString("cpf_cl"));
            mod.setTelefone(conex.rs.getString("tel_cl"));
            mod.setEndereco(conex.rs.getString("end_cl"));
            mod.setBairro(conex.rs.getString("bairro_cl"));
           
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao buscar o ultimo!"+ ex);
        }
        conex.desconecta();
          return mod;
      }
       
       public ModeloClientes Anterior(){
          ModeloClientes mod = new ModeloClientes();
          
          
          conex.execultasql("select * from clientes");
        try {
            conex.rs.previous();
            
            mod.setCodigo(conex.rs.getInt("id_cli"));
            mod.setNome(conex.rs.getString("nome_cl"));
            mod.setCpf(conex.rs.getString("cpf_cl"));
            mod.setTelefone(conex.rs.getString("tel_cl"));
            mod.setEndereco(conex.rs.getString("end_cl"));
            mod.setBairro(conex.rs.getString("bairro_cl"));
           
           
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"erro ao buscar o ultimo!"+ ex);
        }
        
          return mod;
      }
       
        public ModeloClientes Proximo(){
          ModeloClientes mod = new ModeloClientes();
          
          
          conex.execultasql("select * from clientes");
        try {
            conex.rs.next();
            
            mod.setCodigo(conex.rs.getInt("id_cli"));
            mod.setNome(conex.rs.getString("nome_cl"));
            mod.setCpf(conex.rs.getString("cpf_cl"));
            mod.setTelefone(conex.rs.getString("tel_cl"));
            mod.setEndereco(conex.rs.getString("end_cl"));
            mod.setBairro(conex.rs.getString("bairro_cl"));
           
           
        } catch (SQLException ex) {
           // JOptionPane.showMessageDialog(null,"erro ao buscar o ultimo!"+ ex);
        }
        
          return mod;
      }
    
}
