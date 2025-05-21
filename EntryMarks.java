package UniversityMS;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class EntryMarks extends javax.swing.JFrame {
        ArrayList<String> subjectIds = new ArrayList<>();
    Codes co = new Codes();
    String id, cl,sub,exam;
    public EntryMarks() {
        initComponents();
        co.fillComboBox(Com1, "SELECT concat(c.cl_no,'-', cl_name) as fasal from class c order by c.cl_no", "fasal");
        co.fillComboBox(Com2, "SELECT concat(s.sub_no,'-',s.sub_name) as mado from subjects s ORDER by s.sub_no", "mado");
        co.fillComboBox(Com3, "SELECT concat(exm_no,'-', exm_name) imtixan from exams", "imtixan");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonMaterialGradientTwo1 = new RSMaterialComponent.RSButtonMaterialGradientTwo();
        jPanel1 = new javax.swing.JPanel();
        Com2 = new RSMaterialComponent.RSComboBoxMaterial();
        Com1 = new RSMaterialComponent.RSComboBoxMaterial();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new rojeru_san.complementos.RSTableMetro();
        Com3 = new RSMaterialComponent.RSComboBoxMaterial();

        rSButtonMaterialGradientTwo1.setText("rSButtonMaterialGradientTwo1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Com2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------Select Subjects Name-----" }));
        Com2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com2ActionPerformed(evt);
            }
        });
        jPanel1.add(Com2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 240, 30));

        Com1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------Select Class Name-----" }));
        Com1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com1ActionPerformed(evt);
            }
        });
        jPanel1.add(Com1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 240, 30));

        rSButtonMaterialIconOne1.setText("Save");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INSERT_CHART);
        rSButtonMaterialIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 70, 30));

        rSButtonMaterialIconOne2.setText("Avg");
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INSERT_CHART);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 70, 30));

        rSButtonMaterialIconOne3.setText("Total");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INSERT_CHART);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 70, 30));

        rSButtonMaterialIconOne4.setText("Show");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INSERT_CHART);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 70, 30));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table2.setColorBackgoundHead(new java.awt.Color(22, 219, 101));
        table2.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table2.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        table2.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        table2.setRowHeight(32);
        jScrollPane2.setViewportView(table2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1270, 410));

        Com3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------Select Exam Name-----" }));
        Com3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com3ActionPerformed(evt);
            }
        });
        jPanel1.add(Com3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 240, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 4, 1300, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Com1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com1ActionPerformed
         String array[] =  Com1.getSelectedItem().toString().split("-");
        cl = array[0];
        String sql="select s.id I, name from student s, class c, student_class sc where s.id=sc.id and c.cl_no=sc.cl_no and c.cl_no='"+cl+"'";
        co.viewTable(sql, table2);
        
        
    }//GEN-LAST:event_Com1ActionPerformed
    private void Com2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com2ActionPerformed
      try {
        String[] array = Com2.getSelectedItem().toString().split("-");
        String subId = array[0].trim();
        String subName = array[1].trim();

        DefaultTableModel model = (DefaultTableModel) table2.getModel();

        table2.setRowSelectionAllowed(false);
        table2.setColumnSelectionAllowed(true);
        table2.setCellSelectionEnabled(true);

        // Check if subject already exists
        for (int i = 2; i < model.getColumnCount(); i++) {
            if (model.getColumnName(i).equalsIgnoreCase(subName)) {
                JOptionPane.showMessageDialog(null, "This subject is already added.");
                return;
            }
        }

        // Add subject column
        model.addColumn(subName);
        subjectIds.add(subId); // Track subject ID

        // Fill cells for the new column
        for (int row = 0; row < model.getRowCount(); row++) {
            model.setValueAt("", row, model.getColumnCount() - 1);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_Com2ActionPerformed
      public int setSql(String sql){
        int ok=0;
    try{
            co.setConnection();
            ok=co.std.executeUpdate(sql);                
           co. con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    return ok;
}
    private void rSButtonMaterialIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne1ActionPerformed
        
    
try {
    String classId = Com1.getSelectedItem().toString().split("-")[0]; // Get class ID
    int rowCount = table2.getRowCount();
    int subjectCount = subjectIds.size();

    // Get exam ID from Com3 (e.g., "2-Final Exam")
    String selectedExam = Com3.getSelectedItem().toString();
    String[] examArray = selectedExam.split("-");
    if (examArray.length < 2) {
        JOptionPane.showMessageDialog(null, "Please select a valid exam from the list.");
        return;
    }
    String examId = examArray[0].trim();

    int inserted = 0;

    for (int i = 0; i < rowCount; i++) {
        String studentId = table2.getValueAt(i, 0).toString(); // Column 0 = Student ID

        // 🔁 Get sc_no using your 'search' method from 'codes' class
        String scSql = "SELECT sc_no FROM student_class WHERE id = '" + studentId + "' AND cl_no = '" + classId + "'";
        ResultSet rs = co.search(scSql);  // ✅ Correct call here
        int scNo = -1;
        if (rs.next()) {
            scNo = rs.getInt("sc_no");
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ student_class not found for student: " + studentId);
            continue;
        }

        for (int j = 0; j < subjectCount; j++) {
            String subId = subjectIds.get(j); // subject_id list
            String mark = table2.getValueAt(i, j + 2).toString().trim(); // mark input

            // Validate mark
            if (mark.isEmpty()) {
                JOptionPane.showMessageDialog(null, "⚠️ Please enter all marks before saving.");
                return;
            }

            try {
                double num = Double.parseDouble(mark);
                if (num < 0 || num > 100) {
                    JOptionPane.showMessageDialog(null, "❌ Invalid mark for student " + studentId + ": must be 0–100");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "❌ Non-numeric mark for student: " + studentId);
                return;
            }

            // ✅ INSERT using sc_no, subId, examId
            String sql = "INSERT INTO results VALUES (null, '" + scNo + "', '" + subId + "', '" + examId + "', '" + mark + "', current_date())";
            inserted += setSql(sql);  // Using your method to execute SQL
        }
    }

    JOptionPane.showMessageDialog(null, inserted > 0 ? "✅ All marks saved successfully!" : "⚠️ No marks inserted.");
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "❌ Error saving marks: " + ex.getMessage());
}

            

         

    }//GEN-LAST:event_rSButtonMaterialIconOne1ActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        // TODO add your handling code here:
        
         DefaultTableModel model = (DefaultTableModel) table2.getModel();
    int rowCount = model.getRowCount();
    int colCount = model.getColumnCount();

    // Add "Average" column if not already added
    if (model.findColumn("Average") == -1) {
        model.addColumn("Average");
    }

    for (int row = 0; row < rowCount; row++) {
        int total = 0, count = 0;
        for (int col = 2; col < colCount; col++) {
            Object value = model.getValueAt(row, col);
            if (value != null && !value.toString().trim().isEmpty()) {
                try {
                    total += Integer.parseInt(value.toString());
                    count++;
                } catch (NumberFormatException ex) {
                    // ignore non-number values
                }
            }
        }

        double avg = count > 0 ? (double) total / count : 0;
        model.setValueAt(String.format("%.2f", avg), row, model.getColumnCount() - 1);
    }
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table2.getModel();
    int rowCount = model.getRowCount();
    int colCount = model.getColumnCount();

    // Add "Total" column if not already added
    if (model.findColumn("Total") == -1) {
        model.addColumn("Total");
    }

    for (int row = 0; row < rowCount; row++) {
        int total = 0;
        for (int col = 2; col < colCount; col++) {
            Object value = model.getValueAt(row, col);
            if (value != null && !value.toString().trim().isEmpty()) {
                try {
                    total += Integer.parseInt(value.toString());
                } catch (NumberFormatException ex) {
                    // Ignore or handle invalid number
                }
            }
        }
        model.setValueAt(total, row, model.getColumnCount() - 1); // Set total at last column
    }
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        // TODO add your handling code here:
         String array[] =  Com1.getSelectedItem().toString().split("-");
        cl = array[1].trim();
        String sql = "call result_proc_by_class('"+cl+"')";
        co.viewTable(sql, table2);
        
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void Com3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com3ActionPerformed
        // TODO add your handling code here:
           String array[] = Com3.getSelectedItem().toString().split("-");
           exam = array[0];
   
    }//GEN-LAST:event_Com3ActionPerformed

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
            java.util.logging.Logger.getLogger(EntryMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntryMarks().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBoxMaterial Com1;
    private RSMaterialComponent.RSComboBoxMaterial Com2;
    private RSMaterialComponent.RSComboBoxMaterial Com3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private RSMaterialComponent.RSButtonMaterialGradientTwo rSButtonMaterialGradientTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private rojeru_san.complementos.RSTableMetro table2;
    // End of variables declaration//GEN-END:variables
}
