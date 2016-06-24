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
import modelo.ModeloLocadora;

/**
 *
 * @author Delfino
 */
public class ControleLocadora {
    
    int codProd, codCliente;
    ConectaBanco conex=new ConectaBanco();
     
    public void Salvar(ModeloLocadora mod){
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.conn.prepareStatement("insert into locadora(data_ini,data_devol,preco,id_cli,nome_cl)values(?,?,?,?,?)");
            
          
            pst.setString(1, mod.getDataInicio());
            pst.setString(2, mod.getDataDevol());
           // pst.setString(3, mod.getTipoPag());
            pst.setFloat(3, mod.getPreco());
            pst.setInt(4, mod.getCoCl());
            pst.setString(5,mod.getNomeCl());
            //pst.setString(7,mod.getFime());
              
           
           // pst.setString(6,mod.getNomeCl());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados salvos com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao salvar"+ ex);
        }
        
        conex.desconecta();
    }

    
    public void AdicionaFilmes(ModeloLocadora mod){
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.conn.prepareStatement("insert into loca_dvd (id_loca,id_dvd,preco_loca,tipo_pagl)values(?,?,?,?)");
           
            pst.setInt(1,mod.getCodLoca());
            pst.setInt(2,mod.getCodDvd());
            //pst.setInt(3,mod.getQuantidade());
            pst.setFloat(3,mod.getPreco());
            pst.setString(4,mod.getTipoPag());
            
            pst.execute();
            
          //  JOptionPane.showMessageDialog(null,"Adicionddo");
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao Adicionar os DVDS "+ ex);
        }
        conex.desconecta();
        
    }
    
    public void FechaLoca(ModeloLocadora mod){
    //AchaCliente(mod.getNomeCliente());
    conex.conexao();
        try {
            PreparedStatement pst =conex.conn.prepareStatement("update locadora set data_ini=?,data_devol=?,preco=?,id_cli=?,nome_cl=? where id_loca=?");
          
            pst.setString(1, mod.getDataInicio());
            pst.setString(2, mod.getDataDevol());
           // pst.setString(3, mod.getTipoPag());
            pst.setFloat(3, mod.getPreco());
            pst.setInt(4, mod.getCoCl());
            pst.setString(5, mod.getNomeCl());           
            pst.setInt(6, mod.getCodLoca());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Locação finalizada:");
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao fechar a venda:" +ex);
        }
    conex.desconecta();
    
    
   }
    
    public void Baixa(ModeloLocadora mod){
        
        
        
        conex.conexao();
         
         try {
             
             
         // conex.execultasql("select * from locadora where id_loca="+mod.getCodLoca()+" and tipo_pg ='PG e Retorno'");
          conex.execultasql("select locadora.id_loca,nome_cl,data_ini,data_devol,preco,loca_dvd.tipo_pagl,id_cli,loca_dvd.id_dvd from  locadora,loca_dvd  where loca_dvd.id_dvd=="+mod.getCodDvd()+" and loca_dvd.tipo_pgl ='PG e Retorno'");    
             
         
          // PreparedStatement pst = conex.conn.prepareStatement("Update locadora set tipo_pag = ? where id_loca=?");
          
          PreparedStatement pst = conex.conn.prepareStatement("Update loca_dvd set tipo_pagl = ? where id_dvd=?");
          pst.setString(1,"PG e Retorno");
          // pst.setInt(2,mod.getCodLoca());
           pst.setInt(2,mod.getCodDvd()); 
           pst.execute();
            
            JOptionPane.showMessageDialog(null,"Locação paga !");
            
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Erro ao dar Baixa na Locação!\nErro:"+ ex);
       }
         
         
    }
    
    
    
}  
        
        
        
        
    



  
        
  
    

