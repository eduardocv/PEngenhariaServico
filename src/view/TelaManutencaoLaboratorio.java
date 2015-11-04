package view;

/**
 *
 * @author eduardo.vieira
 */

import dao.ManutLaboratorioDAO;
import entity.ManutLaboratorio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entity.Usuario;
import entity.EnumPerfil;

public class TelaManutencaoLaboratorio extends javax.swing.JDialog {

    public TelaManutencaoLaboratorio(java.awt.Frame parent, boolean modal) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        atualizaTabelaManut();
    }

    public TelaManutencaoLaboratorio(java.awt.Frame parent, boolean modal, Usuario usuario) {

        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        if (usuario.getPerfil().equals(EnumPerfil.USUARIO)) {
            btnAlterar.setEnabled(false);
            btnRelatorios.setEnabled(false);
        }

        atualizaTabelaManut();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtnPesquisar = new javax.swing.ButtonGroup();
        txtPesquisa = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JToggleButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbManut = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        rbtnProduto = new javax.swing.JRadioButton();
        rbtnNumSerie = new javax.swing.JRadioButton();
        rbtnRemetente = new javax.swing.JRadioButton();
        rbtnData = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        btnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/List.png"))); // NOI18N
        btnRelatorios.setText("Relatórios");
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
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
                "ID", "Remetente", "Produto", "Def. Relatado", "Def. Apresentado", "Num. Serie", "Cham. OAT", "Desc. Atividades", "Tempo Rep."
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
            tbManut.getColumnModel().getColumn(1).setMinWidth(66);
            tbManut.getColumnModel().getColumn(1).setPreferredWidth(66);
            tbManut.getColumnModel().getColumn(1).setMaxWidth(66);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pesquisar");

        gbtnPesquisar.add(rbtnProduto);
        rbtnProduto.setText("Produto");

        gbtnPesquisar.add(rbtnNumSerie);
        rbtnNumSerie.setText("Nº de Série");

        gbtnPesquisar.add(rbtnRemetente);
        rbtnRemetente.setText("Remetente");

        gbtnPesquisar.add(rbtnData);
        rbtnData.setText("Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 739, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnProduto)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnNumSerie)
                                .addGap(21, 21, 21)
                                .addComponent(rbtnRemetente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addComponent(rbtnData)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRelatorios)
                    .addComponent(btnVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnNovo, btnRelatorios, btnVisualizar, btnVoltar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRelatorios)
                        .addGap(18, 18, 18)
                        .addComponent(btnVisualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnProduto)
                            .addComponent(rbtnNumSerie)
                            .addComponent(rbtnRemetente)
                            .addComponent(rbtnData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed

    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        TelaRelatorios telaRelatorios = new TelaRelatorios(null, true);
        telaRelatorios.setVisible(true);
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tbManut.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione manutenção a ser alterada!!!");
        } else {
            int id = Integer.parseInt(tbManut.getValueAt(linha, 0).toString());
            //ManutLaboratorioDAO manutLaboratorioDAO = new ManutLaboratorioDAO();
            ManutLaboratorio manutLaboratorio = manutLaboratorioDAO.getManutById(id);
            TelaNovoManutencaoLaboratorio telaCadManutecaoLaboratorio = new TelaNovoManutencaoLaboratorio(null, true, manutLaboratorio);
            telaCadManutecaoLaboratorio.setVisible(true);
            atualizaTabelaManut();

        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        TelaNovoManutencaoLaboratorio telaNovoManut = new TelaNovoManutencaoLaboratorio(null, true, null);
        telaNovoManut.setVisible(true);
        atualizaTabelaManut();
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
                TelaManutencaoLaboratorio dialog = new TelaManutencaoLaboratorio(new javax.swing.JFrame(), true);
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
    private javax.swing.JToggleButton btnRelatorios;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup gbtnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnData;
    private javax.swing.JRadioButton rbtnNumSerie;
    private javax.swing.JRadioButton rbtnProduto;
    private javax.swing.JRadioButton rbtnRemetente;
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
            model.setValueAt(listarManuts.get(i).getDefRelatado(), i, 3);
            model.setValueAt(listarManuts.get(i).getDefApresentado(), i, 4);
            //model.setValueAt(listarManuts.get(i).getData(), i, 5);
            model.setValueAt(listarManuts.get(i).getNumSerie(), i, 5);
            model.setValueAt(listarManuts.get(i).getChamadoOat(), i, 6);
            //model.setValueAt(listarManuts.get(i).isCorrigidoEmCampo(), i, 8);
            model.setValueAt(listarManuts.get(i).getDescAtividades(), i, 7);
            model.setValueAt(listarManuts.get(i).getTempoReparo(), i, 8);
        }
    }
    ManutLaboratorio manutLaboratorio = new ManutLaboratorio();
    ManutLaboratorioDAO manutLaboratorioDAO = new ManutLaboratorioDAO();
}
