package UniversityMS;
import java.awt.Color;
import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ExamAttendence extends javax.swing.JFrame {
    String cl, exam, subject, id, day;
    Codes co = new Codes();
    public ExamAttendence() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        co.fillComboBox(Com1, "SELECT concat(sc.sc_no,'-', a.name) arday from student a, student_class sc where a.id = sc.id ORDER BY sc.sc_no", "arday");
        co.fillComboBox(Com2, "SELECT concat(er.er_no, '-', e.exm_name) imtixan from exams e, exam_reg er where e.exm_no = er.exm_no ORDER BY er.er_no", "imtixan");
        co.fillComboBox(Com3, "SELECT concat(s.sub_no, '-', s.sub_name) mado from subjects s ORDER BY s.sub_no", "mado");
        co.fillComboBox(Com4, "SELECT concat(d.day_no, '-', d.dy_name) malin from days d ORDER BY d.day_no ", "malin");
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
        txtser = new RSMaterialComponent.RSTextFieldMaterial();
        Com4 = new RSMaterialComponent.RSComboBoxMaterial();
        Com1 = new RSMaterialComponent.RSComboBoxMaterial();
        Com3 = new RSMaterialComponent.RSComboBoxMaterial();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        jLabel5 = new javax.swing.JLabel();
        Com2 = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel6 = new javax.swing.JLabel();
        rSButtonMaterialIconOne5 = new RSMaterialComponent.RSButtonMaterialIconOne();
        jLabel8 = new javax.swing.JLabel();
        attDate = new com.toedter.calendar.JDateChooser();

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

        jPanel1.setBackground(new java.awt.Color(22, 219, 101));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Exam_Attendence", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 80));

        jPanel2.setBackground(new java.awt.Color(0, 120, 215));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne2.setText("Save");
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(22, 219, 101));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 80, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(22, 219, 101));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 90, -1));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne4.setText("Delete");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(22, 219, 101));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 90, -1));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne1.setText("Clear");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(22, 219, 101));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student_Class_Num:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Day Num:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txtser.setForeground(new java.awt.Color(0, 0, 0));
        txtser.setPlaceholder("search");
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 240, 30));

        Com4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Day Number" }));
        Com4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com4ActionPerformed(evt);
            }
        });
        jPanel2.add(Com4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 240, 30));

        Com1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Student Class Number" }));
        Com1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com1ActionPerformed(evt);
            }
        });
        jPanel2.add(Com1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 240, 30));

        Com3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Subject  Num" }));
        Com3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com3ActionPerformed(evt);
            }
        });
        jPanel2.add(Com3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 240, 30));

        rSButtonIconTwo1.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonIconTwo1.setBackgroundHover(new java.awt.Color(22, 219, 101));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Exam Num:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        Com2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Exam Num" }));
        Com2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com2ActionPerformed(evt);
            }
        });
        jPanel2.add(Com2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 240, 30));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Subject Num:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        rSButtonMaterialIconOne5.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne5.setText("Show All");
        rSButtonMaterialIconOne5.setBackgroundHover(new java.awt.Color(22, 219, 101));
        rSButtonMaterialIconOne5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHOW_CHART);
        rSButtonMaterialIconOne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne5ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 80, -1));
        jPanel2.add(attDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 240, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 550, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSTextFieldMaterial4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSTextFieldMaterial4ActionPerformed
    }//GEN-LAST:event_rSTextFieldMaterial4ActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        String oper = "insert";
        Date d1 = new Date(attDate.getDate().getTime());
        String sql = "call exam_attendance_pro('" + cl + "','" + exam + "','"+subject+"','" + day + "','"+d1+"','" + oper + "',null)";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        String oper = "update";
        Date d1 = new Date(attDate.getDate().getTime());
        String sql = "call exam_attendance_pro('" + cl + "','" + exam + "','"+subject+"','" + day + "','"+d1+"','" + oper + "','" + id + "')";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Ma hubtaa") == JOptionPane.YES_OPTION) {
        String oper = "delete";
        Date d1 = new Date(attDate.getDate().getTime());
        String sql = "call exam_attendance_pro('" + cl + "','" + exam + "','"+subject+"','" + day + "','"+d1+"','" + oper + "','" + id + "')";
        co.setSql(sql);
        }
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        co.search("SELECT ea_no,  concat(sc.sc_no,'-', a.name) arday, concat(er.er_no, '-', e.exm_name) imtixan, concat(s.sub_no, '-', s.sub_name) mado, concat(d.day_no, '-', d.dy_name) malin, att_date from student a, student_class sc, exams e, exam_reg er, subjects s, days d, exam_attendance ea where a.id = sc.id and sc.sc_no = ea.sc_no and er.exm_no = e.exm_no and er.er_no = ea.er_no and s.sub_no = ea.sub_no and d.day_no = ea.day_no and ea.ea_no =   '"+txtser.getText()+"'");
        try{
            if(co.rs.next()){
             id = co.rs.getString("ea_no");
            Com1.setSelectedItem(co.rs.getString("arday"));
            Com2.setSelectedItem(co.rs.getString("imtixan"));
            Com3.setSelectedItem(co.rs.getString("mado"));
            Com4.setSelectedItem(co.rs.getString("malin"));
            attDate.setDate(co.rs.getDate("att_date"));
          
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

    private void Com1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com1ActionPerformed
        String Array[] = Com1.getSelectedItem().toString().split("-");
        cl = Array[0];
    }//GEN-LAST:event_Com1ActionPerformed

    private void Com2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com2ActionPerformed
        // TODO add your handling code here:
        String Array[] = Com2.getSelectedItem().toString().split("-");
        exam = Array[0];
                
    }//GEN-LAST:event_Com2ActionPerformed

    private void Com3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com3ActionPerformed
        String Array[] = Com3.getSelectedItem().toString().split("-");
     subject = Array[0];
     
    }//GEN-LAST:event_Com3ActionPerformed

    private void rSButtonMaterialIconOne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne5ActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_rSButtonMaterialIconOne5ActionPerformed

    private void Com4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com4ActionPerformed
String Array[] = Com4.getSelectedItem().toString().split("-");
   day = Array[0];
    }//GEN-LAST:event_Com4ActionPerformed

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
            java.util.logging.Logger.getLogger(ExamAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ExamAttendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBoxMaterial Com1;
    private RSMaterialComponent.RSComboBoxMaterial Com2;
    private RSMaterialComponent.RSComboBoxMaterial Com3;
    private RSMaterialComponent.RSComboBoxMaterial Com4;
    private com.toedter.calendar.JDateChooser attDate;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne5;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial4;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    // End of variables declaration//GEN-END:variables
}
