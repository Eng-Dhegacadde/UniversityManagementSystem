package UniversityMS;
import java.awt.Color;
import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ResultExam extends javax.swing.JFrame {
    String sub, st,  id, exam;
    Codes co = new Codes();
    public ResultExam() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        co.fillComboBox(com1, "SELECT concat(s.id, ',', name) arday from student s order by s.id", "arday");
        co.fillComboBox(com2, " SELECT concat(sb.sub_no, ',', sub_name) mado from subjects sb order by sub_no", "mado");
        co.fillComboBox(com3, "SELECT concat(r.er_no, ',', e.exm_name) 'imtixan' from exams e, exam_reg r where e.exm_no = r.exm_no order by er_no", "imtixan");
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
        jLabel3 = new javax.swing.JLabel();
        txtser = new RSMaterialComponent.RSTextFieldMaterial();
        com2 = new RSMaterialComponent.RSComboBoxMaterial();
        com3 = new RSMaterialComponent.RSComboBoxMaterial();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        jLabel6 = new javax.swing.JLabel();
        pertxt = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel7 = new javax.swing.JLabel();
        com1 = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel8 = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();

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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Exam Result", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 80));

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
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 80, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 90, -1));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne4.setText("Delete");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 90, -1));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne1.setText("Clear");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subject Number:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marks:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        txtser.setForeground(new java.awt.Color(0, 0, 0));
        txtser.setPhColor(new java.awt.Color(0, 0, 0));
        txtser.setPlaceholder("search");
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 180, 30));

        com2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Subject Number" }));
        com2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com2ActionPerformed(evt);
            }
        });
        jPanel2.add(com2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 240, 40));

        com3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Exam Register Num" }));
        com3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com3ActionPerformed(evt);
            }
        });
        jPanel2.add(com3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 240, 40));

        rSButtonIconTwo1.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonIconTwo1.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Exam Reg Number:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        pertxt.setForeground(new java.awt.Color(0, 0, 0));
        pertxt.setPhColor(new java.awt.Color(0, 0, 0));
        pertxt.setPlaceholder("Marks");
        jPanel2.add(pertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 240, 30));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student_ID:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        com1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Student ID" }));
        com1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com1ActionPerformed(evt);
            }
        });
        jPanel2.add(com1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 240, 40));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 70, -1));
        jPanel2.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 240, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 610, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSTextFieldMaterial4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSTextFieldMaterial4ActionPerformed
    }//GEN-LAST:event_rSTextFieldMaterial4ActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        String oper = "insert";
        Date d1 = new Date(date1.getDate().getTime());
        String sql = "call department_subjects_pro('" + st + "','" + sub + "','"+exam+"','"+pertxt.getText()+"',  '"+d1+"','" + oper + "',null)";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        String oper = "update";
           Date d1 = new Date(date1.getDate().getTime());
        String sql = "call department_subjects_pro('" + st + "','" + sub + "','"+exam+"','"+pertxt.getText()+"','"+d1+"' ,'" + oper + "','" + id + "')";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Ma hubtaa") == JOptionPane.YES_OPTION) {
            String oper = "delete";
               Date d1 = new Date(date1.getDate().getTime());
            String sql = "call department_subjects_pro('" + st + "','" + sub + "','"+exam+"','"+pertxt.getText()+"', '"+d1+"','" + oper + "','" + id + "')";
            co.setSql(sql);
        }
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        co.search("SELECT rs_no, concat(s.id, ',', name) arday, concat(sb.sub_no, ',', sub_name) mado,concat(r.er_no, ',', e.exm_name) 'imtixan', marks, r_date from student s, exams e, subjects sb, results r, exam_reg er where s.id = r.id and sb.sub_no = r.sub_no and e.exm_no = er.exm_no and er.er_no = r.er_no  and rs_no = '"+txtser.getText()+"'");
        try{
            if(co.rs.next()){
             id = co.rs.getString("rs_no");
            com2.setSelectedItem(co.rs.getString("mado"));
            com1.setSelectedItem(co.rs.getString("arday"));
            com3.setSelectedItem(co.rs.getString("imtixan"));
            pertxt.setText(co.rs.getString("marks"));
            date1.setDate(co.rs.getDate("r_date"));
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

    private void com2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com2ActionPerformed
        String Array[] = com2.getSelectedItem().toString().split(",");
        sub = Array[0];
    }//GEN-LAST:event_com2ActionPerformed

    private void com3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com3ActionPerformed
        String Array[] = com3.getSelectedItem().toString().split(",");
     exam = Array[0];
     
    }//GEN-LAST:event_com3ActionPerformed

    private void com1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com1ActionPerformed
        // TODO add your handling code here:
        String Array[] = com1.getSelectedItem().toString().split(",");
        st = Array[0];
    }//GEN-LAST:event_com1ActionPerformed

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
            java.util.logging.Logger.getLogger(ResultExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ResultExam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBoxMaterial com1;
    private RSMaterialComponent.RSComboBoxMaterial com2;
    private RSMaterialComponent.RSComboBoxMaterial com3;
    private com.toedter.calendar.JDateChooser date1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSTextFieldMaterial pertxt;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial4;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    // End of variables declaration//GEN-END:variables
}
