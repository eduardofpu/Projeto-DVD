/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nvisao;

import controle.ConectaBanco;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.ModeloTabela;

/**
 *
 * @author Eduardo
 */
public class Terror extends javax.swing.JFrame {
    ConectaBanco conex = new ConectaBanco();
            
    /**
     * Creates new form Erotico
     */
    public Terror() {
        initComponents();
         preencherTabela("select * from dvds where tipo='Terror'");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelImagem = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(255, 102, 102));
        jTable1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fred.jpg"))); // NOI18N
        jLabelImagem.setText("Filmes");

        jLabelId.setText("id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelId)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelId)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
         conex.conexao();
             
        try{ 
        String id = ""+jTable1.getValueAt(jTable1.getSelectedRow(),0);
            
           
            
            //para relacionar o clique deacordo com o primeiro campo da tabela
            conex.execultasql("select img from  dvds where id_dvd='"+id+"'");
        
        ImageIcon foto;
        InputStream is ;
        // String nombre;

       

            //para mostrar as fotos relacionadas ao id
            conex.execultasql("select img from dvds where id_dvd='"+jLabelId.getText()+"'");

            while(conex.rs.next()){

                is=conex.rs.getBinaryStream(1);
                //  nombre=conex.rs.getString(2);
                BufferedImage bi = ImageIO.read(is);

                foto= new ImageIcon(bi);

                Image img=foto.getImage();
                //Image newimg=img.getScaledInstance(140,170,java.awt.Image.SCALE_SMOOTH);
                Image newimg=img.getScaledInstance(500,250,java.awt.Image.SCALE_SMOOTH);

                ImageIcon newicon=new ImageIcon(newimg);

                jLabelImagem.setIcon(newicon);
                // jTextFieldTitulo.setText(nombre);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao buscar a imagem!"+ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
     public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Codigo","Titulo","Tipo","Quantidade"};
       
    // String hora = Hora.getText();// Coloca a hora na tabela
        
        conex.conexao();
        conex.execultasql(sql);                
            try {
                conex.rs.first();
                do {
                  
                    dados.add(new Object[]{conex.rs.getString("id_dvd"),conex.rs.getString("titulo"),conex.rs.getString("tipo"),conex.rs.getString("quantidade")});
                    
                   // j++;
                   
                   
                }while(conex.rs.next());
            } catch (SQLException ex) {
               // JOptionPane.showMessageDialog(rootPane,"Erro ao preencher o ArrayList!\nErro:"+ex);
            }
       
            
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
          jTable1.setModel(modelo);
          jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
          jTable1.getColumnModel().getColumn(0).setResizable(false);
          jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
          jTable1.getColumnModel().getColumn(1).setResizable(false);  
          jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
          jTable1.getColumnModel().getColumn(2).setResizable(false);  
          jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
          jTable1.getColumnModel().getColumn(3).setResizable(false); 
          jTable1.getTableHeader().setReorderingAllowed(false);
          jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
          jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);                               
    
       
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
            java.util.logging.Logger.getLogger(Terror.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Terror.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Terror.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Terror.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Terror().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
