package UniversityMS;

import java.awt.Color;

import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    Codes co = new Codes();
    String r_sin, clasReport, s_state, acc, balance, rec, exam, clas, charge, chr;
    public Dashboard() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        co.fillComboBox(recCom, "select concat(id, '-', name) magac from student", "magac");
        co.fillComboBox(stdCom, "select concat(id, '-', name) magac from student", "magac");
        co.fillComboBox(ClassCom, "SELECT concat(cl_no, '-', cl_name) fasal from class", "fasal");
        co.fillComboBox(examclass, "SELECT concat(cl_no, '-', cl_name) fasal from class", "fasal");
        co.fillComboBox(chCom, "SELECT concat(at_no, '-', amount_name) lacag  from amount ORDER BY at_no", "lacag");
        co.fillComboBox(accCom, "SELECT concat(acc_no, '-', acc_name) akoon from account", "akoon");
        co.fillComboBox(recom, "SELECT concat(c.ch_no, ',', s.name)dalac from charges c, student s, student_class sc WHERE s.id = sc.id and c.sc_no = sc.sc_no", "dalac");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lp1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lp8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lp2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lp3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lp4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lp5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lp6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        main = new javax.swing.JTabbedPane();
        panal1 = new javax.swing.JPanel();
        rSLabelImage2 = new necesario.RSLabelImage();
        panel2 = new javax.swing.JPanel();
        rSButtonMaterialIconTwo8 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo13 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo14 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo11 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo16 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo12 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo15 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo21 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo22 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo35 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo20 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo30 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo36 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo37 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo38 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo39 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSLabelImage6 = new necesario.RSLabelImage();
        panal4 = new javax.swing.JPanel();
        rSButtonMaterialIconTwo47 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo48 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo34 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo23 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo28 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo29 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo31 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo32 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo33 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSLabelImage4 = new necesario.RSLabelImage();
        panal5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        recom = new RSMaterialComponent.RSComboBoxMaterial();
        jButton17 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        ClassCom = new RSMaterialComponent.RSComboBoxMaterial();
        jPanel8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        rd2 = new com.toedter.calendar.JDateChooser();
        rd1 = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        accCom = new RSMaterialComponent.RSComboBoxMaterial();
        jButton9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        recCom = new RSMaterialComponent.RSComboBoxMaterial();
        jButton10 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        stdCom = new RSMaterialComponent.RSComboBoxMaterial();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        examclass = new RSMaterialComponent.RSComboBoxMaterial();
        jButton12 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        panal3 = new javax.swing.JPanel();
        rSButtonMaterialIconTwo17 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo42 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo18 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo24 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo25 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo26 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo27 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo43 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo45 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSButtonMaterialIconTwo49 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        jPanel12 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        ch_date = new com.toedter.calendar.JDateChooser();
        chCom = new RSMaterialComponent.RSComboBoxMaterial();
        jPanel14 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rSLabelImage5 = new rojerusan.RSLabelImage();
        panal6 = new javax.swing.JPanel();
        rSButtonMaterialIconTwo19 = new RSMaterialComponent.RSButtonMaterialIconTwo();
        rSLabelImage3 = new rojerusan.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Zips\\Web Images & Icons 2\\Web Images & Icons 2\\ico2.png")); // NOI18N
        jLabel1.setText("University Management System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 1110, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 150));

        jPanel2.setBackground(new java.awt.Color(22, 219, 101));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lp1.setBackground(new java.awt.Color(22, 219, 101));
        lp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lp1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lp1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lp1MouseExited(evt);
            }
        });
        lp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\From Downloads\\home (1).png")); // NOI18N
        jLabel4.setText("    Home");
        lp1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 40));

        jPanel2.add(lp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 300, 50));

        lp8.setBackground(new java.awt.Color(22, 219, 101));
        lp8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lp8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lp8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lp8MouseExited(evt);
            }
        });
        lp8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\From Downloads\\logoute (1).png")); // NOI18N
        jLabel3.setText("    Log Out");
        lp8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, -1));

        jPanel2.add(lp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 300, 50));

        lp2.setBackground(new java.awt.Color(22, 219, 101));
        lp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lp2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lp2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lp2MouseExited(evt);
            }
        });
        lp2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\From Downloads\\evaluate (1).png")); // NOI18N
        jLabel5.setText("   Registration");
        lp2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, -1));

        jPanel2.add(lp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 50));

        lp3.setBackground(new java.awt.Color(22, 219, 101));
        lp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lp3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lp3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lp3MouseExited(evt);
            }
        });
        lp3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\From Downloads\\analysis (1).png")); // NOI18N
        jLabel6.setText("    Finance");
        lp3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, -1));

        jPanel2.add(lp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 300, 50));

        lp4.setBackground(new java.awt.Color(22, 219, 101));
        lp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lp4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lp4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lp4MouseExited(evt);
            }
        });
        lp4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pc\\Downloads\\exam (1).png")); // NOI18N
        jLabel7.setText("    Exam");
        lp4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, -1));

        jPanel2.add(lp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, 50));

        lp5.setBackground(new java.awt.Color(22, 219, 101));
        lp5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lp5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lp5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lp5MouseExited(evt);
            }
        });
        lp5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pc\\Downloads\\report (1).png")); // NOI18N
        jLabel9.setText("    Reports");
        lp5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, -1));

        jPanel2.add(lp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 50));

        lp6.setBackground(new java.awt.Color(22, 219, 101));
        lp6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lp6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lp6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lp6MouseExited(evt);
            }
        });
        lp6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\From Downloads\\team (1).png")); // NOI18N
        jLabel10.setText("    About");
        lp6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, -1));

        jPanel2.add(lp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 300, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, 580));

        panal1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pc\\Downloads\\homeImage.jpg")); // NOI18N
        panal1.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 580));

        main.addTab("tab1", panal1);

        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialIconTwo8.setText("Add Address");
        rSButtonMaterialIconTwo8.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCATION_ON);
        rSButtonMaterialIconTwo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo8ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 210, -1));

        rSButtonMaterialIconTwo13.setText("Responsible");
        rSButtonMaterialIconTwo13.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.RSS_FEED);
        rSButtonMaterialIconTwo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo13ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 210, -1));

        rSButtonMaterialIconTwo14.setText("Schools");
        rSButtonMaterialIconTwo14.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SCHOOL);
        rSButtonMaterialIconTwo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo14ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 210, -1));

        rSButtonMaterialIconTwo11.setText("Student View");
        rSButtonMaterialIconTwo11.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo11ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        rSButtonMaterialIconTwo16.setText("Student Calsses");
        rSButtonMaterialIconTwo16.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo16ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        rSButtonMaterialIconTwo12.setText("Classess");
        rSButtonMaterialIconTwo12.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo12ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        rSButtonMaterialIconTwo15.setText("Faculties");
        rSButtonMaterialIconTwo15.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo15ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        rSButtonMaterialIconTwo21.setText("Staff View");
        rSButtonMaterialIconTwo21.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo21ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        rSButtonMaterialIconTwo22.setText("Jobs");
        rSButtonMaterialIconTwo22.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo22ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        rSButtonMaterialIconTwo35.setText("Semisters");
        rSButtonMaterialIconTwo35.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo35ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo35, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 210, -1));

        rSButtonMaterialIconTwo20.setText("Decree");
        rSButtonMaterialIconTwo20.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo20ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        rSButtonMaterialIconTwo30.setText("Decree");
        rSButtonMaterialIconTwo30.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo30ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo30, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        rSButtonMaterialIconTwo36.setText("Departments");
        rSButtonMaterialIconTwo36.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo36ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 210, -1));

        rSButtonMaterialIconTwo37.setText("DepartmentSubjects");
        rSButtonMaterialIconTwo37.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo37ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        rSButtonMaterialIconTwo38.setText("Specializations");
        rSButtonMaterialIconTwo38.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo38ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo38, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 210, -1));

        rSButtonMaterialIconTwo39.setText("SubjectClass");
        rSButtonMaterialIconTwo39.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo39ActionPerformed(evt);
            }
        });
        panel2.add(rSButtonMaterialIconTwo39, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 210, -1));

        rSLabelImage6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pc\\Desktop\\All Desktop\\From Cudbi\\Icons pro\\120048.jpg")); // NOI18N
        panel2.add(rSLabelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 590));

        main.addTab("tab2", panel2);

        panal4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialIconTwo47.setText("Not in Exam");
        rSButtonMaterialIconTwo47.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo47ActionPerformed(evt);
            }
        });
        panal4.add(rSButtonMaterialIconTwo47, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, 50));

        rSButtonMaterialIconTwo48.setText("SubjectsView");
        rSButtonMaterialIconTwo48.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo48ActionPerformed(evt);
            }
        });
        panal4.add(rSButtonMaterialIconTwo48, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 50));

        rSButtonMaterialIconTwo34.setText("Entry Exam");
        rSButtonMaterialIconTwo34.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo34ActionPerformed(evt);
            }
        });
        panal4.add(rSButtonMaterialIconTwo34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 50));

        rSButtonMaterialIconTwo23.setText("ExamView");
        rSButtonMaterialIconTwo23.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo23ActionPerformed(evt);
            }
        });
        panal4.add(rSButtonMaterialIconTwo23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 50));

        rSButtonMaterialIconTwo28.setText("ExamRegister");
        rSButtonMaterialIconTwo28.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo28ActionPerformed(evt);
            }
        });
        panal4.add(rSButtonMaterialIconTwo28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 50));

        rSButtonMaterialIconTwo29.setText("SubjectClasses");
        rSButtonMaterialIconTwo29.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo29ActionPerformed(evt);
            }
        });
        panal4.add(rSButtonMaterialIconTwo29, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 50));

        rSButtonMaterialIconTwo31.setText("ResultExamView");
        rSButtonMaterialIconTwo31.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo31ActionPerformed(evt);
            }
        });
        panal4.add(rSButtonMaterialIconTwo31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 50));

        rSButtonMaterialIconTwo32.setText("ResultExamView");
        rSButtonMaterialIconTwo32.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo32ActionPerformed(evt);
            }
        });
        panal4.add(rSButtonMaterialIconTwo32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 50));

        rSButtonMaterialIconTwo33.setText("SubjectsView");
        rSButtonMaterialIconTwo33.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo33ActionPerformed(evt);
            }
        });
        panal4.add(rSButtonMaterialIconTwo33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, 50));

        rSLabelImage4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pc\\Downloads\\ExamView.jpg")); // NOI18N
        panal4.add(rSLabelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 540));

        main.addTab("tab3", panal4);

        panal5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 0, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receipt Report", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton16.setText("Single");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 80, -1));

        recom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Student ID" }));
        recom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomActionPerformed(evt);
            }
        });
        jPanel13.add(recom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 30));

        jButton17.setText("All");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        panal5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 230, 120));

        jPanel5.setBackground(new java.awt.Color(0, 0, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All Classes  Report", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Show");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 130, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("All Classes Report");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 40));

        panal5.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 230, 120));

        jPanel6.setBackground(new java.awt.Color(0, 0, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Class Report", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Show");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, -1));

        ClassCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Class Number" }));
        ClassCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassComActionPerformed(evt);
            }
        });
        jPanel6.add(ClassCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        panal5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 230, 120));

        jPanel8.setBackground(new java.awt.Color(0, 0, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receipt Report", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("Show");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, -1));
        jPanel8.add(rd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, -1));
        jPanel8.add(rd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, -1));

        panal5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 230, 120));

        jPanel7.setBackground(new java.awt.Color(0, 0, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Report", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("Single");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 80, -1));

        accCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Account  ID" }));
        accCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accComActionPerformed(evt);
            }
        });
        jPanel7.add(accCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jButton9.setText("All");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        panal5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 230, 120));

        jPanel9.setBackground(new java.awt.Color(0, 0, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receipt Report", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("Single");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 80, -1));

        recCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Student ID" }));
        recCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recComActionPerformed(evt);
            }
        });
        jPanel9.add(recCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jButton10.setText("All");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        panal5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 230, 120));

        jPanel11.setBackground(new java.awt.Color(0, 0, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sudent Statement Report", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stdCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Student ID" }));
        stdCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdComActionPerformed(evt);
            }
        });
        jPanel11.add(stdCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton13.setText("Show");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton14.setText("Balance");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 110, -1));

        panal5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 230, 120));

        jPanel10.setBackground(new java.awt.Color(0, 0, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exam Report", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        examclass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Class Number" }));
        examclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examclassActionPerformed(evt);
            }
        });
        jPanel10.add(examclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jButton12.setText("All");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, -1));

        jButton15.setText("Single");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 80, -1));

        panal5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 230, 120));

        jPanel15.setBackground(new java.awt.Color(0, 0, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Income Statement", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton19.setText("Show");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 130, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Income Statement");
        jPanel15.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 40));

        panal5.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 230, 120));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pc\\Desktop\\All Desktop\\From Cudbi\\Icons pro\\report-image.jpg")); // NOI18N
        panal5.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 540));

        main.addTab("tab4", panal5);

        panal3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialIconTwo17.setText("ChargeView");
        rSButtonMaterialIconTwo17.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo17ActionPerformed(evt);
            }
        });
        panal3.add(rSButtonMaterialIconTwo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 50));

        rSButtonMaterialIconTwo42.setText("Accounts");
        rSButtonMaterialIconTwo42.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo42ActionPerformed(evt);
            }
        });
        panal3.add(rSButtonMaterialIconTwo42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 50));

        rSButtonMaterialIconTwo18.setText("ReceiptView");
        rSButtonMaterialIconTwo18.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo18ActionPerformed(evt);
            }
        });
        panal3.add(rSButtonMaterialIconTwo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 200, 50));

        rSButtonMaterialIconTwo24.setText("Expense_ChargeView");
        rSButtonMaterialIconTwo24.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo24ActionPerformed(evt);
            }
        });
        panal3.add(rSButtonMaterialIconTwo24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 50));

        rSButtonMaterialIconTwo25.setText("Expense_PaymentView");
        rSButtonMaterialIconTwo25.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo25ActionPerformed(evt);
            }
        });
        panal3.add(rSButtonMaterialIconTwo25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 200, 50));

        rSButtonMaterialIconTwo26.setText("Salary _Payment_view");
        rSButtonMaterialIconTwo26.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo26ActionPerformed(evt);
            }
        });
        panal3.add(rSButtonMaterialIconTwo26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 200, 50));

        rSButtonMaterialIconTwo27.setText("Salary _Charge_view");
        rSButtonMaterialIconTwo27.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo27ActionPerformed(evt);
            }
        });
        panal3.add(rSButtonMaterialIconTwo27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 50));

        rSButtonMaterialIconTwo43.setText("Amount Types");
        rSButtonMaterialIconTwo43.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo43ActionPerformed(evt);
            }
        });
        panal3.add(rSButtonMaterialIconTwo43, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 200, 50));

        rSButtonMaterialIconTwo45.setText("Expenses");
        rSButtonMaterialIconTwo45.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo45ActionPerformed(evt);
            }
        });
        panal3.add(rSButtonMaterialIconTwo45, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, 50));

        rSButtonMaterialIconTwo49.setText("Transfer Accounts");
        rSButtonMaterialIconTwo49.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo49ActionPerformed(evt);
            }
        });
        panal3.add(rSButtonMaterialIconTwo49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 50));

        jPanel12.setBackground(new java.awt.Color(0, 0, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Charge All Report", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("Show");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, -1));
        jPanel12.add(ch_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, -1));

        chCom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Amount Number", " " }));
        chCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chComActionPerformed(evt);
            }
        });
        jPanel12.add(chCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 30));

        panal3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 220, 130));

        jPanel14.setBackground(new java.awt.Color(0, 0, 204));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All Charges  Report", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton18.setText("Show");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 130, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("UnPaid Students");
        jPanel14.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 40));

        panal3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 230, 130));

        rSLabelImage5.setIcon(new javax.swing.ImageIcon("D:\\From Downloads\\finance.jpg")); // NOI18N
        panal3.add(rSLabelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1130, 590));

        main.addTab("tab5", panal3);

        panal6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialIconTwo19.setText("UsersView");
        rSButtonMaterialIconTwo19.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STARS);
        rSButtonMaterialIconTwo19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconTwo19ActionPerformed(evt);
            }
        });
        panal6.add(rSButtonMaterialIconTwo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 50));

        rSLabelImage3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pc\\Downloads\\Download free png of PNG  Indian college student cheerful school adult about png, face, person, men, and certificate 12827875.jpeg")); // NOI18N
        panal6.add(rSLabelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1120, 570));

        main.addTab("tab6", panal6);

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 1140, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp1MouseClicked
        // TODO add your handling code here:
        main.setSelectedComponent(panal1);
    }//GEN-LAST:event_lp1MouseClicked

    private void lp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp2MouseClicked
        // TODO add your handling code here:
        main.setSelectedComponent(panel2);
    }//GEN-LAST:event_lp2MouseClicked

    private void lp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp3MouseClicked
       
         main.setSelectedComponent(panal3);
    }//GEN-LAST:event_lp3MouseClicked

    private void lp4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp4MouseClicked
        // TODO add your handling code here:
        main.setSelectedComponent(panal4);
    }//GEN-LAST:event_lp4MouseClicked

    private void lp5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp5MouseClicked
        // TODO add your handling code here:
        main.setSelectedComponent(panal5);
    }//GEN-LAST:event_lp5MouseClicked

    private void lp6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp6MouseClicked
        // TODO add your handling code here:
        main.setSelectedComponent(panal6);
    }//GEN-LAST:event_lp6MouseClicked

    private void lp1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp1MouseEntered
        // TODO add your handling code here:
        lp1.setBackground(Color.decode("#66FF33"));
    }//GEN-LAST:event_lp1MouseEntered

    private void lp1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp1MouseExited
        lp1.setBackground(Color.decode("#16DB65"));
    }//GEN-LAST:event_lp1MouseExited

    private void lp2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp2MouseEntered
        // TODO add your handling code here:
        lp2.setBackground(Color.decode("#66FF33"));
    }//GEN-LAST:event_lp2MouseEntered

    private void lp2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp2MouseExited
        // TODO add your handling code here:
        lp2.setBackground(Color.decode("#16DB65"));
    }//GEN-LAST:event_lp2MouseExited

    private void lp3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp3MouseEntered
        lp3.setBackground(Color.decode("#66FF33"));
// TODO add your handling code here:
    }//GEN-LAST:event_lp3MouseEntered

    private void lp3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp3MouseExited
        // TODO add your handling code here:
        lp3.setBackground(Color.decode("#16DB65"));
    }//GEN-LAST:event_lp3MouseExited

    private void lp4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp4MouseEntered
        // TODO add your handling code here:
        lp4.setBackground(Color.decode("#66FF33"));
    }//GEN-LAST:event_lp4MouseEntered

    private void lp4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp4MouseExited
        // TODO add your handling code here:
        lp4.setBackground(Color.decode("#16DB65"));
    }//GEN-LAST:event_lp4MouseExited

    private void lp5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp5MouseEntered
        // TODO add your handling code here:
        lp5.setBackground(Color.decode("#66FF33"));
    }//GEN-LAST:event_lp5MouseEntered

    private void lp5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp5MouseExited
        // TODO add your handling code here:
        lp5.setBackground(Color.decode("#16DB65"));
    }//GEN-LAST:event_lp5MouseExited

    private void lp6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp6MouseEntered
        // TODO add your handling code here:
        lp6.setBackground(Color.decode("#66FF33"));
    }//GEN-LAST:event_lp6MouseEntered

    private void lp6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp6MouseExited
        // TODO add your handling code here:
        lp6.setBackground(Color.decode("#16DB65"));
    }//GEN-LAST:event_lp6MouseExited

    private void lp8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp8MouseEntered
        // TODO add your handling code here:
        lp8.setBackground(Color.decode("#66FF33"));
    }//GEN-LAST:event_lp8MouseEntered

    private void lp8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp8MouseExited
        // TODO add your handling code here:
        lp8.setBackground(Color.decode("#16DB65"));
    }//GEN-LAST:event_lp8MouseExited

    private void lp8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lp8MouseClicked
        // TODO add your handling code here:
        LogIn log = new LogIn();
        log.show();
        this.hide();
    }//GEN-LAST:event_lp8MouseClicked

    private void rSButtonMaterialIconTwo19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo19ActionPerformed
        UsersView UV = new UsersView();
        UV.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo19ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        co.report("src\\UniversityMS\\Exam_Report_sin.jrxml", "call result_proc_by_class('" + exam + "')");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        co.report("src\\UniversityMS\\Exam_Report_All.jrxml", "call result_proc_all()");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void examclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examclassActionPerformed
        // TODO add your handling code here:
        String Array[] = examclass.getSelectedItem().toString().split("-");
        exam = Array[1];
    }//GEN-LAST:event_examclassActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        co.report("src\\UniversityMS\\student_balance.jrxml", "call student_balance ('" + s_state + "')");

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        //          co.report("src\\UniversityMS\\statement_pro.jrxml", "call statement_pro('"+s_state+"')");

        co.report("src\\UniversityMS\\statement_pro.jrxml", "call statement_pro('" + s_state + "')");
        // JOptionPane.showMessageDialog(null, "call statement_pro('"+s_state+"')");

        // Hubinta xariirka faylka warbixinta
        //String reportPath = "C:\\Users\\Pc\\Documents\\NetBeansProjects\\university\\src\\UniversityMS\\statement_pro.jrxml";
        // Wacitaanka warbixinta
        //try {
        //    co.report(reportPath, "call statement_pro('" + s_state + "')");
        //} catch (Exception e) {
        //    System.out.println("Waxaa dhacay cilad: " + e.getMessage());
        //    e.printStackTrace();
        //}

    }//GEN-LAST:event_jButton13ActionPerformed

    private void stdComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdComActionPerformed
        String Array[] = stdCom.getSelectedItem().toString().split("-");
        s_state = Array[0];
    }//GEN-LAST:event_stdComActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        co.report("src\\UniversityMS\\receipt_report_all.jrxml ", "call receipt_report_all()");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void recComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recComActionPerformed
        String Array[] = recCom.getSelectedItem().toString().split("-");
        rec = Array[0];

    }//GEN-LAST:event_recComActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        co.report("src\\UniversityMS\\receipt_report_single.jrxml", "call receipt_report_single('" + rec + "')");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        co.report("src\\UniversityMS\\repot_account_all.jrxml", "call repot_account_all()");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void accComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accComActionPerformed
        String Array[] = accCom.getSelectedItem().toString().split("-");
        acc = Array[0];
    }//GEN-LAST:event_accComActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        co.report("src\\UniversityMS\\repot_account_single.jrxml", "call repot_account_single('" + acc + "')");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Date d1 = new Date(rd1.getDate().getTime());
        Date d2 = new Date(rd2.getDate().getTime());
        co.report("src\\UniversityMS\\receipt_report_between.jrxml",
                "call receipt_report_between('" + d1 + "','" + d2 + "')");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ClassComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassComActionPerformed
        String Array[] = ClassCom.getSelectedItem().toString().split("-");
        clasReport = Array[0];

    }//GEN-LAST:event_ClassComActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        co.report("src\\UniversityMS\\student_class_reportrt1.jrxml", "call student_class_report('" + clasReport + "')");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        co.report("src\\UniversityMS\\report_class_pro.jrxml", "call report_class_pro()");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rSButtonMaterialIconTwo33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialIconTwo33ActionPerformed

    private void rSButtonMaterialIconTwo32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialIconTwo32ActionPerformed

    private void rSButtonMaterialIconTwo31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialIconTwo31ActionPerformed

    private void rSButtonMaterialIconTwo29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo29ActionPerformed
        SubjectClassView scv = new SubjectClassView();
        scv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo29ActionPerformed

    private void rSButtonMaterialIconTwo28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo28ActionPerformed
        ExamRegisterView erv = new ExamRegisterView();
        erv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo28ActionPerformed

    private void rSButtonMaterialIconTwo23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo23ActionPerformed
        ExamsView ev = new ExamsView();
        ev.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo23ActionPerformed

    private void rSButtonMaterialIconTwo34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo34ActionPerformed
        // TODO add your handling code here:
        EntryMarks em = new EntryMarks();
        em.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo34ActionPerformed

    private void rSButtonMaterialIconTwo48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo48ActionPerformed
        // TODO add your handling code here:
        SubjectsView sv = new SubjectsView();
        sv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo48ActionPerformed

    private void rSButtonMaterialIconTwo47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo47ActionPerformed
        // TODO add your handling code here:
            NotExamStudents nes = new NotExamStudents();
            nes.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo47ActionPerformed

    private void rSButtonMaterialIconTwo45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo45ActionPerformed
        // TODO add your handling code here:
        ExpensesView ev = new ExpensesView();
        ev.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo45ActionPerformed

    private void rSButtonMaterialIconTwo43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo43ActionPerformed
        // TODO add your handling code here:
        AmountsView av = new AmountsView();
        av.setVisible(true);

    }//GEN-LAST:event_rSButtonMaterialIconTwo43ActionPerformed

    private void rSButtonMaterialIconTwo27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo27ActionPerformed
        SalaryChargeView scv = new SalaryChargeView();
        scv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo27ActionPerformed

    private void rSButtonMaterialIconTwo26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo26ActionPerformed
        SalaryPaymentView spv = new SalaryPaymentView();
        spv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo26ActionPerformed

    private void rSButtonMaterialIconTwo25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo25ActionPerformed
        ExpensePeymentView epv = new ExpensePeymentView();
        epv.setVisible(true);

    }//GEN-LAST:event_rSButtonMaterialIconTwo25ActionPerformed

    private void rSButtonMaterialIconTwo24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo24ActionPerformed
        ExpenseChargeView ecv = new ExpenseChargeView();
        ecv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo24ActionPerformed

    private void rSButtonMaterialIconTwo18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo18ActionPerformed
        ReceiptsView rv = new ReceiptsView();
        rv.setVisible(true);

    }//GEN-LAST:event_rSButtonMaterialIconTwo18ActionPerformed

    private void rSButtonMaterialIconTwo42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo42ActionPerformed
        // TODO add your handling code here:
        AccountsView av = new AccountsView();
        av.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo42ActionPerformed

    private void rSButtonMaterialIconTwo17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo17ActionPerformed
        ChargesView cv = new ChargesView();
        cv.show();
    }//GEN-LAST:event_rSButtonMaterialIconTwo17ActionPerformed

    private void rSButtonMaterialIconTwo39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo39ActionPerformed
        // TODO add your handling code here:
        SubjectClassView scv = new SubjectClassView();
        scv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo39ActionPerformed

    private void rSButtonMaterialIconTwo38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo38ActionPerformed
        // TODO add your handling code here:
        SpecializationView sv = new SpecializationView();
        sv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo38ActionPerformed

    private void rSButtonMaterialIconTwo37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo37ActionPerformed
        // TODO add your handling code here:
        DepartmentSubjectsView dpv = new DepartmentSubjectsView();
        dpv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo37ActionPerformed

    private void rSButtonMaterialIconTwo36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo36ActionPerformed
        DepartmentsView dp = new DepartmentsView();
        dp.show();

    }//GEN-LAST:event_rSButtonMaterialIconTwo36ActionPerformed

    private void rSButtonMaterialIconTwo30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialIconTwo30ActionPerformed

    private void rSButtonMaterialIconTwo20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo20ActionPerformed
        // TODO add your handling code here:
        DecreeView d = new DecreeView();
        d.show();

    }//GEN-LAST:event_rSButtonMaterialIconTwo20ActionPerformed

    private void rSButtonMaterialIconTwo35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo35ActionPerformed
        // TODO add your handling code here:
        SemistersView sv = new SemistersView();
        sv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo35ActionPerformed

    private void rSButtonMaterialIconTwo22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo22ActionPerformed
        JobsView jv = new JobsView();
        jv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo22ActionPerformed

    private void rSButtonMaterialIconTwo21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo21ActionPerformed
        StaffView sv = new StaffView();
        sv.setVisible(true);

    }//GEN-LAST:event_rSButtonMaterialIconTwo21ActionPerformed

    private void rSButtonMaterialIconTwo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo15ActionPerformed
        FcaultiesView fv = new FcaultiesView();
        fv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo15ActionPerformed

    private void rSButtonMaterialIconTwo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo12ActionPerformed
        ClassView cv = new ClassView();
        cv.show();
    }//GEN-LAST:event_rSButtonMaterialIconTwo12ActionPerformed

    private void rSButtonMaterialIconTwo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo16ActionPerformed
        StudentClassView scv = new StudentClassView();
        scv.show();
    }//GEN-LAST:event_rSButtonMaterialIconTwo16ActionPerformed

    private void rSButtonMaterialIconTwo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo11ActionPerformed
        StudentsView sv = new StudentsView();
        sv.setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconTwo11ActionPerformed

    private void rSButtonMaterialIconTwo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo14ActionPerformed
        SchoolsView sc = new SchoolsView();
        sc.show();
    }//GEN-LAST:event_rSButtonMaterialIconTwo14ActionPerformed

    private void rSButtonMaterialIconTwo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo13ActionPerformed
        ResponsibleView rs = new ResponsibleView();
        rs.show();
    }//GEN-LAST:event_rSButtonMaterialIconTwo13ActionPerformed

    private void rSButtonMaterialIconTwo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo8ActionPerformed
        AddressView av = new AddressView();
        av.show();
    }//GEN-LAST:event_rSButtonMaterialIconTwo8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
          Date d1 = new Date(ch_date.getDate().getTime());
        String sql = "call dalacad('"+d1+"','"+charge+"')";
        co.setSql(sql);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void chComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chComActionPerformed
        // TODO add your handling code here:
        String array[] = chCom.getSelectedItem().toString().split("-");
        charge = array[0];
    }//GEN-LAST:event_chComActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void recomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recomActionPerformed
        // TODO add your handling code here:
         String Array[] = recCom.getSelectedItem().toString().split("-");
        chr = Array[0];
    }//GEN-LAST:event_recomActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void rSButtonMaterialIconTwo49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconTwo49ActionPerformed
        // TODO add your handling code here:
        TransferAccounts ta = new TransferAccounts();
        ta.setVisible(true);
                
    }//GEN-LAST:event_rSButtonMaterialIconTwo49ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        
        co.report("src\\UniversityMS\\Unpaid_students_Rep.jrxml", "call Unpaid_students()");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        co.report("src\\UniversityMS\\IncomeStatement.jrxml", "call generate_income_statement()");
    }//GEN-LAST:event_jButton19ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBoxMaterial ClassCom;
    private RSMaterialComponent.RSComboBoxMaterial accCom;
    private RSMaterialComponent.RSComboBoxMaterial chCom;
    private com.toedter.calendar.JDateChooser ch_date;
    private RSMaterialComponent.RSComboBoxMaterial examclass;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel lp1;
    private javax.swing.JPanel lp2;
    public javax.swing.JPanel lp3;
    private javax.swing.JPanel lp4;
    private javax.swing.JPanel lp5;
    public javax.swing.JPanel lp6;
    private javax.swing.JPanel lp8;
    private javax.swing.JTabbedPane main;
    private javax.swing.JPanel panal1;
    private javax.swing.JPanel panal3;
    private javax.swing.JPanel panal4;
    private javax.swing.JPanel panal5;
    private javax.swing.JPanel panal6;
    private javax.swing.JPanel panel2;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo11;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo12;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo13;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo14;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo15;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo16;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo17;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo18;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo19;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo20;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo21;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo22;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo23;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo24;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo25;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo26;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo27;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo28;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo29;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo30;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo31;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo32;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo33;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo34;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo35;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo36;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo37;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo38;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo39;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo42;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo43;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo45;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo47;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo48;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo49;
    private RSMaterialComponent.RSButtonMaterialIconTwo rSButtonMaterialIconTwo8;
    private rojerusan.RSLabelImage rSLabelImage1;
    private necesario.RSLabelImage rSLabelImage2;
    private rojerusan.RSLabelImage rSLabelImage3;
    private necesario.RSLabelImage rSLabelImage4;
    private rojerusan.RSLabelImage rSLabelImage5;
    private necesario.RSLabelImage rSLabelImage6;
    private com.toedter.calendar.JDateChooser rd1;
    private com.toedter.calendar.JDateChooser rd2;
    private RSMaterialComponent.RSComboBoxMaterial recCom;
    private RSMaterialComponent.RSComboBoxMaterial recom;
    private RSMaterialComponent.RSComboBoxMaterial stdCom;
    // End of variables declaration//GEN-END:variables
}
