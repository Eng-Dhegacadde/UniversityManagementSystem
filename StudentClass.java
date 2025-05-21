
package UniversityMS;
import java.awt.Color;
import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class StudentClass extends javax.swing.JFrame {
    String cl, st, year, id;
    Codes co = new Codes();
    public StudentClass() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        co.fillComboBox(com1, "SELECT concat(c.cl_no,',',cl_name) cla from class c order by c.cl_no", "cla");
        co.fillComboBox(com3, "select concat(a.y_no,',',year_name) yeer from academic a", "yeer");
        co.fillComboBox(com2, "select concat(s.id,',',s.name) st from student s order by s.id", "st");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSTextFieldMaterial4 = new RSMaterialComponent.RSTextFieldMaterial();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtser = new RSMaterialComponent.RSTextFieldMaterial();
        com3 = new RSMaterialComponent.RSComboBoxMaterial();
        com1 = new RSMaterialComponent.RSComboBoxMaterial();
        com2 = new RSMaterialComponent.RSComboBoxMaterial();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();

        rSTextFieldMaterial4.setBackground(new java.awt.Color(255, 204, 204));
        rSTextFieldMaterial4.setColorMaterial(new java.awt.Color(255, 51, 51));
        rSTextFieldMaterial4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rSTextFieldMaterial4.setPlaceholder("Institution");
        rSTextFieldMaterial4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSTextFieldMaterial4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Student_Class", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 80));

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne2.setText("Save");
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 80, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 90, -1));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne4.setText("Delete");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 90, -1));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne1.setText("Clear");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Class_Num:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Academic Year:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student_ID:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtser.setForeground(new java.awt.Color(0, 0, 0));
        txtser.setPhColor(new java.awt.Color(0, 0, 0));
        txtser.setPlaceholder("search");
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 180, 30));

        com3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Academic year" }));
        com3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com3ActionPerformed(evt);
            }
        });
        jPanel2.add(com3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 240, 30));

        com1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Class Number" }));
        com1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com1ActionPerformed(evt);
            }
        });
        jPanel2.add(com1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 240, 30));

        com2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Student ID" }));
        com2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com2ActionPerformed(evt);
            }
        });
        jPanel2.add(com2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 240, 30));

        rSButtonIconTwo1.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonIconTwo1.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 450, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSTextFieldMaterial4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSTextFieldMaterial4ActionPerformed
    }//GEN-LAST:event_rSTextFieldMaterial4ActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        String oper = "insert";
        String sql = "call student_class_pro('" + cl + "','" + st + "','" + year + "','" + oper + "',null)";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        String oper = "update";
        String sql = "call student_class_pro('" + cl + "','" + st + "','" + year + "','" + oper + "','" + id + "')";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Ma hubtaa") == JOptionPane.YES_OPTION) {
            String oper = "delete";
            String sql = "call student_class_pro('" + cl + "','" + st + "','" + year + "','" + oper + "','" + id + "')";
            co.setSql(sql);
        }
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        co.search("SELECT sc_no, concat(c.cl_no,',',cl_name) cl, concat(s.id,',',s.name) st, concat(a.y_no,',',year_name) yr from student_class sc, student s, academic a, class c where c.cl_no = sc.cl_no and s.id = sc.id and a.y_no = sc.y_no and sc.sc_no = '"+txtser.getText()+"'");
        try{
            if(co.rs.next()){
             id = co.rs.getString("sc_no");
            com1.setSelectedItem(co.rs.getString("cl"));
            com2.setSelectedItem(co.rs.getString("st"));
            com3.setSelectedItem(co.rs.getString("yr"));
            } 
     else
           {
                JOptionPane.showMessageDialog(null, txtser.getText()+" not found");
            }
                
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_rSButtonIconTwo1ActionPerformed

    private void com1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com1ActionPerformed
        // TODO add your handling code here:
           String Array[] = com1.getSelectedItem().toString().split(",");
        cl = Array[0];
    }//GEN-LAST:event_com1ActionPerformed

    private void com2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com2ActionPerformed
        // TODO add your handling code here:
           String Array[] = com2.getSelectedItem().toString().split(",");
        st = Array[0];
    }//GEN-LAST:event_com2ActionPerformed

    private void com3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com3ActionPerformed
        // TODO add your handling code here:
           String Array[] = com3.getSelectedItem().toString().split(",");
        year = Array[0];
    }//GEN-LAST:event_com3ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new StudentClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBoxMaterial com1;
    private RSMaterialComponent.RSComboBoxMaterial com2;
    private RSMaterialComponent.RSComboBoxMaterial com3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial4;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    // End of variables declaration//GEN-END:variables
}
