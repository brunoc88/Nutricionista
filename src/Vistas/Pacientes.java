
package Vistas;

import Data.PacienteData;
import Modelo.Paciente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class Pacientes extends javax.swing.JInternalFrame {

    private PacienteData pacienteData;
    private DefaultTableModel modelo;
    private Paciente pacienteSelec;

    public Pacientes() {
        initComponents();
        pacienteData = new PacienteData();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        jRBCargarPaciente = new javax.swing.JRadioButton();
        jRBBuscarActivos = new javax.swing.JRadioButton();
        jRBBuscarxID = new javax.swing.JRadioButton();
        jRBBuscarxDNI = new javax.swing.JRadioButton();
        jRBBorrarPaciente = new javax.swing.JRadioButton();
        jRBActualizarPacien = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTFDNI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFomicilio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFEstado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();
        jBActualizar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBCargar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setText("Paciente");

        jTablePaciente.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePaciente);

        jRBCargarPaciente.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jRBCargarPaciente.setText("Cargar Paciente");
        jRBCargarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBCargarPacienteActionPerformed(evt);
            }
        });

        jRBBuscarActivos.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jRBBuscarActivos.setText("Buscar Paciente Activo");
        jRBBuscarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBBuscarActivosActionPerformed(evt);
            }
        });

        jRBBuscarxID.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jRBBuscarxID.setText("Buscar Paciente por Codigo");
        jRBBuscarxID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBBuscarxIDActionPerformed(evt);
            }
        });

        jRBBuscarxDNI.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jRBBuscarxDNI.setText("Buscar Paciente por DNI");
        jRBBuscarxDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBBuscarxDNIActionPerformed(evt);
            }
        });

        jRBBorrarPaciente.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jRBBorrarPaciente.setText("Borrar Paciente");
        jRBBorrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBBorrarPacienteActionPerformed(evt);
            }
        });

        jRBActualizarPacien.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jRBActualizarPacien.setText("Actualizar Paciente");
        jRBActualizarPacien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBActualizarPacienActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setText("DNI :");

        jTFDNI.setEnabled(false);
        jTFDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDNIActionPerformed(evt);
            }
        });
        jTFDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFDNIKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel3.setText("Apellido :");

        jTFApellido.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel4.setText("Nombre :");

        jTFNombre.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel5.setText("Domicilio :");

        jTFomicilio.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel6.setText("Telefono :");

        jTFTelefono.setEnabled(false);
        jTFTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefonoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel7.setText("Estado :");

        jTFEstado.setEnabled(false);
        jTFEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEstadoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel8.setText("Codigo");

        jTFID.setEnabled(false);
        jTFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIDActionPerformed(evt);
            }
        });

        jBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/actualizar.png"))); // NOI18N
        jBActualizar.setEnabled(false);
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/buscar.png"))); // NOI18N
        jBBuscar.setEnabled(false);
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/carga-en-la-nube.png"))); // NOI18N
        jBCargar.setEnabled(false);
        jBCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargarActionPerformed(evt);
            }
        });

        jBBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/eliminar.png"))); // NOI18N
        jBBorrar.setEnabled(false);
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/salida.png"))); // NOI18N
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBSalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBBorrarPaciente)
                                    .addComponent(jRBCargarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRBActualizarPacien))
                                .addGap(61, 61, 61)
                                .addComponent(jRBBuscarxDNI)
                                .addGap(40, 40, 40)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(28, 28, 28)
                                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFomicilio)
                                            .addComponent(jTFTelefono)
                                            .addComponent(jTFEstado)
                                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBBuscarActivos, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRBBuscarxID, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(64, 64, 64)
                                .addComponent(jTFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(608, 608, 608)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jBActualizar)
                        .addGap(155, 155, 155)
                        .addComponent(jBBorrar)
                        .addGap(175, 175, 175)
                        .addComponent(jBCargar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRBBuscarActivos)
                                    .addComponent(jRBCargarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBBuscarxID)
                                    .addComponent(jRBBorrarPaciente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRBActualizarPacien)
                                    .addComponent(jRBBuscarxDNI))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jTFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTFomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBActualizar)
                    .addComponent(jBBorrar)
                    .addComponent(jBCargar)
                    .addComponent(jBSalir))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBActualizarPacienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBActualizarPacienActionPerformed
        cargarTodosPacientes();
        limpiaCampos();

        jRBBorrarPaciente.setSelected(false);
        jRBCargarPaciente.setSelected(false);
        jRBBuscarActivos.setSelected(false);
        jRBBuscarxID.setSelected(false);
        jRBBuscarxDNI.setSelected(false);

        jBActualizar.setEnabled(true);
        jBBorrar.setEnabled(false);
        jBBuscar.setEnabled(false);
        jBCargar.setEnabled(false);

        jTFDNI.setEnabled(true);
        jTFDNI.requestFocus();
        jTFApellido.setEnabled(true);
        jTFNombre.setEnabled(true);
        jTFomicilio.setEnabled(true);
        jTFTelefono.setEnabled(true);
        jTFEstado.setEnabled(true);
        jTFID.setEnabled(false);
    }//GEN-LAST:event_jRBActualizarPacienActionPerformed

    private void jRBCargarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBCargarPacienteActionPerformed
        borrarFilasTabla();
        cargarPacientes();
        limpiaCampos();

        jRBBorrarPaciente.setSelected(false);
        jRBActualizarPacien.setSelected(false);
        jRBBuscarActivos.setSelected(false);
        jRBBuscarxID.setSelected(false);
        jRBBuscarxDNI.setSelected(false);

        jBActualizar.setEnabled(false);
        jBBorrar.setEnabled(false);
        jBBuscar.setEnabled(false);
        jBCargar.setEnabled(true);

        jTFDNI.setEnabled(true);
        jTFDNI.requestFocus();
        jTFApellido.setEnabled(true);
        jTFNombre.setEnabled(true);
        jTFomicilio.setEnabled(true);
        jTFTelefono.setEnabled(true);
        jTFEstado.setEnabled(false);
        jTFID.setEnabled(false);

    }//GEN-LAST:event_jRBCargarPacienteActionPerformed

    private void jRBBorrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBBorrarPacienteActionPerformed
        borrarFilasTabla();
        cargarPacientes();
        limpiaCampos();

        jRBCargarPaciente.setSelected(false);
        jRBActualizarPacien.setSelected(false);
        jRBBuscarActivos.setSelected(false);
        jRBBuscarxID.setSelected(false);
        jRBBuscarxDNI.setSelected(false);

        jBActualizar.setEnabled(false);
        jBBorrar.setEnabled(true);
        jBBuscar.setEnabled(false);
        jBCargar.setEnabled(false);

        jTFDNI.setEnabled(false);
        jTFApellido.setEnabled(false);
        jTFNombre.setEnabled(false);
        jTFomicilio.setEnabled(false);
        jTFTelefono.setEnabled(false);
        jTFEstado.setEnabled(false);
        jTFID.setEnabled(false);

    }//GEN-LAST:event_jRBBorrarPacienteActionPerformed

    private void jRBBuscarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBBuscarActivosActionPerformed
        borrarFilasTabla();
        limpiaCampos();

        jRBCargarPaciente.setSelected(false);
        jRBBorrarPaciente.setSelected(false);
        jRBActualizarPacien.setSelected(false);
        jRBBuscarxID.setSelected(false);
        jRBBuscarxDNI.setSelected(false);

        jBActualizar.setEnabled(false);
        jBBorrar.setEnabled(false);
        jBBuscar.setEnabled(true);
        jBCargar.setEnabled(false);

        jTFDNI.setEnabled(false);
        jTFApellido.setEnabled(false);
        jTFNombre.setEnabled(false);
        jTFomicilio.setEnabled(false);
        jTFTelefono.setEnabled(false);
        jTFEstado.setEnabled(false);
        jTFID.setEnabled(false);

    }//GEN-LAST:event_jRBBuscarActivosActionPerformed

    private void jRBBuscarxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBBuscarxIDActionPerformed
        borrarFilasTabla();
        limpiaCampos();

        jRBCargarPaciente.setSelected(false);
        jRBBorrarPaciente.setSelected(false);
        jRBActualizarPacien.setSelected(false);
        jRBBuscarActivos.setSelected(false);
        jRBBuscarxDNI.setSelected(false);

        jBActualizar.setEnabled(false);
        jBBorrar.setEnabled(false);
        jBBuscar.setEnabled(true);
        jBCargar.setEnabled(false);

        jTFDNI.setEnabled(false);
        jTFApellido.setEnabled(false);
        jTFNombre.setEnabled(false);
        jTFomicilio.setEnabled(false);
        jTFTelefono.setEnabled(false);
        jTFEstado.setEnabled(false);
        jTFID.setEnabled(true);
        jTFID.requestFocus();
        
    }//GEN-LAST:event_jRBBuscarxIDActionPerformed

    private void jRBBuscarxDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBBuscarxDNIActionPerformed
        borrarFilasTabla();
        limpiaCampos();

        jRBCargarPaciente.setSelected(false);
        jRBBorrarPaciente.setSelected(false);
        jRBActualizarPacien.setSelected(false);
        jRBBuscarActivos.setSelected(false);
        jRBBuscarxID.setSelected(false);

        jBActualizar.setEnabled(false);
        jBBorrar.setEnabled(false);
        jBBuscar.setEnabled(true);
        jBCargar.setEnabled(false);

        jTFDNI.setEnabled(true);
        jTFDNI.requestFocus();
        jTFApellido.setEnabled(false);
        jTFNombre.setEnabled(false);
        jTFomicilio.setEnabled(false);
        jTFTelefono.setEnabled(false);
        jTFEstado.setEnabled(false);
        jTFID.setEnabled(false);
    }//GEN-LAST:event_jRBBuscarxDNIActionPerformed

    private void jBCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargarActionPerformed
        Paciente pas = new Paciente(Integer.parseInt(jTFDNI.getText()), jTFApellido.getText(), jTFNombre.getText(), jTFomicilio.getText(), Long.parseLong(jTFTelefono.getText()), true);

        pacienteData.guardarPaciente(pas);
        limpiaCampos();
        cargarPacientes();

    }//GEN-LAST:event_jBCargarActionPerformed

    private void jTablePacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacienteMouseClicked

        if (jRBBorrarPaciente.isSelected() || jRBActualizarPacien.isSelected()) {

            int selec = jTablePaciente.getSelectedRow();

            if (selec != -1) {
                int id = (Integer) jTablePaciente.getValueAt(selec, 0);
                int dni = (Integer) jTablePaciente.getValueAt(selec, 1);
                String apellido = (String) jTablePaciente.getValueAt(selec, 2);
                String nombre = (String) jTablePaciente.getValueAt(selec, 3);
                String domicilio = (String) jTablePaciente.getValueAt(selec, 4);
                Long tel = (Long) jTablePaciente.getValueAt(selec, 5);
                boolean estado = (boolean) jTablePaciente.getValueAt(selec, 6);

                jTFID.setText(id + "");
                jTFDNI.setText(dni + "");
                jTFApellido.setText(apellido);
                jTFNombre.setText(nombre);
                jTFomicilio.setText(domicilio);
                jTFTelefono.setText(tel + "");
                jTFEstado.setText(estado + "");
                

                pacienteSelec = new Paciente();
                pacienteSelec.setIdPaciente(id);
                pacienteSelec.setDni(dni);
                pacienteSelec.setApellido(apellido);
                pacienteSelec.setNombre(nombre);
                pacienteSelec.setDomicilio(domicilio);
                pacienteSelec.setTelefono(tel);
                pacienteSelec.setEstado(estado);

            }

        }
    }//GEN-LAST:event_jTablePacienteMouseClicked

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed

        int id = Integer.parseInt(jTFID.getText());
        int dni = Integer.parseInt(jTFDNI.getText());
        String apellido = jTFApellido.getText();
        String nombre = jTFNombre.getText();
        String domicilio = jTFomicilio.getText();
        Long tel = Long.parseLong(jTFTelefono.getText());
        boolean estado = true;

        pacienteData.borrarPaciente(id);
        //  pacienteSelec = null;
        cargarPacientes();
        limpiaCampos();


    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        if (jRBBuscarActivos.isSelected()) {
            cargarPacientes();
        }
        if (jRBBuscarxDNI.isSelected()) {
            borrarFilasTabla();
            Paciente pac = pacienteData.obtenerPacientePorDni(Integer.parseInt(jTFDNI.getText()));
            modelo.addRow(new Object[]{pac.getIdPaciente(), pac.getDni(), pac.getApellido(), pac.getNombre(), pac.getDomicilio(), pac.getTelefono(), pac.isEstado()});

        }
        if (jRBBuscarxID.isSelected()) {
            borrarFilasTabla();
            Paciente pac = pacienteData.obtenerPacientePorId(Integer.parseInt(jTFID.getText()));
            modelo.addRow(new Object[]{pac.getIdPaciente(), pac.getDni(), pac.getApellido(), pac.getNombre(), pac.getDomicilio(), pac.getTelefono(), pac.isEstado()});

        }

    }//GEN-LAST:event_jBBuscarActionPerformed


    private void jTFDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDNIKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
    }//GEN-LAST:event_jTFDNIKeyTyped
    }
    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jTFID.getText());
        int dni = Integer.parseInt(jTFDNI.getText());
        String apellido = jTFApellido.getText();
        String nombre = jTFNombre.getText();
        String domicilio = jTFomicilio.getText();
        Long tel = Long.parseLong(jTFTelefono.getText());
        boolean estado = Boolean.parseBoolean(jTFEstado.getText());

        pacienteSelec.setIdPaciente(id);
        pacienteSelec.setDni(dni);
        pacienteSelec.setApellido(apellido);
        pacienteSelec.setNombre(nombre);
        pacienteSelec.setDomicilio(domicilio);
        pacienteSelec.setTelefono(tel);
        pacienteSelec.setEstado(estado);

        pacienteData.actualizaPaciente(pacienteSelec);
        pacienteSelec = null;
        cargarTodosPacientes();
        limpiaCampos();
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jTFTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefonoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTFEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEstadoActionPerformed

    private void jTFDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDNIActionPerformed

    private void jTFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCargar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBActualizarPacien;
    private javax.swing.JRadioButton jRBBorrarPaciente;
    private javax.swing.JRadioButton jRBBuscarActivos;
    private javax.swing.JRadioButton jRBBuscarxDNI;
    private javax.swing.JRadioButton jRBBuscarxID;
    private javax.swing.JRadioButton jRBCargarPaciente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDNI;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTextField jTFomicilio;
    private javax.swing.JTable jTablePaciente;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraTabla() {
        //titulos de las columnas
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("Codigo");
        columnas.add("DNI");
        columnas.add("Apellido");
        columnas.add("Nombre");
        columnas.add("Domicilio");
        columnas.add("Telefono");
        columnas.add("Estado");
//recorro el array y uso eso de titulos
        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        //se lo cargo a la tabla
        jTablePaciente.setModel(modelo);
    }

    private void limpiaCampos() {

        jTFDNI.setText("");
        jTFApellido.setText("");
        jTFNombre.setText("");
        jTFomicilio.setText("");
        jTFTelefono.setText("");
        jTFEstado.setText("");
        jTFID.setText("");
    }

    private void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }

    }

    private void cargarPacientes() {
        borrarFilasTabla();
        ArrayList<Paciente> lista = (ArrayList) pacienteData.obtenerPaciente();
        for (Paciente pac : lista) {
            modelo.addRow(new Object[]{pac.getIdPaciente(), pac.getDni(), pac.getApellido(), pac.getNombre(), pac.getDomicilio(), pac.getTelefono(), pac.isEstado()});

        }
    }

    private void cargarTodosPacientes() {
        borrarFilasTabla();
        ArrayList<Paciente> lista = (ArrayList) pacienteData.obtenerTodosLosPaciente();
        for (Paciente pac : lista) {
            modelo.addRow(new Object[]{pac.getIdPaciente(), pac.getDni(), pac.getApellido(), pac.getNombre(), pac.getDomicilio(), pac.getTelefono(), pac.isEstado()});

        }
    }

}
