/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidades.Operaciones;
import Mantenimiento.Navegacion;
import Servicios.Servicio_Excel;
import Servicios.Servicio_Operaciones;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lesly Aguilar
 */
public class FREP004 extends javax.swing.JFrame {

    private Servicio_Operaciones servicioOperaciones;
    private JTextField[] componentes;
    private ArrayList<Integer> numMaximo;
    private ArrayList<String> tipoDato;
    private Navegacion navegacion;
    Servicio_Excel servicio_Excel;
    int cant_operaciones;
    private DefaultTableModel modelo;
    int filaseleccionadaOperacion;

    public FREP004() {

        initComponents();
        this.setLocationRelativeTo(null);
        modelo = (DefaultTableModel) tblOperaciones.getModel();
        ((JLabel) tblOperaciones.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        servicioOperaciones = new Servicio_Operaciones(tblOperaciones);
        servicio_Excel = new Servicio_Excel(tblOperaciones, this);
        Listar_Operaciones();
        //Navegacion
        crearArrayComponente();
        crearArrayNumMax();
        crearArrayTipoDato();
        navegacion = new Navegacion(componentes, numMaximo, tipoDato, btn_Agregar);
        asignarEvento();
    }

    private void crearArrayTipoDato() {
        tipoDato = new ArrayList();
        tipoDato.add("S");
        tipoDato.add("S");
        tipoDato.add("S");
        tipoDato.add("S");
        tipoDato.add("S");
    }

    private void crearArrayComponente() {
        componentes = new JTextField[5];
        componentes[0] = txt_Codigo;
        componentes[1] = txt_Descripcion;
        componentes[2] = txt_Verstock;
        componentes[3] = txt_Costos;
        componentes[4] = txt_Transaccion;
    }

    private void crearArrayNumMax() {
        numMaximo = new ArrayList();
        numMaximo.add(2);
        numMaximo.add(40);
        numMaximo.add(1);
        numMaximo.add(1);
        numMaximo.add(1);
    }

    private void asignarEvento() {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].addKeyListener(navegacion);
        }
    }

    private void setear(Operaciones op) {
        op.setIdoperacion(Integer.valueOf(txt_Codigo.getText()));
        op.setCodigooperacion(txt_Codigo.getText());
        op.setDescripcion(txt_Descripcion.getText());
        op.setVerstock(txt_Verstock.getText());
        op.setCostos(txt_Costos.getText());
        op.setTransaccion(txt_Transaccion.getText());
    }

    private void Listar_Operaciones() {
        cant_operaciones = servicioOperaciones.Listar_Operaciones(modelo);
    }

    private void Limpiar_Campos() {
        txt_Codigo.setText("");
        txt_Costos.setText("");
        txt_Descripcion.setText("");
        txt_Transaccion.setText("");
        txt_Verstock.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOperaciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOperaciones = new javax.swing.JTable();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        btn_Exportar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Verstock = new javax.swing.JTextField();
        txt_Costos = new javax.swing.JTextField();
        txt_Transaccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Descripcion = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblOperaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Ver Stock", "Costos", "Transacción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOperaciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblOperaciones.getTableHeader().setReorderingAllowed(false);
        tblOperaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblOperacionesMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOperacionesMouseClicked(evt);
            }
        });
        tblOperaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblOperacionesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblOperaciones);
        tblOperaciones.getColumnModel().getColumn(0).setMinWidth(50);
        tblOperaciones.getColumnModel().getColumn(0).setMaxWidth(50);
        tblOperaciones.getColumnModel().getColumn(2).setMinWidth(100);
        tblOperaciones.getColumnModel().getColumn(2).setMaxWidth(100);
        tblOperaciones.getColumnModel().getColumn(3).setMinWidth(100);
        tblOperaciones.getColumnModel().getColumn(3).setMaxWidth(100);
        tblOperaciones.getColumnModel().getColumn(4).setMinWidth(100);
        tblOperaciones.getColumnModel().getColumn(4).setMaxWidth(100);

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        btn_Exportar.setText("Exportar");
        btn_Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExportarActionPerformed(evt);
            }
        });

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("OPERACIONES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Operación"));

        jLabel2.setText("Codigo");

        jLabel6.setText("Descripción");

        jLabel3.setText("Verstock");

        jLabel5.setText("Transacción");

        jLabel4.setText("Costos");

        jLabel17.setText("(*)");

        jLabel18.setText("(*)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Descripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_Transaccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_Costos, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_Verstock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Verstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Costos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Transaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout panelOperacionesLayout = new javax.swing.GroupLayout(panelOperaciones);
        panelOperaciones.setLayout(panelOperacionesLayout);
        panelOperacionesLayout.setHorizontalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperacionesLayout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(333, 333, 333))
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(panelOperacionesLayout.createSequentialGroup()
                                .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))))
        );
        panelOperacionesLayout.setVerticalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperacionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed

        String mensaje = "";
        if (txt_Codigo.getText().equals("")) {
            mensaje = mensaje + "Ingrese el codigo";
        }
        if (txt_Descripcion.getText().equals("")) {
            mensaje = mensaje + "\n" + "Ingrese la descripción";
        }

        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int verif;
            verif = JOptionPane.showConfirmDialog(null, "¿Desea añadir operación?", "CONFIRMACIÓN", 0);
            if (verif == 0) {
                Operaciones operaciones = new Operaciones();

                operaciones.setCodigooperacion(txt_Codigo.getText());
                operaciones.setDescripcion(txt_Descripcion.getText());
                if (txt_Costos.getText().equals("")) {
                    operaciones.setCostos("");
                } else {
                    operaciones.setCostos(txt_Costos.getText());
                }
                if (txt_Transaccion.getText().equals("")) {
                    operaciones.setTransaccion("");
                } else {
                    operaciones.setTransaccion(txt_Transaccion.getText());
                }
                if (txt_Verstock.getText().equals("")) {
                    operaciones.setVerstock("");
                } else {
                    operaciones.setVerstock(txt_Verstock.getText());
                }

                boolean verific = false;

                verific = servicioOperaciones.insertarOperacion(operaciones);
                if (verific == true) {
                    JOptionPane.showMessageDialog(null, "Insertó una nueva operación");
                    DefaultTableModel modelo = (DefaultTableModel) tblOperaciones.getModel();
                    Object[] lineas = {operaciones.getCodigooperacion(), operaciones.getDescripcion(),
                        operaciones.getVerstock(), operaciones.getCostos(), operaciones.getTransaccion()
                    };
                    modelo.addRow(lineas);
                    Limpiar_Campos();

                } else {
                    JOptionPane.showMessageDialog(null, "Error en la inserción");
                }
            } else {
                Limpiar_Campos();
            }
        }

    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        filaseleccionadaOperacion = tblOperaciones.getSelectedRow();

        int verif;
        String mensaje = "";
        if (txt_Codigo.getText().equals("")) {
            mensaje = mensaje + "Ingrese el codigo";
        }
        if (txt_Descripcion.getText().equals("")) {
            mensaje = mensaje + "\n" + "Ingrese la descripción";
        }

        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            verif = JOptionPane.showConfirmDialog(null, "¿Desea actualizar operacion?", "CONFIRMACIÓN", 0);
            if (verif == 0) {
                String codigo = (String) tblOperaciones.getValueAt(tblOperaciones.getSelectedRow(), 0);

                Operaciones operaciones;
                operaciones = servicioOperaciones.obtener_Operacion_Codigo(codigo);
                operaciones.setCodigooperacion(txt_Codigo.getText());
                operaciones.setDescripcion(txt_Descripcion.getText());
                if (txt_Costos.getText().equals("")) {
                    operaciones.setCostos("");
                } else {
                    operaciones.setCostos(txt_Costos.getText());
                }
                if (txt_Transaccion.getText().equals("")) {
                    operaciones.setTransaccion("");
                } else {
                    operaciones.setTransaccion(txt_Transaccion.getText());
                }
                if (txt_Verstock.getText().equals("")) {
                    operaciones.setVerstock("");
                } else {
                    operaciones.setVerstock(txt_Verstock.getText());
                }
                System.out.println("transa:"+operaciones.getTransaccion());
                boolean verific;

                verific = servicioOperaciones.modificarOperacion(operaciones);
                if (verific == true) {
                    JOptionPane.showMessageDialog(null, "Actualización de la operación");
                    modelo.setValueAt(operaciones.getCodigooperacion(), filaseleccionadaOperacion, 0);
                    modelo.setValueAt(operaciones.getDescripcion(), filaseleccionadaOperacion, 1);
                    modelo.setValueAt(operaciones.getVerstock(), filaseleccionadaOperacion, 2);
                    modelo.setValueAt(operaciones.getCostos(), filaseleccionadaOperacion, 3);
                    modelo.setValueAt(operaciones.getTransaccion(), filaseleccionadaOperacion, 4);
                    Limpiar_Campos();

                } else {
                    JOptionPane.showMessageDialog(null, "Error en la actualización");
                }
            } else {
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        String codigo = (String) tblOperaciones.getValueAt(tblOperaciones.getSelectedRow(), 0);

        Operaciones operacion;
        operacion = servicioOperaciones.obtener_Operacion_Codigo(codigo);
        DefaultTableModel modelo = (DefaultTableModel) tblOperaciones.getModel();
        filaseleccionadaOperacion = tblOperaciones.getSelectedRow();

        if (!txt_Codigo.getText().equals("")) {

            int verif;
            verif = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la operación?", "CONFIRMACIÓN", 0);
            if (verif == 0) {
                boolean verific = false;
                //  Limpiar_Tabla();
                verific = servicioOperaciones.eliminarOperacion(operacion);
                if (verific == true) {
                    JOptionPane.showMessageDialog(null, "Eliminó una operación");
                    Limpiar_Campos();
                    modelo.removeRow(filaseleccionadaOperacion);
                } else {
                    JOptionPane.showMessageDialog(null, "Error en la eliminación");
                }


            } else {
                Limpiar_Campos();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar a una operación antes de eliminar");
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed
    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        Limpiar_Campos();
        txt_Codigo.setEnabled(true);
        tblOperaciones.clearSelection();
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExportarActionPerformed
        servicio_Excel.Exportar_Excel(1);
    }//GEN-LAST:event_btn_ExportarActionPerformed

    private void tblOperacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOperacionesMouseClicked
    }//GEN-LAST:event_tblOperacionesMouseClicked

    private void tblOperacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblOperacionesKeyReleased
        DefaultTableModel modelo = (DefaultTableModel) tblOperaciones.getModel();
        String codigo = (String) tblOperaciones.getValueAt(tblOperaciones.getSelectedRow(), 0);

        Operaciones operacion;
        operacion = servicioOperaciones.obtener_Operacion_Codigo(codigo);

        txt_Codigo.setText(operacion.getCodigooperacion());
        txt_Costos.setText(operacion.getCostos());
        txt_Descripcion.setText(operacion.getDescripcion());
        txt_Transaccion.setText(operacion.getTransaccion());
        txt_Verstock.setText(operacion.getVerstock());
    }//GEN-LAST:event_tblOperacionesKeyReleased

    private void tblOperacionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOperacionesMouseReleased
        DefaultTableModel modelo = (DefaultTableModel) tblOperaciones.getModel();
        String codigo = (String) tblOperaciones.getValueAt(tblOperaciones.getSelectedRow(), 0);

        Operaciones operacion;
        operacion = servicioOperaciones.obtener_Operacion_Codigo(codigo);
        txt_Codigo.setEnabled(false);
        txt_Codigo.setText(operacion.getCodigooperacion());
        txt_Costos.setText(operacion.getCostos());
        txt_Descripcion.setText(operacion.getDescripcion());
        txt_Transaccion.setText(operacion.getTransaccion());
        txt_Verstock.setText(operacion.getVerstock());
    }//GEN-LAST:event_tblOperacionesMouseReleased
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) throws java.lang.InstantiationException {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//
//
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(IU_Operaciones.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            /*} catch (InstantiationException ex) {
//             java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);*/
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IU_Operaciones.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IU_Operaciones.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new IU_Operaciones().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Agregar;
    public javax.swing.JButton btn_Eliminar;
    public javax.swing.JButton btn_Exportar;
    public javax.swing.JButton btn_Limpiar;
    public javax.swing.JButton btn_Modificar;
    public javax.swing.JButton btn_Salir;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel panelOperaciones;
    public javax.swing.JTable tblOperaciones;
    public javax.swing.JTextField txt_Codigo;
    public javax.swing.JTextField txt_Costos;
    public javax.swing.JTextField txt_Descripcion;
    public javax.swing.JTextField txt_Transaccion;
    public javax.swing.JTextField txt_Verstock;
    // End of variables declaration//GEN-END:variables
}
