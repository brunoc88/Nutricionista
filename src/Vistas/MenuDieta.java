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
        int l = 0;
        int c;
    
    
    
    DefaultTableModel modelo= new DefaultTableModel() ;

    //DefaultTableModel modelo = (DefaultTableModel)  this.gDieta1.getModel(); 
    
    public MenuDieta() {
        initComponents();
        armarTabla();
        
       
       listadoPaciente= pasdata.obtenerPaciente();
       for (Paciente paciente : listadoPaciente ){
           this.combopacientes.addItem(paciente);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(combopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addComponent(panelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(851, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(combopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)))
                .addContainerGap(653, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(258, 258, 258)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(681, Short.MAX_VALUE)))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // armarDieta();
      cargarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combopacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopacientesActionPerformed
      // pa =(Paciente) this.combopacientes.getSelectedItem();
      
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
      //  eliminar.setVisible(false);
    }//GEN-LAST:event_eliminarActionPerformed

    private void jTextlimiteCaloricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextlimiteCaloricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextlimiteCaloricoActionPerformed

    private void gDieta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gDieta1MouseClicked
       int filaSeleccionada = gDieta1.getSelectedRow();
      modificar.setEnabled(true);
      eliminar.setEnabled(true);
      jTextPesoBuscado.setText(String.valueOf(gDieta1.getValueAt(filaSeleccionada, 3)));
      jTextpesoInicial.setText((String.valueOf(gDieta1.getValueAt(filaSeleccionada, 4))));
      jTextlimiteCalorico.setText((String.valueOf(gDieta1.getValueAt(filaSeleccionada, 5))));
      //jTextinicio.setText(Date.parse(gDieta1.getValueAt(filaSeleccionada) ,1);
      //jTextfechaFinal.setText((String)gDieta1.getValueAt(filaSeleccionada, 2));
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

  
    
    private void armarTabla(){
       
       //titulos de las columnas
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("Id Dieta");
        columnas.add("inicio");
        columnas.add("fin");
        columnas.add("peso deseado");
        columnas.add("peso inciial");
        columnas.add("limite calorico");
        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        gDieta1.setModel(modelo);
        
        
    
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Paciente> combopacientes;
    private javax.swing.JButton eliminar;
    private javax.swing.JTable gDieta1;
    private javax.swing.JButton guardarModicar;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
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
