/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.ComidaData;
import Modelo.Comida;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Comidas extends javax.swing.JInternalFrame {

    private ComidaData comidaData;

    private DefaultTableModel modelo;
    private List<Comida> listaComida;
    private Comida comidaSelec;

    public Comidas() {
        initComponents();

        comidaData = new ComidaData();
        listaComida = comidaData.obtenerComida();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableComida = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDetalle = new javax.swing.JTextArea();
        jBCargar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jRBCargarComida = new javax.swing.JRadioButton();
        jRBActualizaComida = new javax.swing.JRadioButton();
        jRBBorrarComida = new javax.swing.JRadioButton();
        jRBBuscNombre = new javax.swing.JRadioButton();
        jRBBuscActivas = new javax.swing.JRadioButton();
        jRBBuscId = new javax.swing.JRadioButton();
        jTFId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFCalorias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFEstado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jMenu4.setText("jMenu4");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        jLabel1.setText("Comidas");

        jTableComida.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableComidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableComida);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/comida.png"))); // NOI18N

        jLabel3.setText("Nombre :");

        jTFNombre.setEnabled(false);
        jTFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombreKeyTyped(evt);
            }
        });

        jLabel4.setText("Detalle");

        jTextAreaDetalle.setColumns(20);
        jTextAreaDetalle.setRows(5);
        jTextAreaDetalle.setEnabled(false);
        jScrollPane2.setViewportView(jTextAreaDetalle);

        jBCargar.setText("Cargar");
        jBCargar.setEnabled(false);
        jBCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.setEnabled(false);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBActualizar.setText("Actualizar");
        jBActualizar.setEnabled(false);
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.setEnabled(false);
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jRBCargarComida.setText("Cargar Comida Nueva");
        jRBCargarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBCargarComidaActionPerformed(evt);
            }
        });

        jRBActualizaComida.setText("Actualizar Comida");
        jRBActualizaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBActualizaComidaActionPerformed(evt);
            }
        });

        jRBBorrarComida.setText("Borrar Comida");
        jRBBorrarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBBorrarComidaActionPerformed(evt);
            }
        });

        jRBBuscNombre.setText("Buscar Comida por Nombre");
        jRBBuscNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBBuscNombreActionPerformed(evt);
            }
        });

        jRBBuscActivas.setText("Buscar Comidas Activas");
        jRBBuscActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBBuscActivasActionPerformed(evt);
            }
        });

        jRBBuscId.setText("Buscar Comida por ID");
        jRBBuscId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBBuscIdActionPerformed(evt);
            }
        });

        jTFId.setEnabled(false);
        jTFId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFIdKeyTyped(evt);
            }
        });

        jLabel5.setText("Calorias :");

        jTFCalorias.setEnabled(false);
        jTFCalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCaloriasKeyTyped(evt);
            }
        });

        jLabel6.setText("Estado:");

        jLabel7.setText("Id:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBCargarComida)
                            .addComponent(jRBActualizaComida)
                            .addComponent(jRBBorrarComida))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jTFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(35, 35, 35)
                                        .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRBBuscNombre)
                                            .addComponent(jRBBuscActivas))
                                        .addGap(50, 50, 50))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBBuscar)
                                        .addGap(85, 85, 85))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jRBBuscId))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jBCargar)
                        .addGap(99, 99, 99)
                        .addComponent(jBEliminar)
                        .addGap(69, 69, 69)
                        .addComponent(jBActualizar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jRBCargarComida)
                        .addGap(18, 18, 18)
                        .addComponent(jRBActualizaComida)
                        .addGap(18, 18, 18)
                        .addComponent(jRBBorrarComida)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRBBuscNombre)
                                    .addComponent(jLabel5)
                                    .addComponent(jTFCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRBBuscActivas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRBBuscId)
                                        .addGap(47, 47, 47)
                                        .addComponent(jBBuscar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(jTFEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(63, 63, 63)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCargar)
                    .addComponent(jBEliminar)
                    .addComponent(jBActualizar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

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

    private void jRBCargarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBCargarComidaActionPerformed

        cargarComidas();
        jTFCalorias.setEnabled(true);
        jTFId.setText("");
        jTFId.setEnabled(false);
        jTFNombre.setEnabled(true);
        jTextAreaDetalle.setEnabled(true);
        jRBActualizaComida.setSelected(false);
        jRBBorrarComida.setSelected(false);
        jRBBuscNombre.setSelected(false);
        jRBBuscActivas.setSelected(false);
        jRBBuscId.setSelected(false);

        jBCargar.setEnabled(true);
        jBEliminar.setEnabled(false);
        jBActualizar.setEnabled(false);
        jBBuscar.setEnabled(false);


    }//GEN-LAST:event_jRBCargarComidaActionPerformed

    private void jRBActualizaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBActualizaComidaActionPerformed

        borrarFilasTabla();
        cargarComidas();

        jTFCalorias.setEnabled(true);
        //jTFCalorias.setText("");
        jTFId.setText("");
        jTFId.setEnabled(false);
        //jTFNombre.setText("");
        jTextAreaDetalle.setText("");
        jTFNombre.setEnabled(true);
        jTextAreaDetalle.setEnabled(true);
        jRBCargarComida.setSelected(false);
        jRBBorrarComida.setSelected(false);
        jRBBuscNombre.setSelected(false);
        jRBBuscActivas.setSelected(false);
        jRBBuscId.setSelected(false);

        jBCargar.setEnabled(false);
        jBEliminar.setEnabled(false);
        jBActualizar.setEnabled(true);
        jBBuscar.setEnabled(false);

    }//GEN-LAST:event_jRBActualizaComidaActionPerformed

    private void jRBBorrarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBBorrarComidaActionPerformed
        borrarFilasTabla();
        cargarComidas();
        jTFCalorias.setEnabled(false);
        jTFCalorias.setText("");
        jTFId.setText("");
        jTFId.setEnabled(false);
        jTFNombre.setText("");
        jTextAreaDetalle.setText("");
        jTFNombre.setEnabled(false);
        jTextAreaDetalle.setEnabled(false);
        jRBCargarComida.setSelected(false);
        jRBActualizaComida.setSelected(false);
        jRBBuscNombre.setSelected(false);
        jRBBuscActivas.setSelected(false);
        jRBBuscId.setSelected(false);

        jBCargar.setEnabled(false);
        jBEliminar.setEnabled(true);
        jBActualizar.setEnabled(false);
        jBBuscar.setEnabled(false);

    }//GEN-LAST:event_jRBBorrarComidaActionPerformed

    private void jRBBuscNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBBuscNombreActionPerformed
        borrarFilasTabla();
        jTFCalorias.setEnabled(false);
        jTFCalorias.setText("");
        jTFId.setText("");
        jTFId.setEnabled(false);
        jTFNombre.setText("");
        jTextAreaDetalle.setText("");
        jTFNombre.setEnabled(true);
        jTextAreaDetalle.setEnabled(false);
        jRBCargarComida.setSelected(false);
        jRBActualizaComida.setSelected(false);
        jRBBorrarComida.setSelected(false);
        jRBBuscActivas.setSelected(false);
        jRBBuscId.setSelected(false);

        jBCargar.setEnabled(false);
        jBEliminar.setEnabled(false);
        jBActualizar.setEnabled(false);
        jBBuscar.setEnabled(true);

    }//GEN-LAST:event_jRBBuscNombreActionPerformed

    private void jRBBuscActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBBuscActivasActionPerformed
        borrarFilasTabla();
        jTFCalorias.setEnabled(false);
        jTFCalorias.setText("");
        jTFId.setText("");
        jTFId.setEnabled(false);
        jTFNombre.setText("");
        jTextAreaDetalle.setText("");
        jTFNombre.setEnabled(false);
        jTextAreaDetalle.setEnabled(false);
        jRBCargarComida.setSelected(false);
        jRBActualizaComida.setSelected(false);
        jRBBorrarComida.setSelected(false);
        jRBBuscNombre.setSelected(false);
        jRBBuscId.setSelected(false);

        jBCargar.setEnabled(false);
        jBEliminar.setEnabled(false);
        jBActualizar.setEnabled(false);
        jBBuscar.setEnabled(true);


    }//GEN-LAST:event_jRBBuscActivasActionPerformed

    private void jRBBuscIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBBuscIdActionPerformed
        borrarFilasTabla();
        jTFCalorias.setEnabled(false);
        jTFCalorias.setText("");
        jTFNombre.setText("");
        jTextAreaDetalle.setText("");
        jTFNombre.setEnabled(false);
        jTextAreaDetalle.setEnabled(false);
        jTFId.setText("");
        jTFId.setEnabled(true);
        jRBCargarComida.setSelected(false);
        jRBActualizaComida.setSelected(false);
        jRBBorrarComida.setSelected(false);
        jRBBuscNombre.setSelected(false);
        jRBBuscActivas.setSelected(false);

        jBCargar.setEnabled(false);
        jBEliminar.setEnabled(false);
        jBActualizar.setEnabled(false);
        jBBuscar.setEnabled(true);


    }//GEN-LAST:event_jRBBuscIdActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        if (jRBBuscActivas.isSelected()) {
            cargarComidas();
        }
        if (jRBBuscNombre.isSelected()) {

            cargaComidaNom(jTFNombre.getText());
        }
        if (jRBBuscId.isSelected()) {
            int busc = Integer.parseInt(jTFId.getText());
            cargaComidaId(busc);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargarActionPerformed

        Comida com = new Comida(jTFNombre.getText(), jTextAreaDetalle.getText(), Integer.parseInt(jTFCalorias.getText()), true);

        comidaData.guardarComida(com);


    }//GEN-LAST:event_jBCargarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed

        int idcomida = Integer.parseInt(jTFId.getText());
        String nombre = jTFNombre.getText();
        String detalle = jTextAreaDetalle.getText();
        int calorias = Integer.parseInt(jTFCalorias.getText());
        boolean estado = true; // no se como tomar el estado boolean

        comidaSelec.setIdComida(idcomida);
        comidaSelec.setNombre(nombre);
        comidaSelec.setDetalle(detalle);
        comidaSelec.setCalorias(calorias);
        comidaSelec.setEstado(estado);

        comidaData.actualizaComida(comidaSelec);
        comidaSelec = null;
        cargarComidas();


    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jTableComidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableComidaMouseClicked
        // Click con el raton
        if (jRBActualizaComida.isSelected() || jRBBorrarComida.isSelected()) {

            int selec = jTableComida.getSelectedRow();
            if (selec != -1) {
                int idcomida = (Integer) jTableComida.getValueAt(selec, 0);
                String nombre = (String) jTableComida.getValueAt(selec, 1);
                String detalle = (String) jTableComida.getValueAt(selec, 2);
                int calorias = (Integer) jTableComida.getValueAt(selec, 3);
                boolean estado = (boolean) jTableComida.getValueAt(selec, 4);

                jTFId.setText(idcomida + "");
                jTFNombre.setText(nombre);
                jTextAreaDetalle.setText(detalle);
                jTFCalorias.setText(calorias + "");
                jTFEstado.setText(estado + "");

                comidaSelec = new Comida();
                comidaSelec.setIdComida(idcomida);
                comidaSelec.setNombre(nombre);
                comidaSelec.setDetalle(detalle);
                comidaSelec.setCalorias(calorias);
                comidaSelec.setEstado(estado);

            }

        }

    }//GEN-LAST:event_jTableComidaMouseClicked

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:

        int idcomida = Integer.parseInt(jTFId.getText());
        String nombre = jTFNombre.getText();
        String detalle = jTextAreaDetalle.getText();
        int calorias = Integer.parseInt(jTFCalorias.getText());
        boolean estado = true; // no se como tomar el estado boolean



        comidaData.borrarComida(idcomida);
        comidaSelec = null;
        cargarComidas();


    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTFCaloriasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCaloriasKeyTyped
      char c=evt.getKeyChar();
      
        if (c<'0' || c>'9') evt.consume();
            
        
        
        
    }//GEN-LAST:event_jTFCaloriasKeyTyped

    private void jTFIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIdKeyTyped
       
        char c=evt.getKeyChar();
      
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTFIdKeyTyped

    private void jTFNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreKeyTyped
       char c=evt.getKeyChar();
      
        if ((c<'a' || c>'z')&&(c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_jTFNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCargar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButton jRBActualizaComida;
    private javax.swing.JRadioButton jRBBorrarComida;
    private javax.swing.JRadioButton jRBBuscActivas;
    private javax.swing.JRadioButton jRBBuscId;
    private javax.swing.JRadioButton jRBBuscNombre;
    private javax.swing.JRadioButton jRBCargarComida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFCalorias;
    private javax.swing.JTextField jTFEstado;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTable jTableComida;
    private javax.swing.JTextArea jTextAreaDetalle;
    // End of variables declaration//GEN-END:variables

    private void cargarComidas() {
        borrarFilasTabla();

        ArrayList<Comida> lista = (ArrayList) comidaData.obtenerComida();
        for (Comida com : lista) {
            modelo.addRow(new Object[]{com.getIdComida(), com.getNombre(), com.getDetalle(), com.getCalorias(), com.isEstado()});
// no me trae el nombre de la comida

        }
    }

    private void cargaComidaId(int nu) {
        borrarFilasTabla();
        ArrayList<Comida> lista = (ArrayList) comidaData.obtenerComidaPorId(nu);
        for (Comida com : lista) {
            modelo.addRow(new Object[]{com.getIdComida(), com.getNombre(), com.getDetalle(), com.getCalorias(), com.isEstado()});

        }
    }

    private void cargaComidaNom(String bus) {
        borrarFilasTabla();
        ArrayList<Comida> lista = (ArrayList) comidaData.buscaComida(bus);
        for (Comida com : lista) {
            modelo.addRow(new Object[]{com.getIdComida(), com.getNombre(), com.getDetalle(), com.getCalorias(), com.isEstado()});

        }
    }

    private void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }

    }

    private void armarCabeceraTabla() {
        //titulos de las columnas
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Detalle");
        columnas.add("Calorias");
        columnas.add("Estado");
//recorro el array y uso eso de titulos
        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        //se lo cargo a la tabla
        jTableComida.setModel(modelo);

    }

}
