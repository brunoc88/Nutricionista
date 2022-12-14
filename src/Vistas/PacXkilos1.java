package Vistas;

import Data.DietaData;
import Modelo.Dieta;
import Modelo.Paciente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PacXkilos1 extends javax.swing.JInternalFrame {

    private DietaData dietaData;
    private Paciente paciente;
    private Dieta dieta;
    private DefaultTableModel modelo;

    public PacXkilos1() {
        initComponents();
        paciente = new Paciente();
        dieta = new Dieta();
        dietaData = new DietaData();
        modelo = new DefaultTableModel();

        armarCabeceraTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFKilos = new javax.swing.JTextField();
        jBBuscarKilos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKilos = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Kilos bajados");

        jTFKilos.setBackground(new java.awt.Color(255, 255, 255));
        jTFKilos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFKilosActionPerformed(evt);
            }
        });
        jTFKilos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFKilosKeyTyped(evt);
            }
        });

        jBBuscarKilos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/buscar.png"))); // NOI18N
        jBBuscarKilos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarKilosActionPerformed(evt);
            }
        });

        jTableKilos.setBackground(new java.awt.Color(255, 255, 255));
        jTableKilos.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTableKilos.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jTableKilos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableKilos.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTableKilos);

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/salida.png"))); // NOI18N
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresar Kg :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(652, 652, 652)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jTFKilos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jBBuscarKilos)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jBBuscarKilos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTFKilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(127, 127, 127)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFKilosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFKilosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFKilosActionPerformed

    private void jBBuscarKilosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarKilosActionPerformed
        cargarPacientes();


    }//GEN-LAST:event_jBBuscarKilosActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();        
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jTFKilosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFKilosKeyTyped
           char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTFKilosKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarKilos;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFKilos;
    private javax.swing.JTable jTableKilos;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraTabla() {
        //titulos de las columnas
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("Paciente");
        columnas.add("Peso Buscado");
        columnas.add("Peso Inicial");
//recorro el array y uso eso de titulos
        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        //se lo cargo a la tabla
        jTableKilos.setModel(modelo);

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
        ArrayList<Dieta> lista = (ArrayList) dietaData.pacientesBajar(Integer.parseInt(jTFKilos.getText()));
        for (Dieta pac : lista) {
            modelo.addRow(new Object[]{pac.getIdPaciente(), pac.getPesoBuscado(), pac.getPesoInicial(), pac.toString()});
        }

    }

}
