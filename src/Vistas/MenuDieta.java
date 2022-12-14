/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.ComidaData;
import Data.DietaData;
import Data.ItemComidasData;
import Data.PacienteData;
import Modelo.Comida;
import Modelo.Dieta;
import Modelo.ItemComidas;
import Modelo.Paciente;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana luz
 */
public class MenuDieta extends javax.swing.JInternalFrame {

        private ArrayList <Paciente> listadoPaciente;
        private ArrayList <Comida> listadocomida;
        private ArrayList <Dieta> listadodieta;
        private PacienteData pasdata= new PacienteData();
        private Paciente pa = new Paciente();
        private DietaData dieda = new DietaData();
        private Dieta die = new Dieta();
        private ItemComidasData cdata= new ItemComidasData();
        private ComidaData comiData = new ComidaData();
        private Comida comida = new Comida();
        private int sumacalorias;
        int codigo=0;
        int codigoComida=0;
    
    
    
    DefaultTableModel modelo= new DefaultTableModel() ;

    
    public MenuDieta() {
        initComponents();
        armarTabla();
        
       
       listadoPaciente= pasdata.obtenerPaciente();
       for (Paciente paciente : listadoPaciente ){
           this.combopacientes.addItem(paciente);
       }
       listadocomida=comiData.obtenerComida();
        for (Comida aux  : listadocomida) {
            this.jComboComidas.addItem(aux);
            
        }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combopacientes = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        panelModificar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextinicio = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        guardarModicar = new javax.swing.JButton();
        jTextPesoBuscado = new javax.swing.JTextField();
        jTextpesoInicial = new javax.swing.JTextField();
        jTextlimiteCalorico = new javax.swing.JTextField();
        jTextfechaFinal = new javax.swing.JTextField();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        gDieta1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gComida1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jComboComidas = new javax.swing.JComboBox<>();
        jAgregarComida = new javax.swing.JButton();
        jQuitarComida = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextCalorias = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        jLabel1.setText("Paciente ");

        combopacientes.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        combopacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopacientesActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jButton1.setText("Buscar Dietas Asociadas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        panelModificar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        jLabel3.setText("Peso Buscado");

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        jLabel4.setText("Peso inicial");

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        jLabel5.setText("Limite Calórico");

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        jLabel6.setText("Fecha Inicio");

        jTextinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextinicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextinicioMouseExited(evt);
            }
        });
        jTextinicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextinicioPropertyChange(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        jLabel7.setText("Fecha fin ");

        guardarModicar.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        guardarModicar.setText("Guardar ");
        guardarModicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarModicarActionPerformed(evt);
            }
        });

        jTextPesoBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPesoBuscadoActionPerformed(evt);
            }
        });

        jTextlimiteCalorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextlimiteCaloricoActionPerformed(evt);
            }
        });

        jTextfechaFinal.setEnabled(false);

        modificar.setFont(new java.awt.Font("Segoe Script", 1, 20)); // NOI18N
        modificar.setText("Modificar Dieta ");
        modificar.setEnabled(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Segoe Script", 1, 20)); // NOI18N
        eliminar.setText("Eliminar Dieta");
        eliminar.setEnabled(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModificarLayout = new javax.swing.GroupLayout(panelModificar);
        panelModificar.setLayout(panelModificarLayout);
        panelModificarLayout.setHorizontalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarLayout.createSequentialGroup()
                        .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(panelModificarLayout.createSequentialGroup()
                                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelModificarLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelModificarLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextlimiteCalorico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelModificarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)
                        .addComponent(jTextfechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelModificarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(guardarModicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminar))))
        );
        panelModificarLayout.setVerticalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextPesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextlimiteCalorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextfechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarModicar)
                    .addComponent(modificar)
                    .addComponent(eliminar))
                .addGap(6, 6, 6))
        );

        gDieta1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        gDieta1.setModel(new javax.swing.table.DefaultTableModel(
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
        gDieta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gDieta1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(gDieta1);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setText("Listado de comidas ");

        gComida1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Calorias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(gComida1);

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        jLabel8.setText("Comidas");

        jComboComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboComidasActionPerformed(evt);
            }
        });

        jAgregarComida.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        jAgregarComida.setText("Agregar Comida");
        jAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarComidaActionPerformed(evt);
            }
        });

        jQuitarComida.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        jQuitarComida.setText("Quitar Comida");
        jQuitarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuitarComidaActionPerformed(evt);
            }
        });

        jSalir.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel9.setText("Calorias");

        jTextCalorias.setBackground(new java.awt.Color(255, 0, 51));
        jTextCalorias.setFont(new java.awt.Font("Segoe Script", 1, 20)); // NOI18N
        jTextCalorias.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextCalorias.setEnabled(false);
        jTextCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCaloriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jComboComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(310, 310, 310))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(combopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(176, 176, 176))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(286, 286, 286)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jQuitarComida, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAgregarComida, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(panelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(jComboComidas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jAgregarComida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jQuitarComida)
                        .addGap(27, 27, 27)
                        .addComponent(jSalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Pacientes bajar cantidad Kilos");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenu3.setText("Pacientes dieta en rango fecha");
        jMenu1.add(jMenu3);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Pacientes que no lograron el peso");
        jMenu1.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      cargarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combopacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopacientesActionPerformed
     
      
    }//GEN-LAST:event_combopacientesActionPerformed

    private void guardarModicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarModicarActionPerformed
    Dieta d = new Dieta();
    
    d.setPesoBuscado(Double.parseDouble(jTextPesoBuscado.getText()));
    d.setPesoInicial(Double.parseDouble(jTextpesoInicial.getText()));
    d.setLimiteCalorico(Integer.parseInt(jTextlimiteCalorico.getText()));
    d.setInicio(LocalDate.parse( new SimpleDateFormat("yyyy-MM-dd").format(jTextinicio.getDate())));
    d.setFin(d.getInicio().plusDays(7));
    jTextfechaFinal.setText(d.getInicio().plusDays(7).toString());
    d.setIdPaciente((Paciente) combopacientes.getSelectedItem());
    d.setEstado(true);
    
    dieda.GuardarDieta(d);
    cargarTabla();
   // guardarModicar.setEnabled(false);
    }//GEN-LAST:event_guardarModicarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
    Dieta d = new Dieta();
    int filaSeleccionada = gDieta1.getSelectedRow();
    d.setPesoBuscado(Double.parseDouble(jTextPesoBuscado.getText()));
    d.setPesoInicial(Double.parseDouble(jTextpesoInicial.getText()));
    d.setLimiteCalorico(Integer.parseInt(jTextlimiteCalorico.getText()));
    d.setInicio(LocalDate.parse( new SimpleDateFormat("yyyy-MM-dd").format(jTextinicio.getDate())));
    d.setFin(d.getInicio().plusDays(7));
    d.setIdPaciente((Paciente) combopacientes.getSelectedItem());
    //d.setEstado(true);
    d.setIdDieta((int) gDieta1.getValueAt(filaSeleccionada, 0));
    dieda.actualizaDieta(d);
    cargarTabla();
    modificar.setEnabled(false);
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int filaSeleccionada = gDieta1.getSelectedRow();
        dieda.eliminarDieta((int) gDieta1.getValueAt(filaSeleccionada, 0));
        cargarTabla();
        armarComida(0);
        this.jTextPesoBuscado.setText("");
        this.jTextCalorias.setText("");
        this.jTextfechaFinal.setText("");
        this.jTextpesoInicial.setText("");
        this.jTextlimiteCalorico.setText("");
      //  eliminar.setVisible(false);
    }//GEN-LAST:event_eliminarActionPerformed

    private void jTextlimiteCaloricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextlimiteCaloricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextlimiteCaloricoActionPerformed

    private void gDieta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gDieta1MouseClicked
    
    
      codigo=Integer.parseInt(String.valueOf(modelo.getValueAt(this.gDieta1.getSelectedRow(), 0)));
      armarComida(codigo);
      int filaSeleccionada = gDieta1.getSelectedRow();
      modificar.setEnabled(true);
      eliminar.setEnabled(true);
      jTextPesoBuscado.setText(String.valueOf(gDieta1.getValueAt(filaSeleccionada, 3)));
      jTextpesoInicial.setText((String.valueOf(gDieta1.getValueAt(filaSeleccionada, 4))));
      jTextlimiteCalorico.setText((String.valueOf(gDieta1.getValueAt(filaSeleccionada, 5))));
      //jTextinicio.setText(Date.parse(gDieta1.getValueAt(filaSeleccionada) ,1);
      //jTextfechaFinal.setText((String)gDieta1.getValueAt(filaSeleccionada, 2));
    
      //Insertar fecha en jcalendar
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      String fecha = String.valueOf(modelo.getValueAt(this.gDieta1.getSelectedRow(), 1));
      LocalDate inputAdDate = LocalDate.parse(fecha, formatter);
      java.util.Date f = Date.from(inputAdDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
      this.jTextinicio.setDate(f);
      
  
    }//GEN-LAST:event_gDieta1MouseClicked

    private void jTextPesoBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPesoBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPesoBuscadoActionPerformed

    private void jTextinicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextinicioMouseClicked
        
jTextfechaFinal.setText(LocalDate.parse( new SimpleDateFormat("yyyy-MM-dd").format(jTextinicio.getDate())).plusDays(7).toString());
    }//GEN-LAST:event_jTextinicioMouseClicked

    private void jTextinicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextinicioMouseExited
        // TODO add your handling code here:
        jTextfechaFinal.setText(LocalDate.parse( new SimpleDateFormat("yyyy-MM-dd").format(jTextinicio.getDate())).plusDays(7).toString());
    }//GEN-LAST:event_jTextinicioMouseExited

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarComidaActionPerformed
        // TODO add your handling code here:
        Comida c = new Comida();
        c=(Comida)jComboComidas.getSelectedItem();
        DefaultTableModel modelod = (DefaultTableModel) this.gDieta1.getModel();
        int maximo=Integer.parseInt(String.valueOf(modelod.getValueAt(this.gDieta1.getSelectedRow(), 5)));
        if(sumacalorias + c.getCalorias() <= maximo ){
            int obtenerDieta=Integer.parseInt(String.valueOf(modelod.getValueAt(this.gDieta1.getSelectedRow(), 0)));
            dieda.buscarDietaPorId(obtenerDieta);
            Dieta i = new Dieta();  
            i=dieda.buscarDietaPorId(obtenerDieta);
            cdata.GuardarComidaDieta(i, c);
            armarComida(obtenerDieta);
        }else{
            JOptionPane.showMessageDialog(this, "La comida no se puede agregar porque supera el limite calorico");
        }
        
    }//GEN-LAST:event_jAgregarComidaActionPerformed

    private void jQuitarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuitarComidaActionPerformed
        // TODO add your handling code here:
        int codigoComida=0;
        DefaultTableModel modelo = (DefaultTableModel) this.gComida1.getModel();
        codigoComida=Integer.parseInt(String.valueOf(modelo.getValueAt(this.gComida1.getSelectedRow(), 0)));
        cdata.eliminarComidaDieta(codigoComida);
        armarComida(codigo);
         
    }//GEN-LAST:event_jQuitarComidaActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalirActionPerformed

    private void jComboComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboComidasActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_jComboComidasActionPerformed

    private void jTextCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCaloriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCaloriasActionPerformed

    private void jTextinicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextinicioPropertyChange
        // TODO add your handling code here:
        //Me dice la propiedad que cambió, por ejemplo date(la fecha)
        //Para obtener la nueva fecha
        if (evt.getNewValue() instanceof Date) {
            this.jTextfechaFinal.setText(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(this.jTextinicio.getDate())).plusDays(7).toString());
        }
    }//GEN-LAST:event_jTextinicioPropertyChange

  
    
    private void armarTabla(){
       
       //titulos de las columnas
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("Id Dieta");
        columnas.add("inicio");
        columnas.add("fin");
        columnas.add("peso deseado");
        columnas.add("peso inicial");
        columnas.add("limite calorico");
        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        gDieta1.setModel(modelo);
    }    
        
    private void armarComida(int idDieta){
        ArrayList <ItemComidas> comi = new ArrayList();
        comi= comiData.obtenerComidaPorDieta(idDieta);
        String datos[]= new String[3];
        DefaultTableModel modeloc = (DefaultTableModel) this.gComida1.getModel();
         modeloc.setNumRows(0);
        sumacalorias = 0;
        for (ItemComidas aux : comi) {
            datos[0] = aux.getIdItemComidas()+ "";
            datos[1] = aux.getIdComida().getNombre();
            datos[2] = aux.getIdComida().getCalorias()+ "";
            modeloc.addRow(datos);
           
            sumacalorias = sumacalorias + aux.getIdComida().getCalorias();
        }
        this.jTextCalorias.setText(sumacalorias + "");
    }
        
    
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Paciente> combopacientes;
    private javax.swing.JButton eliminar;
    private javax.swing.JTable gComida1;
    private javax.swing.JTable gDieta1;
    private javax.swing.JButton guardarModicar;
    private javax.swing.JButton jAgregarComida;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JComboBox<Comida> jComboComidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jQuitarComida;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextCalorias;
    private javax.swing.JTextField jTextPesoBuscado;
    private javax.swing.JTextField jTextfechaFinal;
    private com.toedter.calendar.JDateChooser jTextinicio;
    private javax.swing.JTextField jTextlimiteCalorico;
    private javax.swing.JTextField jTextpesoInicial;
    private javax.swing.JButton modificar;
    private javax.swing.JPanel panelModificar;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
    modelo.setNumRows(0);
    listadodieta = dieda.obtenerDietaPorPaciente((Paciente)combopacientes.getSelectedItem());
        for (Dieta aux : listadodieta) {
            if(aux.isEstado()==true){
            modelo.addRow(new Object[]{aux.getIdDieta(), aux.getInicio(),aux.getFin(),aux.getPesoBuscado(),aux.getPesoInicial(),aux.getLimiteCalorico()});            
            }
        }
    }
}
