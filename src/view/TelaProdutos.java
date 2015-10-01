package view;

import dao.ProdutoDAO;
import entity.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo C. Vieira
 */
public class TelaProdutos extends javax.swing.JDialog {

    public TelaProdutos(java.awt.Frame parent, boolean modal) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        btnAtivar.setText("Ativar");
        atualizaTabelaProdutos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnAtivar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rbtnCodigo = new javax.swing.JRadioButton();
        rbtnItem = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");

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

        btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png"))); // NOI18N
        btnAtivar.setText("Ativar");
        btnAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(tbProduto);
        if (tbProduto.getColumnModel().getColumnCount() > 0) {
            tbProduto.getColumnModel().getColumn(0).setMinWidth(33);
            tbProduto.getColumnModel().getColumn(0).setPreferredWidth(22);
            tbProduto.getColumnModel().getColumn(0).setMaxWidth(22);
            tbProduto.getColumnModel().getColumn(3).setMinWidth(66);
            tbProduto.getColumnModel().getColumn(3).setPreferredWidth(22);
            tbProduto.getColumnModel().getColumn(3).setMaxWidth(66);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualizar)
                    .addComponent(btnAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnAtivar, btnNovo, btnVisualizar, btnVoltar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtivar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisa por:");

        rbtnCodigo.setSelected(true);
        rbtnCodigo.setText("Código");
        rbtnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCodigoActionPerformed(evt);
            }
        });

        rbtnItem.setText("Descrição");
        rbtnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(rbtnCodigo)
                .addGap(21, 21, 21)
                .addComponent(rbtnItem)
                .addGap(93, 93, 93)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(rbtnCodigo)
                    .addComponent(rbtnItem)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)))
                .addGap(16, 16, 16)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if (linha != -1) {
            int id = Integer.parseInt(tbProduto.getValueAt(linha, 0).toString());

            produto = produtoDAO.getProdutoById(id);

            if (produto.getStatus().equals("Ativo")) {
                produto.setStatus("Inativo");
                btnAtivar.setText("Ativar");
                btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
                atualizaTabelaProdutos();
            } else {
                produto.setStatus("Ativo");
                btnAtivar.setText("Desativar");
                btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
                atualizaTabelaProdutos();
            }

            produtoDAO.update(produto);
            atualizaTabelaProdutos();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o produto que deseja Ativar/Desativar !!!");
        }
    }//GEN-LAST:event_btnAtivarActionPerformed

    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
        int linha = tbProduto.getSelectedRow();
        if (tbProduto.getValueAt(linha, 3).equals("Ativo")) {
            btnAtivar.setText("Desativar");
            btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
        } else {
            btnAtivar.setText("Ativar");
            btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
            atualizaTabelaProdutos();
        }
    }//GEN-LAST:event_tbProdutoMouseClicked

    private void rbtnCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCodigoActionPerformed

    private void rbtnItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnItemActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        String pesquisa = txtPesquisa.getText();
       if (rbtnCodigo.isSelected()){
           buscaCodigo(pesquisa);
       }else{
           buscaProduto(pesquisa);
       }
    }//GEN-LAST:event_txtPesquisaActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnCodigo;
    private javax.swing.JRadioButton rbtnItem;
    private javax.swing.JTable tbProduto;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
//List<Produto> listaProdutos = new ArrayList<Produto>();
//    DefaultListModel<Produto> modelo = new DefaultListModel<Produto>();

    private void atualizaTabelaProdutos() {
        //ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Produto> listarProdutos = produtoDAO.listarProdutos();
        DefaultTableModel model = (DefaultTableModel) this.tbProduto.getModel();
        model.setRowCount(listarProdutos.size());
        for (int i = 0; i < listarProdutos.size(); i++) {
            model.setValueAt(listarProdutos.get(i).getIdProduto(), i, 0);
            model.setValueAt(listarProdutos.get(i).getCodProduto(), i, 1);
            model.setValueAt(listarProdutos.get(i).getProduto(), i, 2);
            model.setValueAt(listarProdutos.get(i).getStatus(), i, 3);
        }
    }

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
            model.setValueAt(filtrada.get(i).getStatus(), i, 3);

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
            model.setValueAt(filtrada.get(i).getStatus(), i, 3);

        }
    }

    Produto produto = new Produto();
    ProdutoDAO produtoDAO = new ProdutoDAO();
}
