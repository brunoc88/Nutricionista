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
    private ItemComidasData it;
    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;

    public ItemComidasV() {
        initComponents();
        it = new ItemComidasData();
        die = new DietaData();
        com = new ComidaData();
        modelo = new DefaultTableModel();
        modelo2 = new DefaultTableModel();
        armarCabecera1();
        armarCabecera2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbSelectEliminar = new javax.swing.JRadioButton();
        jBBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jbSelectGuardar = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbCargar = new javax.swing.JButton();
        jRBOptener = new javax.swing.JRadioButton();
        jRBCalorias = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        jLabel1.setText("Item Comidas");

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
        jbSelectEliminar.setText("Eliminar comida de la dieta");
        jbSelectEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelectEliminarActionPerformed(evt);
            }
        });

        jBBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/eliminar.png"))); // NOI18N
        jBBorrar.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Id Comida:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/salida.png"))); // NOI18N

        jbSelectGuardar.setBackground(new java.awt.Color(204, 204, 255));
        jbSelectGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbSelectGuardar.setText("Guardar comida en la dieta");
        jbSelectGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelectGuardarActionPerformed(evt);
            }
        });

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

        jRBOptener.setBackground(new java.awt.Color(204, 204, 255));
        jRBOptener.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRBOptener.setText("Obtener comida por dieta");
        jRBOptener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBOptenerActionPerformed(evt);
            }
        });

        jRBCalorias.setBackground(new java.awt.Color(204, 204, 255));
        jRBCalorias.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRBCalorias.setText("Calorias totales");
        jRBCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBCaloriasActionPerformed(evt);
            }
        });

        jLabel3.setText("Tabla Dieta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbSelectGuardar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBCalorias)
                            .addComponent(jRBOptener)
                            .addComponent(jbSelectEliminar))
                        .addGap(120, 120, 120)
                        .addComponent(jbCargar)
                        .addGap(18, 18, 18)
                        .addComponent(jBBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(319, 319, 319))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSelectGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbSelectEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBOptener)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRBCalorias))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBBorrar)
                        .addComponent(jButton2)
                        .addComponent(jbCargar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(197, 197, 197))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSelectEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectEliminarActionPerformed
        jbSelectGuardar.setSelected(false);
         jRBOptener.setSelected(false);
        jRBCalorias.setSelected(false);
        
    }//GEN-LAST:event_jbSelectEliminarActionPerformed

    private void jbSelectGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectGuardarActionPerformed

        llenarTabla1();
        llenarTabla2();
        
    
        jBBorrar.setSelected(false);
               
        jbSelectEliminar.setSelected(false);
        jRBOptener.setSelected(false);
        jRBCalorias.setSelected(false);
      
        
        
    }//GEN-LAST:event_jbSelectGuardarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jbSelectGuardar.isSelected()) {
            int select = jTable1.getSelectedRow();
            if (select != -1) {
                int idDieta = (Integer) jTable1.getValueAt(select, 0);
                int idPaciente = (Integer) jTable1.getValueAt(select, 1);
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
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error");
        }

    }//GEN-LAST:event_jbCargarActionPerformed

    private void jRBOptenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBOptenerActionPerformed
      jbSelectGuardar.setSelected(false);
         jbSelectEliminar.setSelected(false);
        jRBCalorias.setSelected(false);
    }//GEN-LAST:event_jRBOptenerActionPerformed

    private void jRBCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBCaloriasActionPerformed
        // TODO add your handling code here:
        
     jbSelectGuardar.setSelected(false);
         jbSelectEliminar.setSelected(false);
        jRBOptener.setSelected(false);
    }//GEN-LAST:event_jRBCaloriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBCalorias;
    private javax.swing.JRadioButton jRBOptener;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbCargar;
    private javax.swing.JRadioButton jbSelectEliminar;
    private javax.swing.JRadioButton jbSelectGuardar;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera1() {

        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("idDieta");
        columnas.add("idPaciente");
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
    private void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
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
