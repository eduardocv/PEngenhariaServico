package view;

import dao.ProdutoDAO;
import entity.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaProdutos extends javax.swing.JDialog {

    public TelaProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setLocationRelativeTo(parent);
        initComponents();
        atualizaListaProdutos();
    }

    public void atualizaListaProdutos() {
        DefaultListModel<Produto> modelo = new DefaultListModel<Produto>();
        ProdutoDAO produtoDAO = new ProdutoDAO();

        listaProdutos = produtoDAO.listarProdutos();
        modelo = new DefaultListModel<Produto>();
        for (Produto produto : listaProdutos) {
            modelo.addElement(produto);
        }
        lstProdutos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnItem = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProdutos = new javax.swing.JList();
        btnVoltar1 = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnAtivar = new javax.swing.JToggleButton();
        btnAlterar1 = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbtnCodigo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");

        rbtnItem.setText("Item");
        rbtnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnItemActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstProdutos);

        btnVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        btnVoltar1.setText("Voltar");
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });

        btnVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/View.png"))); // NOI18N
        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png"))); // NOI18N
        btnAtivar.setText("Desativar");
        btnAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarActionPerformed(evt);
            }
        });

        btnAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Modify.png"))); // NOI18N
        btnAlterar1.setText("Alterar");
        btnAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar1ActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Create.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnVoltar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVisualizar))
                    .addComponent(btnAtivar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtivar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel1.setText("Pesquisa por:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        rbtnCodigo.setSelected(true);
        rbtnCodigo.setText("Código");
        rbtnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(rbtnCodigo)
                .addGap(18, 18, 18)
                .addComponent(rbtnItem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnCodigo)
                    .addComponent(rbtnItem)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnItemActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        ProdutoDAO produtoDAO = new ProdutoDAO();
        //         if(rbtnCodigo.getSelectedIcon().toString() == "descricao"){
        //             if (rbtnCodigoActionPerformed(null)){
        listaProdutos = produtoDAO.buscarPorCod(txtBuscar.getText());
        //                 }else{
        //                 listaProdutos = produtoDAO.buscarPorDesc(txtBuscar.getText());
        //                }
        modelo = new DefaultListModel<Produto>();
        for (Produto produto : listaProdutos) {
            modelo.addElement(produto);
        }
        lstProdutos.setModel(modelo);

        // fazer funcionar a escolha da busca por codigo ou descrição????
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void rbtnCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCodigoActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
       if (lstProdutos.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Favor selecionar um produto");
        } else {
            TelaVisualizarProduto telaDetalhesProduto = new TelaVisualizarProduto(null, true);
            telaDetalhesProduto.setVisible(true);
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarActionPerformed
        //        if (lstProdutos.getSelectedIndex() == -1) {
        //            JOptionPane.showMessageDialog(null, "Favor selecionar um produto");
        //        } else {
        //
        //            int excluir = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir", "EXCLUSÃO", JOptionPane.YES_NO_OPTION);
        //            if (excluir == 0) {
        //           ProdutoDAO produtoDAO = new ProdutoDAO();
        //                Produto produto = (Produto) lstProdutos.getSelectedValue();
        //                produtoDAO.delete(produto.getIdProduto());
        //                atualizaLista();
        //            }
        //        }
    }//GEN-LAST:event_btnAtivarActionPerformed

    private void btnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar1ActionPerformed
        Produto produto = new Produto();
        if (lstProdutos.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Favor selecionar um produto");
        } else {
            produto = (Produto) lstProdutos.getSelectedValue();
            TelaNovoProduto telaCadastroProduto = new TelaNovoProduto(null, true);
            telaCadastroProduto.setVisible(true);
            //   atualizaLista();
            //   atualizaListaProdutos();
        }
    }//GEN-LAST:event_btnAlterar1ActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
          TelaNovoProduto telaCadastroProduto = new TelaNovoProduto(null, true);
        telaCadastroProduto.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

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
    private javax.swing.JButton btnAlterar1;
    private javax.swing.JToggleButton btnAtivar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstProdutos;
    private javax.swing.JRadioButton rbtnCodigo;
    private javax.swing.JRadioButton rbtnItem;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
List<Produto> listaProdutos = new ArrayList<Produto>();
    DefaultListModel<Produto> modelo = new DefaultListModel<Produto>();

}
