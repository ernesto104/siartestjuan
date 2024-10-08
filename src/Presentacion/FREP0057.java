package Presentacion;

import Entidades.Equipos;
import Entidades.PuntosVenta;
import Mantenimiento.Navegacion;
import Servicios.HibernateUtil;
import Servicios.Servicio_Excel;
import Servicios.Servicio_Equipos;
import Servicios.Servicio_Puntos_Venta;
import Servicios.TipoMensaje;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Keily
 */
public class FREP0057 extends javax.swing.JFrame {

    int numeroequipos;
    Servicio_Puntos_Venta spv;
    int fila;
    private boolean seleccionada;
    public JTextField[] componentes;
    DefaultTableModel modelo;
    Navegacion navegacion;
    private final ArrayList<Integer> numMaximo;
    private final ArrayList<String> tipoDato;
    TipoMensaje tm;
    boolean modificar;
    private Servicio_Puntos_Venta sp;
    private DefaultTableModel table;
    int ultimo_id;
    int num_lin;

    public int getUltimo_id() {
        return ultimo_id;
    }

    public void setUltimo_id(int ultimo_id) {
        this.ultimo_id = ultimo_id;
    }

    public FREP0057() {

        initComponents();
        this.setLocationRelativeTo(null);
        modelo = (DefaultTableModel) tablaCodigoPuntosVenta.getModel();
        table = (DefaultTableModel) tablaCodigoPuntosVenta.getModel();
        spv = new Servicio_Puntos_Venta(this);
        tm = new TipoMensaje();
        modificar = false;

        txtid.setText(String.valueOf(spv.nextId()));
        Listar_PuntosVenta();
        crearArrayComponente();
        numMaximo = new ArrayList<>();
        crearArrayNumMax();
        tipoDato = new ArrayList<>();
        crearArrayTipoDato();
        navegacion = new Navegacion(componentes, numMaximo, tipoDato, btnagregar);
        asignarEvento();

        sp = new Servicio_Puntos_Venta(this);
        
        //para ocultar botones (se desplazo a otra vista el boton Eliminar)
        btneliminar.setVisible(false);
        jLabel5.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        txtdescuento2.setVisible(false);
        txtdescuento3.setVisible(false);
        txtdescuento4.setVisible(false);
        
        btndesactivar.setVisible(false);
    }

    private void crearArrayComponente() {
        componentes = new JTextField[4];
        componentes[0] = txtdescripcion;
        //componentes[1] = txtdescuento;
        componentes[1] = txtdescuento2;
        componentes[2] = txtdescuento3;
        componentes[3] = txtdescuento4;
    }

    private void crearArrayNumMax() {
        numMaximo.add(40);
        numMaximo.add(13);
        numMaximo.add(13);
        numMaximo.add(13);
        numMaximo.add(13);
    }

    private void asignarEvento() {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].addKeyListener(navegacion);
        }
    }

    private void crearArrayTipoDato() {
        tipoDato.add("S");
        tipoDato.add("D");
        tipoDato.add("D");
        tipoDato.add("D");
        tipoDato.add("D");
    }
    //generar contenido de tabla
    private void Listar_PuntosVenta() {
        spv.Listar_PuntosVenta();
    }

    private String validarEntradas() {
        String mensaje = "ERROR";
        if (txtdescripcion.getText().equals("")) {
            mensaje = mensaje + "\n- Ingrese descripción de Punto de Venta";
        }
        
        
        if (comboEstado.getSelectedIndex() == 0) {
            mensaje += "\n- Seleccione un estado para el Punto de Venta";
        }
        
        if( !modificar) {
            if (spv.buscarPuntosVentax_Nombre(txtdescripcion.getText()) != null){
                mensaje += "\n Punto de venta existente, escoja otro nombre para el nuevo Punto de Venta";
            }
        }
       /* if (mensaje.equals("")) {
            return tm.VALIDO;
        } else {*/
            return mensaje;
        //}
   
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        panelPuntosVenta = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdescuento2 = new javax.swing.JTextField();
        txtdescuento3 = new javax.swing.JTextField();
        txtdescuento4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCodigoPuntosVenta = new javax.swing.JTable();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnexportar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btndesactivar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

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
        jScrollPane1.setViewportView(jTable1);

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Puntos de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        jLabel1.setText("Código de Venta");

        jLabel2.setText("Estado");

        txtid.setEnabled(false);

        jLabel4.setText("Descripcion");

        jLabel3.setText("( * )");

        jLabel5.setText("Modelo");

        jLabel7.setText("Descuento 3");

        jLabel8.setText("Descuento 4 ");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Activado", "Desactivado" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtdescuento4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdescuento3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdescuento2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtdescuento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdescuento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdescuento4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Puntos de Venta");

        tablaCodigoPuntosVenta.setAutoCreateRowSorter(true);
        tablaCodigoPuntosVenta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tablaCodigoPuntosVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Punto Venta", "Descripcion", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCodigoPuntosVenta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaCodigoPuntosVenta.getTableHeader().setReorderingAllowed(false);
        tablaCodigoPuntosVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaCodigoPuntosVentaMouseReleased(evt);
            }
        });
        tablaCodigoPuntosVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaCodigoPuntosVentaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCodigoPuntosVenta);
        if (tablaCodigoPuntosVenta.getColumnModel().getColumnCount() > 0) {
            tablaCodigoPuntosVenta.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablaCodigoPuntosVenta.getColumnModel().getColumn(1).setPreferredWidth(300);
            tablaCodigoPuntosVenta.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnexportar.setText("Exportar");
        btnexportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btndesactivar.setText("Des/Activar");
        btndesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesactivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPuntosVentaLayout = new javax.swing.GroupLayout(panelPuntosVenta);
        panelPuntosVenta.setLayout(panelPuntosVentaLayout);
        panelPuntosVentaLayout.setHorizontalGroup(
            panelPuntosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPuntosVentaLayout.createSequentialGroup()
                .addGroup(panelPuntosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPuntosVentaLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel6))
                    .addGroup(panelPuntosVentaLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelPuntosVentaLayout.createSequentialGroup()
                .addGroup(panelPuntosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPuntosVentaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPuntosVentaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnexportar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        panelPuntosVentaLayout.setVerticalGroup(
            panelPuntosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPuntosVentaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPuntosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexportar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPuntosVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPuntosVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        if (seleccionada == false) {
            String validacion = validarEntradas();
            
            if (!validacion.equals("ERROR")) {
                //tm.Error(validacion);
                JOptionPane.showMessageDialog(null, validacion, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int verif;
                verif = JOptionPane.showConfirmDialog(null, "¿Desea continuar con la operacion?", "CONFIRMACIÓN", 0);
                if (verif == 0) {
                    int id = Integer.parseInt(txtid.getText());
                    String descripcion = txtdescripcion.getText();
                    String estado = (String) comboEstado.getSelectedItem();
                    //double descuento = validarDoble(txtdescuento);
                    double descuento2 = validarDoble(txtdescuento2);
                    double descuento3 = validarDoble(txtdescuento3);
                    double descuento4 = validarDoble(txtdescuento4);

                    PuntosVenta li = new PuntosVenta();
                    li.setIdpuntosventa(id);
                    li.setDescripcion(descripcion);
                    li.setEstado(estado);
                    //li.setDescuento1(validarDoble(txtdescuento));
                    //li.setDescuento2(validarDoble(txtdescuento2));
                    //li.setDescuento3(validarDoble(txtdescuento3));
                    //li.setDescuento4(validarDoble(txtdescuento4));

                    if (spv.addPuntosVenta(li)) {
                        JOptionPane.showMessageDialog(null, "Operacion exitosa");
                        Object[] row = {id, descripcion, estado,/*descuento,*/ descuento2, descuento3, descuento4};
                        table.addRow(row);
                        clean();
                        txtid.setText(String.valueOf(spv.nextId()));
                    } else {
                        JOptionPane.showMessageDialog(null, "Error en la inserción");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "ESTE PUNTO DE VENTA YA SE ENCUENTRA REGISTRADO\nUTILICE LA OPCION 'LIMPIAR' PARA COMENZAR A AGREGAR UN NUEVO PUNTO DE VENTA", "Error al agregar", 0);
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private double validarDoble(JTextField txt) {
        if (txt.getText().equals("")) {
            return 0.0;
        } else {
            return Double.parseDouble(txt.getText());
        }
    }

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        if (seleccionada == true) {
            if (JOptionPane.showConfirmDialog(this, "¿ Desea continuar con la Operacion ?", "Confirmacion", JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {
                if (spv.borrarPuntosVenta(spv.getPuntosVenta(Integer.parseInt(txtid.getText())))) {
                    JOptionPane.showMessageDialog(null, "Operacion exitosa");
                    table.removeRow(fila);
                    tablaCodigoPuntosVenta.clearSelection();
                    seleccionada = false;
                    clean();
                    txtid.setText(String.valueOf(spv.nextId()));
                } else {
                    JOptionPane.showMessageDialog(null, "Error en la Operacion");
                }
            }
        } else {
            tm.manejarMensajes(tm.NO_SELECCIONADO_PUNTOS_VENTA);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    public boolean actualizarPuntosVenta(PuntosVenta l) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(l);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            session.beginTransaction().rollback();
            return false;
        }

    }

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        modificar = true;
        String validacion = validarEntradas();
        if (seleccionada == true) {
            if (!validacion.equals("ERROR")) {
                JOptionPane.showMessageDialog(null, validacion, "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                int verif;
                verif = JOptionPane.showConfirmDialog(null, "¿Desea continuar con la operacion?", "CONFIRMACIÓN", 0);
                if (verif == 0) {
                    int id = Integer.parseInt(txtid.getText());
                    String descripcion = txtdescripcion.getText();
                    //double descuento = validarDoble(txtdescuento);
                    String estado = (String) comboEstado.getSelectedItem();
                    double descuento2 = validarDoble(txtdescuento2);
                   /* double descuento3 = validarDoble(txtdescuento3);
                    double descuento4 = validarDoble(txtdescuento4);*/

                    PuntosVenta l = new PuntosVenta();
                    l.setIdpuntosventa(id);
                    l.setDescripcion(descripcion);
                    l.setEstado(estado);
                   // l.setDescuento1(descuento);
                    //l.setDescuento2(descuento2);
                    /*l.setDescuento3(descuento3);
                    l.setDescuento4(descuento4);*/

                    if (actualizarPuntosVenta(l)) {
                        JOptionPane.showMessageDialog(null, "Operación exitosa");
                        DefaultTableModel m = (DefaultTableModel) tablaCodigoPuntosVenta.getModel();
                        m.setValueAt(id, fila, 0);
                        m.setValueAt(descripcion, fila, 1);
                        m.setValueAt(estado, fila, 2);
                        //m.setValueAt(descuento, fila, 2);
                       //m.setValueAt(descuento2, fila, 3);
                       /* m.setValueAt(descuento3, fila, 4);
                        m.setValueAt(descuento4, fila, 5);*/

                    } else {
                        JOptionPane.showMessageDialog(null, "Error en la actualización");
                    }
                }
            }
        } else {
            tm.manejarMensajes(tm.NO_SELECCIONADO_PUNTOS_VENTA);
        }
        modificar = false;

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
        tablaCodigoPuntosVenta.clearSelection();
        seleccionada = false;
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnexportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportarActionPerformed
        Servicio_Excel servicio_excel;
        servicio_excel = new Servicio_Excel(tablaCodigoPuntosVenta, this);
        servicio_excel.Exportar_Excel(1);
    }//GEN-LAST:event_btnexportarActionPerformed

    //supestamente mapea tabla(no confirmado)
    private void tablaCodigoPuntosVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaCodigoPuntosVentaKeyReleased
        fila = tablaCodigoPuntosVenta.getSelectedRow();
        String id = tablaCodigoPuntosVenta.getValueAt(fila, 0).toString();
        String descripcion = tablaCodigoPuntosVenta.getValueAt(fila, 1).toString();
        String estado = (String) tablaCodigoPuntosVenta.getValueAt(fila, 2);


        txtid.setText(id);
        txtdescripcion.setText(descripcion);
        comboEstado.setSelectedItem(String.valueOf(estado));
       // txtdescuento.setText(String.valueOf(descuento));

        seleccionada = true;
    }//GEN-LAST:event_tablaCodigoPuntosVentaKeyReleased

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void tablaCodigoPuntosVentaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCodigoPuntosVentaMouseReleased
        // TODO add your handling code here:
        //Para rellenar formulario al seleccionar 1 fila de tabla
        fila = tablaCodigoPuntosVenta.getSelectedRow();
        String id = tablaCodigoPuntosVenta.getValueAt(fila, 0).toString();
        String descripcion = tablaCodigoPuntosVenta.getValueAt(fila, 1).toString();
        String estado = (String) tablaCodigoPuntosVenta.getValueAt(fila, 2);
        //double descuento2 = (double) tablaCodigoEquipos.getValueAt(fila, 3);
       // double descuento3 = (double) tablaCodigoEquipos.getValueAt(fila, 4);
      //  double descuento4 = (double) tablaCodigoEquipos.getValueAt(fila, 5);

        txtid.setText(id);
        txtdescripcion.setText(descripcion);
        comboEstado.setSelectedItem(String.valueOf(estado));
       // txtdescuento2.setText(String.valueOf(descuento2));
       // txtdescuento3.setText(String.valueOf(descuento3));
        //txtdescuento4.setText(String.valueOf(descuento4));

        seleccionada = true;
    }//GEN-LAST:event_tablaCodigoPuntosVentaMouseReleased

    private void btndesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesactivarActionPerformed
        // TODO add your handling code here:
        String validacion = validarEntradas();
        if (seleccionada == true) { 
                int verif;
                verif = JOptionPane.showConfirmDialog(null, "¿Desea continuar con la operacion?", "CONFIRMACIÓN", 0);
                if (verif == 0) {
                    //int id = Integer.parseInt(txtid.getText());
                    //String descripcion = txtdescripcion.getText();
                    //double descuento = validarDoble(txtdescuento);
                    
                    //probando acceso a data de fila de manera directa
                    fila = tablaCodigoPuntosVenta.getSelectedRow();
                    int id = (int) tablaCodigoPuntosVenta.getValueAt(fila, 0);
                    String descripcion = tablaCodigoPuntosVenta.getValueAt(fila, 1).toString();
                    String estado = (String) tablaCodigoPuntosVenta.getValueAt(fila, 2);
                    
                    
                    /*double descuento2 = validarDoble(txtdescuento2);*/
                   /* double descuento3 = validarDoble(txtdescuento3);
                    double descuento4 = validarDoble(txtdescuento4);*/
                    if(estado.equals("Activado")){
                        estado="Desactivado";
                    }else{
                        estado="Activado";
                    }
                    PuntosVenta l = new PuntosVenta();
                    l.setIdpuntosventa(id);
                    l.setDescripcion(descripcion);

                    l.setEstado(estado);
                   // l.setDescuento1(descuento);
                   /* l.setDescuento2(descuento2);*/
                    /*l.setDescuento3(descuento3);
                    l.setDescuento4(descuento4);*/

                    if (actualizarPuntosVenta(l)) {
                        JOptionPane.showMessageDialog(null, "Operación exitosa");
                        DefaultTableModel m = (DefaultTableModel) tablaCodigoPuntosVenta.getModel();
                        m.setValueAt(id, fila, 0);
                        m.setValueAt(descripcion, fila, 1);
                        m.setValueAt(estado, fila, 2);
                        //m.setValueAt(descuento, fila, 2);
                       /* m.setValueAt(descuento2, fila, 3);*/
                       /* m.setValueAt(descuento3, fila, 4);
                        m.setValueAt(descuento4, fila, 5);*/
                        
                        comboEstado.setSelectedItem(String.valueOf(estado));

                    } else {
                        JOptionPane.showMessageDialog(null, "Error en la actualización");
                    }
                }
            
        } else {
            tm.manejarMensajes(tm.NO_SELECCIONADO_PUNTOS_VENTA);
        }
    }//GEN-LAST:event_btndesactivarActionPerformed

    public void limpiar() {

        txtdescripcion.setText("");
       // txtdescuento.setText("");
        comboEstado.setSelectedIndex(0);
        txtdescuento2.setText("");
        txtdescuento3.setText("");
        txtdescuento4.setText("");
        if (table.getRowCount() != 0) {
            int num = Integer.parseInt(table.getValueAt(table.getRowCount() - 1, 0).toString()) + 1;
            txtid.setText(String.valueOf(num));
        } else {
            txtid.setText("1");
        }

    }

    private void clean() {
        for (JTextField j : componentes) {
            j.setText("");
        }
        tablaCodigoPuntosVenta.clearSelection();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnagregar;
    public javax.swing.JButton btndesactivar;
    public javax.swing.JButton btneliminar;
    public javax.swing.JButton btnexportar;
    public javax.swing.JButton btnlimpiar;
    public javax.swing.JButton btnmodificar;
    public javax.swing.JButton btnsalir;
    public javax.swing.JComboBox comboEstado;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    public javax.swing.JPanel panelPuntosVenta;
    public javax.swing.JTable tablaCodigoPuntosVenta;
    public javax.swing.JTextField txtdescripcion;
    public javax.swing.JTextField txtdescuento2;
    public javax.swing.JTextField txtdescuento3;
    public javax.swing.JTextField txtdescuento4;
    public javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
