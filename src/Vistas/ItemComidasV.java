/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.ComidaData;
import Data.DietaData;
import Data.ItemComidasData;
import Modelo.Comida;
import Modelo.Dieta;
import Modelo.ItemComidas;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana luz
 */
public class ItemComidasV extends javax.swing.JInternalFrame {

    private DietaData die;
    private ComidaData com;
    private Dieta dieta;
    private Comida comidaSelect;
    private ItemComidas item;
    private ItemComidasData it;
    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;
    private DefaultTableModel modelo3;
    private String sum;
    private int x = 0;
    private boolean flag = false, flag2 = false , flag3 = false, flag4 = false;
    

    public ItemComidasV() {
        initComponents();
        it = new ItemComidasData();
        die = new DietaData();
        com = new ComidaData();
        modelo = new DefaultTableModel();
        modelo2 = new DefaultTableModel();
        modelo3 = new DefaultTableModel();
        armarCabecera1();
        armarCabecera2();
        armarCabecera3();
        //desactivo textfield
        jtSuma.setEnabled(false);
        jbSumar.setEnabled(false);
        jbLimpiar.setEnabled(false);
        jbBuscar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbSelectEliminar = new javax.swing.JRadioButton();
        jbBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtSuma = new javax.swing.JTextField();
        jbSelectGuardar = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbCargar = new javax.swing.JButton();
        jRBCalorias = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jbSumar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jRBOptener = new javax.swing.JRadioButton();
        jrDesactivarComida = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Item Comidas");

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbSelectEliminar.setBackground(new java.awt.Color(204, 204, 255));
        jbSelectEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbSelectEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jbSelectEliminar.setText("Eliminar comida de la dieta");
        jbSelectEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelectEliminarActionPerformed(evt);
            }
        });

        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/eliminar.png"))); // NOI18N
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total Calorias");

        jtSuma.setBackground(new java.awt.Color(255, 255, 255));

        jbSelectGuardar.setBackground(new java.awt.Color(204, 204, 255));
        jbSelectGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbSelectGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jbSelectGuardar.setText("Guardar comida en la dieta");
        jbSelectGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelectGuardarActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jbCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/carga-en-la-nube.png"))); // NOI18N
        jbCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarActionPerformed(evt);
            }
        });

        jRBCalorias.setBackground(new java.awt.Color(204, 204, 255));
        jRBCalorias.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRBCalorias.setForeground(new java.awt.Color(0, 0, 0));
        jRBCalorias.setText("Calorias totales");
        jRBCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBCaloriasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tabla Dieta");

        jbSumar.setText("Sumar");
        jbSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSumarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jRBOptener.setBackground(new java.awt.Color(204, 204, 255));
        jRBOptener.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRBOptener.setForeground(new java.awt.Color(0, 0, 0));
        jRBOptener.setText("Obtener comida por dieta");
        jRBOptener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBOptenerActionPerformed(evt);
            }
        });

        jrDesactivarComida.setBackground(new java.awt.Color(204, 204, 255));
        jrDesactivarComida.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jrDesactivarComida.setForeground(new java.awt.Color(51, 51, 51));
        jrDesactivarComida.setText("Desactivar Comida");
        jrDesactivarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDesactivarComidaActionPerformed(evt);
            }
        });

        jTable3.setBackground(new java.awt.Color(255, 255, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(305, 305, 305)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbSelectGuardar)
                                    .addComponent(jbSelectEliminar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRBCalorias)
                                            .addComponent(jrDesactivarComida)
                                            .addComponent(jRBOptener)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(232, 232, 232)
                                        .addComponent(jLabel2)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbSumar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbLimpiar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbCargar)
                                        .addGap(27, 27, 27)
                                        .addComponent(jbBorrar))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jbBuscar)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jbSelectGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSelectEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrDesactivarComida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBCalorias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRBOptener))
                            .addComponent(jbBorrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSumar)
                            .addComponent(jbLimpiar))
                        .addGap(37, 37, 37)
                        .addComponent(jbBuscar)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCargar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSelectEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectEliminarActionPerformed
        if (flag3==false) {
            llenarTabla3();
            borrarFilasTabla1();
            borrarFilasTabla2();
        }
       
        //desactivo selecciones
        jbSelectGuardar.setSelected(false);
        jrDesactivarComida.setSelected(false);
        jRBOptener.setSelected(false);
        jRBCalorias.setSelected(false);
        //desactivo botones
        jbCargar.setEnabled(false);
        jbSumar.setEnabled(false);
        jbLimpiar.setEnabled(false);
        jbBuscar.setEnabled(false);
        //activo boton
        jbBorrar.setEnabled(true);
        
        //desactivo textfield
        jtSuma.setEnabled(false);
        
    }//GEN-LAST:event_jbSelectEliminarActionPerformed

    private void jbSelectGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectGuardarActionPerformed

        //llenos las tablas y las seteo
        //hice una bandera porque se me duplicabla las tablas
        if (flag == false) {
            llenarTabla1();
            llenarTabla2();
            llenarTabla3();
        }
        
        
        
       
        //desactivo las demas opciones
        jrDesactivarComida.setSelected(false);
        jbSelectEliminar.setSelected(false);
        jRBOptener.setSelected(false);
        jRBCalorias.setSelected(false);
        
        //desactivo los botones
        jbBorrar.setEnabled(false);
        jbSumar.setEnabled(false);
        jbLimpiar.setEnabled(false);
        jbBuscar.setEnabled(false);
        //habilito solo el de cargar
        jbCargar.setEnabled(true);
       
        //desactivo textfield
        jtSuma.setEnabled(false);
        
      
        
        
    }//GEN-LAST:event_jbSelectGuardarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jbSelectGuardar.isSelected()) {
            int select = jTable1.getSelectedRow();
            if (select != -1) {
                int idDieta = (Integer) jTable1.getValueAt(select, 0);
                //int idPaciente = (Integer) jTable1.getValueAt(select, 1);
                LocalDate inicio = (LocalDate) jTable1.getValueAt(select, 2);
                LocalDate fin = (LocalDate) jTable1.getValueAt(select, 3);
                double pesoBuscado = (Double) jTable1.getValueAt(select, 4);
                int liminteCalorico = (Integer) jTable1.getValueAt(select, 5);
                double pesoInicial = (Double) jTable1.getValueAt(select, 6);
                boolean estado = (Boolean) jTable1.getValueAt(select, 7);

                dieta = new Dieta();
                dieta.setIdDieta(idDieta);
                //dieta.setIdPaciente(idPaciente);
                dieta.setInicio(inicio);
                dieta.setFin(fin);
                dieta.setPesoBuscado(pesoBuscado);
                dieta.setLimiteCalorico(liminteCalorico);
                dieta.setPesoInicial(pesoInicial);
                dieta.setEstado(estado);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        if (jbSelectGuardar.isSelected()) {
            int select = jTable2.getSelectedRow();
            if (select != 1) {
                int idcomida = (Integer) jTable2.getValueAt(select, 0);
                String nombre = (String) jTable2.getValueAt(select, 1);
                String detalle = (String) jTable2.getValueAt(select, 2);
                int calorias = (Integer) jTable2.getValueAt(select, 3);
                boolean estado = (boolean) jTable2.getValueAt(select, 4);

                comidaSelect = new Comida();
                comidaSelect.setIdComida(idcomida);
                comidaSelect.setNombre(nombre);
                comidaSelect.setDetalle(detalle);
                comidaSelect.setCalorias(calorias);
                comidaSelect.setEstado(estado);
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jbCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarActionPerformed
        int tabla1 = jTable1.getSelectedRow();
        int tabla2 = jTable2.getSelectedRow();
        if (jbSelectGuardar.isSelected()) {
            if (tabla1 != 1 && tabla2 != 1) {
                it = new ItemComidasData();
              
                it.GuardarComidaDieta(dieta, comidaSelect);
                llenarTabla3();
                borrarFilasTabla1();
                borrarFilasTabla2();
                llenarTabla1();
                llenarTabla2();
                flag = true;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error");
        }

    }//GEN-LAST:event_jbCargarActionPerformed

    private void jRBOptenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBOptenerActionPerformed
      llenarTabla1();
        llenarTabla3();
        llenarTabla2();
        //desactivo selecciones
        jbSelectGuardar.setSelected(false);
        jrDesactivarComida.setSelected(false);
        jbSelectEliminar.setSelected(false);
        jRBCalorias.setSelected(false);
        
        //desactivo los botones
        jbBorrar.setEnabled(false);
        jbSumar.setEnabled(false);
        jbLimpiar.setEnabled(false);
        jbCargar.setEnabled(false);
       
        //desactivo textfield
        jtSuma.setEnabled(false);
        
        //activo el boton de buscar
        jbBuscar.setEnabled(true);
    }//GEN-LAST:event_jRBOptenerActionPerformed

    private void jRBCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBCaloriasActionPerformed
        //desactivo selecciones
        llenarTabla1();
        jbSelectGuardar.setSelected(false);
        jrDesactivarComida.setSelected(false);
        jbSelectEliminar.setSelected(false);
        jRBOptener.setSelected(false);
        
        
     
        //desactivo botones
        jbCargar.setEnabled(false);
        jbBorrar.setEnabled(false);
        jbBuscar.setEnabled(false);
        //activo botones
        jbSumar.setEnabled(true);
        jbLimpiar.setEnabled(true);
        
        //activo textfield
        jtSuma.setEnabled(true);
       
    }//GEN-LAST:event_jRBCaloriasActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        try {
            int tabla = jTable3.getSelectedRow();
            if (tabla!=-1) {
            if (jbSelectEliminar.isSelected()) {
                it = new ItemComidasData();
                it.eliminarComidaDieta(item.getIdItemComidas());
                borrarFilasTabla();
                llenarTabla3();
                flag = true;
            }else if(jrDesactivarComida.isSelected()){
                it = new ItemComidasData();
                it.borradoLogComidaDieta(item.getIdItemComidas());
                borrarFilasTabla();
                llenarTabla3();
                flag = true;
            }
            }} catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error en Intento de borrado");
        }
        
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jrDesactivarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDesactivarComidaActionPerformed
        if (flag2==false) {
            llenarTabla3();
            borrarFilasTabla1();
            borrarFilasTabla2();
        }
        
        
        jTable2.setEnabled(false);
        jTable1.setEnabled(false);
        
        //desactivo selecciones 
        jbSelectGuardar.setSelected(false);
        jbSelectEliminar.setSelected(false);
        jRBOptener.setSelected(false);
        jRBCalorias.setSelected(false);
        
        //descativo botones
        jbCargar.setEnabled(false);
        jbSumar.setEnabled(false);
        jbLimpiar.setEnabled(false);
        jbBuscar.setEnabled(false);
        //activo borrar
        jbBorrar.setEnabled(true);
        
        //desactivo textfield
        jtSuma.setEnabled(false);
    }//GEN-LAST:event_jrDesactivarComidaActionPerformed

    private void jbSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSumarActionPerformed
        int select = jTable1.getSelectedRow();
        if (jRBCalorias.isSelected()) {
                if (select !=-1) {
                dieta = new Dieta();
                it = new ItemComidasData();
                int idDieta = (Integer) jTable1.getValueAt(select, 0);
                
               x= x +it.caloriasTotal(idDieta);
               
               String sum = x+"";
               jtSuma.setText("");
                jtSuma.setText(sum);
                jbSumar.setEnabled(false);
            }
               }else{
            JOptionPane.showMessageDialog(this, "Error en la suma de calorias");
        }
    }//GEN-LAST:event_jbSumarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtSuma.setText("");
        x = 0;
        sum = "";
        jbSumar.setEnabled(true);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        if (jbSelectEliminar.isSelected()||jrDesactivarComida.isSelected()) {
            int select = jTable3.getSelectedRow();
            if (select != -1) {
                int idItemComidas = (Integer) jTable3.getValueAt(select, 0);
                boolean estado = (boolean)jTable3.getValueAt(select, 3);
                
              
                item = new ItemComidas();
                
                item.setIdItemComidas(idItemComidas);
                item.setEstado(estado);
                
                 
            }else{
                JOptionPane.showMessageDialog(this, "Error en el evento de la tabla 3");
            }
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int select = jTable3.getSelectedRow();
        if (jRBOptener.isSelected()) {
            if (select != -1) {
                it = new ItemComidasData();
                
                int idDieta = (Integer) jTable1.getValueAt(select, 1);
                
                ArrayList <ItemComidas>list = (ArrayList)it.obtenerComidaPorDieta(idDieta);
                JOptionPane.showMessageDialog(null, list);
            }
        }else{
             JOptionPane.showMessageDialog(null, "Error al obtener comida");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBCalorias;
    private javax.swing.JRadioButton jRBOptener;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCargar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JRadioButton jbSelectEliminar;
    private javax.swing.JRadioButton jbSelectGuardar;
    private javax.swing.JButton jbSumar;
    private javax.swing.JRadioButton jrDesactivarComida;
    private javax.swing.JTextField jtSuma;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera1() {

        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("idDieta");
        columnas.add("Inicio");
        columnas.add("Fin");
        columnas.add("Peso buscado");
        columnas.add("Limite Calorico");
        columnas.add("Peso Inicial");
        columnas.add("Estado");
        
        for (Object columna : columnas) {
            modelo.addColumn(columna);
        }
        jTable1.setModel(modelo);

    }

    
    public void armarCabecera2(){
        
        ArrayList <Object> columnas = new ArrayList();
        columnas.add("IdComida");
        columnas.add("Nombre");
        columnas.add("Detalle");
        columnas.add("Calorias");
        columnas.add("Estado");
        
        for (Object die : columnas) {
            modelo2.addColumn(die);
        }
        
        jTable2.setModel(modelo2);
        
    }
    
    public void armarCabecera3(){
     ArrayList <Object> columnas = new ArrayList();
        columnas.add("Codigo");
        columnas.add("Codigo Dieta");
        columnas.add("Codigo Comida");
        columnas.add("Estado");
        
        for (Object items : columnas) {
            modelo3.addColumn(items);
        }
        
        jTable3.setModel(modelo3);
    
    }
    private void borrarFilasTabla2() {
        if (modelo2 != null) {
            int a = modelo2.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {
                modelo2.removeRow(i);
            }
        }

    }

//     public void llenarTabla(){
//         borrarFilasTabla();
//         ArrayList <ItemComidas> lista = (ArrayList) itemComidas.obtener();
//         
//         for (ItemComidas it : lista) {
//            modelo.addRow(new Object[]{it.getIdItemComidas(),it.getIdDieta(),it.getIdComida(),it.isEstado()});
//         }
//         
//     }
    public void llenarTabla1() {
        //borrarFilasTabla();

        ArrayList<Dieta> lista = (ArrayList) die.optenerDieta();

        for (Dieta di : lista) {
            modelo.addRow(new Object[]{di.getIdDieta(), di.getInicio(), di.getFin(), di.getPesoBuscado(), di.getLimiteCalorico(), di.getPesoInicial(), di.isEstado()});
        }
    }
     
     public void llenarTabla2(){
      //borrarFilasTabla();
         ArrayList<Comida>list = (ArrayList) com.obtenerComida();
         
         for (Comida com : list) {
           modelo2.addRow(new Object[]{com.getIdComida(), com.getNombre(), com.getDetalle(), com.getCalorias(), com.isEstado()});


         }
     
     }
     
      public void llenarTabla3(){
         
         ArrayList <ItemComidas> lista = (ArrayList) it.obtener();
         
         for (ItemComidas it : lista) {
            modelo3.addRow(new Object[]{it.getIdItemComidas(),it.getIdDieta(),it.getIdComida(),it.isEstado()});
         }
         
     }
     
      //tabla de itemComidas
    public void borrarFilasTabla() {
        if (modelo3 != null) {
            int a = modelo3.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {
                modelo3.removeRow(i);
            }
        }

    }
    
    public void borrarFilasTabla1() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }
}}
