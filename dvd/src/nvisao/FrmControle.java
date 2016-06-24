/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nvisao;

import controle.ConectaBanco;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import modelo.ModeloTabela;

/**
 *
 * @author Eduardo
 */
public class FrmControle extends javax.swing.JFrame {

    ConectaBanco conex = new ConectaBanco();
    int i=1;
    public FrmControle() {
        initComponents();
        
        URL url = this.getClass().getResource("/Imagens/dvd.png");  //coloca a imagem no lugar da tigela java
          Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);  
            this.setIconImage(imagemTitulo);
        //preencherTabela1("select * from locadora");
       // preencherTabela1("select locadora.id_loca,data_ini,data_devol,tipo_pag,preco,loca_dvd.id_dvd,dvds.titulo from locadora,loca_dvd , dvds where loca_dvd.id_loca=locadora.id_loca and dvds.id_dvd=loca_dvd.id_dvd ");
       preencherTabela1("select locadora.id_loca,data_ini,data_devol,loca_dvd.tipo_pagl,preco,loca_dvd.id_dvd,dvds.titulo from locadora,loca_dvd , dvds where loca_dvd.id_loca=locadora.id_loca and dvds.id_dvd=loca_dvd.id_dvd ");
        
//preencherTabelaTotal("select sum(preco)as preco from locadora" );
        preencherTabelaTotal("select sum(preco_loca)as preco_loca from loca_dvd");
        
        
         ////////////////////////////////////////////////////////////////////////////////    
        //faz os botões serem acionados com a tecla enter
    AbstractAction action = new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
        JButton button = (JButton) e.getSource();
        button.doClick();        
        } else if(e.getSource() instanceof JComponent){
            JComponent component = (JComponent) e.getSource();
            component.transferFocus();
        }
    }
    };
    jButton1.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButton1.getActionMap().put("DoClick", action);
    jButton2.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButton2.getActionMap().put("DoClick", action);
    jButton3.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButton3.getActionMap().put("DoClick", action);      
    jButton4.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButton4.getActionMap().put("DoClick", action);    
       // getRootPane().setDefaultButton(jButton8);//botão sair com enter
  ///////////////////////////////////////////////////////////////////////////////////////////////  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableP = new javax.swing.JTable();
        jTextFieldTipoP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de locações");

        jDesktopPane1.setBackground(new java.awt.Color(204, 153, 0));

        tableP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tableP.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        tableP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableP.setRowHeight(30);
        tableP.setRowMargin(15);
        tableP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableP);

        jButton1.setText("Devedores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "                 R$", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable2.setRowHeight(40);
        jScrollPane2.setViewportView(jTable2);

        jButton4.setText("Excluir codigo");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dvd.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton4)
                .addGap(198, 198, 198)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jTextFieldTipoP, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)
                        .addGap(166, 166, 166)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(115, 115, 115))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTipoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(32, 32, 32))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextFieldTipoP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       // preencherTabela1("select * from locadora where tipo_pag like '%"+jTextFieldTipoP.getText()+"%'");
        if(jTextFieldTipoP.getText().equals("")){
          JOptionPane.showMessageDialog(rootPane,"Informe: Avista,PG e retorno ou Devolução para pesquisar!");
        }else{
        preencherTabela2("select locadora.id_loca,data_ini,data_devol,loca_dvd.tipo_pagl,preco,loca_dvd.id_dvd,dvds.titulo from locadora,loca_dvd , dvds where loca_dvd.id_loca=locadora.id_loca and dvds.id_dvd=loca_dvd.id_dvd and tipo_pagl like '%"+jTextFieldTipoP.getText()+"%'");
        
        jTextFieldTipoP.setText("");
        jTextFieldTipoP.setEnabled(!true);
        jButton1.setEnabled(!true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        new FrmControle().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
     String[] options = {"Sim", "Não"};

        int resposta = JOptionPane.showOptionDialog(null, "Tem certeza que deseja Deletar todos as locações ?",
                "Confirmar",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        

        if (resposta == 1) {
        	
        	return;//Este é o Botao do NAO. Ira retornar para a Calculadora
        }
        
        if(resposta == 0){//Este é o Botao do SIM. Ira sair do seu Programa
        preencherTabela1(" delete from loca_dvd");
        preencherTabela1("delete from locadora");      
       // preencherTabela1(" select * from locadora");
        preencherTabela1("select locadora.id_loca,data_ini,data_devol,loca_dvd.tipo_pagl,preco,loca_dvd.id_dvd,dvds.titulo from locadora,loca_dvd , dvds where loca_dvd.id_loca=locadora.id_loca and dvds.id_dvd=loca_dvd.id_dvd ");
        
        
        preencherTabelaTotal("select sum(preco_loca)as preco_loca from loca_dvd");
        
        }
        JOptionPane.showMessageDialog(rootPane, "Exclusão com sucesso");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        if(jTextFieldTipoP.getText().equals("")){
          JOptionPane.showMessageDialog(rootPane,"Informe um codigo locação para exclui-lo!");
        }else{
            
            
        String[] options = {"Sim", "Não"};

        int resposta = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir o codigo de locação ?",
                "Confirmar",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        

        if (resposta == 1) {
        	
        	return;//Este é o Botao do NAO. Ira retornar para a Calculadora
        }
        
        if(resposta == 0){//Este é o Botao do SIM. Ira sair do seu Programa
       preencherTabela1("delete from loca_dvd where loca_dvd.id_loca  ='"+jTextFieldTipoP.getText()+"'");
         preencherTabela1("delete from locadora where locadora.id_loca  ='"+jTextFieldTipoP.getText()+"'"); 
        
         //preencherTabela1(" select * from locadora");
         preencherTabelaTotal("select sum(preco_loca)as preco_loca from loca_dvd");
         
          preencherTabela1("select locadora.id_loca,data_ini,data_devol,loca_dvd.tipo_pagl,preco,loca_dvd.id_dvd,dvds.titulo from locadora,loca_dvd , dvds where loca_dvd.id_loca=locadora.id_loca and dvds.id_dvd=loca_dvd.id_dvd ");
        
        }
        JOptionPane.showMessageDialog(rootPane, "Exclusão com sucesso");
        
      }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePMouseClicked
        // TODO add your handling code here:
        String codgo=""+tableP.getValueAt(tableP.getSelectedRow(),1);
        jTextFieldTipoP.setText(String.valueOf(codgo));
    }//GEN-LAST:event_tablePMouseClicked

    /**
     * @param args the command line arguments
     */
    
     public void preencherTabela1(String sql){
        ArrayList dados = new ArrayList();
        //String[] Colunas = new String[]{"Qt.","Codigo de locação ","Nome cliente","Data Locação ","Data Devolução","Preço","tipo pag","codigo cl"};
       String[] Colunas = new String[]{"Linha","locação ","Data Locação ","Data Devolução","tipo pag","Preço","cod dvd","titulo"};
    // String hora = Hora.getText();// Coloca a hora na tabela
        
        conex.conexao();
        conex.execultasql(sql);                
            try {
                conex.rs.first();
                do {
                  
                   // dados.add(new Object[]{i,conex.rs.getString("id_loca"),conex.rs.getString("nome_cl"),conex.rs.getString("data_ini"),conex.rs.getString("data_devol"),conex.rs.getString("preco"),conex.rs.getString("tipo_pag"),conex.rs.getString("id_cli")});
                dados.add(new Object[]{i,conex.rs.getString("id_loca"),conex.rs.getString("data_ini"),conex.rs.getString("data_devol"),conex.rs.getString("tipo_pagl"),conex.rs.getString("preco"),conex.rs.getString("id_dvd"),conex.rs.getString("titulo")});    
                   i++;
                   
                   
                }while(conex.rs.next());
            } catch (SQLException ex) {
               // JOptionPane.showMessageDialog(rootPane,"Erro ao preencher o ArrayList!\nErro:"+ex);
            }
       
            
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
          tableP.setModel(modelo);
          tableP.getColumnModel().getColumn(0).setPreferredWidth(40);
          tableP.getColumnModel().getColumn(0).setResizable(false);
          tableP.getColumnModel().getColumn(1).setPreferredWidth(70);
          tableP.getColumnModel().getColumn(1).setResizable(false);  
          tableP.getColumnModel().getColumn(2).setPreferredWidth(100);
          tableP.getColumnModel().getColumn(2).setResizable(false);  
          tableP.getColumnModel().getColumn(3).setPreferredWidth(80);
          tableP.getColumnModel().getColumn(3).setResizable(false);  
          tableP.getColumnModel().getColumn(4).setPreferredWidth(80);
          tableP.getColumnModel().getColumn(4).setResizable(false); 
          tableP.getColumnModel().getColumn(5).setPreferredWidth(70);
          tableP.getColumnModel().getColumn(5).setResizable(false);  
          tableP.getColumnModel().getColumn(6).setPreferredWidth(70);
          tableP.getColumnModel().getColumn(6).setResizable(false);  
          tableP.getColumnModel().getColumn(7).setPreferredWidth(150);
          tableP.getColumnModel().getColumn(7).setResizable(false); 
          //tableP.getColumnModel().getColumn(8).setPreferredWidth(90);
         // tableP.getColumnModel().getColumn(8).setResizable(false); 
          
          
          tableP.getTableHeader().setReorderingAllowed(false);
          tableP.setAutoResizeMode(tableP.AUTO_RESIZE_OFF);
          tableP.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);                                
    
       
       }
       public void preencherTabela2(String sql){
        ArrayList dados = new ArrayList();
        //String[] Colunas = new String[]{"Qt.","Codigo de locação ","Nome cliente","Data Locação ","Data Devolução","Preço","tipo pag","codigo cl"};
       String[] Colunas = new String[]{"Linha","locação ","Data Locação ","Data Devolução","tipo pag","Preço","cod dvd","titulo"};
    // String hora = Hora.getText();// Coloca a hora na tabela
        int j=1;
        conex.conexao();
        conex.execultasql(sql);                
            try {
                conex.rs.first();
                do {
                  
                   // dados.add(new Object[]{i,conex.rs.getString("id_loca"),conex.rs.getString("nome_cl"),conex.rs.getString("data_ini"),conex.rs.getString("data_devol"),conex.rs.getString("preco"),conex.rs.getString("tipo_pag"),conex.rs.getString("id_cli")});
                dados.add(new Object[]{j,conex.rs.getString("id_loca"),conex.rs.getString("data_ini"),conex.rs.getString("data_devol"),conex.rs.getString("tipo_pagl"),conex.rs.getString("preco"),conex.rs.getString("id_dvd"),conex.rs.getString("titulo")});    
                   j++;
                   
                   
                }while(conex.rs.next());
            } catch (SQLException ex) {
               // JOptionPane.showMessageDialog(rootPane,"Erro ao preencher o ArrayList!\nErro:"+ex);
            }
       
            
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
          tableP.setModel(modelo);
          tableP.getColumnModel().getColumn(0).setPreferredWidth(40);
          tableP.getColumnModel().getColumn(0).setResizable(false);
          tableP.getColumnModel().getColumn(1).setPreferredWidth(70);
          tableP.getColumnModel().getColumn(1).setResizable(false);  
          tableP.getColumnModel().getColumn(2).setPreferredWidth(100);
          tableP.getColumnModel().getColumn(2).setResizable(false);  
          tableP.getColumnModel().getColumn(3).setPreferredWidth(100);
          tableP.getColumnModel().getColumn(3).setResizable(false);  
          tableP.getColumnModel().getColumn(4).setPreferredWidth(100);
          tableP.getColumnModel().getColumn(4).setResizable(false); 
          tableP.getColumnModel().getColumn(5).setPreferredWidth(70);
          tableP.getColumnModel().getColumn(5).setResizable(false);  
          tableP.getColumnModel().getColumn(6).setPreferredWidth(70);
          tableP.getColumnModel().getColumn(6).setResizable(false);  
          tableP.getColumnModel().getColumn(7).setPreferredWidth(150);
          tableP.getColumnModel().getColumn(7).setResizable(false); 
          //tableP.getColumnModel().getColumn(8).setPreferredWidth(90);
         // tableP.getColumnModel().getColumn(8).setResizable(false); 
          
          
          tableP.getTableHeader().setReorderingAllowed(false);
          tableP.setAutoResizeMode(tableP.AUTO_RESIZE_OFF);
          tableP.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);                                
    
       
       }
     
       public void  preencherTabelaTotal(String sql){
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"TOTAL"};
       
    
        
        conex.conexao();
        conex.execultasql(sql);                
            try {
                conex.rs.first();
                do {
                  
                    dados.add(new Object[]{conex.rs.getString("preco_loca")});
                   
                    
                   
                   
                    
                }while(conex.rs.next());
            } catch (SQLException ex) {
               // JOptionPane.showMessageDialog(rootPane,"Erro ao preencher o ArrayList!\nErro:"+ex);
            }
       
            
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
          jTable2.setModel(modelo);
          jTable2.getColumnModel().getColumn(0).setPreferredWidth(90);
          jTable2.getColumnModel().getColumn(0).setResizable(false);
          
          jTable2.getTableHeader().setReorderingAllowed(false);
          jTable2.setAutoResizeMode(jTable2.AUTO_RESIZE_OFF);
          jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   
       }
    
     
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmControle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldTipoP;
    private javax.swing.JTable tableP;
    // End of variables declaration//GEN-END:variables
}
