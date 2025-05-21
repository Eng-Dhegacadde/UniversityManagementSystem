package UniversityMS;
import javax.swing.JFrame;
public class StudentClassView extends javax.swing.JFrame {
Codes co = new Codes();
    public StudentClassView() {
        initComponents();
        co.viewTable("call  student_class_view", rSTableMetro1);
         this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         // this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSButtonMaterialIconTwo1 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        jScrollPane2 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 219, 101));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Class View", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialIconTwo1.setBackground(new java.awt.Color(22, 219, 101));
        rSButtonMaterialIconTwo1.setText("Add  Student Class");
        rSButtonMaterialIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        rSButtonMaterialIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
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
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(58, 66, 226));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setRowHeight(32);
        jScrollPane2.setViewportView(rSTableMetro1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1300, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo1ActionPerformed
        StudentClass sc = new StudentClass();
        sc.show();
      
    }//GEN-LAST:event_rSButtonMaterialIconTwo1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentClassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentClassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentClassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentClassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentClassView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo1;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    // End of variables declaration//GEN-END:variables
}
