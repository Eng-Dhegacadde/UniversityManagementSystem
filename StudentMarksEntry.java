package UniversityMS;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class StudentMarksEntry extends JFrame {
    private JComboBox<String> classComboBox, subjectComboBox;
    private JTable marksTable;
    private JButton saveButton;
    private DefaultTableModel tableModel;
    
    public StudentMarksEntry() {
        setTitle("Student Marks Entry");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel with ComboBoxes
        JPanel topPanel = new JPanel(new FlowLayout());
        classComboBox = new JComboBox<>();
        subjectComboBox = new JComboBox<>();
        topPanel.add(new JLabel("Class:"));
        topPanel.add(classComboBox);
        topPanel.add(new JLabel("Subject:"));
        topPanel.add(subjectComboBox);

        // Table to enter marks
        tableModel = new DefaultTableModel(new Object[]{"Student ID", "Student Name", "Marks"}, 0);
        marksTable = new JTable(tableModel);

        // Save Button
        saveButton = new JButton("Save Marks");
        saveButton.addActionListener(e -> saveMarks());

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(marksTable), BorderLayout.CENTER);
        add(saveButton, BorderLayout.SOUTH);

        loadClasses();
        classComboBox.addActionListener(e -> loadSubjects());
        subjectComboBox.addActionListener(e -> loadStudents());
    }

    // Load classes from database
    private void loadClasses() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "root", "");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT class_name FROM classes")) {
            while (rs.next()) {
                classComboBox.addItem(rs.getString("class_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Load subjects based on selected class
    private void loadSubjects() {
        subjectComboBox.removeAllItems();
        String selectedClass = (String) classComboBox.getSelectedItem();
        if (selectedClass == null) return;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "root", "");
             PreparedStatement ps = con.prepareStatement("SELECT subject_name FROM subjects WHERE class_id = (SELECT class_id FROM classes WHERE class_name = ?)")) {
            ps.setString(1, selectedClass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                subjectComboBox.addItem(rs.getString("subject_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Load students based on selected class
    private void loadStudents() {
        tableModel.setRowCount(0);
        String selectedClass = (String) classComboBox.getSelectedItem();
        if (selectedClass == null) return;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "root", "");
             PreparedStatement ps = con.prepareStatement("SELECT student_id, student_name FROM students WHERE class_id = (SELECT class_id FROM classes WHERE class_name = ?)")) {
            ps.setString(1, selectedClass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getInt("student_id"), rs.getString("student_name"), ""});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Save marks to database
    private void saveMarks() {
        String selectedSubject = (String) subjectComboBox.getSelectedItem();
        if (selectedSubject == null) return;
        
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "root", "");
             PreparedStatement ps = con.prepareStatement("INSERT INTO marks (student_id, subject_id, marks) VALUES (?, (SELECT subject_id FROM subjects WHERE subject_name = ?), ?)")) {
            
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                int studentId = (int) tableModel.getValueAt(i, 0);
                String marks = (String) tableModel.getValueAt(i, 2);
                
                ps.setInt(1, studentId);
                ps.setString(2, selectedSubject);
                ps.setInt(3, Integer.parseInt(marks));
                ps.addBatch();
            }
            ps.executeBatch();
            JOptionPane.showMessageDialog(this, "Marks saved successfully!");
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving marks!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentMarksEntry().setVisible(true));
    }
}
