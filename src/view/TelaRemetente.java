package view;

import dao.RemetenteDAO;
import entity.Remetente;
import java.util.ArrayList;
import java.util.List;
//import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entity.Usuario;
import entity.EnumPerfil;

/**
 *
 * @author Eduardo C. Vieira
 */
public class TelaRemetente extends javax.swing.JDialog {

    public TelaRemetente(java.awt.Frame parent, boolean modal) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        btnAtivar.setText("Ativar");
        atualizaTabelaRemetentes();
    }

    public TelaRemetente(java.awt.Frame parent, boolean modal, Usuario usuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);

        if (usuario.getPerfil().equals(EnumPerfil.USUARIO)) {
            btnAlterar.setEnabled(false);
            btnAtivar.setEnabled(false);
        }

        btnAtivar.setText("Ativar");
        atualizaTabelaRemetentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRemetente = new javax.swing.JTable();
        btnAtivar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TRs/RTs (Remetentes)");

        jLabel1.setText("Pesquisa por Nome:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Remetentes de equipamentos"));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/View.png"))); // NOI18N
        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Modify.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Create.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        tbRemetente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Tipo", "E-mail", "Telefone", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRemetente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRemetenteMouseClicked(evt);
            }
        });
        tbRemetente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbRemetenteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbRemetente);
        if (tbRemetente.getColumnModel().getColumnCount() > 0) {
            tbRemetente.getColumnModel().getColumn(0).setMinWidth(33);
            tbRemetente.getColumnModel().getColumn(0).setPreferredWidth(22);
            tbRemetente.getColumnModel().getColumn(0).setMaxWidth(22);
            tbRemetente.getColumnModel().getColumn(2).setMinWidth(39);
            tbRemetente.getColumnModel().getColumn(2).setPreferredWidth(39);
            tbRemetente.getColumnModel().getColumn(2).setMaxWidth(39);
            tbRemetente.getColumnModel().getColumn(4).setMinWidth(100);
            tbRemetente.getColumnModel().getColumn(4).setPreferredWidth(150);
            tbRemetente.getColumnModel().getColumn(4).setMaxWidth(150);
            tbRemetente.getColumnModel().getColumn(5).setMinWidth(66);
            tbRemetente.getColumnModel().getColumn(5).setPreferredWidth(22);
            tbRemetente.getColumnModel().getColumn(5).setMaxWidth(66);
        }

        btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png"))); // NOI18N
        btnAtivar.setText("Ativar");
        btnAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtivar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        TelaNovoRemetente telaNovoRemetente = new TelaNovoRemetente(null, true);
        telaNovoRemetente.setVisible(true);
        atualizaTabelaRemetentes();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tbRemetente.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o remetente que deseja alterar !!!");
        } else {
            if (tbRemetente.getValueAt(linha, 5).equals("Ativo")) {
                int id = Integer.parseInt(tbRemetente.getValueAt(linha, 0).toString());
                //RemetenteDAO remetenteDAO = new RemetenteDAO();
                Remetente remetente = remetenteDAO.getRemetenteById(id);
                TelaNovoRemetente telaNovoRemetente = new TelaNovoRemetente(null, true, false, remetente);
                telaNovoRemetente.setVisible(true);
                atualizaTabelaRemetentes();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não é possível alterar um remetente Desativado !!!");
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        int linha = tbRemetente.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(tbRemetente.getValueAt(linha, 0).toString());
            //RemetenteDAO remetenteDAO = new RemetenteDAO();
            remetente = remetenteDAO.getRemetenteById(id);
            TelaVisualizarRemetente telaVisualisarRemetente = new TelaVisualizarRemetente(null, true, remetente);
            telaVisualisarRemetente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um remetente !!!");
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tbRemetenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRemetenteMouseClicked
     atualizaBotaoAtivar();
    }//GEN-LAST:event_tbRemetenteMouseClicked

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        String nome = txtPesquisa.getText();
        buscaNome(nome);
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarActionPerformed
        int linha = tbRemetente.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o remetente que deseja ativar/desativar!");
        } else {
            int id = Integer.parseInt(tbRemetente.getValueAt(linha, 0).toString());
            
            remetente = remetenteDAO.getRemetenteById(id);
           
                if (tbRemetente.getValueAt(linha, 5).equals("Ativo")) {
                    remetente.setStatus(false);
                } else {
                    remetente.setStatus(true);
                }
                if (btnAtivar.getText().equalsIgnoreCase("Ativar")) {
                    btnAtivar.setText("Desativar");
                    btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
                } else {
                    btnAtivar.setText("Ativar");
                    btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
                }
                remetenteDAO.atualizaStatus(remetente);
            }
        
        atualizaTabelaRemetentes();

    }//GEN-LAST:event_btnAtivarActionPerformed

    private void tbRemetenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbRemetenteKeyReleased
        atualizaBotaoAtivar();
    }//GEN-LAST:event_tbRemetenteKeyReleased

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
            java.util.logging.Logger.getLogger(TelaRemetente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRemetente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRemetente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRemetente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaRemetente dialog = new TelaRemetente(new javax.swing.JFrame(), true);//, null);
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtivar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbRemetente;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void atualizaBotaoAtivar() {
        int linha = tbRemetente.getSelectedRow();
        if (tbRemetente.getValueAt(linha, 5).equals("Ativo")) {
            btnAtivar.setText("Desativar");
            btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
        } else {
            btnAtivar.setText("Ativar");
            btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
        }
    }
    
    private void atualizaTabelaRemetentes() {

        List<Remetente> listarRemetentes = remetenteDAO.listarRemetentes();
        DefaultTableModel model = (DefaultTableModel) this.tbRemetente.getModel();
        model.setRowCount(listarRemetentes.size());
        for (int i = 0; i < listarRemetentes.size(); i++) {
            model.setValueAt(listarRemetentes.get(i).getIdRemetente(), i, 0);
            model.setValueAt(listarRemetentes.get(i).getNome(), i, 1);
            model.setValueAt(listarRemetentes.get(i).getTipo(), i, 2);
            model.setValueAt(listarRemetentes.get(i).getEmail(), i, 3);
            model.setValueAt(listarRemetentes.get(i).getTelefone(), i, 4);
            model.setValueAt(retornaStatus(listarRemetentes.get(i).isStatus()), i, 5);
        }
    }
    
    private String retornaStatus(Boolean status) {
        return (status ? "Ativo" : "Inativo");
    }
    String strStatus;

    public void buscaNome(String nome) {
       
        List<Remetente> filtrada = new ArrayList();
        List<Remetente> listarRemetentes = remetenteDAO.listarRemetentes();
        String nomeDigitadoTemp = nome.toLowerCase();
        for (Remetente rem : listarRemetentes) {
            String nomeTemp = rem.getNome().toLowerCase();
            if (nomeTemp.contains(nomeDigitadoTemp)) {
                filtrada.add(rem);
            }
        }
        DefaultTableModel model = (DefaultTableModel) this.tbRemetente.getModel();
        model.setNumRows(0);
        for (int i = 0; i < filtrada.size(); i++) {
            model.addRow(new Object[]{});
            model.setValueAt(filtrada.get(i).getIdRemetente(), i, 0);
            model.setValueAt(filtrada.get(i).getNome(), i, 1);
            model.setValueAt(filtrada.get(i).getTipo(), i, 2);
            model.setValueAt(filtrada.get(i).getEmail(), i, 3);
            model.setValueAt(filtrada.get(i).getTelefone(), i, 4);
            model.setValueAt(retornaStatus(filtrada.get(i).isStatus()), i, 5);
        }
    }
    Remetente remetente = new Remetente();
    RemetenteDAO remetenteDAO = new RemetenteDAO();

}
