/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.AlunoController;
import controller.SituacaoCadastroController;
import java.awt.HeadlessException;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.TimerTask;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import model.Aluno;
import model.SituacaoCadastro;
import model.VRTableModel;
import javax.swing.JPanel;
import javax.swing.Timer;
import model.GerenciadorCaracteres;
import model.GerenciadorJanela;
import model.GerenciadorNumeros;
import model.LookAndFeel;

/**
 *
 * @author Matheus
 */
public class ConsultaAlunoListGUI extends javax.swing.JInternalFrame {

    private Aluno alunoModel = new Aluno();
    private AlunoController alunoController = new AlunoController();
    private SituacaoCadastro situacaoCadastroModel = new SituacaoCadastro();
    private SituacaoCadastroController SituacaoCadastroController = new SituacaoCadastroController();
    private JDesktopPane desktop;
    private LookAndFeel tela = new LookAndFeel();
    GerenciadorJanela gerenciador = new GerenciadorJanela();
    CadastroAlunoListGUI cadastro = new CadastroAlunoListGUI();
    
  
    public ConsultaAlunoListGUI(JDesktopPane desktop)  {
        initComponents();
        TextId.setDocument(new GerenciadorNumeros());
 
        this.desktop = desktop;
        tela.lookAndFeel(this, tela.VISUALJAVA);
        
      
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JDesktop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        TextId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbSituacao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        BtSair = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta Aluno");
        setVisible(true);

        JDesktop.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nome");

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        TextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdActionPerformed(evt);
            }
        });

        jLabel2.setText("C??digo");

        cbSituacao.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbSituacaoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSituacaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Situa????o");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);

        javax.swing.GroupLayout JDesktopLayout = new javax.swing.GroupLayout(JDesktop);
        JDesktop.setLayout(JDesktopLayout);
        JDesktopLayout.setHorizontalGroup(
            JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                    .addGroup(JDesktopLayout.createSequentialGroup()
                        .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesquisa)
                            .addGroup(JDesktopLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(72, 72, 72)))
                        .addGap(18, 18, 18)
                        .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JDesktopLayout.createSequentialGroup()
                                .addComponent(TextId)
                                .addGap(18, 18, 18))
                            .addGroup(JDesktopLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(103, 103, 103)))
                        .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JDesktopLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(57, 57, 57)))))
                .addContainerGap())
        );
        JDesktopLayout.setVerticalGroup(
            JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        BtSair.setText("Sair");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consultar.png"))); // NOI18N
        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(BtSair)
                .addComponent(jButton2))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consultar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(JDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        setBounds(0, 0, 729, 662);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed

    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtSairActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        gerenciador.GerenciadorJanela(cadastro, desktop);
        cadastro.TextNome.setText("");
        cadastro.Id.setText("");
        cadastro.cbCadastro.setSelectedIndex(0);
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pesquisar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pesquisar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbSituacaoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbSituacaoAncestorAdded
        List<SituacaoCadastro> listaSituacaoCadastro = SituacaoCadastroController.pesquisaSituacaoCadastro();
        cbSituacao.removeAll();
        
        for (SituacaoCadastro situacaocadastro : listaSituacaoCadastro) {
            cbSituacao.addItem(situacaocadastro);
            
        }
        cbSituacao.addItem("TODOS");
        
    }//GEN-LAST:event_cbSituacaoAncestorAdded

    private void TextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
     if(evt.getClickCount() == 2){
         if(!cadastro.isVisible()){
             Editar();
         }
        cadastro.toFront();
             
         
         
          
     }
       

    }//GEN-LAST:event_tabelaMouseClicked

    

    private void tabelaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMousePressed
     
    }//GEN-LAST:event_tabelaMousePressed

    private void cbSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSituacaoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Editar();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtSair;
    private javax.swing.JPanel JDesktop;
    private javax.swing.JTextField TextId;
    private javax.swing.JComboBox<Object> cbSituacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void pesquisar() throws HeadlessException {
        String descricao;
        Integer codigo;
        String pesquisa;
        

        if (TextId.getText().isEmpty() && txtPesquisa.getText().isEmpty() )  {
            JOptionPane.showMessageDialog(this, "Digite um campo para Consulta");
            descricao = null;
            pesquisa = null;
          

        } else {
            if(TextId.getText().isEmpty()){
            codigo = null;
            alunoModel.setId(codigo);
            descricao = txtPesquisa.getText();
         
            if("TODOS".equals(cbSituacao.getSelectedItem())){
                alunoModel.setTeste("");
            }else{
                pesquisa = cbSituacao.getSelectedItem().toString();
                alunoModel.setTeste(pesquisa);
            }
            }
            else{
             codigo = Integer.parseInt(TextId.getText());  
             alunoModel.setId(codigo);   
             descricao = txtPesquisa.getText();
         
            if("TODOS".equals(cbSituacao.getSelectedItem())){
                alunoModel.setTeste("");
            }else{
                pesquisa = cbSituacao.getSelectedItem().toString();
                alunoModel.setTeste(pesquisa);
            }   
            }
        VRTableModel tableModel = new VRTableModel();
        tableModel.addColumn("C??digo");
        tableModel.addColumn("Nome Aluno");

        for (Aluno v : alunoController.listaAluno(descricao, alunoModel)) {
            tableModel.addRow(new Object[]{
                v.getId(),
                v.getNome()

            });
        }
        tabela.setModel(tableModel);
        }

        
       
    }
    
    private void Editar() throws NumberFormatException {
        int linha = tabela.getSelectedRow();
        if(linha >= 0){
        gerenciador.GerenciadorJanela(cadastro, desktop);
        String id = tabela.getValueAt(tabela.getSelectedRow(), 0).toString();
        alunoModel.setId(Integer.parseInt(id));
         for(Aluno v : alunoController.pesquisaSituacao(alunoModel)){
             cadastro.Id.setText(v.getId().toString());
             cadastro.TextNome.setText(v.getNome().toString());
            for (int i = 0; i < cadastro.cbCadastro.getItemCount(); i++) {
            
            if (((SituacaoCadastro) cadastro.cbCadastro.getItemAt(i)).getId() == v.getId_situacaocadastro()) {
                cadastro.cbCadastro.setSelectedIndex(i);
            }
        }
         }
        cadastro.toFront();
    }else{
             JOptionPane.showMessageDialog(this, "Selecione um Aluno");
        }
    }
}
