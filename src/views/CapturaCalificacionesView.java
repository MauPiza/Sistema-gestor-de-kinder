package views;

import common.Common;
import dao.ClassroomService;
import dao.StudentService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Student;

public class CapturaCalificacionesView extends javax.swing.JFrame {

    ClassroomService classroomService = new ClassroomService();
    StudentService studentService = new StudentService();
    Student student = new Student();
    List<Student> students = new ArrayList();
    List<Integer> classroomsId = classroomService.getClassroomsIdOccupated();
    List<String> califList = new ArrayList();
    int studentIndex = 0;
    int index = 0;

    public CapturaCalificacionesView() {
        initComponents();
        next_capture_btn.setVisible(false);
        setLocationRelativeTo(null);
        classroomsId.forEach(id -> {
            String item = String.valueOf(classroomService.getClassroomById(id).getName());
            grade_group_combobox.addItem(item);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        grade_group_combobox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel_calificaciones = new javax.swing.JPanel();
        item1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        item1_b1 = new javax.swing.JTextField();
        item1_b2 = new javax.swing.JTextField();
        item1_b3 = new javax.swing.JTextField();
        item2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        item2_b1 = new javax.swing.JTextField();
        item2_b2 = new javax.swing.JTextField();
        item2_b3 = new javax.swing.JTextField();
        item3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        item3_b1 = new javax.swing.JTextField();
        item3_b2 = new javax.swing.JTextField();
        item3_b3 = new javax.swing.JTextField();
        item4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        item4_b1 = new javax.swing.JTextField();
        item4_b2 = new javax.swing.JTextField();
        item4_b3 = new javax.swing.JTextField();
        item5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        item5_b1 = new javax.swing.JTextField();
        item5_b2 = new javax.swing.JTextField();
        item5_b3 = new javax.swing.JTextField();
        item6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        item6_b1 = new javax.swing.JTextField();
        item6_b2 = new javax.swing.JTextField();
        item6_b3 = new javax.swing.JTextField();
        item7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        item7_b1 = new javax.swing.JTextField();
        item7_b2 = new javax.swing.JTextField();
        item7_b3 = new javax.swing.JTextField();
        item8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        item8_b1 = new javax.swing.JTextField();
        item8_b2 = new javax.swing.JTextField();
        item8_b3 = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        student_name_label = new javax.swing.JLabel();
        student_lstname_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        next_capture_btn = new javax.swing.JPanel();
        next_capture_label = new javax.swing.JLabel();
        begin_capture_btn = new javax.swing.JPanel();
        start_capture_label = new javax.swing.JLabel();
        back_label = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        main_panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("Captura de calificaciones");

        grade_group_combobox.setBackground(new java.awt.Color(255, 255, 255));
        grade_group_combobox.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        grade_group_combobox.setForeground(new java.awt.Color(153, 153, 153));
        grade_group_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));
        grade_group_combobox.setBorder(null);
        grade_group_combobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grade_group_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade_group_comboboxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Grado y grupo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Información del alumno");

        panel_calificaciones.setBackground(new java.awt.Color(153, 153, 255));

        item1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Lenguaje y comunicación");

        item1_b1.setBackground(new java.awt.Color(255, 255, 255));
        item1_b1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item1_b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item1_b1.setBorder(null);

        item1_b2.setBackground(new java.awt.Color(255, 255, 255));
        item1_b2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item1_b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item1_b2.setBorder(null);
        item1_b2.setEnabled(false);

        item1_b3.setBackground(new java.awt.Color(255, 255, 255));
        item1_b3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item1_b3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item1_b3.setBorder(null);
        item1_b3.setEnabled(false);

        javax.swing.GroupLayout item1Layout = new javax.swing.GroupLayout(item1);
        item1.setLayout(item1Layout);
        item1Layout.setHorizontalGroup(
            item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                .addComponent(item1_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(item1_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item1Layout.createSequentialGroup()
                    .addContainerGap(378, Short.MAX_VALUE)
                    .addComponent(item1_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(318, 318, 318)))
        );
        item1Layout.setVerticalGroup(
            item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item1_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(item1_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(item1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(item1_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        item2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setText("Pensamiento matemático");

        item2_b1.setBackground(new java.awt.Color(255, 255, 255));
        item2_b1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item2_b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item2_b1.setBorder(null);

        item2_b2.setBackground(new java.awt.Color(255, 255, 255));
        item2_b2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item2_b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item2_b2.setBorder(null);
        item2_b2.setEnabled(false);

        item2_b3.setBackground(new java.awt.Color(255, 255, 255));
        item2_b3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item2_b3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item2_b3.setBorder(null);
        item2_b3.setEnabled(false);

        javax.swing.GroupLayout item2Layout = new javax.swing.GroupLayout(item2);
        item2.setLayout(item2Layout);
        item2Layout.setHorizontalGroup(
            item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(item2_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(item2_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(item2_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        item2Layout.setVerticalGroup(
            item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(item2_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item2_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item2_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        item3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setText("Exploración y comprensión del mundo natural y social");

        item3_b1.setBackground(new java.awt.Color(255, 255, 255));
        item3_b1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item3_b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item3_b1.setBorder(null);

        item3_b2.setBackground(new java.awt.Color(255, 255, 255));
        item3_b2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item3_b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item3_b2.setBorder(null);
        item3_b2.setEnabled(false);

        item3_b3.setBackground(new java.awt.Color(255, 255, 255));
        item3_b3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item3_b3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item3_b3.setBorder(null);
        item3_b3.setEnabled(false);

        javax.swing.GroupLayout item3Layout = new javax.swing.GroupLayout(item3);
        item3.setLayout(item3Layout);
        item3Layout.setHorizontalGroup(
            item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(item3_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(item3_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(item3_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        item3Layout.setVerticalGroup(
            item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item3_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item3_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item3_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        item4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("Artes");

        item4_b1.setBackground(new java.awt.Color(255, 255, 255));
        item4_b1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item4_b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item4_b1.setBorder(null);

        item4_b2.setBackground(new java.awt.Color(255, 255, 255));
        item4_b2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item4_b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item4_b2.setBorder(null);
        item4_b2.setEnabled(false);

        item4_b3.setBackground(new java.awt.Color(255, 255, 255));
        item4_b3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item4_b3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item4_b3.setBorder(null);
        item4_b3.setEnabled(false);

        javax.swing.GroupLayout item4Layout = new javax.swing.GroupLayout(item4);
        item4.setLayout(item4Layout);
        item4Layout.setHorizontalGroup(
            item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(item4_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(item4_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(item4_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        item4Layout.setVerticalGroup(
            item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item4_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(item4_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(item4_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        item5.setBackground(new java.awt.Color(153, 153, 255));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel11.setText("Educación física");

        item5_b1.setBackground(new java.awt.Color(255, 255, 255));
        item5_b1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item5_b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item5_b1.setBorder(null);

        item5_b2.setBackground(new java.awt.Color(255, 255, 255));
        item5_b2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item5_b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item5_b2.setBorder(null);
        item5_b2.setEnabled(false);

        item5_b3.setBackground(new java.awt.Color(255, 255, 255));
        item5_b3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item5_b3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item5_b3.setBorder(null);
        item5_b3.setEnabled(false);

        javax.swing.GroupLayout item5Layout = new javax.swing.GroupLayout(item5);
        item5.setLayout(item5Layout);
        item5Layout.setHorizontalGroup(
            item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(item5_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(item5_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(item5_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        item5Layout.setVerticalGroup(
            item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item5_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(item5_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(item5_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        item6.setBackground(new java.awt.Color(204, 204, 255));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setText("Inglés");

        item6_b1.setBackground(new java.awt.Color(255, 255, 255));
        item6_b1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item6_b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item6_b1.setBorder(null);

        item6_b2.setBackground(new java.awt.Color(255, 255, 255));
        item6_b2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item6_b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item6_b2.setBorder(null);
        item6_b2.setEnabled(false);

        item6_b3.setBackground(new java.awt.Color(255, 255, 255));
        item6_b3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item6_b3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item6_b3.setBorder(null);
        item6_b3.setEnabled(false);

        javax.swing.GroupLayout item6Layout = new javax.swing.GroupLayout(item6);
        item6.setLayout(item6Layout);
        item6Layout.setHorizontalGroup(
            item6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(item6_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(item6_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(item6_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        item6Layout.setVerticalGroup(
            item6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(item6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(item6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item6_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(item6_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(item6_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        item7.setBackground(new java.awt.Color(153, 153, 255));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel13.setText("Educación socioemocional");

        item7_b1.setBackground(new java.awt.Color(255, 255, 255));
        item7_b1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item7_b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item7_b1.setBorder(null);

        item7_b2.setBackground(new java.awt.Color(255, 255, 255));
        item7_b2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item7_b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item7_b2.setBorder(null);
        item7_b2.setEnabled(false);

        item7_b3.setBackground(new java.awt.Color(255, 255, 255));
        item7_b3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item7_b3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item7_b3.setBorder(null);
        item7_b3.setEnabled(false);

        javax.swing.GroupLayout item7Layout = new javax.swing.GroupLayout(item7);
        item7.setLayout(item7Layout);
        item7Layout.setHorizontalGroup(
            item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(item7_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(item7_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(item7_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        item7Layout.setVerticalGroup(
            item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item7Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item7_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(item7_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(item7_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        item8.setBackground(new java.awt.Color(204, 204, 255));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel12.setText("Informática");

        item8_b1.setBackground(new java.awt.Color(255, 255, 255));
        item8_b1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item8_b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item8_b1.setBorder(null);

        item8_b2.setBackground(new java.awt.Color(255, 255, 255));
        item8_b2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item8_b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item8_b2.setBorder(null);
        item8_b2.setEnabled(false);

        item8_b3.setBackground(new java.awt.Color(255, 255, 255));
        item8_b3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        item8_b3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item8_b3.setBorder(null);
        item8_b3.setEnabled(false);

        javax.swing.GroupLayout item8Layout = new javax.swing.GroupLayout(item8);
        item8.setLayout(item8Layout);
        item8Layout.setHorizontalGroup(
            item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(item8_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(item8_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(item8_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        item8Layout.setVerticalGroup(
            item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item8Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item8_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(item8_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(item8_b3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btn_guardar.setBackground(new java.awt.Color(51, 51, 51));
        btn_guardar.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });
        btn_guardar.setLayout(new java.awt.GridBagLayout());

        jLabel14.setFont(new java.awt.Font("Roboto Slab Medium", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 204));
        jLabel14.setText("Guardar");
        btn_guardar.add(jLabel14, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout panel_calificacionesLayout = new javax.swing.GroupLayout(panel_calificaciones);
        panel_calificaciones.setLayout(panel_calificacionesLayout);
        panel_calificacionesLayout.setHorizontalGroup(
            panel_calificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_calificacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_calificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_calificacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        panel_calificacionesLayout.setVerticalGroup(
            panel_calificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_calificacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Apellidos:");

        student_name_label.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        student_name_label.setForeground(new java.awt.Color(51, 51, 51));
        student_name_label.setText("Nombre del alumno");

        student_lstname_label.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        student_lstname_label.setForeground(new java.awt.Color(51, 51, 51));
        student_lstname_label.setText("Apellidos");

        jSeparator1.setBackground(Common.SECOND_GRAY);

        jSeparator2.setBackground(Common.SECOND_GRAY);

        next_capture_btn.setBackground(Common.DEEP_BLUE_COLOR);
        next_capture_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next_capture_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next_capture_btnMouseClicked(evt);
            }
        });
        next_capture_btn.setLayout(new java.awt.GridBagLayout());

        next_capture_label.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        next_capture_label.setForeground(new java.awt.Color(255, 255, 255));
        next_capture_label.setText("Siguiente registro");
        next_capture_btn.add(next_capture_label, new java.awt.GridBagConstraints());

        begin_capture_btn.setBackground(Common.DEEP_BLUE_COLOR);
        begin_capture_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        begin_capture_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                begin_capture_btnMouseClicked(evt);
            }
        });
        begin_capture_btn.setLayout(new java.awt.GridBagLayout());

        start_capture_label.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        start_capture_label.setForeground(new java.awt.Color(255, 255, 255));
        start_capture_label.setText("Comenzar captura");
        begin_capture_btn.add(start_capture_label, new java.awt.GridBagConstraints());

        back_label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back_label.setForeground(new java.awt.Color(102, 102, 102));
        back_label.setText("Volver atrás");
        back_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_labelMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Bloque I");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Bloque II");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Bloque III");

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(346, 346, 346)
                .addComponent(jLabel15)
                .addGap(68, 68, 68)
                .addComponent(jLabel16)
                .addGap(48, 48, 48)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(grade_group_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(student_name_label)
                                    .addComponent(student_lstname_label))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(back_label))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(begin_capture_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(next_capture_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(panel_calificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(7, 7, 7)))
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_calificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grade_group_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(student_name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(student_lstname_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(begin_capture_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(next_capture_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back_label)
                        .addGap(18, 18, 18))))
        );

        getContentPane().add(main_panel);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jMenuBar1.setMinimumSize(new java.awt.Dimension(34, 30));

        jMenu1.setBorder(null);
        jMenu1.setText("Ayuda");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("¿Qué valores asignar en los campos?");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("¿Cómo se llenan los demás bloques?");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("¿Puedo interrumpir el llenado de calificaciones?");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Ayuda general");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grade_group_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grade_group_comboboxActionPerformed
        try {
            if (grade_group_combobox.getSelectedIndex() > 0) {
                studentIndex = 0;
                //Obtiene el valor del combobox (Ej. 1-A)
                String classroomName = grade_group_combobox.getSelectedItem().toString();
                //Obtiene el id del salón mediante el valor del combobox
                int classroomId = classroomService.getClassroomIdByName(classroomName);
                //Se obtiene la lista de estudiantes por salon
                students.clear();// limpia los datos basura que tenga la lista
                students = studentService.getStudentsByClassroom(classroomId);
                Student currentStudent = students.get(studentIndex);
                student_name_label.setText((currentStudent.getName()));
                student_lstname_label.setText((currentStudent.getF_lastname()) + " " + currentStudent.getS_lastname());
            } else {
                student_name_label.setText("Nombre del alumno");
                student_lstname_label.setText("Apellidos");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_grade_group_comboboxActionPerformed

    private void back_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_labelMouseClicked
        HomeView hv = new HomeView();
        this.dispose();
        hv.setVisible(true);
    }//GEN-LAST:event_back_labelMouseClicked

    private void next_capture_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next_capture_btnMouseClicked
        //TODO: hacer los campos de las materias, solo si están llenos se puede sumar el contador (necesario
        // presionar boton guardar)
        try {
            if (studentIndex != students.size()) {
                Student currentStudent = students.get(studentIndex);
                System.out.println(currentStudent.getIdStudent());
                student_name_label.setText((currentStudent.getName()));
                student_lstname_label.setText((currentStudent.getF_lastname()) + " " + currentStudent.getS_lastname());
                studentIndex++;
            } else {
                JOptionPane.showMessageDialog(null, "No hay más registros");
                student_name_label.setText("Nombre del alumno");
                student_lstname_label.setText("Apellidos");
                next_capture_btn.setVisible(false);
                begin_capture_btn.setVisible(true);
                grade_group_combobox.setEnabled(true);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_next_capture_btnMouseClicked

    private void begin_capture_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_begin_capture_btnMouseClicked
        // Valida que las acciones se realicen siempre y cuando esté un item
        // válido seleccionado
        if (grade_group_combobox.getSelectedIndex() != 0) {
            studentIndex = 0;
            next_capture_btn.setVisible(true);
            begin_capture_btn.setVisible(false);
            grade_group_combobox.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una opción primero");
        }
    }//GEN-LAST:event_begin_capture_btnMouseClicked

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        /**
         * Nomenclatura de la declaración de las variables: C1 -> Calificacion1
         * C(n) -> Calificacion n B1 -> Bloque 1 B(n) -> Bloque n c7b1 ->
         * Calificacion 7 del Bloque 1
         */
        String c1b1, c2b1, c3b1, c4b1, c5b1, c6b1, c7b1, c8b1;
        c1b1 = item1_b1.getText();
        c2b1 = item2_b1.getText();
        c3b1 = item3_b1.getText();
        c4b1 = item4_b1.getText();
        c5b1 = item5_b1.getText();
        c6b1 = item6_b1.getText();
        c7b1 = item7_b1.getText();
        c8b1 = item8_b1.getText();
        califList.add(c1b1);
        califList.add(c2b1);
        califList.add(c3b1);
        califList.add(c4b1);
        califList.add(c5b1);
        califList.add(c6b1);
        califList.add(c7b1);
        califList.add(c8b1);
        califList.forEach(calif -> {
            System.out.println(calif);
        });
    }//GEN-LAST:event_btn_guardarMouseClicked

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
            java.util.logging.Logger.getLogger(CapturaCalificacionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapturaCalificacionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapturaCalificacionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapturaCalificacionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CapturaCalificacionesView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_label;
    private javax.swing.JPanel begin_capture_btn;
    private javax.swing.JPanel btn_guardar;
    private javax.swing.JComboBox<String> grade_group_combobox;
    private javax.swing.JPanel item1;
    private javax.swing.JTextField item1_b1;
    private javax.swing.JTextField item1_b2;
    private javax.swing.JTextField item1_b3;
    private javax.swing.JPanel item2;
    private javax.swing.JTextField item2_b1;
    private javax.swing.JTextField item2_b2;
    private javax.swing.JTextField item2_b3;
    private javax.swing.JPanel item3;
    private javax.swing.JTextField item3_b1;
    private javax.swing.JTextField item3_b2;
    private javax.swing.JTextField item3_b3;
    private javax.swing.JPanel item4;
    private javax.swing.JTextField item4_b1;
    private javax.swing.JTextField item4_b2;
    private javax.swing.JTextField item4_b3;
    private javax.swing.JPanel item5;
    private javax.swing.JTextField item5_b1;
    private javax.swing.JTextField item5_b2;
    private javax.swing.JTextField item5_b3;
    private javax.swing.JPanel item6;
    private javax.swing.JTextField item6_b1;
    private javax.swing.JTextField item6_b2;
    private javax.swing.JTextField item6_b3;
    private javax.swing.JPanel item7;
    private javax.swing.JTextField item7_b1;
    private javax.swing.JTextField item7_b2;
    private javax.swing.JTextField item7_b3;
    private javax.swing.JPanel item8;
    private javax.swing.JTextField item8_b1;
    private javax.swing.JTextField item8_b2;
    private javax.swing.JTextField item8_b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel next_capture_btn;
    private javax.swing.JLabel next_capture_label;
    private javax.swing.JPanel panel_calificaciones;
    private javax.swing.JLabel start_capture_label;
    private javax.swing.JLabel student_lstname_label;
    private javax.swing.JLabel student_name_label;
    // End of variables declaration//GEN-END:variables
}
