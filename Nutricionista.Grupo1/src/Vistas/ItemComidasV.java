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
        ///
        
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
        jbSelectGuardar = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbCargar = new javax.swing.JButton();
        jRBOptener = new javax.swing.JRadioButton();
        jRBCalorias = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbSumar = new javax.swing.JButton();
        jrDesactivarComida = new javax.swing.JRadioButton();
        jtSuma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

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

        jbSelectEliminar.setBackground(new java.awt.Color(255, 204, 153));
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

        jbSelectGuardar.setBackground(new java.awt.Color(255, 204, 153));
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
        jbCargar.setEnabled(false);
        jbCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarActionPerformed(evt);
            }
        });

        jRBOptener.setBackground(new java.awt.Color(255, 204, 153));
        jRBOptener.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRBOptener.setForeground(new java.awt.Color(0, 0, 0));
        jRBOptener.setText("Obtener comida por dieta");
        jRBOptener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBOptenerActionPerformed(evt);
            }
        });

        jRBCalorias.setBackground(new java.awt.Color(255, 204, 153));
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

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tabla Comida");

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tabla Item Comidas");

        jbSumar.setText("Sumar");
        jbSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSumarActionPerformed(evt);
            }
        });

        jrDesactivarComida.setBackground(new java.awt.Color(255, 204, 153));
        jrDesactivarComida.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jrDesactivarComida.setForeground(new java.awt.Color(0, 0, 0));
        jrDesactivarComida.setText("Desactivar Comida");
        jrDesactivarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDesactivarComidaActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total de Calorias");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSumar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jbCargar)
                .addGap(18, 18, 18)
                .addComponent(jbBorrar)
                .addGap(250, 250, 250))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(341, 341, 341))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(326, 326, 326))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSelectGuardar)
                    .addComponent(jbSelectEliminar)
                    .addComponent(jRBCalorias)
                    .addComponent(jrDesactivarComida)
                    .addComponent(jRBOptener)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jbBuscar))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jbSelectGuardar)
                        .addGap(1, 1, 1)
                        .addComponent(jrDesactivarComida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSelectEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBCalorias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBOptener)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbBorrar)
                            .addComponent(jbCargar))
                        .addContainerGap(116, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbSumar)
                            .addComponent(jtSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jbLimpiar))
                        .addGap(129, 129, 129))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSelectEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectEliminarActionPerformed
        //lleno tablas
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
               // int idPaciente = (Integer) jTable1.getValueAt(select, 1);
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
            if (select != -1) {
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
            if (tabla1 != -1 && tabla2 != -1) {
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
          JOptionPane.showMessageDialog(this, "Error en cargar");
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
        llenarTabla1();
           
        //desactivo selecciones
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
        //llenarTabla1();
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
        
        //llenarTabla3();
    }//GEN-LAST:event_jbBorrarActionPerformed

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

    private void jrDesactivarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDesactivarComidaActionPerformed
        //lleno tabla 3 y seteo
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

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtSuma.setText("");
        x = 0;
        sum = "";
        jbSumar.setEnabled(true);
    }//GEN-LAST:event_jbLimpiarActionPerformed

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
        columnas.add("Codido");
        columnas.add("Codigo Paciente");
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
        columnas.add("Codigo");
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

    }
    public void borrarFilasTabla2() {
        if (modelo2 != null) {
            int a = modelo2.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {
                modelo2.removeRow(i);
            }
        }

    }

     public void llenarTabla3(){
         
         ArrayList <ItemComidas> lista = (ArrayList) it.obtener();
         
         for (ItemComidas it : lista) {
            modelo3.addRow(new Object[]{it.getIdItemComidas(),it.getIdDieta(),it.getIdComida(),it.isEstado()});
         }
         
     }
    public void llenarTabla1() {
        //borrarFilasTabla();

        ArrayList<Dieta> lista = (ArrayList) die.optenerDieta();

        for (Dieta di : lista) {
            modelo.addRow(new Object[]{di.getIdDieta(), di.getIdPaciente(), di.getInicio(), di.getFin(), di.getPesoBuscado(), di.getLimiteCalorico(), di.getPesoInicial(), di.isEstado()});
        }
    }
     
     public void llenarTabla2(){
      //borrarFilasTabla();
         ArrayList<Comida>list = (ArrayList) com.obtenerComida();
         
         for (Comida com : list) {
           modelo2.addRow(new Object[]{com.getIdComida(), com.getNombre(), com.getDetalle(), com.getCalorias(), com.isEstado()});


         }
     
     }
}
