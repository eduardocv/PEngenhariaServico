package view;

import dao.ComponenteDAO;
import entity.Componente;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;
//import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
//import javax.swing.Spring;
import javax.swing.table.DefaultTableModel;

public class TelaComponentes extends javax.swing.JDialog {

    public TelaComponentes(java.awt.Frame parent, boolean modal) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        btnAtivar.setText("Ativar");
        atualizaTabelaComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtnBuscaCodItem = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnAtivar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbComponente = new javax.swing.JTable();
        rbtnCodigo = new javax.swing.JRadioButton();
        rbtnProduto = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Componentes");

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
        jScrollPane2.setViewportView(tbComponente);
        if (tbComponente.getColumnModel().getColumnCount() > 0) {
            tbComponente.getColumnModel().getColumn(0).setMinWidth(33);
            tbComponente.getColumnModel().getColumn(0).setPreferredWidth(22);
            tbComponente.getColumnModel().getColumn(0).setMaxWidth(22);
            tbComponente.getColumnModel().getColumn(3).setMinWidth(66);
            tbComponente.getColumnModel().getColumn(3).setPreferredWidth(22);
            tbComponente.getColumnModel().getColumn(3).setMaxWidth(66);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualizar)
                    .addComponent(btnAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnAtivar, btnNovo, btnVisualizar, btnVoltar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
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

        gbtnBuscaCodItem.add(rbtnCodigo);
        rbtnCodigo.setSelected(true);
        rbtnCodigo.setText("Código");
        rbtnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCodigoActionPerformed(evt);
            }
        });

        gbtnBuscaCodItem.add(rbtnProduto);
        rbtnProduto.setText("Produto");
        rbtnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisa por:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnProduto))
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnCodigo)
                    .addComponent(rbtnProduto)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        if (linha != -1) {
            int id = Integer.parseInt(tbComponente.getValueAt(linha, 0).toString());

            componente = componenteDAO.getComponenteById(id);

            if (componente.getStatus().equals("Ativo")) {
                componente.setStatus("Inativo");
                btnAtivar.setText("Ativar");
                btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
                atualizaTabelaComponentes();
            } else {
                componente.setStatus("Ativo");
                btnAtivar.setText("Desativar");
                btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
                atualizaTabelaComponentes();
            }

            componenteDAO.update(componente);
            atualizaTabelaComponentes();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o componente que deseja Ativar/Desativar !!!");
        }
    }//GEN-LAST:event_btnAtivarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tbComponente.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o produto que deseja fazer a alteração!");
        } else {
            if (tbComponente.getValueAt(linha, 3).equals("Ativo")) {
                int id = Integer.parseInt(tbComponente.getValueAt(linha, 0).toString());
                //
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
        int linha = tbComponente.getSelectedRow();
        if (tbComponente.getValueAt(linha, 3).equals("Ativo")) {
            btnAtivar.setText("Desativar");
            btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
        } else {
            btnAtivar.setText("Ativar");
            btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
            atualizaTabelaComponentes();
        }
    }//GEN-LAST:event_tbComponenteMouseClicked

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
       String pesquisa = txtPesquisa.getText();
       if (rbtnCodigo.isSelected()){
           buscaCodigo(pesquisa);
       }else{
           buscaComponente(pesquisa);
       }
       
        
    }//GEN-LAST:event_txtPesquisaKeyReleased

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnCodigo;
    private javax.swing.JRadioButton rbtnProduto;
    private javax.swing.JTable tbComponente;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void atualizaTabelaComponentes() {
        //ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Componente> listarComponentes = componenteDAO.listarComponentes();
        DefaultTableModel model = (DefaultTableModel) this.tbComponente.getModel();
        model.setRowCount(listarComponentes.size());
        for (int i = 0; i < listarComponentes.size(); i++) {
            model.setValueAt(listarComponentes.get(i).getIdComponente(), i, 0);
            model.setValueAt(listarComponentes.get(i).getCodComponente(), i, 1);
            model.setValueAt(listarComponentes.get(i).getComponente(), i, 2);
            model.setValueAt(listarComponentes.get(i).getStatus(), i, 3);
        }
    }

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
            model.setValueAt(filtrada.get(i).getStatus(), i, 3);

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
            model.setValueAt(filtrada.get(i).getStatus(), i, 3);

        }

    }
    Componente componente = new Componente();
    ComponenteDAO componenteDAO = new ComponenteDAO();
}
