/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjava;

/**
 *
 * @author adrianojr
 */
public class InterfaceCalc extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceCalc
     */
    public InterfaceCalc() {
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

        jBSoma = new javax.swing.JButton();
        jBSub = new javax.swing.JButton();
        jTVal1 = new javax.swing.JTextField();
        jTVal2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResult = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBSoma.setText("Soma");
        jBSoma.setActionCommand("jBSoma");
        jBSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomaActionPerformed(evt);
            }
        });

        jBSub.setText("Subtrai");
        jBSub.setActionCommand("jBsub");

        jTVal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTVal1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTVal2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jTVal1)
                    .addComponent(jBSoma)
                    .addComponent(jBSub)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTVal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTVal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSoma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTVal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTVal1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTVal1ActionPerformed

    private void jBSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSomaActionPerformed

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
	  java.util.logging.Logger.getLogger(InterfaceCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
	  java.util.logging.Logger.getLogger(InterfaceCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
	  java.util.logging.Logger.getLogger(InterfaceCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	  java.util.logging.Logger.getLogger(InterfaceCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
	  public void run() {
	      new InterfaceCalc().setVisible(true);
	  }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSoma;
    private javax.swing.JButton jBSub;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTResult;
    private javax.swing.JTextField jTVal1;
    private javax.swing.JTextField jTVal2;
    // End of variables declaration//GEN-END:variables
}