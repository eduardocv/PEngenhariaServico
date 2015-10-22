package view;

import dao.ComponenteDAO;
import entity.Componente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entity.Usuario;
import entity.EnumPerfil;

public class TelaComponentes extends javax.swing.JDialog {

    public TelaComponentes(java.awt.Frame parent, boolean modal) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        atualizaTabelaComponentes();
    }

    public TelaComponentes(java.awt.Frame parent, boolean modal, Usuario usuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);

        if (usuario.getPerfil().equals(EnumPerfil.USUARIO)) {
            btnAlterar.setEnabled(false);
            btnAtivar.setEnabled(false);
        }

        btnAtivar.setText("Ativar");
        atualizaTabelaComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtnBuscaCodItem = new javax.swing.ButtonGroup();
        rbtnCodigo = new javax.swing.JRadioButton();
        rbtnProduto = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbComponente = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnAtivar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COMPONENTES");

        gbtnBuscaCodItem.add(rbtnCodigo);
        rbtnCodigo.setSelected(true);
        rbtnCodigo.setText("Código");
        rbtnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCodigoActionPerformed(evt);
            }
        });

        gbtnBuscaCodItem.add(rbtnProduto);
        rbtnProduto.setText("Componente");
        rbtnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnProdutoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pesquisar");

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

        tbComponente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Código", "Produto", "Status"
            }
        ));
        tbComponente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbComponenteMouseClicked(evt);
            }
        });
        tbComponente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbComponenteKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbComponente);
        if (tbComponente.getColumnModel().getColumnCount() > 0) {
            tbComponente.getColumnModel().getColumn(0).setMinWidth(33);
            tbComponente.getColumnModel().getColumn(0).setPreferredWidth(22);
            tbComponente.getColumnModel().getColumn(0).setMaxWidth(22);
            tbComponente.getColumnModel().getColumn(1).setMinWidth(99);
            tbComponente.getColumnModel().getColumn(1).setPreferredWidth(99);
            tbComponente.getColumnModel().getColumn(1).setMaxWidth(99);
            tbComponente.getColumnModel().getColumn(3).setMinWidth(66);
            tbComponente.getColumnModel().getColumn(3).setPreferredWidth(66);
            tbComponente.getColumnModel().getColumn(3).setMaxWidth(66);
        }

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

        btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png"))); // NOI18N
        btnAtivar.setText("Ativar");
        btnAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVisualizar)
                        .addGap(24, 24, 24)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnCodigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtnProduto))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesquisa)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnProduto)
                    .addComponent(rbtnCodigo))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnVisualizar)
                    .addComponent(btnAtivar)
                    .addComponent(btnAlterar)
                    .addComponent(btnNovo))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCodigoActionPerformed

    private void rbtnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnProdutoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        int linha = tbComponente.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(tbComponente.getValueAt(linha, 0).toString());
            componente = componenteDAO.getComponenteById(id);
            TelaVisualizarComponente telaVisualisarComponente = new TelaVisualizarComponente(null, true, componente);
            telaVisualisarComponente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um componente !!!");
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarActionPerformed
        int linha = tbComponente.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o componente que deseja ativar/desativar!");
        } else {
            int id = Integer.parseInt(tbComponente.getValueAt(linha, 0).toString());

            componente = componenteDAO.getComponenteById(id);

            if (tbComponente.getValueAt(linha, 3).equals("Ativo")) {
                componente.setStatus(false);
            } else {
                componente.setStatus(true);
            }
            if (btnAtivar.getText().equalsIgnoreCase("Ativar")) {
                btnAtivar.setText("Desativar");
                btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
            } else {
                btnAtivar.setText("Ativar");
                btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
            }
            componenteDAO.atualizaStatus(componente);
        }

        atualizaTabelaComponentes();
    }//GEN-LAST:event_btnAtivarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tbComponente.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o produto que deseja fazer a alteração!");
        } else {
            if (tbComponente.getValueAt(linha, 3).equals("Ativo")) {
                int id = Integer.parseInt(tbComponente.getValueAt(linha, 0).toString());
                componente = componenteDAO.getComponenteById(id);
                TelaNovoComponente telaNovoComponente = new TelaNovoComponente(null, true, false, componente);
                telaNovoComponente.setVisible(true);
                atualizaTabelaComponentes();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não é possível alterar um componente Desativado!!!");
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        TelaNovoComponente telaCadastroComponente = new TelaNovoComponente(null, true);
        telaCadastroComponente.setVisible(true);
        atualizaTabelaComponentes();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tbComponenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbComponenteMouseClicked
        atualizaBotaoAtivar();
    }//GEN-LAST:event_tbComponenteMouseClicked

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        String pesquisa = txtPesquisa.getText();
        if (rbtnCodigo.isSelected()) {
            buscaCodigo(pesquisa);
        } else {
            buscaComponente(pesquisa);
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tbComponenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbComponenteKeyReleased
        atualizaBotaoAtivar();
    }//GEN-LAST:event_tbComponenteKeyReleased

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
            java.util.logging.Logger.getLogger(TelaComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaComponentes dialog = new TelaComponentes(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup gbtnBuscaCodItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnCodigo;
    private javax.swing.JRadioButton rbtnProduto;
    private javax.swing.JTable tbComponente;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void atualizaBotaoAtivar() {
        int linha = tbComponente.getSelectedRow();
        if (tbComponente.getValueAt(linha, 3).equals("Ativo")) {
            btnAtivar.setText("Desativar");
            btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
        } else {
            btnAtivar.setText("Ativar");
            btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
        }
    }

    private void atualizaTabelaComponentes() {
        //ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Componente> listarComponentes = componenteDAO.listarComponentes();
        DefaultTableModel model = (DefaultTableModel) this.tbComponente.getModel();
        model.setRowCount(listarComponentes.size());
        for (int i = 0; i < listarComponentes.size(); i++) {
            model.setValueAt(listarComponentes.get(i).getIdComponente(), i, 0);
            model.setValueAt(listarComponentes.get(i).getCodComponente(), i, 1);
            model.setValueAt(listarComponentes.get(i).getComponente(), i, 2);
            model.setValueAt(retornaStatus(listarComponentes.get(i).isStatus()), i, 3);
        }
    }

    private String retornaStatus(Boolean status) {
        return (status ? "Ativo" : "Inativo");
    }
    String strStatus;

    public void buscaCodigo(String nome) {
        List<Componente> filtrada = new ArrayList();
        List<Componente> listarComponentes = componenteDAO.listarComponentes();
        String codigoDigitadoTemp = nome.toLowerCase();
        for (Componente rem : listarComponentes) {
            String codTemp = rem.getCodComponente().toLowerCase();
            if (codTemp.contains(codigoDigitadoTemp)) {
                filtrada.add(rem);
            }
        }
        DefaultTableModel model = (DefaultTableModel) this.tbComponente.getModel();
        model.setNumRows(0);
        for (int i = 0; i < filtrada.size(); i++) {
            model.addRow(new Object[]{});
            model.setValueAt(filtrada.get(i).getIdComponente(), i, 0);
            model.setValueAt(filtrada.get(i).getCodComponente(), i, 1);
            model.setValueAt(filtrada.get(i).getComponente(), i, 2);
            model.setValueAt(retornaStatus(filtrada.get(i).isStatus()), i, 3);

        }
    }

    public void buscaComponente(String nome) {
        List<Componente> filtrada = new ArrayList();
        List<Componente> listarComponentes = componenteDAO.listarComponentes();
        String componenteDigitadoTemp = nome.toLowerCase();
        for (Componente rem : listarComponentes) {
            String prodTemp = rem.getComponente().toLowerCase();
            if (prodTemp.contains(componenteDigitadoTemp)) {
                filtrada.add(rem);
            }
        }
        DefaultTableModel model = (DefaultTableModel) this.tbComponente.getModel();
        model.setNumRows(0);
        for (int i = 0; i < filtrada.size(); i++) {
            model.addRow(new Object[]{});
            model.setValueAt(filtrada.get(i).getIdComponente(), i, 0);
            model.setValueAt(filtrada.get(i).getCodComponente(), i, 1);
            model.setValueAt(filtrada.get(i).getComponente(), i, 2);
            model.setValueAt(retornaStatus(filtrada.get(i).isStatus()), i, 3);

        }

    }
    Componente componente = new Componente();
    ComponenteDAO componenteDAO = new ComponenteDAO();
}
