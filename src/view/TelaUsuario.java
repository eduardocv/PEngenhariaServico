
package view;

import dao.UsuarioDAO;
import javax.swing.table.DefaultTableModel;
import entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe_tubandt
 */
public class TelaUsuario extends javax.swing.JDialog {

    /**
     * Creates new form TelaNovoUsuario
     */
    public TelaUsuario(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        btnAtivarUsuario.setText("Ativar");

        atualizaTabelaUsuarios();
    }
    boolean novo = true;
    Usuario usuario;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisarUsuario = new javax.swing.JTextField();
        btnPesquisarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnNovoUsuario = new javax.swing.JButton();
        btnAlterarUsuario = new javax.swing.JButton();
        btnAtivarUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblEmpresaUsuario = new javax.swing.JLabel();
        btnVoltarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Usuário"));

        jLabel1.setText("Pesquisar:");

        btnPesquisarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Find.png"))); // NOI18N
        btnPesquisarUsuario.setText("Pesquisar");
        btnPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarUsuarioActionPerformed(evt);
            }
        });

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1234", "Osama", "0711666", null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Nome", "CPF", "Perfil", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuario.getTableHeader().setReorderingAllowed(false);
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuario);

        btnNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/New document.png"))); // NOI18N
        btnNovoUsuario.setText("Novo");
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });

        btnAlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Modify.png"))); // NOI18N
        btnAlterarUsuario.setText("Alterar");
        btnAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUsuarioActionPerformed(evt);
            }
        });

        btnAtivarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png"))); // NOI18N
        btnAtivarUsuario.setText("Desativar");
        btnAtivarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Empresa:");

        lblEmpresaUsuario.setText("-");

        btnVoltarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        btnVoltarUsuario.setText("Voltar");
        btnVoltarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnNovoUsuario)
                .addGap(44, 44, 44)
                .addComponent(btnAlterarUsuario)
                .addGap(44, 44, 44)
                .addComponent(btnAtivarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarUsuario)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmpresaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarUsuario))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarUsuario, btnNovoUsuario, btnVoltarUsuario});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarUsuario)
                    .addComponent(jLabel2)
                    .addComponent(lblEmpresaUsuario))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoUsuario)
                    .addComponent(btnAlterarUsuario)
                    .addComponent(btnAtivarUsuario)
                    .addComponent(btnVoltarUsuario))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarUsuarioActionPerformed
        List<Usuario> u = new ArrayList<Usuario>();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        for (Usuario usuario : usuarioDAO.listarUsuarios()) {
            if (usuario.getNome().startsWith(txtPesquisarUsuario.getText())) {
                u.add(usuario);
            }
        }
        mostraTela(u);
    }//GEN-LAST:event_btnPesquisarUsuarioActionPerformed

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        novo = true;
        TelaNovoUsuario telaNovoUsuario = new TelaNovoUsuario(null, true, novo, null);

        telaNovoUsuario.setVisible(true);
        atualizaTabelaUsuarios();
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUsuarioActionPerformed
        int linha = tblUsuario.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o usuário que deseja alterar!");
        } else if (tblUsuario.getValueAt(linha, 4).equals("Ativo")) {
            novo = false;
            int id = Integer.parseInt(tblUsuario.getValueAt(linha, 0).toString());
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            Usuario usuario = usuarioDAO.getUsuarioById(id);

            if (usuario.getMatricula() == 1) {
                JOptionPane.showMessageDialog(rootPane, "Não é possível alterar esse usuário!");
            } else {
                TelaNovoUsuario telaNovoUsuario = new TelaNovoUsuario(null, true, novo, usuario);
                telaNovoUsuario.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Não é possível alterar um usuário desativado!");
        }
        atualizaTabelaUsuarios();
    }//GEN-LAST:event_btnAlterarUsuarioActionPerformed

    private void btnVoltarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarUsuarioActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarUsuarioActionPerformed

    private void btnAtivarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarUsuarioActionPerformed
        int linha = tblUsuario.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o usuário que deseja ativar/desativar!");

        } else {
            int id = Integer.parseInt(tblUsuario.getValueAt(linha, 0).toString());

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuario = usuarioDAO.getUsuarioById(id);

            if (usuario.getMatricula() == 1) {
                JOptionPane.showMessageDialog(rootPane, "Não é possível desativar esse usuário!");

            } else {
                if (tblUsuario.getValueAt(linha, 4).equals("Ativo")) {
                    usuario.setStatus("Desativado");

                } else {
                    usuario.setStatus("Ativo");
                }

                if (btnAtivarUsuario.getText().equalsIgnoreCase("Ativar")) {
                    btnAtivarUsuario.setText("Desativar");
                    btnAtivarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
                } else {
                    btnAtivarUsuario.setText("Ativar");
                    btnAtivarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
                }

                usuarioDAO.atualizaStatus(usuario);
            }
        }
        atualizaTabelaUsuarios();
    }//GEN-LAST:event_btnAtivarUsuarioActionPerformed

    private void tblUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseEntered
        atualizaTabelaUsuarios();
    }//GEN-LAST:event_tblUsuarioMouseEntered

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        int linha = tblUsuario.getSelectedRow();
        if (tblUsuario.getValueAt(linha, 4).equals("Ativo")) {
            btnAtivarUsuario.setText("Desativar");
            btnAtivarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
        } else {
            btnAtivarUsuario.setText("Ativar");
            btnAtivarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));

        }
    }//GEN-LAST:event_tblUsuarioMouseClicked

    private void mostraTela(List<Usuario> mostraUsuarios) {
        DefaultTableModel model = (DefaultTableModel) this.tblUsuario.getModel();
        model.setRowCount(mostraUsuarios.size());
        for (int i = 0; i < mostraUsuarios.size(); i++) {
            model.setValueAt(mostraUsuarios.get(i).getMatricula(), i, 0);
            model.setValueAt(mostraUsuarios.get(i).getNome(), i, 1);
            model.setValueAt(mostraUsuarios.get(i).getCPF(), i, 2);
            model.setValueAt(mostraUsuarios.get(i).getPerfil(), i, 3);
            model.setValueAt(mostraUsuarios.get(i).getStatus(), i, 4);
        }

    }

    private void atualizaTabelaUsuarios() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> listarUsuarios = usuarioDAO.listarUsuarios();

        //pega o modelo da Tabela e coloca na variavel "model"
        DefaultTableModel model
                = (DefaultTableModel) this.tblUsuario.getModel();
        //insere na tabela o número de linhas que a lista tem
        model.setRowCount(listarUsuarios.size());

        //laço para inserir os dados dos objetos na Tabela
        for (int i = 0; i < listarUsuarios.size(); i++) {

            model.setValueAt(listarUsuarios.get(i).getMatricula(), i, 0);
            model.setValueAt(listarUsuarios.get(i).getNome(), i, 1);
            model.setValueAt(listarUsuarios.get(i).getCPF(), i, 2);
            model.setValueAt(listarUsuarios.get(i).getPerfil().getDescricao(), i, 3);
            model.setValueAt(listarUsuarios.get(i).getStatus(), i, 4);

        }

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
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaUsuario dialog = new TelaUsuario(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btnAlterarUsuario;
    private javax.swing.JButton btnAtivarUsuario;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JButton btnPesquisarUsuario;
    private javax.swing.JButton btnVoltarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmpresaUsuario;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtPesquisarUsuario;
    // End of variables declaration//GEN-END:variables
}
