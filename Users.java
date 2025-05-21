package UniversityMS;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import university.*;
public class Users extends javax.swing.JFrame {
    Codes co = new Codes();
    String macalin,id, role;
    public Users() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        co.fillComboBox(staffCom, "select concat(s.st_no, ',', s.name) stf from staff s order by s.st_no", "stf");
        co.fillComboBox(roleCom, "SELECT concat(r.user_role_no, ',', roole) rool from user_role r ORDER BY user_role_no", "rool");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        txtser = new RSMaterialComponent.RSTextFieldMaterial();
        txtuser = new RSMaterialComponent.RSTextFieldMaterial();
        txtpass = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        staffCom = new RSMaterialComponent.RSComboBoxMaterial();
        questiontxt = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roleCom = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel6 = new javax.swing.JLabel();
        anstxt = new RSMaterialComponent.RSTextFieldMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Users", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 938, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 80));

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Staff Num:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Passowrd:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne2.setText("Save");
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 80, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 90, -1));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne4.setText("Delete");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 90, -1));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonMaterialIconOne1.setText("Clear");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 80, -1));

        txtser.setForeground(new java.awt.Color(0, 0, 0));
        txtser.setPhColor(new java.awt.Color(0, 0, 0));
        txtser.setPlaceholder("search");
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 22, 180, 30));

        txtuser.setForeground(new java.awt.Color(0, 0, 0));
        txtuser.setPhColor(new java.awt.Color(0, 0, 0));
        txtuser.setPlaceholder("UserName");
        jPanel2.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 102, -1, 30));

        txtpass.setForeground(new java.awt.Color(0, 0, 0));
        txtpass.setPhColor(new java.awt.Color(0, 0, 0));
        txtpass.setPlaceholder("Password");
        jPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 232, -1, 30));

        rSButtonIconTwo1.setBackground(new java.awt.Color(0, 0, 204));
        rSButtonIconTwo1.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        staffCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Stafff Number" }));
        staffCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffComActionPerformed(evt);
            }
        });
        jPanel2.add(staffCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 250, 30));

        questiontxt.setForeground(new java.awt.Color(0, 0, 0));
        questiontxt.setPhColor(new java.awt.Color(0, 0, 0));
        questiontxt.setPlaceholder("Secret Question");
        jPanel2.add(questiontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("S Question");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User_Role:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        roleCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----Select Role Number----", " ", " " }));
        roleCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComActionPerformed(evt);
            }
        });
        jPanel2.add(roleCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 250, 30));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Answer:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        anstxt.setForeground(new java.awt.Color(0, 0, 0));
        anstxt.setPhColor(new java.awt.Color(0, 0, 0));
        anstxt.setPlaceholder("Answer");
        jPanel2.add(anstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 950, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        String oper = "insert";
        String sql = "call users_pro('"+txtuser.getText()+"','"+macalin+"','"+txtpass.getText()+"','"+questiontxt.getText()+"','"+anstxt.getText()+"', '"+role+"', '"+oper+"',null)";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        String oper = "update";
         String sql = "call users_pro('"+txtuser.getText()+"', '"+macalin+"', '"+txtpass.getText()+"',  '"+questiontxt.getText()+"','"+anstxt.getText()+"', '"+role+"','"+oper+"', '"+id+"')";
         co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Ma hubtaa in aad deleted")==JOptionPane.YES_OPTION){
            String oper = "delete";
            String sql = "call users_pro('"+txtuser.getText()+"', '"+macalin+"', '"+txtpass.getText()+"', '"+questiontxt.getText()+"','"+anstxt.getText()+"', '"+role+"','"+oper+"', '"+id+"')";
            co.setSql(sql);
        }
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed
    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        co.search("SELECT  user_no, user_name, concat(s.st_no, ',', s.name) stf, passwords, secretQuestion, Answer, concat(r.user_role_no, ',', roole) rool from users u, staff s, user_role r where u.st_no = s.st_no and u.user_role_no = r.user_role_no and user_no = '"+txtser.getText()+"'");
        try{
            if(co.rs.next()){
                id = co.rs.getString("user_no");
                txtuser.setText(co.rs.getString("user_name"));
                staffCom.setSelectedItem(co.rs.getString("stf"));
                txtpass.setText(co.rs.getString("passwords"));
                questiontxt.setText(co.rs.getString("secretQuestion"));
                anstxt.setText(co.rs.getString("Answer"));
                roleCom.setSelectedItem(co.rs.getString("rool"));
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

    private void staffComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffComActionPerformed
        // TODO add your handling code here:
        String Array1[] = staffCom.getSelectedItem().toString().split(",");
        macalin = Array1[0];
    }//GEN-LAST:event_staffComActionPerformed

    private void roleComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComActionPerformed
        // TODO add your handling code here:
          String Array1[] = roleCom.getSelectedItem().toString().split(",");
        role = Array1[0];
    }//GEN-LAST:event_roleComActionPerformed

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTextFieldMaterial anstxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSTextFieldMaterial questiontxt;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSComboBoxMaterial roleCom;
    private RSMaterialComponent.RSComboBoxMaterial staffCom;
    private RSMaterialComponent.RSTextFieldMaterial txtpass;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    private RSMaterialComponent.RSTextFieldMaterial txtuser;
    // End of variables declaration//GEN-END:variables
}
