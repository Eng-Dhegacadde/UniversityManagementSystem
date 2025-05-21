package UniversityMS;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class EntryResults extends javax.swing.JFrame {
        ArrayList<String> subjectIds = new ArrayList<>();
    Codes co = new Codes();
    String id, cl,sub,exam;
    public EntryResults() {
        initComponents();
        co.fillComboBox(Com1, "SELECT DISTINCT concat(c.cl_no, '-', c.cl_name) AS cl\n" +
"FROM student s\n" +
"JOIN student_class sc ON s.id = sc.id\n" +
"JOIN class c ON c.cl_no = sc.cl_no\n" +
"WHERE sc.sc_no IN (\n" +
"    SELECT e.sc_no FROM exam_attendance e\n" +
")   ", "cl");
    co.fillComboBox(Com2, "SELECT DISTINCT concat( sub.sub_no, '-', sub.sub_name) AS subject\n" +
"FROM subjects sub\n" +
"JOIN exam_attendance ea ON sub.sub_no = ea.sub_no", "subject");
//        co.fillComboBox(Com3, "SELECT concat(exm_no,'-', exm_name) imtixan from exams", "imtixan");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonMaterialGradientTwo1 = new RSMaterialComponent.RSButtonMaterialGradientTwo();
        jPanel1 = new javax.swing.JPanel();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new rojeru_san.complementos.RSTableMetro();
        Com2 = new RSMaterialComponent.RSComboBoxMaterial();
        Com1 = new RSMaterialComponent.RSComboBoxMaterial();

        rSButtonMaterialGradientTwo1.setText("rSButtonMaterialGradientTwo1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialIconOne1.setText("Save");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INSERT_CHART);
        rSButtonMaterialIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 70, 30));

        rSButtonMaterialIconOne2.setText("Avg");
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INSERT_CHART);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 70, 30));

        rSButtonMaterialIconOne3.setText("Total");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INSERT_CHART);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 70, 30));

        rSButtonMaterialIconOne4.setText("Show");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(0, 0, 0));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INSERT_CHART);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 70, 30));

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

        Com2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------Select Subjects Name-----" }));
        Com2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com2ActionPerformed(evt);
            }
        });
        jPanel1.add(Com2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 240, 30));

        Com1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------Select Class Name-----" }));
        Com1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Com1ActionPerformed(evt);
            }
        });
        jPanel1.add(Com1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 240, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 4, 1300, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
      // Declare a variable to store ea_no
int eaNo = 0;


private void fetchEaNo(String scNo, String subId) {
    try {
        // SQL query to retrieve the distinct ea_no for the selected student (via sc_no) and subject (via sub_no)
        String query = "SELECT DISTINCT ea.ea_no " +
                       "FROM exam_attendance ea " +
                       "WHERE ea.sc_no = '" + scNo + "' " +  // Use sc_no to link to the student
                       "AND ea.sub_no = '" + subId + "'";  // Use sub_no to filter by subject

        ResultSet rs = co.search(query);  // Use search to fetch ea_no based on sc_no and sub_no
        if (rs.next()) {
            eaNo = rs.getInt("ea_no");  // Store the ea_no into the variable
        } else {
            JOptionPane.showMessageDialog(null, "No matching exam attendance found for this student and subject.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}




private void saveMarksToDatabase() {
    // Get the selected subject name from the combo box
    String subjectName = (String) Com2.getSelectedItem();
    
    // Print debugging information
    System.out.println("Selected Subject: " + subjectName);
    System.out.println("Subject IDs List: " + subjectIds);

    // Now, iterate over all rows (students) in the table and save their marks
    DefaultTableModel model = (DefaultTableModel) table2.getModel();

    for (int row = 0; row < model.getRowCount(); row++) {
        String scNo = model.getValueAt(row, 0).toString(); // Assuming column 0 has the sc_no (student class number)
        String marks = (String) model.getValueAt(row, 2);  // Marks are in the 3rd column (adjust this if necessary)

        if (!marks.isEmpty()) {
            // Check if the index is valid in subjectIds
            int selectedIndex = Com2.getSelectedIndex();
            if (selectedIndex < 1 || selectedIndex > subjectIds.size()) {
                JOptionPane.showMessageDialog(null, "Invalid subject index: " + selectedIndex);
                return;
            }

            // Get the correct sub_no based on the subject selected
            String subId = subjectIds.get(selectedIndex - 1); // Get the correct sub_no from the list
            System.out.println("Subject ID: " + subId);

            // Fetch the correct ea_no for this student (sc_no) and subject
            fetchEaNo(scNo, subId);  // Pass sc_no and sub_no to get correct ea_no

            if (eaNo != 0) {  // Ensure ea_no is valid
                try {
                    // SQL query to insert marks into the result table
                    String query = "INSERT INTO result (ea_no, marks, r_date) VALUES (" + eaNo + ", '" + marks + "', '" + new java.sql.Date(System.currentTimeMillis()) + "')";
                    co.setSql(query);  // Execute the query using setSql
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: No valid exam attendance found for student " + scNo + " and subject " + subjectName);
            }
        }
    }
}

      
     

private void calculateAverage() {
    DefaultTableModel model = (DefaultTableModel) table2.getModel();
    int rowCount = model.getRowCount();
    int colCount = model.getColumnCount();

    // Add "Average" column if not already added
    if (model.findColumn("Average") == -1) {
        model.addColumn("Average");
    }

    // Iterate through each row (representing a student)
    for (int row = 0; row < rowCount; row++) {
        int total = 0, count = 0;

        // Iterate through each subject column (starting from column 2, which is assumed to be the first subject)
        // Exclude the "Total" column (last column) and the "Average" column (next-to-last column)
        for (int col = 2; col < colCount - 2; col++) {  // Start from the first subject column, but exclude the last two columns
            Object value = model.getValueAt(row, col);

            if (value != null && !value.toString().trim().isEmpty()) {
                try {
                    total += Integer.parseInt(value.toString());
                    count++;
                } catch (NumberFormatException ex) {
                    // Ignore non-number values
                    continue;
                }
            }
        }

        // Calculate average if there are valid marks (count > 0)
        double avg = (count > 0) ? (double) total / count : 0;
        model.setValueAt(String.format("%.2f", avg), row, model.getColumnCount() - 2); // Set average in the second-last column
    }
}



      
    private void rSButtonMaterialIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne1ActionPerformed
        saveMarksToDatabase();
    }//GEN-LAST:event_rSButtonMaterialIconOne1ActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        // TODO add your handling code here:
    calculateAverage();
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

   private void calculateTotal() {
    DefaultTableModel model = (DefaultTableModel) table2.getModel();
    int rowCount = model.getRowCount();
    int colCount = model.getColumnCount();

    // Add "Total" column if not already added
    if (model.findColumn("Total") == -1) {
        model.addColumn("Total");
    }

    // Iterate through each row (representing a student)
    for (int row = 0; row < rowCount; row++) {
        int total = 0;

        // Iterate through each subject column (starting from column 2, which is assumed to be the first subject)
        // Exclude the "Total" column (last column)
        for (int col = 2; col < colCount - 2; col++) {  // Exclude the last two columns (Total and Average)
            Object value = model.getValueAt(row, col);

            if (value != null && !value.toString().trim().isEmpty()) {
                try {
                    total += Integer.parseInt(value.toString());
                } catch (NumberFormatException ex) {
                    // Ignore invalid values (non-numeric)
                    continue;
                }
            }
        }

        // Set the total value in the "Total" column for the current student
        model.setValueAt(total, row, model.getColumnCount() - 1); // Set total in the last column
    }
}


    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        // TODO add your handling code here:
      calculateTotal();
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        // TODO add your handling code here:
//         String array[] =  Com1.getSelectedItem().toString().split("-");
//        cl = array[1].trim();
//        String sql = "call result_proc_by_class('"+cl+"')";
//        co.viewTable(sql, table2);
        
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void Com2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com2ActionPerformed
      try {
        // Split the selected item from the combo box to get sub_no and sub_name
        String[] array = Com2.getSelectedItem().toString().split("-");
        String subId = array[0].trim(); // sub_no
        String subName = array[1].trim(); // sub_name

        DefaultTableModel model = (DefaultTableModel) table2.getModel();

        // Disable row selection, enable column selection for better UI behavior
        table2.setRowSelectionAllowed(false);
        table2.setColumnSelectionAllowed(true);
        table2.setCellSelectionEnabled(true);

        // Check if the subject is already added to the table columns
        for (int i = 2; i < model.getColumnCount(); i++) {
            if (model.getColumnName(i).equalsIgnoreCase(subName)) {
                JOptionPane.showMessageDialog(null, "This subject is already added.");
                return;
            }
        }

        // Add the subject column by sub_name
        model.addColumn(subName);
        subjectIds.add(subId); // Track sub_no (subject ID)

        // Fill the new column with empty cells
        for (int row = 0; row < model.getRowCount(); row++) {
            model.setValueAt("", row, model.getColumnCount() - 1);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_Com2ActionPerformed

    private void Com1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Com1ActionPerformed
        String array[] =  Com1.getSelectedItem().toString().split("-");
        cl = array[0];
        String sql="select s.id I, name from student s, class c, student_class sc where s.id=sc.id and c.cl_no=sc.cl_no and c.cl_no='"+cl+"'";
        co.viewTable(sql, table2);

    }//GEN-LAST:event_Com1ActionPerformed

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
            java.util.logging.Logger.getLogger(EntryResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntryResults().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBoxMaterial Com1;
    private RSMaterialComponent.RSComboBoxMaterial Com2;
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
