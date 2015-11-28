package view;

import dao.ManutLaboratorioDAO;
import entity.ManutLaboratorio;
import java.util.ArrayList;
import java.util.List;
//import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entity.Usuario;
import entity.EnumPerfil;

public class TelaManutencaoLaboratorio extends javax.swing.JDialog {

    public TelaManutencaoLaboratorio(java.awt.Frame parent, boolean modal, Usuario usuario) {

        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        if (usuario.getPerfil().equals(EnumPerfil.USUARIO)) {
            btnAlterar.setEnabled(false);
           // btnRelatorios.setEnabled(false);
        }

        atualizaTabelaManut();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtnPesquisar = new javax.swing.ButtonGroup();
        txtPesquisa = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbManut = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        rbtnProduto = new javax.swing.JRadioButton();
        rbtnRemetente = new javax.swing.JRadioButton();
        rbtnData = new javax.swing.JRadioButton();
        rbtnResponsavel = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção de equipamentos");

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

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
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

        tbManut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Remetente", "Produto", "Responsável", "Def. Apresentado", "Num. Serie", "Cham. OAT", "Data", "Tempo Rep."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbManut);
        if (tbManut.getColumnModel().getColumnCount() > 0) {
            tbManut.getColumnModel().getColumn(0).setMinWidth(44);
            tbManut.getColumnModel().getColumn(0).setPreferredWidth(44);
            tbManut.getColumnModel().getColumn(0).setMaxWidth(44);
            tbManut.getColumnModel().getColumn(5).setMinWidth(77);
            tbManut.getColumnModel().getColumn(5).setPreferredWidth(77);
            tbManut.getColumnModel().getColumn(5).setMaxWidth(77);
            tbManut.getColumnModel().getColumn(6).setMinWidth(77);
            tbManut.getColumnModel().getColumn(6).setPreferredWidth(77);
            tbManut.getColumnModel().getColumn(6).setMaxWidth(77);
            tbManut.getColumnModel().getColumn(7).setMinWidth(77);
            tbManut.getColumnModel().getColumn(7).setPreferredWidth(77);
            tbManut.getColumnModel().getColumn(7).setMaxWidth(77);
            tbManut.getColumnModel().getColumn(8).setMinWidth(77);
            tbManut.getColumnModel().getColumn(8).setPreferredWidth(77);
            tbManut.getColumnModel().getColumn(8).setMaxWidth(77);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pesquisar");

        gbtnPesquisar.add(rbtnProduto);
        rbtnProduto.setText("Produto");

        gbtnPesquisar.add(rbtnRemetente);
        rbtnRemetente.setText("Remetente");

        gbtnPesquisar.add(rbtnData);
        rbtnData.setText("Data");

        gbtnPesquisar.add(rbtnResponsavel);
        rbtnResponsavel.setText("Responsável");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(130, 130, 130))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnRemetente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnResponsavel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnData)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnNovo, btnVoltar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVoltar)
                        .addComponent(btnAlterar)
                        .addComponent(btnNovo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnProduto)
                    .addComponent(rbtnRemetente)
                    .addComponent(rbtnData)
                    .addComponent(rbtnResponsavel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tbManut.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione a manutenção que será alterada!!!");
        } else {
            int id = Integer.parseInt(tbManut.getValueAt(linha, 0).toString());
            ManutLaboratorio manutLaboratorio = manutLaboratorioDAO.getManutById(id);
            TelaNovoManutencaoLaboratorio telaCadManutecaoLaboratorio = new TelaNovoManutencaoLaboratorio(null, true, false, manutLaboratorio, usuario);
            telaCadManutecaoLaboratorio.setVisible(true);
            atualizaTabelaManut();

        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        TelaNovoManutencaoLaboratorio telaNovoManut = new TelaNovoManutencaoLaboratorio(null, true);//, null);
        telaNovoManut.setVisible(true);
        atualizaTabelaManut();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        String pesquisa = txtPesquisa.getText();
        if (rbtnRemetente.isSelected()) {
            buscaRemetente(pesquisa);
        } else if (rbtnProduto.isSelected()) {
            buscaProduto(pesquisa);
        } else if (rbtnResponsavel.isSelected()) {
            buscaResponsavel(pesquisa);
        } else if (rbtnData.isSelected()) {
            buscaData(pesquisa);
        }

    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(TelaManutencaoLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaManutencaoLaboratorio dialog = new TelaManutencaoLaboratorio(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup gbtnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnData;
    private javax.swing.JRadioButton rbtnProduto;
    private javax.swing.JRadioButton rbtnRemetente;
    private javax.swing.JRadioButton rbtnResponsavel;
    private javax.swing.JTable tbManut;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void atualizaTabelaManut() {

        List<ManutLaboratorio> listarManuts = manutLaboratorioDAO.listarManuts();
        DefaultTableModel model = (DefaultTableModel) this.tbManut.getModel();
        model.setRowCount(listarManuts.size());
        for (int i = 0; i < listarManuts.size(); i++) {
            model.setValueAt(listarManuts.get(i).getIdManutLaboratorio(), i, 0);
            model.setValueAt(listarManuts.get(i).getRemetente(), i, 1);
            model.setValueAt(listarManuts.get(i).getProduto(), i, 2);
            model.setValueAt(listarManuts.get(i).getTecnico(), i, 3);
            model.setValueAt(listarManuts.get(i).getDefApresentado(), i, 4);

            //model.setValueAt(listarManuts.get(i).getData(), i, 5);
            model.setValueAt(listarManuts.get(i).getNumSerie(), i, 5);
            model.setValueAt(listarManuts.get(i).getChamadoOat(), i, 6);
            //model.setValueAt(listarManuts.get(i).isCorrigidoEmCampo(), i, 8);
            //model.setValueAt(listarManuts.get(i).getDescAtividades(), i, 7);
            model.setValueAt(listarManuts.get(i).getData(), i, 7);
            model.setValueAt(listarManuts.get(i).getTempoReparo(), i, 8);
            //model.setValueAt(listarManuts.get(i).getTecnico(),i,9);
        }
    }

    public void buscaRemetente(String manut) {
        List<ManutLaboratorio> filtrada = new ArrayList();
        List<ManutLaboratorio> listarManuts = manutLaboratorioDAO.listarManuts();
        String manutDigitadoTemp = manut.toLowerCase();
        for (ManutLaboratorio man : listarManuts) {
            String manutTemp = man.getRemetente().toLowerCase();
            if (manutTemp.contains(manutDigitadoTemp)) {
                filtrada.add(man);
            }
        }
        DefaultTableModel model = (DefaultTableModel) this.tbManut.getModel();
        model.setNumRows(0);
        for (int i = 0; i < filtrada.size(); i++) {
            model.addRow(new Object[]{});
            model.setValueAt(filtrada.get(i).getIdManutLaboratorio(), i, 0);
            model.setValueAt(filtrada.get(i).getRemetente(), i, 1);
            model.setValueAt(filtrada.get(i).getProduto(), i, 2);
            model.setValueAt(filtrada.get(i).getTecnico(), i, 3);
            model.setValueAt(filtrada.get(i).getDefApresentado(), i, 4);
            model.setValueAt(filtrada.get(i).getNumSerie(), i, 5);
            model.setValueAt(filtrada.get(i).getChamadoOat(), i, 6);
            model.setValueAt(filtrada.get(i).getData(), i, 7);
            model.setValueAt(filtrada.get(i).getTempoReparo(), i, 8);

        }
    }

    public void buscaProduto(String manut) {
        List<ManutLaboratorio> filtrada = new ArrayList();
        List<ManutLaboratorio> listarManuts = manutLaboratorioDAO.listarManuts();
        String manutDigitadoTemp = manut.toLowerCase();
        for (ManutLaboratorio man : listarManuts) {
            String manutTemp = man.getProduto().toLowerCase();
            if (manutTemp.contains(manutDigitadoTemp)) {
                filtrada.add(man);
            }
        }
        DefaultTableModel model = (DefaultTableModel) this.tbManut.getModel();
        model.setNumRows(0);
        for (int i = 0; i < filtrada.size(); i++) {
            model.addRow(new Object[]{});
            model.setValueAt(filtrada.get(i).getIdManutLaboratorio(), i, 0);
            model.setValueAt(filtrada.get(i).getRemetente(), i, 1);
            model.setValueAt(filtrada.get(i).getProduto(), i, 2);
            model.setValueAt(filtrada.get(i).getTecnico(), i, 3);
            model.setValueAt(filtrada.get(i).getDefApresentado(), i, 4);
            model.setValueAt(filtrada.get(i).getNumSerie(), i, 5);
            model.setValueAt(filtrada.get(i).getChamadoOat(), i, 6);
            model.setValueAt(filtrada.get(i).getData(), i, 7);
            model.setValueAt(filtrada.get(i).getTempoReparo(), i, 8);

        }
    }

    public void buscaResponsavel(String manut) {
        List<ManutLaboratorio> filtrada = new ArrayList();
        List<ManutLaboratorio> listarManuts = manutLaboratorioDAO.listarManuts();
        String manutDigitadoTemp = manut.toLowerCase();
        for (ManutLaboratorio man : listarManuts) {
            String manutTemp = man.getTecnico().toLowerCase();
            if (manutTemp.contains(manutDigitadoTemp)) {
                filtrada.add(man);
            }
        }
        DefaultTableModel model = (DefaultTableModel) this.tbManut.getModel();
        model.setNumRows(0);
        for (int i = 0; i < filtrada.size(); i++) {
            model.addRow(new Object[]{});
            model.setValueAt(filtrada.get(i).getIdManutLaboratorio(), i, 0);
            model.setValueAt(filtrada.get(i).getRemetente(), i, 1);
            model.setValueAt(filtrada.get(i).getProduto(), i, 2);
            model.setValueAt(filtrada.get(i).getTecnico(), i, 3);
            model.setValueAt(filtrada.get(i).getDefApresentado(), i, 4);
            model.setValueAt(filtrada.get(i).getNumSerie(), i, 5);
            model.setValueAt(filtrada.get(i).getChamadoOat(), i, 6);
            model.setValueAt(filtrada.get(i).getData(), i, 7);
            model.setValueAt(filtrada.get(i).getTempoReparo(), i, 8);

        }
    }

    public void buscaData(String manut) {
        List<ManutLaboratorio> filtrada = new ArrayList();
        List<ManutLaboratorio> listarManuts = manutLaboratorioDAO.listarManuts();
        String manutDigitadoTemp = manut.toLowerCase();
        for (ManutLaboratorio man : listarManuts) {
            String manutTemp = man.getData().toLowerCase();
            if (manutTemp.contains(manutDigitadoTemp)) {
                filtrada.add(man);
            }
        }
        DefaultTableModel model = (DefaultTableModel) this.tbManut.getModel();
        model.setNumRows(0);
        for (int i = 0; i < filtrada.size(); i++) {
            model.addRow(new Object[]{});
            model.setValueAt(filtrada.get(i).getIdManutLaboratorio(), i, 0);
            model.setValueAt(filtrada.get(i).getRemetente(), i, 1);
            model.setValueAt(filtrada.get(i).getProduto(), i, 2);
            model.setValueAt(filtrada.get(i).getTecnico(), i, 3);
            model.setValueAt(filtrada.get(i).getDefApresentado(), i, 4);
            model.setValueAt(filtrada.get(i).getNumSerie(), i, 5);
            model.setValueAt(filtrada.get(i).getChamadoOat(), i, 6);
            model.setValueAt(filtrada.get(i).getData(), i, 7);
            model.setValueAt(filtrada.get(i).getTempoReparo(), i, 8);

        }
    }

    Usuario usuario = new Usuario();
    ManutLaboratorio manutLaboratorio = new ManutLaboratorio();
    ManutLaboratorioDAO manutLaboratorioDAO = new ManutLaboratorioDAO();
}
