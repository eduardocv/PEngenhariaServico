package view;

import entity.Usuario;
import entity.EnumPerfil;

public class TelaInicial extends javax.swing.JDialog {

    public TelaInicial(java.awt.Frame parent, boolean modal, Usuario usuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.usuario = usuario;

        if (usuario.getPerfil().equals(EnumPerfil.ADMINISTRADOR)) {

            btnUsuarios.setEnabled(true);
            btnComponentes.setEnabled(true);
            btnManutencaoLaboratorio.setEnabled(true);
            btnRemetentes.setEnabled(true);
            btnProdutos.setEnabled(true);
            btnLogoff.setEnabled(true);

        } else {
            btnUsuarios.setEnabled(false);
            btnComponentes.setEnabled(true);
            btnManutencaoLaboratorio.setEnabled(true);
            btnRemetentes.setEnabled(true);
            btnProdutos.setEnabled(true);
            btnLogoff.setEnabled(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRemetentes = new javax.swing.JButton();
        btnManutencaoLaboratorio = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnComponentes = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnLogoff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnRemetentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BotãoRemetentesCinza.png"))); // NOI18N
        btnRemetentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemetentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemetentesActionPerformed(evt);
            }
        });

        btnManutencaoLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BotãoManutençãoCinza.png"))); // NOI18N
        btnManutencaoLaboratorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManutencaoLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManutencaoLaboratorioActionPerformed(evt);
            }
        });

        btnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BotãoProdutosCinza.png"))); // NOI18N
        btnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnComponentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BotãoComponentesCinza.png"))); // NOI18N
        btnComponentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComponentesActionPerformed(evt);
            }
        });

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BotãoUsuáriosCinza.png"))); // NOI18N
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BotãoSairCinza.png"))); // NOI18N
        btnLogoff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComponentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnManutencaoLaboratorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRemetentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogoff, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnComponentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManutencaoLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemetentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemetentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemetentesActionPerformed
        TelaRemetente telaRemetente = new TelaRemetente(null, true, usuario);
        telaRemetente.setVisible(true);
    }//GEN-LAST:event_btnRemetentesActionPerformed

    private void btnManutencaoLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManutencaoLaboratorioActionPerformed
        TelaManutencaoLaboratorio telaManutencaoLaboratorio = new TelaManutencaoLaboratorio(null, true, usuario);
        telaManutencaoLaboratorio.setVisible(true);
    }//GEN-LAST:event_btnManutencaoLaboratorioActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        TelaProdutos telaProdutos = new TelaProdutos(null, true, usuario);
        telaProdutos.setVisible(true);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComponentesActionPerformed
        TelaComponentes telaComponentes = new TelaComponentes(null, true, usuario);
        telaComponentes.setVisible(true);
    }//GEN-LAST:event_btnComponentesActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        TelaUsuario telaUsuario = new TelaUsuario(null, true);
        telaUsuario.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoffActionPerformed

        this.dispose();
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);

    }//GEN-LAST:event_btnLogoffActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaInicial dialog = new TelaInicial(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComponentes;
    private javax.swing.JButton btnLogoff;
    private javax.swing.JButton btnManutencaoLaboratorio;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnRemetentes;
    private javax.swing.JButton btnUsuarios;
    // End of variables declaration//GEN-END:variables
    Usuario usuario;
}
