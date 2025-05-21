package UniversityMS;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import university.*;
public class Faculties extends javax.swing.JFrame {
    Codes co = new Codes();
    String id;
    public Faculties() {
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
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne5 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne6 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne7 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne8 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne9 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne10 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne11 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne12 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne13 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne14 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne15 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne16 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne17 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne18 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne19 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne20 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne21 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne22 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne23 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne24 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne25 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne26 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne27 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne28 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne29 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne30 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne31 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne32 = new RSMaterialComponent.RSButtonMaterialIconOne();
        facName = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        txtser = new RSMaterialComponent.RSTextFieldMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Faculties", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 80));

        jPanel2.setBackground(new java.awt.Color(37, 45, 223));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fuculty Name: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne2.setText("Save");
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 80, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 90, -1));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne4.setText("Delete");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        jPanel2.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 90, -1));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne1.setText("Clear");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 80, -1));

        rSButtonMaterialIconOne5.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne5.setText("Save");
        rSButtonMaterialIconOne5.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        jPanel2.add(rSButtonMaterialIconOne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 80, -1));

        rSButtonMaterialIconOne6.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne6.setText("Update");
        rSButtonMaterialIconOne6.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne6.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        jPanel2.add(rSButtonMaterialIconOne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 90, -1));

        rSButtonMaterialIconOne7.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne7.setText("Delete");
        rSButtonMaterialIconOne7.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne7.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        jPanel2.add(rSButtonMaterialIconOne7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 90, -1));

        rSButtonMaterialIconOne8.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne8.setText("Clear");
        rSButtonMaterialIconOne8.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne8.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 80, -1));

        rSButtonMaterialIconOne9.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne9.setText("Save");
        rSButtonMaterialIconOne9.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne9.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        jPanel2.add(rSButtonMaterialIconOne9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 80, -1));

        rSButtonMaterialIconOne10.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne10.setText("Update");
        rSButtonMaterialIconOne10.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne10.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        jPanel2.add(rSButtonMaterialIconOne10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 90, -1));

        rSButtonMaterialIconOne11.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne11.setText("Delete");
        rSButtonMaterialIconOne11.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne11.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        jPanel2.add(rSButtonMaterialIconOne11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 90, -1));

        rSButtonMaterialIconOne12.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne12.setText("Clear");
        rSButtonMaterialIconOne12.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne12.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 80, -1));

        rSButtonMaterialIconOne13.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne13.setText("Save");
        rSButtonMaterialIconOne13.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne13.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        jPanel2.add(rSButtonMaterialIconOne13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 80, -1));

        rSButtonMaterialIconOne14.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne14.setText("Update");
        rSButtonMaterialIconOne14.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne14.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        jPanel2.add(rSButtonMaterialIconOne14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 90, -1));

        rSButtonMaterialIconOne15.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne15.setText("Delete");
        rSButtonMaterialIconOne15.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne15.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        jPanel2.add(rSButtonMaterialIconOne15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 90, -1));

        rSButtonMaterialIconOne16.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne16.setText("Clear");
        rSButtonMaterialIconOne16.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne16.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 80, -1));

        rSButtonMaterialIconOne17.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne17.setText("Save");
        rSButtonMaterialIconOne17.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne17.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        jPanel2.add(rSButtonMaterialIconOne17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 80, -1));

        rSButtonMaterialIconOne18.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne18.setText("Update");
        rSButtonMaterialIconOne18.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne18.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        jPanel2.add(rSButtonMaterialIconOne18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 90, -1));

        rSButtonMaterialIconOne19.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne19.setText("Delete");
        rSButtonMaterialIconOne19.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne19.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        jPanel2.add(rSButtonMaterialIconOne19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 90, -1));

        rSButtonMaterialIconOne20.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne20.setText("Clear");
        rSButtonMaterialIconOne20.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne20.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 80, -1));

        rSButtonMaterialIconOne21.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne21.setText("Save");
        rSButtonMaterialIconOne21.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne21.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        jPanel2.add(rSButtonMaterialIconOne21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 80, -1));

        rSButtonMaterialIconOne22.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne22.setText("Update");
        rSButtonMaterialIconOne22.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne22.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        jPanel2.add(rSButtonMaterialIconOne22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 90, -1));

        rSButtonMaterialIconOne23.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne23.setText("Delete");
        rSButtonMaterialIconOne23.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne23.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        jPanel2.add(rSButtonMaterialIconOne23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 90, -1));

        rSButtonMaterialIconOne24.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne24.setText("Clear");
        rSButtonMaterialIconOne24.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne24.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 80, -1));

        rSButtonMaterialIconOne25.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne25.setText("Save");
        rSButtonMaterialIconOne25.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne25.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        jPanel2.add(rSButtonMaterialIconOne25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 80, -1));

        rSButtonMaterialIconOne26.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne26.setText("Clear");
        rSButtonMaterialIconOne26.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne26.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 80, -1));

        rSButtonMaterialIconOne27.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne27.setText("Delete");
        rSButtonMaterialIconOne27.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne27.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        jPanel2.add(rSButtonMaterialIconOne27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 90, -1));

        rSButtonMaterialIconOne28.setBackground(new java.awt.Color(51, 0, 51));
        rSButtonMaterialIconOne28.setText("Update");
        rSButtonMaterialIconOne28.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne28.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        jPanel2.add(rSButtonMaterialIconOne28, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 90, -1));

        rSButtonMaterialIconOne29.setText("Save");
        rSButtonMaterialIconOne29.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne29.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        rSButtonMaterialIconOne29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne29ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, -1));

        rSButtonMaterialIconOne30.setText("Update");
        rSButtonMaterialIconOne30.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne30.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne30ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 90, -1));

        rSButtonMaterialIconOne31.setText("Delete");
        rSButtonMaterialIconOne31.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne31.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne31ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne31, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 80, -1));

        rSButtonMaterialIconOne32.setText("Clear");
        rSButtonMaterialIconOne32.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonMaterialIconOne32.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne32, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 80, -1));

        facName.setForeground(new java.awt.Color(0, 0, 0));
        facName.setPhColor(new java.awt.Color(0, 0, 0));
        facName.setPlaceholder("Subject Name");
        jPanel2.add(facName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 112, 240, 30));

        rSButtonIconTwo1.setBackgroundHover(new java.awt.Color(255, 255, 0));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        txtser.setForeground(new java.awt.Color(0, 0, 0));
        txtser.setPlaceholder("search");
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 22, 190, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 420, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconOne29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne29ActionPerformed
        String oper = "insert";
        String sql = "call faculties_pro('"+facName.getText()+"', '"+oper+"', null)";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne29ActionPerformed

    private void rSButtonMaterialIconOne30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne30ActionPerformed
        String oper = "update";
        String sql = "call faculties_pro('"+facName.getText()+"', '"+oper+"', '"+id+"')";
        co.setSql(sql);
        
    }//GEN-LAST:event_rSButtonMaterialIconOne30ActionPerformed

    private void rSButtonMaterialIconOne31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne31ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "ma hubtaa inaad deleted")==JOptionPane.YES_OPTION){
            String oper = "delete";
            String sql = "call faculties_pro('"+facName.getText()+"', '"+oper+"', '"+id+"')";
            co.setSql(sql);
        }
       
    }//GEN-LAST:event_rSButtonMaterialIconOne31ActionPerformed

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        // TODO add your handling code here:
        co.search(" SELECT fa_no, fa_Name from faculties where fa_no = '"+txtser.getText()+"'");
        try{
            if(co.rs.next()){
                id = co.rs.getString("fa_no");
                facName.setText(co.rs.getString("fa_Name"));
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
            java.util.logging.Logger.getLogger(Faculties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faculties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faculties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faculties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Faculties().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTextFieldMaterial facName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne10;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne11;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne12;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne13;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne14;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne15;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne16;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne17;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne18;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne19;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne20;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne21;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne22;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne23;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne24;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne25;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne26;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne27;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne28;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne29;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne30;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne31;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne32;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne5;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne6;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne7;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne8;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne9;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    // End of variables declaration//GEN-END:variables
}
