package view;

import dao.UsuarioDAO;
import javax.swing.table.DefaultTableModel;
import entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaUsuario extends javax.swing.JDialog {

    public TelaUsuario(java.awt.Dialog parent, boolean modal) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        btnAtivarUsuario.setText("Ativar");
        atualizaTabelaUsuarios();
    }
   // boolean novo = true;
    Usuario usuario;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnNovoUsuario = new javax.swing.JButton();
        btnAlterarUsuario = new javax.swing.JButton();
        btnAtivarUsuario = new javax.swing.JButton();
        btnVoltarUsuario = new javax.swing.JButton();
        txtPesquisarUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("USUÁRIOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela de Usuários"));

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Perfil", "Status"
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
        if (tblUsuario.getColumnModel().getColumnCount() > 0) {
            tblUsuario.getColumnModel().getColumn(0).setMinWidth(33);
            tblUsuario.getColumnModel().getColumn(0).setPreferredWidth(22);
            tblUsuario.getColumnModel().getColumn(0).setMaxWidth(22);
            tblUsuario.getColumnModel().getColumn(3).setMinWidth(88);
            tblUsuario.getColumnModel().getColumn(3).setPreferredWidth(22);
            tblUsuario.getColumnModel().getColumn(3).setMaxWidth(88);
            tblUsuario.getColumnModel().getColumn(4).setMinWidth(66);
            tblUsuario.getColumnModel().getColumn(4).setPreferredWidth(22);
            tblUsuario.getColumnModel().getColumn(4).setMaxWidth(66);
        }

        btnNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Create.png"))); // NOI18N
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltarUsuario)
                    .addComponent(btnAlterarUsuario)
                    .addComponent(btnNovoUsuario)
                    .addComponent(btnAtivarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarUsuario, btnAtivarUsuario, btnNovoUsuario, btnVoltarUsuario});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovoUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterarUsuario)
                        .addGap(21, 21, 21)
                        .addComponent(btnAtivarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltarUsuario))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        txtPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarUsuarioActionPerformed(evt);
            }
        });
        txtPesquisarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarUsuarioKeyReleased(evt);
            }
        });

        jLabel1.setText("Pesquisar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        //novo = true;
        TelaNovoUsuario telaNovoUsuario = new TelaNovoUsuario(null, true);//, true, null);
        telaNovoUsuario.setVisible(true);
        atualizaTabelaUsuarios();
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUsuarioActionPerformed
        int linha = tblUsuario.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o usuário que deseja alterar!");
        }else{
            if (tblUsuario.getValueAt(linha, 4).equals("Ativo")) {
            int id = Integer.parseInt(tblUsuario.getValueAt(linha, 0).toString());
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            Usuario usuario = usuarioDAO.getUsuarioById(id);

            if (usuario.getIdUsuario() == 1) {
                JOptionPane.showMessageDialog(rootPane, "Não é possível alterar esse usuário!");
            } else {
                TelaNovoUsuario telaNovoUsuario = new TelaNovoUsuario(null, true, false, usuario);
                telaNovoUsuario.setVisible(true);
                atualizaTabelaUsuarios();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Não é possível alterar um usuário desativado!");
        }
        
    }//GEN-LAST:event_btnAlterarUsuarioActionPerformed
    }
    private void btnVoltarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarUsuarioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarUsuarioActionPerformed

    private void btnAtivarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarUsuarioActionPerformed
        int linha = tblUsuario.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o usuário que deseja ativar/desativar!");

        } else {
            int id = Integer.parseInt(tblUsuario.getValueAt(linha, 0).toString());

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuario = usuarioDAO.getUsuarioById(id);

            if (usuario.getIdUsuario() == 1) {
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

    private void txtPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarUsuarioActionPerformed

    private void txtPesquisarUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarUsuarioKeyReleased
        String nome = txtPesquisarUsuario.getText();
        buscaNome(nome);
        
    }//GEN-LAST:event_txtPesquisarUsuarioKeyReleased

    private void mostraTela(List<Usuario> mostraUsuarios) {
        DefaultTableModel model = (DefaultTableModel) this.tblUsuario.getModel();
        model.setRowCount(mostraUsuarios.size());
        for (int i = 0; i < mostraUsuarios.size(); i++) {
            model.setValueAt(mostraUsuarios.get(i).getIdUsuario(), i, 0);
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

            model.setValueAt(listarUsuarios.get(i).getIdUsuario(), i, 0);
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
    private javax.swing.JButton btnVoltarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtPesquisarUsuario;
    // End of variables declaration//GEN-END:variables
public void buscaNome(String nome) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        List<Usuario> filtrada = new ArrayList();
        List<Usuario> listarUsuarios = usuarioDAO.listarUsuarios();
        String nomeDigitadoTemp = nome.toLowerCase();
        for (Usuario usr : listarUsuarios) {
            String nomeTemp = usr.getNome().toLowerCase();
            //System.out.println(nomeTemp + " - " + nomeDigitadoTemp);
            if (nomeTemp.contains(nomeDigitadoTemp)) {
                filtrada.add(usr);
            }
        }
        DefaultTableModel model = (DefaultTableModel) this.tblUsuario.getModel();
        model.setNumRows(0);
        for (int i = 0; i < filtrada.size(); i++) {
            model.addRow(new Object[]{});
            model.setValueAt(filtrada.get(i).getIdUsuario(), i, 0);
            model.setValueAt(filtrada.get(i).getNome(), i, 1);
            model.setValueAt(filtrada.get(i).getCPF(), i, 2);
            model.setValueAt(filtrada.get(i).getPerfil(), i, 3);
            model.setValueAt(filtrada.get(i).getStatus(),i,4);
        }
    }
}
