package UniversityMS;
import java.awt.Color;
import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class SubjectClass extends javax.swing.JFrame {
    String cl, dept, year, id, staf;
    Codes co = new Codes();
    public SubjectClass() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        co.fillComboBox(ClassCom, "SELECT concat(c.cl_no,',',cl_name) cla from class c order by c.cl_no", "cla");
        co.fillComboBox(DeptCom, " select concat(d.dp_no, ',', dp_Name) dept from departments d order by dp_no", "dept");
        co.fillComboBox(staffCom, "SELECT concat(s.st_no, ',', name) stf from staff s order by s.st_no", "stf");
        co.fillComboBox(academicCom, " select concat(a.y_no, ',', year_name) aca from academic a order by y_no", "aca");
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
        academicCom = new RSMaterialComponent.RSComboBoxMaterial();
        ClassCom = new RSMaterialComponent.RSComboBoxMaterial();
        staffCom = new RSMaterialComponent.RSComboBoxMaterial();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        jLabel5 = new javax.swing.JLabel();
        DeptCom = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel6 = new javax.swing.JLabel();
        pertxt = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialIconOne5 = new RSMaterialComponent.RSButtonMaterialIconOne();

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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Subject_Class", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

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
        jLabel4.setText("Class_Num:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Academic Year:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No. of Periods:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        txtser.setForeground(new java.awt.Color(0, 0, 0));
        txtser.setPlaceholder("search");
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 240, 30));

        academicCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Academic year" }));
        academicCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                academicComActionPerformed(evt);
            }
        });
        jPanel2.add(academicCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 240, 30));

        ClassCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Class Number" }));
        ClassCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassComActionPerformed(evt);
            }
        });
        jPanel2.add(ClassCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 240, 30));

        staffCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Staff Num" }));
        staffCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffComActionPerformed(evt);
            }
        });
        jPanel2.add(staffCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 240, 30));

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
        jLabel5.setText("Dept Num:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        DeptCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Department Num" }));
        DeptCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptComActionPerformed(evt);
            }
        });
        jPanel2.add(DeptCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 240, 30));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Staff Num:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        pertxt.setForeground(new java.awt.Color(0, 0, 0));
        pertxt.setPlaceholder("No of Periods");
        jPanel2.add(pertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 240, 30));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 550, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSTextFieldMaterial4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSTextFieldMaterial4ActionPerformed
    }//GEN-LAST:event_rSTextFieldMaterial4ActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        String oper = "insert";
        String sql = "call subject_class_pro('" + cl + "','" + dept + "','"+staf+"','" + year + "','"+pertxt.getText()+"','" + oper + "',null)";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        String oper = "update";
        String sql = "call subject_class_pro('" + cl + "','" + dept + "','"+staf+"','" + year + "','"+pertxt.getText()+"','" + oper + "','" + id + "')";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Ma hubtaa") == JOptionPane.YES_OPTION) {
            String oper = "delete";
            String sql = "call subject_class_pro('" + cl + "','" + dept + "','"+staf+"','" + year + "','"+pertxt.getText()+"','" + oper + "','" + id + "')";
            co.setSql(sql);
        }
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        co.search("SELECT sub_cl,  concat(c.cl_no, ',',cl_name) cla, concat(d.dp_no, ',', dp_Name) dept, concat(a.y_no, ',', year_name) aca, concat(s.st_no, ',', name) stf, no_period from class c, subject_class sb, academic a, staff s, departments d WHERE sb.cl_no = c.cl_no and sb.dp_sub = d.dp_no and sb.y_no = a.y_no and sb.st_no = s.st_no and sub_cl =  '"+txtser.getText()+"'");
        try{
            if(co.rs.next()){
             id = co.rs.getString("sub_cl");
            ClassCom.setSelectedItem(co.rs.getString("cla"));
            DeptCom.setSelectedItem(co.rs.getString("dept"));
            staffCom.setSelectedItem(co.rs.getString("stf"));
            academicCom.setSelectedItem(co.rs.getString("aca"));
            pertxt.setText(co.rs.getString("no_period"));
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

    private void ClassComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassComActionPerformed
        String Array[] = ClassCom.getSelectedItem().toString().split(",");
        cl = Array[0];
    }//GEN-LAST:event_ClassComActionPerformed

    private void DeptComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptComActionPerformed
        // TODO add your handling code here:
        String Array[] = DeptCom.getSelectedItem().toString().split(",");
        dept = Array[0];
                
    }//GEN-LAST:event_DeptComActionPerformed

    private void staffComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffComActionPerformed
        String Array[] = staffCom.getSelectedItem().toString().split(",");
     staf = Array[0];
     
    }//GEN-LAST:event_staffComActionPerformed

    private void academicComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_academicComActionPerformed
   String Array[] = academicCom.getSelectedItem().toString().split(",");
        year = Array[0];    }//GEN-LAST:event_academicComActionPerformed

    private void rSButtonMaterialIconOne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne5ActionPerformed
        // TODO add your handling code here:

        StudentsView sv = new StudentsView();
        sv.show();

    }//GEN-LAST:event_rSButtonMaterialIconOne5ActionPerformed

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
            java.util.logging.Logger.getLogger(SubjectClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBoxMaterial ClassCom;
    private RSMaterialComponent.RSComboBoxMaterial DeptCom;
    private RSMaterialComponent.RSComboBoxMaterial academicCom;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSTextFieldMaterial pertxt;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne5;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial4;
    private RSMaterialComponent.RSComboBoxMaterial staffCom;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    // End of variables declaration//GEN-END:variables
}
