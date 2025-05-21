package UniversityMS;
import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Students extends javax.swing.JFrame {
    Codes co = new Codes();
    String  schol, res,add,id, sex;
        String gender = "male"; 
    public Students() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        co.fillComboBox(addCom, "select concat(a.add_no, ',',a.district,',',a.village) adrr from address a order by a.add_no", "adrr");
        co.fillComboBox(resCom, "select concat(r.res_no, ', ', r.res_name) walid from responsible r order by r.res_no", "walid");
        co.fillComboBox(ShcolCom, "select concat(sh.sh_no, ' ,', sh.school_Name) school from schools sh order by sh.sh_no", "school");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSTextFieldMaterial4 = new RSMaterialComponent.RSTextFieldMaterial();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hhhh = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        txtser = new RSMaterialComponent.RSTextFieldMaterial();
        txtTell = new RSMaterialComponent.RSTextFieldMaterial();
        txtPlace = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        addCom = new RSMaterialComponent.RSComboBoxMaterial();
        resCom = new RSMaterialComponent.RSComboBoxMaterial();
        regDate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        ShcolCom = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel8 = new javax.swing.JLabel();
        txtName = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialIconOne5 = new RSMaterialComponent.RSButtonMaterialIconOne();
        female = new RSMaterialComponent.RSRadioButtonMaterial();
        male = new RSMaterialComponent.RSRadioButtonMaterial();
        jLabel11 = new javax.swing.JLabel();
        discount = new RSMaterialComponent.RSTextFieldMaterial();

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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Students", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1128, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 80));

        jPanel2.setBackground(new java.awt.Color(0, 120, 215));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sex:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Place of Birth:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address Num:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        hhhh.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        hhhh.setForeground(new java.awt.Color(255, 255, 255));
        hhhh.setText("Responsible Num:");
        jPanel2.add(hhhh, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tell:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        rSButtonIconTwo1.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonIconTwo1.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        txtser.setForeground(new java.awt.Color(0, 0, 0));
        txtser.setPlaceholder("search");
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 450, 30));

        txtTell.setForeground(new java.awt.Color(0, 0, 0));
        txtTell.setPhColor(new java.awt.Color(0, 0, 0));
        txtTell.setPlaceholder("Tell");
        jPanel2.add(txtTell, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 280, 30));

        txtPlace.setForeground(new java.awt.Color(0, 0, 0));
        txtPlace.setPhColor(new java.awt.Color(0, 0, 0));
        txtPlace.setPlaceholder("Place of Birth");
        jPanel2.add(txtPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 270, 30));

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne2.setText("Save");
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 80, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 90, -1));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne4.setText("Delete");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 90, -1));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne1.setText("Show All");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHOW_CHART);
        rSButtonMaterialIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 110, -1));

        addCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Address Number" }));
        addCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addComActionPerformed(evt);
            }
        });
        jPanel2.add(addCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 270, 30));

        resCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Responsible Number" }));
        resCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resComActionPerformed(evt);
            }
        });
        jPanel2.add(resCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 270, 30));

        regDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(regDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 280, 30));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("School Number:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        ShcolCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select School Number" }));
        ShcolCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShcolComActionPerformed(evt);
            }
        });
        jPanel2.add(ShcolCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 270, 30));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Birth Date:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 120, -1));

        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setPhColor(new java.awt.Color(0, 0, 0));
        txtName.setPlaceholder("Name");
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 280, 30));

        rSButtonMaterialIconOne5.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne5.setText("Clear");
        rSButtonMaterialIconOne5.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonMaterialIconOne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne5ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 80, -1));

        female.setBackground(new java.awt.Color(51, 0, 51));
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 90, -1));

        male.setBackground(new java.awt.Color(51, 0, 51));
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 90, -1));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Discount:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 160, -1));

        discount.setForeground(new java.awt.Color(0, 0, 0));
        discount.setPhColor(new java.awt.Color(0, 0, 0));
        discount.setPlaceholder("Discount");
        jPanel2.add(discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 270, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1140, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSTextFieldMaterial4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSTextFieldMaterial4ActionPerformed
    }//GEN-LAST:event_rSTextFieldMaterial4ActionPerformed
    private void resComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resComActionPerformed
        String Array[] = resCom.getSelectedItem().toString().split(",");
        res = Array[0];
    }//GEN-LAST:event_resComActionPerformed

    private void addComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addComActionPerformed
        String Array[] = addCom.getSelectedItem().toString().split(",");
        add = Array[0];
    }//GEN-LAST:event_addComActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        Date d1 = new Date(regDate.getDate().getTime());
        if (male.isSelected()) {
                gender="male";
            }
        else if(female.isSelected()){
         gender="female";
       }
         else {
            JOptionPane.showMessageDialog(null, "Please select a gender!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
    }
        String name = txtName.getText().trim();
        String phone = txtTell.getText().trim();
        String place = txtPlace.getText().trim();
        if(name.isEmpty() || phone.isEmpty()  || place.isEmpty() || addCom.getSelectedIndex()==0|| resCom.getSelectedIndex()==0 ||ShcolCom.getSelectedIndex()==0 || d1==null){
                JOptionPane.showMessageDialog(null, "Xogtan wax baa ka maqan!", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
       else  if(txtTell.getText().length() < 9 && txtTell.getText().length() >12){
                JOptionPane.showMessageDialog(null, "Invalid Number!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String oper = "insert";
        String sql = "call student_pro('"+txtName.getText()+"','"+txtTell.getText()+"','"+gender+"','"+d1+"','"+txtPlace.getText()+"', '"+discount.getText()+"','"+add+"','"+res+"','"+schol+"','"+oper+"',null)";
        co.setSql(sql);
        } 
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
         Date d1 = new Date(regDate.getDate().getTime());
             if (male.isSelected()) {
                gender="male";
            }
       else{
         gender="female";
       }
        String oper = "update";
        String sql = "call student_pro('"+txtName.getText()+"','"+txtTell.getText()+"','"+gender+"','"+d1+"','"+txtPlace.getText()+"' ,  '"+discount.getText()+"','"+add+"','"+res+"','"+schol+"','"+oper+"','"+id+"')";        
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
                if (JOptionPane.showConfirmDialog(null, "Ma hubtaa") == JOptionPane.YES_OPTION) {
                     String oper = "delete";
                        Date d1 = new Date(regDate.getDate().getTime());
                        String sql = "call student_pro('"+txtName.getText()+"','"+txtTell.getText()+"','"+gender+"','"+d1+"','"+txtPlace.getText()+"','"+discount.getText()+"','"+add+"','"+res+"','"+schol+"','"+oper+"','"+id+"')";                        
                        co.setSql(sql);
                }
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        co.search(" select id,name, tell, sex, b_date, p_birth, discount, concat(a.add_no, ',',a.district,',',a.village) adrr, concat(r.res_no, ', ', r.res_name) walid,concat(sh.sh_no, ' ,', sh.school_Name) school from address a, responsible r, schools sh, student s where s.add_no = a.add_no and s.res_no = r.res_no and s.sh_no = sh.sh_no and id =  '"+txtser.getText()+"'");
        try{
            if(co.rs.next()){
                    id = co.rs.getString("id");
                    txtName.setText(co.rs.getString("name"));
                    txtTell.setText(co.rs.getString("tell"));
                  gender=(co.rs.getString("sex"));
                    regDate.setDate(co.rs.getDate("b_date"));
                    txtPlace.setText(co.rs.getString("p_birth"));
                    discount.setText(co.rs.getString("discount"));
                    addCom.setSelectedItem(co.rs.getString("adrr"));
                   resCom.setSelectedItem(co.rs.getString("walid"));
                    ShcolCom.setSelectedItem(co.rs.getString("school"));
                    if(gender.equals("male")){
                        male.setSelected(true);
                      female.setSelected(false);
                    }
                    else{
                        male.setSelected(false);
                        female.setSelected(true);
                    }
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

    private void ShcolComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShcolComActionPerformed
        // TODO add your handling code here:
          String Array[] = ShcolCom.getSelectedItem().toString().split(",");
            schol = Array[0];
    }//GEN-LAST:event_ShcolComActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        male.setSelected(false);
         female.setSelected(true);
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
       female.setSelected(false);
       male.setSelected(true);
    }//GEN-LAST:event_maleActionPerformed

    private void rSButtonMaterialIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne1ActionPerformed
        // TODO add your handling code here:
        
        StudentsView sv = new StudentsView();
        sv.show();
        
               
    }//GEN-LAST:event_rSButtonMaterialIconOne1ActionPerformed

    private void rSButtonMaterialIconOne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne5ActionPerformed
        // TODO add your handling code here:
            // Clear text fields
    txtName.setText("");
    txtTell.setText("");
    txtPlace.setText("");
   ShcolCom.setSelectedIndex(0);
   resCom.setSelectedIndex(0);
   addCom.setSelectedIndex(0);
   regDate.setDate(null);
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
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBoxMaterial ShcolCom;
    private RSMaterialComponent.RSComboBoxMaterial addCom;
    private RSMaterialComponent.RSTextFieldMaterial discount;
    private RSMaterialComponent.RSRadioButtonMaterial female;
    private javax.swing.JLabel hhhh;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSRadioButtonMaterial male;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne5;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial4;
    private com.toedter.calendar.JDateChooser regDate;
    private RSMaterialComponent.RSComboBoxMaterial resCom;
    private RSMaterialComponent.RSTextFieldMaterial txtName;
    private RSMaterialComponent.RSTextFieldMaterial txtPlace;
    private RSMaterialComponent.RSTextFieldMaterial txtTell;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    // End of variables declaration//GEN-END:variables
}
