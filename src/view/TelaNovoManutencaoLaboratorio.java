

package view;

import dao.ComponenteDAO;
import dao.ProdutoDAO;
import dao.RemetenteDAO;
import entity.Componente;
import entity.Produto;
import entity.Remetente;
import entity.Usuario;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entity.Usuario;

/**
 *
 * @author eduardo.vieira
 */
public class TelaNovoManutencaoLaboratorio extends javax.swing.JDialog {

    /**
     * Creates new form TelaManutencaoLaboratorio
     */
    public TelaNovoManutencaoLaboratorio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Manutenção de equipamentos");       
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        atualizaProduto();
        atualizaRemetente();
        atualizaComponente();
        lblData.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
    //    uhuuulll manda a hora atual para o label.
   lblUsuario.setText(usuario.getNome());
   // fazer uma maneira que o nome do usuario apareça aqui.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDefeitoRelatado = new javax.swing.JTextField();
        txtChamadoOat = new javax.swing.JTextField();
        txtNumSerie = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbProduto = new javax.swing.JComboBox();
        cbRemetente = new javax.swing.JComboBox();
        lblData = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtTempoReparo = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMaterialUtilizado = new javax.swing.JList();
        btnExcluir = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        cbComponente = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        lblUsuario = new javax.swing.JLabel();
        txtDefeitoConstatado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Defeito Relatado:");

        jLabel2.setText("Defeito Constatado:");

        jLabel3.setText("Data:");

        jLabel4.setText("Chamado/OAT:");

        jLabel5.setText("Nº de Série:");

        jLabel9.setText("Remetente:");

        jLabel10.setText("Produto:");

        cbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutoActionPerformed(evt);
            }
        });

        cbRemetente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRemetenteActionPerformed(evt);
            }
        });

        lblData.setText("-");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Componente(s) utilizado(s)"));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Save.png"))); // NOI18N
        jButton1.setText("Salvar");

        try {
            txtTempoReparo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("Tempo aproximado de reparo:");

        jScrollPane2.setViewportView(lstMaterialUtilizado);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Bad mark.png"))); // NOI18N
        btnExcluir.setText("Excluir");

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Good mark.png"))); // NOI18N
        btnIncluir.setText("Incluir");

        cbComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbComponenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(btnExcluir)
                            .addGap(27, 27, 27)
                            .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cbComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTempoReparo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(btnVoltar)))
                        .addGap(29, 29, 29)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnIncluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTempoReparo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setText("Poderia ter sido corrigido em campo");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição das atividades"));

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        lblUsuario.setText("USUÁRIO");

        jLabel6.setText("Nº ID da manutenção:");

        lblId.setText("-");

        jLabel7.setText("Técnico:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDefeitoConstatado, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblId)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblUsuario))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDefeitoRelatado, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblData)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtChamadoOat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbRemetente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDefeitoConstatado, txtDefeitoRelatado});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario)
                            .addComponent(jLabel6)
                            .addComponent(lblId)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cbRemetente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDefeitoRelatado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDefeitoConstatado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(lblData)
                            .addComponent(txtChamadoOat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutoActionPerformed
    
    }//GEN-LAST:event_cbProdutoActionPerformed

    private void cbRemetenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRemetenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRemetenteActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void cbComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbComponenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbComponenteActionPerformed
public void atualizaRemetente(){
        RemetenteDAO remetenteDAO = new RemetenteDAO();
       List<Remetente> listarRemetentes = remetenteDAO.listarRemetentes();
       for (Remetente remetente : listarRemetentes){
           cbRemetente.addItem(remetente);
       }
    }
    public void atualizaProduto(){
        ProdutoDAO produtoDAO = new ProdutoDAO();
       List<Produto> listarProduto = produtoDAO.listarProdutos();
       for (Produto produto : listarProduto){
           cbProduto.addItem(produto);
       }
          }
     public void atualizaComponente(){
        ComponenteDAO componenteDAO = new ComponenteDAO();
        List<Componente> listarComponentes = componenteDAO.listarComponentes();
        for (Componente componente : listarComponentes){
            cbComponente.addItem(componente);
        }
       }
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
            java.util.logging.Logger.getLogger(TelaNovoManutencaoLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovoManutencaoLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovoManutencaoLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovoManutencaoLaboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaNovoManutencaoLaboratorio dialog = new TelaNovoManutencaoLaboratorio(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cbComponente;
    private javax.swing.JComboBox cbProduto;
    private javax.swing.JComboBox cbRemetente;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList lstMaterialUtilizado;
    private javax.swing.JTextField txtChamadoOat;
    private javax.swing.JTextField txtDefeitoConstatado;
    private javax.swing.JTextField txtDefeitoRelatado;
    private javax.swing.JTextField txtNumSerie;
    private javax.swing.JFormattedTextField txtTempoReparo;
    // End of variables declaration//GEN-END:variables


Usuario usuario = new Usuario();
}
