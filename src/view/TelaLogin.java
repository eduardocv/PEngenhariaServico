
package view;

import dao.UsuarioDAO;
import entity.Usuario;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
         getRootPane().setDefaultButton(btnEntrar); 
    }

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSenha = new javax.swing.JPasswordField();
        lblEsqueceuSenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        lblEsqueceuSenha.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        lblEsqueceuSenha.setForeground(new java.awt.Color(51, 102, 255));
        lblEsqueceuSenha.setText("Esqueceu a senha?");
        lblEsqueceuSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEsqueceuSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEsqueceuSenhaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEsqueceuSenhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEsqueceuSenhaMouseExited(evt);
            }
        });

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha:");

        jLabel1.setText("Usuário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEsqueceuSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEntrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEsqueceuSenha)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        String email = txtUsuario.getText();
        String senha = txtSenha.getText();       
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuario = usuarioDAO.getLoginSenha(email, senha);

        if (usuario != null) {

            if(usuario.isStatus()== false){
                JOptionPane.showMessageDialog(rootPane, "Usuário desativado!");
                
            }  else {
                TelaInicial telaInicial = new TelaInicial(this, false, usuario);
                this.dispose();
                
                telaInicial.setVisible(true);
                telaInicial.setVisible(true);
            }
                 
        } else if (email.equals("") || senha.equals("")){
           JOptionPane.showMessageDialog(rootPane, "Preencha os campos, por favor.");    
            
        }
        else{            
           JOptionPane.showMessageDialog(rootPane, "Usuário e/ou senha incorreto(s)!");    
           
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void lblEsqueceuSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEsqueceuSenhaMouseClicked
        String email = txtUsuario.getText(); 
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        Usuario usuario = usuarioDAO.getLogin(email);
        
         if (usuario == null) {
             JOptionPane.showMessageDialog(null, "Usuário incorreto!");
             
         } else{
            
             if(usuario.getIdUsuario() == 1){
                  JOptionPane.showMessageDialog(null, "Este usuário não pode ser alterado!");
             }
             else if(usuario.isStatus()== false){
                 JOptionPane.showMessageDialog(rootPane, "Usuário desativado!");
                
            }  else {                   
                 String senhaAlterada;
                 senhaAlterada = usuario.getSenha();
                 senhaAlterada = usuario.getCPF();
               //  senhaAlterada += usuario.getCPF().substring(4, 7);
                 usuario.setSenha(senhaAlterada);
                // ir no bd e fazer essa porra funcionar               
                 JOptionPane.showMessageDialog(null, "Senha alterada! \nNova senha: 6 primeiros dígitos do seu CPF.");
             }
         }
        
    }//GEN-LAST:event_lblEsqueceuSenhaMouseClicked

    private void lblEsqueceuSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEsqueceuSenhaMouseEntered
        Map<TextAttribute, Object> atributos = new HashMap<TextAttribute, Object>();
        atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lblEsqueceuSenha.setFont(new Font("Tahoma Simples", Font.BOLD, 12).deriveFont(atributos));
    }//GEN-LAST:event_lblEsqueceuSenhaMouseEntered

    private void lblEsqueceuSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEsqueceuSenhaMouseExited
        lblEsqueceuSenha.setFont(new Font("Tahoma Simples", 1, 9));
    }//GEN-LAST:event_lblEsqueceuSenhaMouseExited

    public void limparCampos(){
        txtSenha.setText(null);
        txtUsuario.setText(null);
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEsqueceuSenha;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
