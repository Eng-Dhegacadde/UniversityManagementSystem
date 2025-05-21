package UniversityMS;
import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Staff extends javax.swing.JFrame {
    Codes co = new Codes();
    String job, spc, deg,add,id, sex;
    String gender = "male";
    public Staff() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        co.fillComboBox(jobCom, "SELECT concat(job_no,',',title) jobb from jobs j order by j.job_no", "jobb");
        co.fillComboBox(spcCom, "SELECT concat(sp.sp_no, ',',sp.sp_name)  spcc from specialization sp ORDER by sp.sp_no", "spcc");
        co.fillComboBox(decCom, "SELECT concat(d.dec_no, ',',d.dec_name) degg from decree d  ORDER BY d.dec_no", "degg");
        co.fillComboBox(addCom, "select concat(a.add_no, ',',a.district,',',a.village) adrr from address a order by a.add_no", "adrr");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSTextFieldMaterial4 = new RSMaterialComponent.RSTextFieldMaterial();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        txtser = new RSMaterialComponent.RSTextFieldMaterial();
        txtTell = new RSMaterialComponent.RSTextFieldMaterial();
        txtName = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        addCom = new RSMaterialComponent.RSComboBoxMaterial();
        jobCom = new RSMaterialComponent.RSComboBoxMaterial();
        spcCom = new RSMaterialComponent.RSComboBoxMaterial();
        decCom = new RSMaterialComponent.RSComboBoxMaterial();
        regDate = new com.toedter.calendar.JDateChooser();
        malee = new RSMaterialComponent.RSRadioButtonMaterial();
        female = new RSMaterialComponent.RSRadioButtonMaterial();
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Staff", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 80));

        jPanel2.setBackground(new java.awt.Color(0, 120, 215));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Spc Num:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Job Num:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sex:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 80, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address Num:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Decree Num:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tell:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        rSButtonIconTwo1.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonIconTwo1.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        txtser.setForeground(new java.awt.Color(0, 0, 0));
        txtser.setPlaceholder("search");
        txtser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserActionPerformed(evt);
            }
        });
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 22, 310, 30));

        txtTell.setForeground(new java.awt.Color(0, 0, 0));
        txtTell.setPlaceholder("Tell");
        jPanel2.add(txtTell, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 290, 30));

        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setPlaceholder("Name");
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 290, 30));

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne2.setText("Save");
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 80, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 90, -1));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne4.setText("Delete");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 90, -1));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne1.setText("Clear");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonMaterialIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 80, -1));

        addCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Address Number" }));
        addCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addComActionPerformed(evt);
            }
        });
        jPanel2.add(addCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 290, 30));

        jobCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Job number" }));
        jobCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobComActionPerformed(evt);
            }
        });
        jPanel2.add(jobCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 290, 30));

        spcCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Spc Number" }));
        spcCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spcComActionPerformed(evt);
            }
        });
        jPanel2.add(spcCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 290, 30));

        decCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Degree Number" }));
        decCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decComActionPerformed(evt);
            }
        });
        jPanel2.add(decCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 290, 30));

        regDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(regDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 290, 30));

        malee.setForeground(new java.awt.Color(255, 255, 255));
        malee.setText("Male");
        malee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleeActionPerformed(evt);
            }
        });
        jPanel2.add(malee, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 110, -1));

        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 130, -1));

        rSButtonMaterialIconOne5.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne5.setText("Show All");
        rSButtonMaterialIconOne5.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonMaterialIconOne5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHOW_CHART);
        rSButtonMaterialIconOne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne5ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSTextFieldMaterial4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSTextFieldMaterial4ActionPerformed
    }//GEN-LAST:event_rSTextFieldMaterial4ActionPerformed

    private void jobComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobComActionPerformed
        String Array[] = jobCom.getSelectedItem().toString().split(",");
        job = Array[0];
    }//GEN-LAST:event_jobComActionPerformed

    private void spcComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spcComActionPerformed
        // TODO add your handling code here:
        String Array[] = spcCom.getSelectedItem().toString().split(",");
        spc = Array[0];
    }//GEN-LAST:event_spcComActionPerformed

    private void decComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decComActionPerformed
        String Array[] = decCom.getSelectedItem().toString().split(",");
        deg = Array[0];
    }//GEN-LAST:event_decComActionPerformed

    private void addComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addComActionPerformed
        String Array[] = addCom.getSelectedItem().toString().split(",");
        add = Array[0];
    }//GEN-LAST:event_addComActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        Date d1 = new Date(regDate.getDate().getTime());
             if (malee.isSelected()) {
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
        if(name.isEmpty() || phone.isEmpty()  ||  addCom.getSelectedIndex()==0|| decCom.getSelectedIndex()==0 ||spcCom.getSelectedIndex()==0 ||  jobCom.getSelectedIndex()==0|| d1==null){
                JOptionPane.showMessageDialog(null, "Xogtan wax baa ka maqan!", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
       else  if(txtTell.getText().length() > 10 || txtTell.getText().length() < 10){
                JOptionPane.showMessageDialog(null, "Invalid Number!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
       else{
        String oper = "insert";
        String sql = "call staff_pro('"+txtName.getText()+"','"+txtTell.getText()+"','"+gender+"','"+job+"','"+spc+"','"+deg+"','"+add+"','"+d1+"','"+oper+"',null)";
        co.setSql(sql);
       }
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        // TODO add your handling code here:
         Date d1 = new Date(regDate.getDate().getTime());
              if(malee.isSelected()){
            gender = "male";
        }
        else{
            gender = "female";
        }
        String oper = "update";
        String sql = "call staff_pro('"+txtName.getText()+"','"+txtTell.getText()+"','"+gender+"','"+job+"','"+spc+"','"+deg+"','"+add+"','"+d1+"','"+oper+"','"+id+"')";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        // TODO add your handling code here:
                if (JOptionPane.showConfirmDialog(null, "Ma hubtaa") == JOptionPane.YES_OPTION) {
                     String oper = "delete";
                        String sql = "call staff_pro('"+txtName.getText()+"','"+txtTell.getText()+"','"+gender+"','"+job+"','"+spc+"','"+deg+"','"+add+"','"+regDate+"','"+oper+"','"+id+"')";
                        co.setSql(sql);
                }
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        // TODO add your handling code here:
        co.search("SELECT st_no, name, tell, sex, concat(j.job_no,',',title) jobb,concat(sp.sp_no, ',',sp.sp_name)  spcc, concat(d.dec_no, ',',d.dec_name) degg, concat(a.add_no, ',',a.district,',',a.village) adrr, hire_date from jobs j, specialization sp, decree d, address a, staff s where s.job_no = j.job_no and s.sp_no = sp.sp_no and s.dec_no = d.dec_no and s.add_no = a.add_no and st_no = '"+txtser.getText()+"'");
        try{
            if(co.rs.next()){
                    id = co.rs.getString("st_no");
                    txtName.setText(co.rs.getString("name"));
                    txtTell.setText(co.rs.getString("tell"));
                    gender=(co.rs.getString("sex"));   
                    jobCom.setSelectedItem(co.rs.getString("jobb"));
                   spcCom.setSelectedItem(co.rs.getString("spcc"));
                   decCom.setSelectedItem(co.rs.getString("degg"));
                   addCom.setSelectedItem(co.rs.getString("adrr"));
                   regDate.setDate(co.rs.getDate("hire_date"));
                   if(gender.equals("male")){
                       malee.setSelected(true);
                       female.setSelected(false);
                   }
                   else{
                        malee.setSelected(false);
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

    private void maleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleeActionPerformed
        // TODO add your handling code here:
        malee.setSelected(true);
        female.setSelected(false);
    }//GEN-LAST:event_maleeActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
         malee.setSelected(false);
        female.setSelected(true);
    }//GEN-LAST:event_femaleActionPerformed

    private void rSButtonMaterialIconOne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne5ActionPerformed
        // TODO add your handling code here:

        StudentsView sv = new StudentsView();
        sv.show();

    }//GEN-LAST:event_rSButtonMaterialIconOne5ActionPerformed

    private void txtserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserActionPerformed
      
    }//GEN-LAST:event_txtserActionPerformed

    private void rSButtonMaterialIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne1ActionPerformed
    txtName.setText("");
    txtTell.setText("");
   spcCom.setSelectedIndex(0);
   jobCom.setSelectedIndex(0);
   addCom.setSelectedIndex(0);
   decCom.setSelectedIndex(0);
   regDate.setDate(null);
    }//GEN-LAST:event_rSButtonMaterialIconOne1ActionPerformed

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBoxMaterial addCom;
    private RSMaterialComponent.RSComboBoxMaterial decCom;
    private RSMaterialComponent.RSRadioButtonMaterial female;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSComboBoxMaterial jobCom;
    private RSMaterialComponent.RSRadioButtonMaterial malee;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne5;
    private RSMaterialComponent.RSTextFieldMaterial rSTextFieldMaterial4;
    private com.toedter.calendar.JDateChooser regDate;
    private RSMaterialComponent.RSComboBoxMaterial spcCom;
    private RSMaterialComponent.RSTextFieldMaterial txtName;
    private RSMaterialComponent.RSTextFieldMaterial txtTell;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    // End of variables declaration//GEN-END:variables
}
