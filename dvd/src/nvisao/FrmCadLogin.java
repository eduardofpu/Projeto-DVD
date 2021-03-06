/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nvisao;

import controle.ControleLogin;
import java.awt.Image;
import java.awt.Toolkit;
import modelo.ModeloLogin;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Eduardo
 */
public class FrmCadLogin extends javax.swing.JFrame {

     ModeloLogin mod = new ModeloLogin();
     ControleLogin control = new ControleLogin();
      int flag = 1;
     
    public FrmCadLogin() {
        initComponents();
         URL url = this.getClass().getResource("/Imagens/dvd.png");  //coloca a imagem no lugar da tigela java
          Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);  
            this.setIconImage(imagemTitulo);
            
            
            
///////////////////////////////////////////////////////////////////////////////    
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
    jButtonSalvar.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButtonSalvar.getActionMap().put("DoClick", action);
    jButtonAlterar.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButtonAlterar.getActionMap().put("DoClick", action);
    jButtonCancelar.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButtonCancelar.getActionMap().put("DoClick", action);
    jButtonExcluir.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButtonExcluir.getActionMap().put("DoClick", action);
    jButtonNovo.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButtonNovo.getActionMap().put("DoClick", action);
    jButtonPrimeiro.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButtonPrimeiro.getActionMap().put("DoClick", action);  
    jButtonUltimo.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButtonUltimo.getActionMap().put("DoClick", action); 
    jButtonProximo.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButtonProximo.getActionMap().put("DoClick", action); 
    jButtonAnterior.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "DoClick");
    jButtonAnterior.getActionMap().put("DoClick", action); 
        
        getRootPane().setDefaultButton(jButtonSair);//botão sair com enter
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelLogin = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabeSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelConfSenha = new javax.swing.JLabel();
        jPasswordFieldconfSenha = new javax.swing.JPasswordField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jLabelPermissão = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jCombo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Login");

        jLabelCodigo.setText("Código:");

        jTextFieldCodigo.setEnabled(false);

        jLabelNome.setText("Nome:");

        jTextFieldNome.setEnabled(false);

        jLabelLogin.setText("Login:");

        jTextFieldLogin.setEnabled(false);

        jLabeSenha.setText("Senha:");

        jPasswordFieldSenha.setEnabled(false);

        jLabelConfSenha.setText("Confirmação de Senha:");

        jPasswordFieldconfSenha.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Editar");
        jButtonAlterar.setToolTipText("Editar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setToolTipText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonPrimeiro.setText("<<");
        jButtonPrimeiro.setToolTipText("Primeiro");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("<");
        jButtonAnterior.setToolTipText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setText(">");
        jButtonProximo.setToolTipText("Próximo");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonUltimo.setText(">>");
        jButtonUltimo.setToolTipText("Último");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jLabelPermissão.setText("Permissão:");

        jButtonSair.setText("Sair");
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Comum" }));
        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUltimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabeSenha)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelConfSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldconfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelPermissão)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPermissão)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogin)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldconfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConfSenha))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonPrimeiro)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonUltimo)
                    .addComponent(jButtonSair))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        jTextFieldCodigo.setText("");
        jTextFieldLogin.setText("");
        jTextFieldNome.setText("");
        jPasswordFieldconfSenha.setText("");
        jPasswordFieldSenha.setText("");
        jButtonSalvar.setEnabled(true);
        jTextFieldLogin.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jPasswordFieldconfSenha.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        
                
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        
        // para confirmar a senha devo fazer um if else
          // se for igual preenche o modelo se não for recebe uma menssagem
        if(jPasswordFieldSenha.getText().equals(jPasswordFieldconfSenha.getText())){
        mod.setNome(jTextFieldNome.getText());
        mod.setPermissao((String)jCombo.getSelectedItem());
        mod.setLogin(jTextFieldLogin.getText()); 
        mod.setSenha(jPasswordFieldSenha.getText());
        
       
       // mod.setSenha(jPasswordFieldconfSenha.getText());
        //mod.setPermissao(jPasswordFieldconfSenha.getText());//não precisa
       
       
       
       
        
        control.salvar(mod);
        
        jTextFieldCodigo.setText("");
        jTextFieldLogin.setText("");
        jTextFieldNome.setText("");
        jPasswordFieldconfSenha.setText("");
        jPasswordFieldSenha.setText("");
        jButtonSalvar.setEnabled(!true);
        jTextFieldLogin.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jPasswordFieldconfSenha.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
        
        }else{
            JOptionPane.showMessageDialog(rootPane, "AS senhas não correspondem !!!");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
         if(flag==2){
        mod.setNome(jTextFieldNome.getText());
        mod.setPermissao((String)jCombo.getSelectedItem());
        mod.setLogin(jTextFieldLogin.getText()); 
        mod.setSenha(jPasswordFieldSenha.getText());
       // mod.setPermissao(jPasswordFieldconfSenha.getText()); //não precisa
                
           
            
            control.Alterar(mod);
             
            
        }else{
            mod.setNome(jTextFieldNome.getText());
            mod.setSenha(jPasswordFieldSenha.getText()); 
            mod.setPermissao(jPasswordFieldconfSenha.getText());
            mod.setLogin(jTextFieldLogin.getText());           
            mod.setPermissao((String)jCombo.getSelectedItem());
            control.Alterar(mod);
           
       }       
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        mod.setId(Integer.parseInt(jTextFieldCodigo.getText()));
        control.Excluir(mod);
        jTextFieldCodigo.setText("");
        jTextFieldLogin.setText("");
        jTextFieldNome.setText("");
        jPasswordFieldconfSenha.setText("");
        jPasswordFieldSenha.setText("");
        jButtonSalvar.setEnabled(!true);
        jTextFieldLogin.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jPasswordFieldconfSenha.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        
        jTextFieldCodigo.setText("");
        jTextFieldLogin.setText("");
        jTextFieldNome.setText("");
        jPasswordFieldconfSenha.setText("");
        jPasswordFieldSenha.setText("");
        jButtonSalvar.setEnabled(!true);
        jTextFieldLogin.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        jPasswordFieldconfSenha.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jButtonNovo.setEnabled(!false);
        jButtonCancelar.setEnabled(!true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // TODO add your handling code here:
        mod=control.Primeiro();
        jTextFieldCodigo.setText(String.valueOf(mod.getId()));
        jTextFieldNome.setText(mod.getNome());
        jPasswordFieldSenha.setText(String.valueOf(mod.getSenha()));
        jPasswordFieldconfSenha.setText(String.valueOf(mod.getPermissao()));
        jTextFieldLogin.setText(String.valueOf(mod.getLogin()));
        jCombo.setSelectedItem(String.valueOf(mod.getPermissao()));
        
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        // TODO add your handling code here:
        mod=control.Uti();
        jTextFieldCodigo.setText(String.valueOf(mod.getId()));
        jTextFieldNome.setText(mod.getNome());
        jPasswordFieldSenha.setText(String.valueOf(mod.getSenha()));
        jPasswordFieldconfSenha.setText(String.valueOf(mod.getPermissao()));
        jTextFieldLogin.setText(String.valueOf(mod.getLogin()));
        jCombo.setSelectedItem(String.valueOf(mod.getPermissao()));
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        mod=control.Ant();
        jTextFieldCodigo.setText(String.valueOf(mod.getId()));
        jTextFieldNome.setText(mod.getNome());
        jPasswordFieldSenha.setText(String.valueOf(mod.getSenha()));
        jPasswordFieldconfSenha.setText(String.valueOf(mod.getPermissao()));
        jTextFieldLogin.setText(String.valueOf(mod.getLogin()));
         jCombo.setSelectedItem(String.valueOf(mod.getPermissao()));
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // TODO add your handling code here:
        
        mod=control.Prox();
        jTextFieldCodigo.setText(String.valueOf(mod.getId()));
        jTextFieldNome.setText(mod.getNome());
        jPasswordFieldSenha.setText(String.valueOf(mod.getSenha()));
        jPasswordFieldconfSenha.setText(String.valueOf(mod.getPermissao()));
        jTextFieldLogin.setText(String.valueOf(mod.getLogin()));
       jCombo.setSelectedItem(String.valueOf(mod.getPermissao()));
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmCadLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox jCombo;
    private javax.swing.JLabel jLabeSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelConfSenha;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPermissão;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JPasswordField jPasswordFieldconfSenha;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
