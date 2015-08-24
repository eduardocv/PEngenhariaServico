package view;

import view.TelaVisualisarTecnico;
import dao.TecnicoDAO;
import entity.Tecnico;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduardo.vieira
 */
public class TelaTecnico extends javax.swing.JDialog {

    public TelaTecnico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        atualizaTabelaTecnicos();
    }
    Tecnico tecnico;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnVisualisar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTecnicoLab = new javax.swing.JTable();
        btnAtivar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Técnico de Laboratório");
        setIconImage(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Create.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Modify.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnVisualisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/View.png"))); // NOI18N
        btnVisualisar.setText("Visualisar");
        btnVisualisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualisarActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        tbTecnicoLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "E-mail", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTecnicoLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTecnicoLabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTecnicoLab);
        if (tbTecnicoLab.getColumnModel().getColumnCount() > 0) {
            tbTecnicoLab.getColumnModel().getColumn(0).setMinWidth(22);
            tbTecnicoLab.getColumnModel().getColumn(0).setPreferredWidth(22);
            tbTecnicoLab.getColumnModel().getColumn(0).setMaxWidth(22);
            tbTecnicoLab.getColumnModel().getColumn(3).setPreferredWidth(22);
        }

        btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png"))); // NOI18N
        btnAtivar.setText("Ativar");
        btnAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnNovo, btnVisualisar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addGap(9, 9, 9)
                        .addComponent(btnAtivar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar)))
                .addGap(27, 27, 27))
        );

        jLabel1.setText("Pesquisa por Nome:");

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
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        TelaCadastroTecnico telaCadastroTecnico = new TelaCadastroTecnico(null, true);//, true, null);
        telaCadastroTecnico.setVisible(true);
        atualizaTabelaTecnicos();


    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tbTecnicoLab.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o técnico que deseja alterar!");
        } else {
            if (tbTecnicoLab.getValueAt(linha, 3).equals("Ativo")) {
                int id = Integer.parseInt(tbTecnicoLab.getValueAt(linha, 0).toString());
                TecnicoDAO dao = new TecnicoDAO();
                Tecnico tecnico = dao.getTecnicoById(id);
                TelaCadastroTecnico telaCadastroTecnico = new TelaCadastroTecnico(null, true, false, tecnico);
                telaCadastroTecnico.setVisible(true);
                atualizaTabelaTecnicos();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não é possível alterar um técnico Desativado!");
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnVisualisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualisarActionPerformed
        int linha = tbTecnicoLab.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(tbTecnicoLab.getValueAt(linha, 0).toString());
            TecnicoDAO tecnicoDAO = new TecnicoDAO();
            tecnico = tecnicoDAO.getTecnicoById(id);
            TelaVisualisarTecnico telaVisualisarTecnico = new TelaVisualisarTecnico(null, true, tecnico);
            telaVisualisarTecnico.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um técnico!");
        }
    }//GEN-LAST:event_btnVisualisarActionPerformed
    private void mostraTela(List<Tecnico> listarTecnicos) {
        DefaultTableModel model = (DefaultTableModel) this.tbTecnicoLab.getModel();
        model.setRowCount(listarTecnicos.size());
        for (int i = 0; i < 4; i++) {    // i < tbTecnicoLab.getHeight()
            model.setValueAt(listarTecnicos.get(i).getIdTecnico(), i, 0);
            model.setValueAt(listarTecnicos.get(i).getNome(), i, 1);
            model.setValueAt(listarTecnicos.get(i).getEmail(), i, 2);
            model.setValueAt(listarTecnicos.get(i).getStatus(), i, 3);
        }

    }
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarActionPerformed
        int linha = tbTecnicoLab.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(tbTecnicoLab.getValueAt(linha, 0).toString());
            TecnicoDAO tecnicoDAO = new TecnicoDAO();
            tecnico = tecnicoDAO.getTecnicoById(id);

            if (tecnico.getStatus().equals("Ativo")) {
                tecnico.setStatus("Inativo");
                btnAtivar.setText("Ativar");
                btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
                atualizaTabelaTecnicos();
            } else {
                tecnico.setStatus("Ativo");
                btnAtivar.setText("Desativar");
                btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
                atualizaTabelaTecnicos();
            }

            tecnicoDAO.update(tecnico);
            atualizaTabelaTecnicos();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione a empresa que deseja Ativar/Desativar!");
        }


    }//GEN-LAST:event_btnAtivarActionPerformed

    private void tbTecnicoLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTecnicoLabMouseClicked
        int linha = tbTecnicoLab.getSelectedRow();
        if (tbTecnicoLab.getValueAt(linha, 3).equals("Ativo")) {
            btnAtivar.setText("Desativar");
            btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fall.png")));
        } else {
            btnAtivar.setText("Ativar");
            btnAtivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Raise.png")));
            atualizaTabelaTecnicos();
        }
    }//GEN-LAST:event_tbTecnicoLabMouseClicked

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        String nome = txtPesquisa.getText();
        buscaNome(nome);
    }//GEN-LAST:event_txtPesquisaKeyReleased

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
            java.util.logging.Logger.getLogger(TelaTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaTecnico dialog = new TelaTecnico(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnVisualisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTecnicoLab;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
//List<Tecnico> listaTecnicos = new ArrayList<Tecnico>();
//    DefaultListModel<Tecnico> modelo = new DefaultListModel<Tecnico>();

    private void atualizaTabelaTecnicos() {
        TecnicoDAO tecnicoDAO = new TecnicoDAO();
        List<Tecnico> listarTecnicos = tecnicoDAO.listarTecnicos();

        //pega o modelo da Tabela e coloca na variavel "model"
        DefaultTableModel model = (DefaultTableModel) this.tbTecnicoLab.getModel();
        //insere na tabela o número de linhas que a lista tem
        model.setRowCount(listarTecnicos.size());

        //laço para inserir os dados dos objetos na Tabela
        for (int i = 0; i < listarTecnicos.size(); i++) {

            model.setValueAt(listarTecnicos.get(i).getIdTecnico(), i, 0);
            model.setValueAt(listarTecnicos.get(i).getNome(), i, 1);
            model.setValueAt(listarTecnicos.get(i).getEmail(), i, 2);
            model.setValueAt(listarTecnicos.get(i).getStatus(), i, 3);
        }

    }

    public void buscaNome(String nome) {
        TecnicoDAO tecnicoDAO = new TecnicoDAO();
        List<Tecnico> filtrada = new ArrayList();
        List<Tecnico> listarTecnicos = tecnicoDAO.listarTecnicos();
        String nomeDigitadoTemp = nome.toLowerCase();
        for (Tecnico tec : listarTecnicos) {
            String nomeTemp = tec.getNome().toLowerCase();
            //System.out.println(nomeTemp + " - " + nomeDigitadoTemp);
            if (nomeTemp.contains(nomeDigitadoTemp)) {
                filtrada.add(tec);
            }
        }
        DefaultTableModel model = (DefaultTableModel) this.tbTecnicoLab.getModel();
        model.setNumRows(0);
        for (int i = 0; i < filtrada.size(); i++) {
            model.addRow(new Object[]{});
            model.setValueAt(filtrada.get(i).getIdTecnico(), i, 0);
            model.setValueAt(filtrada.get(i).getNome(), i, 1);
            model.setValueAt(filtrada.get(i).getEmail(), i, 2);
            model.setValueAt(filtrada.get(i).getStatus(), i, 3);
        }
    }

}
