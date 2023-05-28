package views;

import common.Common;
import dao.ClassroomService;
import dao.StudentService;
import dao.TutorService;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Classroom;
import model.Student;
import model.Tutor;
import utils.UtilsDate;
import utils.UtilsPatterns;

public class InscripcionAlumnosView extends javax.swing.JFrame {

    StudentService studentService = new StudentService();
    TutorService tutorService = new TutorService();
    ClassroomService classroomService = new ClassroomService();
    int age = 0;
    String curp;

    public InscripcionAlumnosView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lastname1_field = new javax.swing.JTextField();
        lastname2_field = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        gender_combobox = new javax.swing.JComboBox<>();
        age_field = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        birthday_field = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        grade_field = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        group_field = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tutor_name = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        tutor_lastname1 = new javax.swing.JTextField();
        tutor_lastname2 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        email_field = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        bottom_panel = new javax.swing.JPanel();
        backToHome = new javax.swing.JLabel();
        buttonEnter = new javax.swing.JPanel();
        labelEnter = new javax.swing.JLabel();
        curp_field = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        main_panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("Alumno nuevo");

        name_field.setBackground(new java.awt.Color(255, 255, 255));
        name_field.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        name_field.setForeground(new java.awt.Color(153, 153, 153));
        name_field.setText("Nombre(s)");
        name_field.setBorder(null);
        name_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        name_field.setNextFocusableComponent(lastname1_field);
        name_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                name_fieldFocusLost(evt);
            }
        });
        name_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name_fieldKeyTyped(evt);
            }
        });

        lastname1_field.setBackground(new java.awt.Color(255, 255, 255));
        lastname1_field.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lastname1_field.setForeground(new java.awt.Color(153, 153, 153));
        lastname1_field.setText("Apellido paterno");
        lastname1_field.setBorder(null);
        lastname1_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lastname1_field.setNextFocusableComponent(tutor_lastname2);
        lastname1_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastname1_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastname1_fieldFocusLost(evt);
            }
        });
        lastname1_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastname1_fieldKeyTyped(evt);
            }
        });

        lastname2_field.setBackground(new java.awt.Color(255, 255, 255));
        lastname2_field.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lastname2_field.setForeground(new java.awt.Color(153, 153, 153));
        lastname2_field.setText("Apellido materno");
        lastname2_field.setBorder(null);
        lastname2_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lastname2_field.setName(""); // NOI18N
        lastname2_field.setNextFocusableComponent(curp_field);
        lastname2_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastname2_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastname2_fieldFocusLost(evt);
            }
        });
        lastname2_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastname2_fieldKeyTyped(evt);
            }
        });

        gender_combobox.setBackground(new java.awt.Color(255, 255, 255));
        gender_combobox.setEditable(true);
        gender_combobox.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        gender_combobox.setForeground(new java.awt.Color(153, 153, 153));
        gender_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Género", "Masculino", "Femenino" }));
        gender_combobox.setBorder(null);
        gender_combobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gender_combobox.setEnabled(false);

        age_field.setEditable(false);
        age_field.setBackground(new java.awt.Color(255, 255, 255));
        age_field.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        age_field.setForeground(new java.awt.Color(153, 153, 153));
        age_field.setText("Edad");
        age_field.setBorder(null);
        age_field.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        age_field.setMargin(new java.awt.Insets(2, 15, 2, 15));
        age_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                age_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                age_fieldFocusLost(evt);
            }
        });

        birthday_field.setEditable(false);
        birthday_field.setBackground(new java.awt.Color(255, 255, 255));
        birthday_field.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        birthday_field.setForeground(new java.awt.Color(153, 153, 153));
        birthday_field.setText("Fecha de nacimiento");
        birthday_field.setBorder(null);
        birthday_field.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        birthday_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                birthday_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                birthday_fieldFocusLost(evt);
            }
        });

        grade_field.setEditable(false);
        grade_field.setBackground(new java.awt.Color(255, 255, 255));
        grade_field.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        grade_field.setForeground(new java.awt.Color(153, 153, 153));
        grade_field.setText("Grado");
        grade_field.setBorder(null);
        grade_field.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        grade_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                grade_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                grade_fieldFocusLost(evt);
            }
        });

        group_field.setEditable(false);
        group_field.setBackground(new java.awt.Color(255, 255, 255));
        group_field.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        group_field.setForeground(new java.awt.Color(153, 153, 153));
        group_field.setText("Grupo");
        group_field.setBorder(null);
        group_field.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        group_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                group_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                group_fieldFocusLost(evt);
            }
        });

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Datos del tutor");

        tutor_name.setBackground(new java.awt.Color(255, 255, 255));
        tutor_name.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tutor_name.setForeground(new java.awt.Color(153, 153, 153));
        tutor_name.setText("Nombre(s)");
        tutor_name.setBorder(null);
        tutor_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tutor_name.setNextFocusableComponent(tutor_lastname1);
        tutor_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tutor_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tutor_nameFocusLost(evt);
            }
        });
        tutor_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tutor_nameKeyTyped(evt);
            }
        });

        tutor_lastname1.setBackground(new java.awt.Color(255, 255, 255));
        tutor_lastname1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tutor_lastname1.setForeground(new java.awt.Color(153, 153, 153));
        tutor_lastname1.setText("Apellido paterno");
        tutor_lastname1.setBorder(null);
        tutor_lastname1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tutor_lastname1.setNextFocusableComponent(tutor_lastname2);
        tutor_lastname1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tutor_lastname1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tutor_lastname1FocusLost(evt);
            }
        });
        tutor_lastname1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tutor_lastname1KeyTyped(evt);
            }
        });

        tutor_lastname2.setBackground(new java.awt.Color(255, 255, 255));
        tutor_lastname2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tutor_lastname2.setForeground(new java.awt.Color(153, 153, 153));
        tutor_lastname2.setText("Apellido materno");
        tutor_lastname2.setBorder(null);
        tutor_lastname2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tutor_lastname2.setNextFocusableComponent(email_field);
        tutor_lastname2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tutor_lastname2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tutor_lastname2FocusLost(evt);
            }
        });
        tutor_lastname2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tutor_lastname2KeyTyped(evt);
            }
        });

        email_field.setBackground(new java.awt.Color(255, 255, 255));
        email_field.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        email_field.setForeground(new java.awt.Color(153, 153, 153));
        email_field.setText("Correo electrónico");
        email_field.setBorder(null);
        email_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        email_field.setNextFocusableComponent(labelEnter);
        email_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_fieldFocusLost(evt);
            }
        });

        bottom_panel.setBackground(utils.UtilsUI.castIntToColor("6594FF")
        );

        backToHome.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        backToHome.setForeground(new java.awt.Color(255, 255, 255));
        backToHome.setText("Volver al inicio");
        backToHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backToHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bottom_panelLayout = new javax.swing.GroupLayout(bottom_panel);
        bottom_panel.setLayout(bottom_panelLayout);
        bottom_panelLayout.setHorizontalGroup(
            bottom_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottom_panelLayout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(backToHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottom_panelLayout.setVerticalGroup(
            bottom_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottom_panelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(backToHome)
                .addGap(18, 18, 18))
        );

        buttonEnter.setBackground(utils.UtilsUI.castIntToColor("6594FF"));
        buttonEnter.setForeground(new java.awt.Color(255, 255, 255));
        buttonEnter.setLayout(new java.awt.CardLayout());

        labelEnter.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        labelEnter.setForeground(new java.awt.Color(255, 255, 255));
        labelEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEnter.setText("GUARDAR");
        labelEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelEnterMouseClicked(evt);
            }
        });
        buttonEnter.add(labelEnter, "card2");

        curp_field.setBackground(new java.awt.Color(255, 255, 255));
        curp_field.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        curp_field.setForeground(new java.awt.Color(153, 153, 153));
        curp_field.setText("CURP");
        curp_field.setBorder(null);
        curp_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        curp_field.setNextFocusableComponent(tutor_name);
        curp_field.setPreferredSize(new java.awt.Dimension(94, 15));
        curp_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                curp_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                curp_fieldFocusLost(evt);
            }
        });
        curp_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                curp_fieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gender_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator4)
                                    .addComponent(age_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                            .addComponent(lastname2_field)
                            .addComponent(lastname1_field)
                            .addComponent(name_field)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(birthday_field)
                            .addComponent(jSeparator6)
                            .addComponent(curp_field, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator15))
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tutor_lastname1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tutor_lastname2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, main_panelLayout.createSequentialGroup()
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(tutor_name, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator14))
                        .addGap(30, 30, 30))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(grade_field)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(group_field)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(218, 218, 218)
                        .addComponent(buttonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(bottom_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(tutor_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tutor_lastname1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tutor_lastname2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastname1_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastname2_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(curp_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gender_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthday_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addComponent(grade_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addComponent(group_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottom_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(main_panel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToHomeMouseClicked
        HomeView hv = new HomeView();
        this.dispose();
        hv.setVisible(true);
    }//GEN-LAST:event_backToHomeMouseClicked

    private void email_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_fieldFocusLost
        if (email_field.getText().isBlank()) {
            email_field.setText("Correo electrónico");
        }
    }//GEN-LAST:event_email_fieldFocusLost

    private void email_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_fieldFocusGained
        if (email_field.getText().equalsIgnoreCase("Correo electrónico")) {
            email_field.setText("");
        }
    }//GEN-LAST:event_email_fieldFocusGained

    private void tutor_lastname2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tutor_lastname2FocusLost
        if (tutor_lastname2.getText().isBlank()) {
            tutor_lastname2.setText("Apellido materno");
        }
    }//GEN-LAST:event_tutor_lastname2FocusLost

    private void tutor_lastname2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tutor_lastname2FocusGained
        if (tutor_lastname2.getText().equalsIgnoreCase("Apellido materno")) {
            tutor_lastname2.setText("");
        }
    }//GEN-LAST:event_tutor_lastname2FocusGained

    private void tutor_lastname1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tutor_lastname1FocusLost
        if (tutor_lastname1.getText().isBlank()) {
            tutor_lastname1.setText("Apellido paterno");
        }
    }//GEN-LAST:event_tutor_lastname1FocusLost

    private void tutor_lastname1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tutor_lastname1FocusGained
        if (tutor_lastname1.getText().equalsIgnoreCase("Apellido paterno")) {
            tutor_lastname1.setText("");
        }
    }//GEN-LAST:event_tutor_lastname1FocusGained

    private void tutor_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tutor_nameFocusLost
        if (tutor_name.getText().isBlank()) {
            tutor_name.setText("Nombre(s)");
        }
    }//GEN-LAST:event_tutor_nameFocusLost

    private void tutor_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tutor_nameFocusGained
        if (tutor_name.getText().equalsIgnoreCase("Nombre(s)")) {
            tutor_name.setText("");
        }
    }//GEN-LAST:event_tutor_nameFocusGained

    private void group_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_group_fieldFocusLost
        if (group_field.getText().isBlank()) {
            group_field.setText("Grupo");
        }
    }//GEN-LAST:event_group_fieldFocusLost

    private void group_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_group_fieldFocusGained
        if (group_field.getText().equalsIgnoreCase("Grupo")) {
            group_field.setText("");
        }
    }//GEN-LAST:event_group_fieldFocusGained

    private void grade_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_grade_fieldFocusLost
        if (grade_field.getText().isBlank()) {
            grade_field.setText("Grado");
        }
    }//GEN-LAST:event_grade_fieldFocusLost

    private void grade_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_grade_fieldFocusGained
        if (grade_field.getText().equalsIgnoreCase("Grado")) {
            grade_field.setText("");
        }
    }//GEN-LAST:event_grade_fieldFocusGained

    private void birthday_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birthday_fieldFocusLost
        if (birthday_field.getText().isBlank()) {
            birthday_field.setText("Fecha de nacimiento");
        }
    }//GEN-LAST:event_birthday_fieldFocusLost

    private void birthday_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birthday_fieldFocusGained
        if (birthday_field.getText().equalsIgnoreCase("Fecha de nacimiento")) {
            birthday_field.setText("");
        }
    }//GEN-LAST:event_birthday_fieldFocusGained

    private void age_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_age_fieldFocusLost
        if (age_field.getText().isBlank()) {
            age_field.setText("Edad");
        }
    }//GEN-LAST:event_age_fieldFocusLost

    private void age_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_age_fieldFocusGained
        if (age_field.getText().equalsIgnoreCase("Edad")) {
            age_field.setText("");
        }
    }//GEN-LAST:event_age_fieldFocusGained

    private void lastname2_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastname2_fieldFocusLost
        if (lastname2_field.getText().isBlank()) {
            lastname2_field.setText("Apellido materno");
        }
    }//GEN-LAST:event_lastname2_fieldFocusLost

    private void lastname2_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastname2_fieldFocusGained
        if (lastname2_field.getText().equalsIgnoreCase("Apellido materno")) {
            lastname2_field.setText("");
        }
    }//GEN-LAST:event_lastname2_fieldFocusGained

    private void lastname1_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastname1_fieldFocusLost
        if (lastname1_field.getText().isBlank()) {
            lastname1_field.setText("Apellido paterno");
        }
    }//GEN-LAST:event_lastname1_fieldFocusLost

    private void lastname1_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastname1_fieldFocusGained
        if (lastname1_field.getText().equalsIgnoreCase("Apellido paterno")) {
            lastname1_field.setText("");
        }
    }//GEN-LAST:event_lastname1_fieldFocusGained

    private void name_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_fieldFocusLost
        if (name_field.getText().isBlank()) {
            name_field.setText("Nombre(s)");
        }
    }//GEN-LAST:event_name_fieldFocusLost

    private void name_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_fieldFocusGained
        if (name_field.getText().equalsIgnoreCase("Nombre(s)")) {
            name_field.setText("");
        }
    }//GEN-LAST:event_name_fieldFocusGained

    private void curp_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_curp_fieldFocusLost
        if (curp_field.getText().isBlank() || curp_field.getText().length() < 18) {
            curp_field.setText("CURP");
            JOptionPane.showMessageDialog(null, "CURP no válida");
        } else if (!curp_field.getText().equals("CURP")) {
            fillDisabledFields();
        }
    }//GEN-LAST:event_curp_fieldFocusLost

    private void curp_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_curp_fieldFocusGained
        if (curp_field.getText().equalsIgnoreCase("CURP")) {
            curp_field.setText("");
        }
    }//GEN-LAST:event_curp_fieldFocusGained

    private void name_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_fieldKeyTyped
        boolean isTrue = UtilsPatterns.validateOnlyCharacters(name_field);
        if (!isTrue)
            evt.consume();
    }//GEN-LAST:event_name_fieldKeyTyped

    private void curp_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_curp_fieldKeyTyped
        // Valida que la cantidad de caracteres no sea mayor a 18
        if (curp_field.getText().length() >= 18)
            evt.consume();
    }//GEN-LAST:event_curp_fieldKeyTyped

    private void lastname1_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastname1_fieldKeyTyped
        boolean isTrue = UtilsPatterns.validateOnlyCharacters(lastname1_field);
        if (!isTrue)
            evt.consume();
    }//GEN-LAST:event_lastname1_fieldKeyTyped

    private void lastname2_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastname2_fieldKeyTyped
        boolean isTrue = UtilsPatterns.validateOnlyCharacters(lastname2_field);
        if (!isTrue)
            evt.consume();
    }//GEN-LAST:event_lastname2_fieldKeyTyped

    private void tutor_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tutor_nameKeyTyped
        boolean isTrue = UtilsPatterns.validateOnlyCharacters(name_field);
        if (!isTrue)
            evt.consume();
    }//GEN-LAST:event_tutor_nameKeyTyped

    private void tutor_lastname1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tutor_lastname1KeyTyped
        boolean isTrue = UtilsPatterns.validateOnlyCharacters(name_field);
        if (!isTrue)
            evt.consume();
    }//GEN-LAST:event_tutor_lastname1KeyTyped

    private void tutor_lastname2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tutor_lastname2KeyTyped
        boolean isTrue = UtilsPatterns.validateOnlyCharacters(name_field);
        if (!isTrue)
            evt.consume();
    }//GEN-LAST:event_tutor_lastname2KeyTyped

    private void labelEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEnterMouseClicked
        try {
            if (fillDisabledFields() && validateNamesWithCurp(curp) && validateTutorData()) {
                createNewStudent();
            } else {
                JOptionPane.showMessageDialog(null, "Error, revise lo siguiente:"
                        + "\n 1. Los datos del alumno no coinciden con la CURP"
                        + "\n 2. Existe algún campo vacío");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error, revisa los campos solicitados "
                    + "\n Si el problema persiste, contacta a soporte técnico");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_labelEnterMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InscripcionAlumnosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscripcionAlumnosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscripcionAlumnosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscripcionAlumnosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new InscripcionAlumnosView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age_field;
    private javax.swing.JLabel backToHome;
    private javax.swing.JTextField birthday_field;
    private javax.swing.JPanel bottom_panel;
    private javax.swing.JPanel buttonEnter;
    private javax.swing.JTextField curp_field;
    private javax.swing.JTextField email_field;
    private javax.swing.JComboBox<String> gender_combobox;
    private javax.swing.JTextField grade_field;
    private javax.swing.JTextField group_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelEnter;
    private javax.swing.JTextField lastname1_field;
    private javax.swing.JTextField lastname2_field;
    private javax.swing.JPanel main_panel;
    private javax.swing.JTextField name_field;
    private javax.swing.JTextField tutor_lastname1;
    private javax.swing.JTextField tutor_lastname2;
    private javax.swing.JTextField tutor_name;
    // End of variables declaration//GEN-END:variables

    /**
     * Llena los campos: género, edad, fecha de nacimiento, grado y grupo
     * Devuelve true si estan todos correctamente llenados
     */
    private boolean fillDisabledFields() {
        curp = curp_field.getText();
        boolean areFilled = false;
        age = (int) studentService.getAgeAndBirthday(curp).get(Common.GET_AGE);
        try {
            if (age < 3 || age > 5) {
                JOptionPane.showMessageDialog(null, "La edad no aplica para el registro");
            } else {
                age_field.setText("Edad:" + age + " años");
                fillGradeField();
                // charAt(7) obtiene la posicion donde se encuentra el grupo
                fillGroupField(grade_field.getText().charAt(7));
                fillBirthDayField(curp);
                selectGenderInCombobox(curp);
                areFilled = true;
            }
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
        }
        return areFilled;
    }

    /**
     * ********OPERACIONES CON LA CURP**********
     */
//  Muestra el grado donde sera inscrito el alumno en funcion a la edad
    private boolean fillGradeField() {
        char grade = studentService.setGrade(age);
        boolean isCorrect = false;
        if (grade != '0') {
            grade_field.setText("Grado: " + grade);
            isCorrect = true;
        }
        return isCorrect;
    }

//  Muestra el grupo en el que se inscribira el alumno
    private boolean fillGroupField(char grade) {
        char group = studentService.setGroup(grade);
        boolean groupAvailable = false;
        if (group == '0') {
            group_field.setText("No aplica");
        } else {
            group_field.setText("Grupo: " + group);
            groupAvailable = true;
        }
        return groupAvailable;
    }

//  Calcula y muestra la fecha de nacimiento
    private boolean fillBirthDayField(String curp) {
        LocalDate dateOfBirth = (LocalDate) studentService.getAgeAndBirthday(curp).get(Common.GET_BIRTHDATE);
        birthday_field.setText(String.valueOf(UtilsDate.getFormatedDate(false, dateOfBirth)));
        return true;
    }

//  Selecciona el genero del combobox
    private boolean selectGenderInCombobox(String curp) {
        char genderChar = studentService.getGenderByCurp(curp);
        if (genderChar == 'H') {
            gender_combobox.setSelectedIndex(1);
        } else if (genderChar == 'M') {
            gender_combobox.setSelectedIndex(2);
        }
        return true;
    }

    /*Valida que las iniciales del nombre y apellidos coincidan con los puestos 
    en la CURP*/
    private boolean validateNamesWithCurp(String curp) {
        //Variables obtained by substrings of 'curp' text value
        String curpLstName1 = curp.substring(0, 1);
        char curpLstName2 = curp.charAt(2);
        char curpName = curp.charAt(3);
        //Variables obtained from "Student's info"
        String lstName1 = lastname1_field.getText().substring(0, 1);
        char lstName2 = lastname2_field.getText().charAt(0);
        char name = name_field.getText().charAt(0);
        return (curpLstName1.equals(lstName1) && curpLstName2 == lstName2 && curpName == name);

    }

    private boolean validateTutorData() {
        return ((!tutor_name.getText().contains("Nombre(s)") || !tutor_name.getText().trim().isBlank())
                && (!tutor_lastname1.getText().contains("Apellido paterno") || !tutor_lastname1.getText().trim().isBlank())
                && (!tutor_lastname2.getText().contains("Apellido materno") || !tutor_lastname2.getText().trim().isBlank())
                && (!email_field.getText().contains("Correo electrónico") || !email_field.getText().trim().isBlank()));
    }

    private boolean createNewStudent() {
        // Crea un objeto de 'Tutor' y lo asocia con el registro del alumno
        Student student = new Student();
        Classroom classroom = new Classroom();
        LocalDate dateWithPlusYears, dateWithoutPlusingYears;
        char grade = grade_field.getText().charAt(7);
        char group = group_field.getText().charAt(7);
        String classroomName = grade + "-" + group;
        int age = age_field.getText().charAt(5);
        int id_tutor = (int) createTutorAndMatchToStudent().get(1);
        int id_course = studentService.setCourse(grade);
        if (id_course == 0) {
            System.out.println("Error al cargar las materias");
            return false;
        }
        classroom.setName(classroomName);
        student.setName(name_field.getText());
        student.setF_lastname(lastname1_field.getText());
        student.setS_lastname(lastname2_field.getText());
        student.setCurp(curp);
        //Obtiene la primer letra del género del estudiante
        student.setGender(gender_combobox.getSelectedItem().toString().charAt(0));
        student.setAge((char) age);
        dateWithoutPlusingYears = (LocalDate) studentService.getAgeAndBirthday(curp).get(Common.GET_BIRTHDATE);
        dateWithPlusYears = dateWithoutPlusingYears.plusYears(2000);
        student.setBirthday(dateWithPlusYears);
        student.setGrade(grade);
        student.setGroup(group);
        student.setIdTutor(id_tutor);
        student.setId_classroom(classroomService.getClassroomIdByName(classroomName));
        student.setIdCourse(id_course);
        return studentService.newStudent(student);
    }

    /**
     * @return index 0 para obtener si la operacion es true o false index 1 para
     * obtener el objeto del tutor
     */
    private List<Object> createTutorAndMatchToStudent() {
        List<Object> returnValues = new ArrayList();
        Tutor tutor = new Tutor();
        tutor.setName(tutor_name.getText());
        tutor.setF_lastname(tutor_lastname1.getText());
        tutor.setS_lastname(tutor_lastname2.getText());
        tutor.setEmail(email_field.getText());
        returnValues.add(tutorService.createTutor(tutor));
        returnValues.add(tutorService.getLastTutorAdded());
        return returnValues;
    }
}
