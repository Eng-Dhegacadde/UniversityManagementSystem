package UniversityMS;
import university.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Days extends javax.swing.JFrame {

    Codes co = new Codes();
    String id;
    public Days() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        txtser = new RSMaterialComponent.RSTextFieldMaterial();
        txtday = new RSMaterialComponent.RSTextFieldMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Days", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 80));

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Day Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne1.setText("Clear");
        rSButtonMaterialIconOne1.setAutoscrolls(true);
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 80, -1));

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne2.setText("Save");
        rSButtonMaterialIconOne2.setAutoscrolls(true);
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setAutoscrolls(true);
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 90, -1));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne4.setText("Delete");
        rSButtonMaterialIconOne4.setAutoscrolls(true);
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 80, -1));

        rSButtonIconTwo1.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonIconTwo1.setAutoscrolls(true);
        rSButtonIconTwo1.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        txtser.setBackground(new java.awt.Color(51, 0, 51));
        txtser.setForeground(new java.awt.Color(255, 255, 255));
        txtser.setPlaceholder("search");
        txtser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtserActionPerformed(evt);
            }
        });
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 180, -1));

        txtday.setBackground(new java.awt.Color(51, 0, 51));
        txtday.setForeground(new java.awt.Color(255, 255, 255));
        txtday.setPlaceholder("Day Name");
        jPanel2.add(txtday, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 230, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
          co.search("SELECT day_no, dy_name from days where day_no =  '"+txtser.getText()+"'");
        try{
            if(co.rs.next()){
                id = co.rs.getString("day_no");
                txtday.setText(co.rs.getString("dy_name"));
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

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        String oper = "insert";
     String sql = "call days_pro('"+txtday.getText()+"', '"+oper+"',null)";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void txtserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtserActionPerformed
      
    }//GEN-LAST:event_txtserActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        String oper = "update";
        String sql = "call days_pro('"+txtday.getText()+"', '"+oper+"', '"+id+"')";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "ma hubtaa in aad deleted")==JOptionPane.YES_OPTION){
            String oper = "delete";
            String sql = "call days_pro('"+txtday.getText()+"', '"+oper+"','"+id+"')";
            co.setSql(sql);
        }
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

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
            java.util.logging.Logger.getLogger(Days.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Days.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Days.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Days.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Days().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSTextFieldMaterial txtday;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    // End of variables declaration//GEN-END:variables
}
