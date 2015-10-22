package view;

import dao.ProdutoDAO;
import entity.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entity.Usuario;
import entity.EnumPerfil;

/**
 *
 * @author Eduardo C. Vieira
 */
public class TelaProdutos extends javax.swing.JDialog {

    public TelaProdutos(java.awt.Frame parent, boolean modal) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        atualizaTabelaProdutos();
    }
    
    public TelaProdutos(java.awt.Frame parent, boolean modal, Usuario usuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);

        if (usuario.getPerfil().equals(EnumPerfil.USUARIO)) {
            btnAlterar.setEnabled(false);
            btnAtivar.setEnabled(false);
        }

        btnAtivar.setText("Ativar");
        atualizaTabelaProdutos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtnTipoPesquisa = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnAtivar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rbtnCodigo = new javax.swing.JRadioButton();
        rbtnProduto = new javax.swing.JRadioButton();
        txtPesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PRODUTOS");

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
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
        tbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoMouseClicked(evt);
            }
        });
        tbProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbProdutoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbProduto);
        if (tbProduto.getColumnModel().getColumnCount() > 0) {
            tbProduto.getColumnModel().getColumn(0).setMinWidth(33);
            tbProduto.getColumnModel().getColumn(0).setPreferredWidth(22);
            tbProduto.getColumnModel().getColumn(0).setMaxWidth(22);
            tbProduto.getColumnModel().getColumn(3).setMinWidth(66);
            tbProduto.getColumnModel().getColumn(3).setPreferredWidth(22);
            tbProduto.getColumnModel().getColumn(3).setMaxWidth(66);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pesquisar");

        gbtnTipoPesquisa.add(rbtnCodigo);
        rbtnCodigo.setSelected(true);
        rbtnCodigo.setText("Código");
        rbtnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCodigoActionPerformed(evt);
            }
        });

        gbtnTipoPesquisa.add(rbtnProduto);
        rbtnProduto.setText("Produto");
        rbtnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnProdutoActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVisualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesquisa))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnNovo, btnVisualizar, btnVoltar});

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        int linha = tbProduto.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(tbProduto.getValueAt(linha, 0).toString());
            produto = produtoDAO.getProdutoById(id);
            TelaVisualizarProduto telaVisualisarProduto = new TelaVisualizarProduto(null, true, produto);
            telaVisualisarProduto.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um remetente !!!");
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tbProduto.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o produto que deseja fazer a alteração!");
        } else {
            if (tbProduto.getValueAt(linha, 3).equals("Ativo")) {
                int id = Integer.parseInt(tbProduto.getValueAt(linha, 0).toString());
                //
                produto = produtoDAO.getProdutoById(id);
                TelaNovoProduto telaNovoProduto = new TelaNovoProduto(null, true, false, produto);
                telaNovoProduto.setVisible(true);
                atualizaTabelaProdutos();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não é possível alterar um produto Desativado!!!");
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        TelaNovoProduto telaCadastroProduto = new TelaNovoProduto(null, true);
        telaCadastroProduto.setVisible(true);
        atualizaTabelaProdutos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarActionPerformed
        int linha = tbProduto.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o produto que deseja ativar/desativar!");
        } else {
            int id = Integer.parseInt(tbProduto.getValueAt(linha, 0).toString());

            produto = produtoDAO.getProdutoById(id);

            if (tbProduto.getValueAt(linha, 3).equals("Ativo")) {
                produto.setStatus(false);
            } else {
                produto.setStatus(true);
            }
            if (btnAtivar.getText().equalsIgnoreCase("Ativar")) {
                btnAtivar.setText("Desativar");
                btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
            } else {
                btnAtivar.setText("Ativar");
                btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
            }
            produtoDAO.atualizaStatus(produto);
        }

        atualizaTabelaProdutos();
    }//GEN-LAST:event_btnAtivarActionPerformed

    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
        atualizaBotaoAtivar();
    }//GEN-LAST:event_tbProdutoMouseClicked

    private void rbtnCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCodigoActionPerformed

    private void rbtnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnProdutoActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        String pesquisa = txtPesquisa.getText();
        if (rbtnCodigo.isSelected()) {
            buscaCodigo(pesquisa);
        } else {
            buscaProduto(pesquisa);
        }

    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tbProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProdutoKeyReleased
        atualizaBotaoAtivar();
    }//GEN-LAST:event_tbProdutoKeyReleased

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
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaProdutos dialog = new TelaProdutos(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup gbtnTipoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnCodigo;
    private javax.swing.JRadioButton rbtnProduto;
    private javax.swing.JTable tbProduto;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void atualizaBotaoAtivar() {
        int linha = tbProduto.getSelectedRow();
        if (tbProduto.getValueAt(linha, 3).equals("Ativo")) {
            btnAtivar.setText("Desativar");
            btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
        } else {
            btnAtivar.setText("Ativar");
            btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
        }
    }

    private void atualizaTabelaProdutos() {
        //ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Produto> listarProdutos = produtoDAO.listarProdutos();
        DefaultTableModel model = (DefaultTableModel) this.tbProduto.getModel();
        model.setRowCount(listarProdutos.size());
        for (int i = 0; i < listarProdutos.size(); i++) {
            model.setValueAt(listarProdutos.get(i).getIdProduto(), i, 0);
            model.setValueAt(listarProdutos.get(i).getCodProduto(), i, 1);
            model.setValueAt(listarProdutos.get(i).getProduto(), i, 2);
            model.setValueAt(retornaStatus(listarProdutos.get(i).isStatus()), i, 3);
        }
    }

    private String retornaStatus(Boolean status) {
        return (status ? "Ativo" : "Inativo");
    }
    String strStatus;

    public void buscaCodigo(String nome) {
        //  RemetenteDAO remetenteDAO = new RemetenteDAO();
        List<Produto> filtrada = new ArrayList();
        List<Produto> listarProdutos = produtoDAO.listarProdutos();
        String codigoDigitadoTemp = nome.toLowerCase();
        for (Produto rem : listarProdutos) {
            String codTemp = rem.getCodProduto().toLowerCase();
            if (codTemp.contains(codigoDigitadoTemp)) {
                filtrada.add(rem);
            }
        }
        DefaultTableModel model = (DefaultTableModel) this.tbProduto.getModel();
        model.setNumRows(0);
        for (int i = 0; i < filtrada.size(); i++) {
            model.addRow(new Object[]{});
            model.setValueAt(filtrada.get(i).getIdProduto(), i, 0);
            model.setValueAt(filtrada.get(i).getCodProduto(), i, 1);
            model.setValueAt(filtrada.get(i).getProduto(), i, 2);
            model.setValueAt(retornaStatus(filtrada.get(i).isStatus()), i, 3);

        }
    }

    public void buscaProduto(String nome) {
        List<Produto> filtrada = new ArrayList();
        List<Produto> listarProdutos = produtoDAO.listarProdutos();
        String produtoDigitadoTemp = nome.toLowerCase();
        for (Produto rem : listarProdutos) {
            String prodTemp = rem.getProduto().toLowerCase();
            if (prodTemp.contains(produtoDigitadoTemp)) {
                filtrada.add(rem);
            }
        }
        DefaultTableModel model = (DefaultTableModel) this.tbProduto.getModel();
        model.setNumRows(0);
        for (int i = 0; i < filtrada.size(); i++) {
            model.addRow(new Object[]{});
            model.setValueAt(filtrada.get(i).getIdProduto(), i, 0);
            model.setValueAt(filtrada.get(i).getCodProduto(), i, 1);
            model.setValueAt(filtrada.get(i).getProduto(), i, 2);
            model.setValueAt(retornaStatus(filtrada.get(i).isStatus()), i, 3);

        }
    }

    Produto produto = new Produto();
    ProdutoDAO produtoDAO = new ProdutoDAO();
}
