/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.AlunoController;
import controller.CursoAlunoController;
import controller.CursoController;
import controller.SituacaoCadastroController;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Curso;
import model.CursoAluno;
import model.SituacaoCadastro;


/**
 *
 * @author Matheus
 */
public class CadastroCursoAlunoListGUI extends javax.swing.JInternalFrame {

    private CursoController cursoController = new CursoController();
    private AlunoController alunoController = new AlunoController();
    private SituacaoCadastroController SituacaoCadastroController = new SituacaoCadastroController();
    private CursoAlunoController cursoAlunoController = new CursoAlunoController();
    private CursoAluno cursoAlunoModel = new CursoAluno();
    private Aluno alunoModel = new Aluno();
    private Curso cursoModel = new Curso();
    private SituacaoCadastro situacaoCadastro = new SituacaoCadastro();
    public CadastroCursoAlunoListGUI() {
        initComponents();
        for (SituacaoCadastro situacaocadastro : SituacaoCadastroController.pesquisaSituacaoCadastro()) {
            cbCadastro.removeAll();
            cbCadastro.addItem(situacaocadastro);
            
        }
        List<Aluno> lista = alunoController.pesquisaAluno();
        cbAluno.removeAll();
        
        for(Aluno aluno:lista){
            cbAluno.addItem(aluno);
        }
          List<Curso> listaCurso = cursoController.pesquisaCurso();
        cbCurso.removeAll();
        
        for(Curso curso : listaCurso){
            cbCurso.addItem(curso);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextClasse = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbAluno = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbCurso = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbCadastro = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Cadastro Curso Aluno");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código");

        TextId.setEditable(false);

        jLabel2.setText("Classe");

        TextClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextClasseActionPerformed(evt);
            }
        });

        jLabel3.setText("Aluno");

        cbAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlunoActionPerformed(evt);
            }
        });

        jLabel4.setText("Curso");

        cbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCursoActionPerformed(evt);
            }
        });

        jLabel5.setText("Situação");

        cbCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextClasse)
                    .addComponent(cbAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(cbCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(cbCadastro, 0, 157, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        jButton2.setText("Salvar");
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
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2))
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextClasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextClasseActionPerformed

    private void cbAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlunoActionPerformed
        
    }//GEN-LAST:event_cbAlunoActionPerformed

    private void cbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCursoActionPerformed
      
    }//GEN-LAST:event_cbCursoActionPerformed

    private void cbCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCadastroActionPerformed
        
    }//GEN-LAST:event_cbCadastroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Salvar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Salvar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Limpar();
    }//GEN-LAST:event_jButton3ActionPerformed

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField TextClasse;
    public static javax.swing.JTextField TextId;
    public static javax.swing.JComboBox<Object> cbAluno;
    public static javax.swing.JComboBox<Object> cbCadastro;
    public static javax.swing.JComboBox<Object> cbCurso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    private void Salvar() throws HeadlessException, NumberFormatException {
        Integer codigo;
        if(TextClasse.getText() == null || TextClasse.getText().trim().equals("") ){
            JOptionPane.showMessageDialog(this, "Informe a Descrição!");
            TextClasse.requestFocus();
        }else{
            if(TextId.getText().isEmpty()){
                codigo = null;
                cursoAlunoModel.setCodigo(codigo);
                alunoModel = (Aluno) cbAluno.getSelectedItem();
                cursoModel = (Curso) cbCurso.getSelectedItem();
                situacaoCadastro = (SituacaoCadastro) cbCadastro.getSelectedItem();
                cursoAlunoModel.setClasse(TextClasse.getText());
                cursoAlunoModel.setAluno(alunoModel);
                cursoAlunoModel.setCurso(cursoModel);
                cursoAlunoModel.setSituacaoCadastro(situacaoCadastro);
                cursoAlunoController.salvarCursoAluno(cursoAlunoModel);
                JOptionPane.showMessageDialog(this, "Salvo com sucesso");
                TextId.setText(cursoAlunoModel.getCodigo().toString());
            }else{
                cursoAlunoModel.setCodigo(Integer.parseInt(TextId.getText()));
                alunoModel = (Aluno) cbAluno.getSelectedItem();
                cursoModel = (Curso) cbCurso.getSelectedItem();
                situacaoCadastro = (SituacaoCadastro) cbCadastro.getSelectedItem();
                cursoAlunoModel.setClasse(TextClasse.getText());
                cursoAlunoModel.setAluno(alunoModel);
                cursoAlunoModel.setCurso(cursoModel);
                cursoAlunoModel.setSituacaoCadastro(situacaoCadastro);
                cursoAlunoController.salvarCursoAluno(cursoAlunoModel);
                JOptionPane.showMessageDialog(this, "Salvo com sucesso");
            }
        }
    }
    private void Limpar() {
        TextClasse.setText("");
        TextId.setText("");
    }
}
