/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

/**
 *
 * @author pedro
 */
public class TelaGestor extends javax.swing.JFrame {

    /**
     * Creates new form TelaAluno
     */
    public TelaGestor() {
        initComponents();
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
        backTelaPrincial = new javax.swing.JButton();
        gerenciarAluno = new javax.swing.JButton();
        gerenciarProfessor = new javax.swing.JButton();
        gerenciarCurso = new javax.swing.JButton();
        gerenciarSala = new javax.swing.JButton();
        gerarRelatorio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backTelaPrincial.setText("Voltar");
        backTelaPrincial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backTelaPrincialActionPerformed(evt);
            }
        });

        gerenciarAluno.setText("Gerenciar Aluno");
        gerenciarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarAlunoActionPerformed(evt);
            }
        });

        gerenciarProfessor.setText("Gerenciar Professor");
        gerenciarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarProfessorActionPerformed(evt);
            }
        });

        gerenciarCurso.setText("Gerenciar Curso");
        gerenciarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarCursoActionPerformed(evt);
            }
        });

        gerenciarSala.setText("Gerenciar Sala");
        gerenciarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarSalaActionPerformed(evt);
            }
        });

        gerarRelatorio.setText("Gerar Relatório");
        gerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Selecione a opção desejada:");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gerarRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerenciarProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerenciarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerenciarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerenciarSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(backTelaPrincial)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(gerenciarAluno)
                .addGap(18, 18, 18)
                .addComponent(gerenciarProfessor)
                .addGap(18, 18, 18)
                .addComponent(gerenciarCurso)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(gerenciarSala)
                        .addGap(18, 18, 18)
                        .addComponent(gerarRelatorio)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backTelaPrincial)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backTelaPrincialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backTelaPrincialActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_backTelaPrincialActionPerformed

    private void gerenciarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarAlunoActionPerformed
        // TODO add your handling code here:
        if (gerenciarAluno.isEnabled()) {
            new TelaGerenciarAluno().setVisible(true);
            dispose();
        } 
        
    }//GEN-LAST:event_gerenciarAlunoActionPerformed

    private void gerenciarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarProfessorActionPerformed
        if (gerenciarProfessor.isEnabled()) {
            new TelaGerenciarProfessor().setVisible(true);
            dispose();
        } 
    }//GEN-LAST:event_gerenciarProfessorActionPerformed

    private void gerenciarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarCursoActionPerformed
        if (gerenciarCurso.isEnabled()) {
            new TelaGerenciarCurso().setVisible(true);
            dispose();
        } 
    }//GEN-LAST:event_gerenciarCursoActionPerformed

    private void gerenciarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarSalaActionPerformed
        if (gerenciarSala.isEnabled()) {
            new TelaGerenciarSala().setVisible(true);
            dispose();
        } 
    }//GEN-LAST:event_gerenciarSalaActionPerformed

    private void gerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioActionPerformed
        if (gerarRelatorio.isEnabled()) {
            new TelaGerarRelatorio().setVisible(true);
            dispose();
        } 
    }//GEN-LAST:event_gerarRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGestor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backTelaPrincial;
    private javax.swing.JButton gerarRelatorio;
    private javax.swing.JButton gerenciarAluno;
    private javax.swing.JButton gerenciarCurso;
    private javax.swing.JButton gerenciarProfessor;
    private javax.swing.JButton gerenciarSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
