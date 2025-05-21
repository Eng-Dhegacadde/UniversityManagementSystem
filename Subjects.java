package UniversityMS;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Subjects extends javax.swing.JFrame {
    Codes co = new Codes();
    String id;
    public Subjects() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        txtser = new RSMaterialComponent.RSTextFieldMaterial();
        txtSubName = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel3 = new javax.swing.JLabel();
        txtcode = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialIconOne5 = new RSMaterialComponent.RSButtonMaterialIconOne();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 120, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Subjects", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 80));

        jPanel2.setBackground(new java.awt.Color(22, 219, 101));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(22, 219, 101));
        rSButtonMaterialIconOne2.setText("Save");
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(22, 219, 101));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 90, -1));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(22, 219, 101));
        rSButtonMaterialIconOne4.setText("Delete");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 80, -1));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(22, 219, 101));
        rSButtonMaterialIconOne1.setText("Show All");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonMaterialIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 100, -1));

        rSButtonIconTwo1.setBackground(new java.awt.Color(22, 219, 101));
        rSButtonIconTwo1.setBackgroundHover(new java.awt.Color(0, 120, 215));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        txtser.setForeground(new java.awt.Color(0, 0, 0));
        txtser.setPlaceholder("search");
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, 30));

        txtSubName.setForeground(new java.awt.Color(0, 0, 0));
        txtSubName.setPlaceholder("Subject Name");
        jPanel2.add(txtSubName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 230, 30));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Subject Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Description:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 130, 30));

        txt1.setBackground(new java.awt.Color(51, 0, 51));
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setPlaceholder("Description");
        jPanel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Code:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, 30));

        txtcode.setForeground(new java.awt.Color(0, 0, 0));
        txtcode.setPlaceholder("Code");
        jPanel2.add(txtcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 230, 30));

        rSButtonMaterialIconOne5.setBackground(new java.awt.Color(22, 219, 101));
        rSButtonMaterialIconOne5.setText("Clear");
        rSButtonMaterialIconOne5.setBackgroundHover(new java.awt.Color(0, 120, 215));
        rSButtonMaterialIconOne5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 80, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 490, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        // TODO add your handling code here:
        String oper = "insert";
        String sql = " call subjects_pro('"+txtSubName.getText()+"', '"+txtcode.getText()+"','"+oper+"', null)";
        co.setSql(sql);
        
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        // TODO add your handling code here:
        co.search("SELECT sub_no, sub_name, code from subjects where sub_no = '"+txtser.getText()+"'");
        try{
            if(co.rs.next()){
                id = co.rs.getString("sub_no");
                txtSubName.setText(co.rs.getString("sub_name"));
                txtcode.setText(co.rs.getString("code"));
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

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        // TODO add your handling code here:
        String oper = "update";
        String sql = "call subjects_pro('"+txtSubName.getText()+"','"+txtcode.getText()+"', '"+oper+"','"+id+"')";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog( null, "Ma hubtaa in deleted ")==JOptionPane.YES_OPTION){
        String oper = "delete";
        String sql = "call subjects_pro('"+txtSubName.getText()+"','"+txtcode.getText()+"', '"+oper+"', '"+id+"')";
        co.setSql(sql);
        }
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonMaterialIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne1ActionPerformed
        // TODO add your handling code here:
        
        SubjectsView sv = new SubjectsView();
        sv.hide();
        sv.show();
        
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
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Subjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne5;
    private RSMaterialComponent.RSTextFieldMaterial txt1;
    private RSMaterialComponent.RSTextFieldMaterial txtSubName;
    private RSMaterialComponent.RSTextFieldMaterial txtcode;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    // End of variables declaration//GEN-END:variables
}
