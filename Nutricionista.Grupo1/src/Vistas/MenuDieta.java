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
        private PacienteData pasdata= new PacienteData();
        private Paciente pa = new Paciente();
        private DietaData dieda = new DietaData();
        private Dieta die = new Dieta();
        private ItemComidasData cdata= new ItemComidasData();
        private ComidaData comiData = new ComidaData();
        private Comida comida = new Comida();
        int l = 0;
        int c;
    
    
    
    DefaultTableModel modelo;

    //DefaultTableModel modelo = (DefaultTableModel)  this.gDieta1.getModel(); 
    
    public MenuDieta() {
        initComponents();
        armarDieta();
        
       
       listadoPaciente= pasdata.obtenerPaciente();
       for (Paciente paciente : listadoPaciente ){
           this.combopacientes.addItem(paciente);
       }
       this.panelModificar.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combopacientes = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        guardarDieta = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        panelModificar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextinicio = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        guardarModicar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextpesoBuscado = new javax.swing.JTextField();
        jTextpesoInicial = new javax.swing.JTextField();
        jTextlimiteCalorico = new javax.swing.JTextField();
        jTextfechaFinal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        gDieta1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

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

        guardarDieta.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        guardarDieta.setText("Guardar Dieta ");
        guardarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDietaActionPerformed(evt);
            }
        });

        modificar.setFont(new java.awt.Font("Segoe Script", 1, 20)); // NOI18N
        modificar.setText("Modificar Dieta ");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        jLabel7.setText("Fecha fin ");

        guardarModicar.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        guardarModicar.setText("Guardar ");
        guardarModicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarModicarActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe Script", 1, 16)); // NOI18N
        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextpesoBuscado.setText("jTextField2");

        jTextpesoInicial.setText("jTextField3");

        jTextlimiteCalorico.setText("jTextField4");

        jTextfechaFinal.setText("jTextField5");

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
                                            .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextpesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(panelModificarLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextlimiteCalorico, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(panelModificarLayout.createSequentialGroup()
                        .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelModificarLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(47, 47, 47)
                                .addComponent(jTextfechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelModificarLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(guardarModicar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelModificarLayout.setVerticalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextpesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarModicar)
                    .addComponent(jButton5))
                .addGap(8, 8, 8))
        );

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel2.setText("Guardar o Modificar Datos del Paciente ");

        eliminar.setFont(new java.awt.Font("Segoe Script", 1, 20)); // NOI18N
        eliminar.setText("Eliminar Dieta");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(gDieta1);

        jLabel8.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        jLabel8.setText("Buscar Dieta por Fechas determinadas");

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
                        .addGap(154, 154, 154)
                        .addComponent(combopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(guardarDieta)
                                .addGap(86, 86, 86)
                                .addComponent(modificar)))
                        .addGap(70, 70, 70)
                        .addComponent(eliminar)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(580, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combopacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addGap(255, 255, 255)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardarDieta)
                            .addComponent(modificar)
                            .addComponent(eliminar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(panelModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(100, 100, 100)
                .addComponent(jLabel8)
                .addContainerGap(451, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(258, 258, 258)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(397, Short.MAX_VALUE)))
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combopacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopacientesActionPerformed
       pa =(Paciente) this.combopacientes.getSelectedItem();
    }//GEN-LAST:event_combopacientesActionPerformed

    private void guardarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDietaActionPerformed
    this.jTextpesoBuscado.setText("");
    this.jTextpesoInicial.setText("");
    this.jTextlimiteCalorico.setText("");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
    this.jTextfechaFinal.setText(LocalDate.now().plusDays(7).format(formatter).toString());
    
    String fecha = String.valueOf(LocalDate.now().toString());
    LocalDate date= LocalDate.parse(fecha,formatter);
    java.util.Date d = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    this.jTextinicio.setDate(d);
    
    
    this.panelModificar.setVisible(true);
    this.modificar.setVisible(false);
    this.eliminar.setVisible(false);
    l=1;
    
    
    }//GEN-LAST:event_guardarDietaActionPerformed

    private void guardarModicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarModicarActionPerformed
       die = new Dieta();
       die.setInicio(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(this.jTextinicio.getDate())));
       this.jTextfechaFinal.setText(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(this.jTextinicio.getDate())).plusDays(7).toString());
       die.setInicio(LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(this.jTextinicio.getDate())));
       DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd");
       LocalDate date=LocalDate.parse(this.jTextfechaFinal.getText(), formatter);
       die.setFin(date);
       
       
       
       
       
       
    }//GEN-LAST:event_guardarModicarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
      l=0;
      DefaultTableModel modelo = (DefaultTableModel) this.gDieta1.getModel();
      if (this.gDieta1.getSelectedRow()!=-1){
      this.panelModificar.setVisible(true);
      this.guardarDieta.setVisible(false);
      this.eliminar.setVisible(false);
      this.jTextpesoBuscado.setText(String.valueOf(modelo.getValueAt(this.gDieta1.getSelectedRow(), 3)));
      this.jTextpesoInicial.setText(String.valueOf(modelo.getValueAt(this.gDieta1.getSelectedRow(), 4)));
      this.jTextlimiteCalorico.setText(String.valueOf(modelo.getValueAt(this.gDieta1.getSelectedRow(), 4)));
      DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd");
      String fecha = String.valueOf(modelo.getValueAt(this.gDieta1.getSelectedRow(), l));
      LocalDate date=LocalDate.parse(fecha, formatter);
      java.util.Date f = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
      this.jTextinicio.setDate(f);
      
      date = date.plusDays(7);
      this.jTextfechaFinal.setText(date.toString());
      
      }else{
          JOptionPane.showMessageDialog(this, "No se selecciono ninguna dieta");
      }
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
      DefaultTableModel modelo = (DefaultTableModel) this.gDieta1.getModel();
      if (this.gDieta1.getSelectedRow()!=-1){
      
      c = Integer.parseInt(String.valueOf(modelo.getValueAt(this.gDieta1.getSelectedRow(), 0)));
      dieda.eliminarDieta(c);
      armarDieta();

      }else {
      JOptionPane.showMessageDialog(this, "Por favor seleccione una dieta");
      }
    }//GEN-LAST:event_eliminarActionPerformed

    
    
    
    
    private void armarDieta(){
       
        //titulos de las columnas
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Detalle");
        columnas.add("Calorias");
        columnas.add("Estado");
        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        
        gDieta1.setModel(modelo);

     /*   ArrayList <Dieta> dieta = new ArrayList();
        dieta= dieda.obtenerDietaPorPaciente(pa);
        String datos[] = new String [6];
        DefaultTableModel modelo = (DefaultTableModel)  this.gDieta1.getModel();
        modelo.setNumRows(0);
        for (Dieta dies : dieta){
            datos[0] = dies.getIdDieta() + "";
            datos[1]= dies.getInicio().toString();
            datos[2]= dies.getFin().toString();
            datos[3]= dies.getPesoBuscado() + "";
            datos[4] = dies.getPesoInicial() +"";
            datos[5]= dies.getLimiteCalorico() +"";
            modelo.addRow(datos);
        }
        */
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Paciente> combopacientes;
    private javax.swing.JButton eliminar;
    private javax.swing.JTable gDieta1;
    private javax.swing.JButton guardarDieta;
    private javax.swing.JButton guardarModicar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextfechaFinal;
    private com.toedter.calendar.JDateChooser jTextinicio;
    private javax.swing.JTextField jTextlimiteCalorico;
    private javax.swing.JTextField jTextpesoBuscado;
    private javax.swing.JTextField jTextpesoInicial;
    private javax.swing.JButton modificar;
    private javax.swing.JPanel panelModificar;
    // End of variables declaration//GEN-END:variables
}
