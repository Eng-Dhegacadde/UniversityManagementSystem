package UniversityMS;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import university.*;
public class Amounts extends javax.swing.JFrame {
    Codes co = new Codes();
    String id;
    public Amounts() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clear = new RSMaterialComponent.RSButtonMaterialIconOne();
        save = new RSMaterialComponent.RSButtonMaterialIconOne();
        update = new RSMaterialComponent.RSButtonMaterialIconOne();
        delete = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        txtser = new RSMaterialComponent.RSTextFieldMaterial();
        txtamount = new RSMaterialComponent.RSTextFieldMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Amounts", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 80));

        jPanel2.setBackground(new java.awt.Color(0, 120, 215));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Amount Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        clear.setBackground(new java.awt.Color(0, 120, 215));
        clear.setText("Clear");
        clear.setBackgroundHover(new java.awt.Color(102, 255, 51));
        clear.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 80, -1));

        save.setBackground(new java.awt.Color(0, 120, 215));
        save.setText("Save");
        save.setBackgroundHover(new java.awt.Color(102, 255, 51));
        save.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, -1));

        update.setBackground(new java.awt.Color(0, 120, 215));
        update.setText("Update");
        update.setBackgroundHover(new java.awt.Color(102, 255, 51));
        update.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 90, -1));

        delete.setBackground(new java.awt.Color(0, 120, 215));
        delete.setText("Delete");
        delete.setBackgroundHover(new java.awt.Color(102, 255, 51));
        delete.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 90, -1));

        rSButtonIconTwo1.setBackground(new java.awt.Color(0, 120, 215));
        rSButtonIconTwo1.setBackgroundHover(new java.awt.Color(102, 255, 51));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        txtser.setForeground(new java.awt.Color(0, 0, 0));
        txtser.setPlaceholder("Search");
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 190, 30));

        txtamount.setForeground(new java.awt.Color(0, 0, 0));
        txtamount.setPlaceholder("Amount Name");
        jPanel2.add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 200, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 420, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
          co.search("SELECT at_no, amount_name from amount where at_no = '"+txtser.getText()+"'");
       try{
           if(co.rs.next()){
               id = co.rs.getString("at_no");
               txtamount.setText(co.rs.getString("amount_name"));
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

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String oper = "insert";
        String sql = "call amount_pro('"+txtamount.getText()+"', '"+oper+"',null)";
        co.setSql(sql);
        
    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String oper = "update";
        String sql = "call amount_pro('"+txtamount.getText()+"', '"+oper+"', '"+id+"')";
        co.setSql(sql);
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Ma hubtaa ")==JOptionPane.YES_OPTION){
            String oper = "delete";
            String sql = "call amount_pro('"+txtamount.getText()+"','"+oper+"','"+id+"')";
            co.setSql(sql);
            
            
        }
        
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Amounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Amounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Amounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Amounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Amounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne clear;
    private RSMaterialComponent.RSButtonMaterialIconOne delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne save;
    private RSMaterialComponent.RSTextFieldMaterial txtamount;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    private RSMaterialComponent.RSButtonMaterialIconOne update;
    // End of variables declaration//GEN-END:variables
}
