
import Model.Cliente;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Cliente
 */
public class CadastrarUser extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarUser
     */
    public CadastrarUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jNomeCadastro = new javax.swing.JLabel();
        jNomeCadastro1 = new javax.swing.JLabel();
        jNomeCadastro2 = new javax.swing.JLabel();
        jNomeCadastro3 = new javax.swing.JLabel();
        EfetuaCadastro = new javax.swing.JButton();
        jDigitaNomeUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextEmailCadastro = new javax.swing.JTextField();
        jPasswordCadastro1 = new javax.swing.JPasswordField();
        jPasswordConfirma = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jNomeCadastro.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jNomeCadastro.setText("Senha:");

        jNomeCadastro1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jNomeCadastro1.setText("Nome:");

        jNomeCadastro2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jNomeCadastro2.setText("Confirmar Senha:");

        jNomeCadastro3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jNomeCadastro3.setText("E-mail:");

        EfetuaCadastro.setBackground(new java.awt.Color(153, 153, 153));
        EfetuaCadastro.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        EfetuaCadastro.setText("Efetuar Cadastro");
        EfetuaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfetuaCadastroActionPerformed(evt);
            }
        });

        jDigitaNomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDigitaNomeUserActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carteira-de-identidade.png"))); // NOI18N

        jTextEmailCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailCadastroActionPerformed(evt);
            }
        });

        jPasswordCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordCadastro1ActionPerformed(evt);
            }
        });

        jPasswordConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jNomeCadastro2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordConfirma))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNomeCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNomeCadastro3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordCadastro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEmailCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDigitaNomeUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(EfetuaCadastro)))
                .addContainerGap(470, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDigitaNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeCadastro3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeCadastro2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(EfetuaCadastro)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDigitaNomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDigitaNomeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDigitaNomeUserActionPerformed

    private void jPasswordCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordCadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordCadastro1ActionPerformed

    private void jTextEmailCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailCadastroActionPerformed

    private void jPasswordConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordConfirmaActionPerformed
    

    }//GEN-LAST:event_jPasswordConfirmaActionPerformed

    private void EfetuaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfetuaCadastroActionPerformed
       String nome = jDigitaNomeUser.getText();
    String email = jTextEmailCadastro.getText();
    String senha = String.valueOf(jPasswordCadastro1.getPassword());
    String confirmSenha = String.valueOf(jPasswordConfirma.getPassword());

    // Validate password confirmation
    if (!senha.equals(confirmSenha)) {
        JOptionPane.showMessageDialog(this, "Passwords do not match");
        return;
    }

    // Create a new instance of Cliente and set the attributes
    Cliente cliente = new Cliente(nome, email, senha);

    // Save the new user in the database
    cliente.salvar();
    
    limparFormulario();
    // Display success message or perform other actions
    JOptionPane.showMessageDialog(this, "User registered successfully");
    }//GEN-LAST:event_EfetuaCadastroActionPerformed
     private void limparFormulario() {
    jDigitaNomeUser.setText("");
    jTextEmailCadastro.setText("");
    jPasswordCadastro1.setText("");
    jPasswordConfirma.setText("");
}
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
            java.util.logging.Logger.getLogger(CadastrarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EfetuaCadastro;
    private javax.swing.JTextField jDigitaNomeUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNomeCadastro;
    private javax.swing.JLabel jNomeCadastro1;
    private javax.swing.JLabel jNomeCadastro2;
    private javax.swing.JLabel jNomeCadastro3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordCadastro1;
    private javax.swing.JPasswordField jPasswordConfirma;
    private javax.swing.JTextField jTextEmailCadastro;
    // End of variables declaration//GEN-END:variables
}
