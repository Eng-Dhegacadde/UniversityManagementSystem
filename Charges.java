package UniversityMS;
import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Charges extends javax.swing.JFrame {
        Codes co = new Codes();
        String cls,dept_pri,id;
    public Charges() {
        initComponents();
          this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        co.fillComboBox(classCom, "SELECT concat(c.cl_no, ',',cl_name) class from class c ORDER by c.cl_no", "class");
        co.fillComboBox(pCom, "SELECT concat(d.dp_price_no, ',',price) qiimaha from dp_price d", "qiimaha");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSTextFieldMaterial4 = new RSMaterialComponent.RSTextFieldMaterial();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        chDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pCom = new RSMaterialComponent.RSComboBoxMaterial();
        classCom = new RSMaterialComponent.RSComboBoxMaterial();
        txtDes = new RSMaterialComponent.RSTextFieldMaterial();
        txtser = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        txtAmount = new RSMaterialComponent.RSTextFieldMaterial();
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

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Charges", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 80));

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(chDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 240, 30));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Description:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Class Num:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("dept Price Num:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Amount:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 80, -1));

        pCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Dept Price Number" }));
        pCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pComActionPerformed(evt);
            }
        });
        jPanel2.add(pCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 240, 30));

        classCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Class Number" }));
        classCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classComActionPerformed(evt);
            }
        });
        jPanel2.add(classCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 240, 30));

        txtDes.setForeground(new java.awt.Color(0, 0, 0));
        txtDes.setColorMaterial(new java.awt.Color(0, 0, 0));
        txtDes.setPlaceholder("Description");
        jPanel2.add(txtDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 240, 30));

        txtser.setForeground(new java.awt.Color(0, 0, 0));
        txtser.setColorMaterial(new java.awt.Color(0, 0, 0));
        txtser.setPlaceholder("search");
        txtser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserActionPerformed(evt);
            }
        });
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 22, 200, 30));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne1.setText("Clear");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        rSButtonMaterialIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 90, -1));

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, 30));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 90, -1));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne4.setText("Delete");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 90, -1));

        txtAmount.setForeground(new java.awt.Color(0, 0, 0));
        txtAmount.setColorMaterial(new java.awt.Color(0, 0, 0));
        txtAmount.setPlaceholder("Ammount To charge");
        jPanel2.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 212, 240, 30));

        rSButtonMaterialIconOne5.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne5.setText("Save");
        rSButtonMaterialIconOne5.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        rSButtonMaterialIconOne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne5ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 80, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSTextFieldMaterial4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSTextFieldMaterial4ActionPerformed
    }//GEN-LAST:event_rSTextFieldMaterial4ActionPerformed

    private void rSButtonMaterialIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne1ActionPerformed
    }//GEN-LAST:event_rSButtonMaterialIconOne1ActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        co.search("SELECT ch_no, concat(c.cl_no, ',',cl_name) clas, concat(d.dp_price_no, ',',price) qiimaha , amount, tarikh, description from charges ch, class c, dp_price d, student_class sc where ch.sc_no = sc.sc_no  and ch.dp_price_no = d.dp_price_no and sc.cl_no = c.cl_no and ch_no = '"+txtser.getText()+"'");
        try{
             if(co.rs.next()){
            id = co.rs.getString("ch_no");
            classCom.setSelectedItem(co.rs.getString("clas"));
            pCom.setSelectedItem(co.rs.getString("qiimaha"));
            txtAmount.setText(co.rs.getString("amount"));
            chDate.setDate(co.rs.getDate("tarikh"));
            txtDes.setText(co.rs.getString("description"));
            
        }  
              else{
                JOptionPane.showMessageDialog(null, txtser.getText()+" not found");
            }
                
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
       
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        // TODO add your handling code here:
        Date d1 = new Date(chDate.getDate().getTime());
        String oper = "update";
        String sql  = "call charge_pro('"+cls+"','"+dept_pri+"','"+txtAmount.getText()+"','"+d1+"','"+txtDes.getText()+"','"+oper+"','"+id+"')";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed
    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        // TODO add your handling code here:
         if (JOptionPane.showConfirmDialog(null, "Ma hubtaa") == JOptionPane.YES_OPTION) {
                Date d1 = new Date(chDate.getDate().getTime());
                String oper = "delete";
                String sql  = "call charge_pro('"+cls+"','"+dept_pri+"','"+txtAmount.getText()+"','"+d1+"','"+txtDes.getText()+"','"+oper+"','"+id+"')";
                co.setSql(sql);
                }
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonMaterialIconOne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne5ActionPerformed
         Date d1 = new Date(chDate.getDate().getTime());
            String oper = "insert";
            String sql = "call charge_pro('"+cls+"','"+dept_pri+"','"+txtAmount.getText()+"','"+d1+"','"+txtDes.getText()+"','"+oper+"',null)";
            co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne5ActionPerformed

    private void classComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classComActionPerformed
        // TODO add your handling code here:
        String Array[] = classCom.getSelectedItem().toString().split(",");
        cls = Array[0];
    }//GEN-LAST:event_classComActionPerformed

    private void pComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pComActionPerformed
        // TODO add your handling code here:
        String Array[] = pCom.getSelectedItem().toString().split(",");
        dept_pri = Array[0];
    }//GEN-LAST:event_pComActionPerformed

    private void txtserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserActionPerformed

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
            java.util.logging.Logger.getLogger(Charges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Charges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Charges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Charges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Charges().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser chDate;
    private RSMaterialComponent.RSComboBoxMaterial classCom;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSComboBoxMaterial pCom;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne5;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial4;
    private RSMaterialComponent.RSTextFieldMaterial txtAmount;
    private RSMaterialComponent.RSTextFieldMaterial txtDes;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    // End of variables declaration//GEN-END:variables
}
