
package Modulos.Venta;

//Librerias necesarias para la conexion y lectura de datos de la base de datos

import Modulos.*;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; //Para editar nuestro JTable
import Clases.Venta; //Lllamar a la clase Cliente para instanciar un objeti de tipo Cliente
import java.io.*;
import java.sql.Types;
public class Carrito extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Carrito(Insertar_Venta venta) {
        initComponents();
        this.venta=venta;
        productos=venta.Productos;
        cantidades=venta.Cantidades;
        precios=venta.Precios;
        if (cantidades==null) {
            cantidades=new int[productos.length];
            int i=0;
            for (String item:productos) {
                cantidades[i]=0;
            }
        }
        Llenar(cantidades);
        //Conexion
        //Conexion db= new Conexion();
        //database=db.getConnection();
    }
    public Carrito(Modificar_Venta ventamod) {
        initComponents();
        this.ventamod=ventamod;
        productos=ventamod.Productos;
        cantidades=ventamod.Cantidades;
        precios=ventamod.Precios;
        Llenar(cantidades);
        //productos=ventamod.Productos;
        //precios=ventamod.Precios;
        //Conexion
        //Conexion db= new Conexion();
        //database=db.getConnection();
    }
    Insertar_Venta venta=null;
    Modificar_Venta ventamod=null;
    //Atributos de conexion
    //Conexion db;
    //Connection database;
    
    //Atributo de consulta
    String SQL;
    
    //Atributo cedula que almacena la cedula buscada
    String[] productos;
    int[] precios;
    int[] cantidades;
    private void Llenar(int[] cantidad){
        
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código");
            modelo.addColumn("Nombre");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio");
            int Intem=0;
            for (String item:productos) {
            //Realizar consulta y almacenar resultado
           try{
               
            CallableStatement buscar = General.database.prepareCall("{call OBTENER_DATOS_PRODUCTOS(?,?)}");
            buscar.setInt(1, Integer.parseInt(item));
            buscar.registerOutParameter(2, Types.REF_CURSOR);
            buscar.execute();
            ResultSet rs=(ResultSet)buscar.getObject(2);
                String[] datos= new String[4];
                rs.next();
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2]=String.valueOf(cantidad[Intem]);
                datos[3]=String.valueOf(Integer.parseInt(rs.getString(3))*cantidad[Intem]);
                //Creo objeto de clase Cliente con los datos obtenido
                modelo.addRow(datos); //Inserto fila al modelo
                Intem++;
            }
           catch(Exception ex){
               
           }
           }
           
            
            //Actualizo modelo de JTable
            PRODUCTOS.setModel(modelo);
    }
    private void Update(){
        int i=0;
        cantidades=new int[productos.length];
        for (String item:productos) {
            cantidades[i]=Integer.parseInt(PRODUCTOS.getValueAt(i, 2).toString());
            i++;
        }
        Llenar(cantidades);
        i=0;
        precios=new int[productos.length];
        for (String item:productos) {
            precios[i]=Integer.parseInt(PRODUCTOS.getValueAt(i, 3).toString());
            i++;
        }
        if(venta!=null){
            venta.Cantidades=cantidades;
            venta.Precios=precios;
            venta.setMonto();
        }
        else if(ventamod!=null){
            ventamod.Cantidades=cantidades;
            ventamod.Precios=precios;
            ventamod.setMonto();
        }
    }
    //Objeto venta creado al consultar una cedula/venta en especifico, es para transmitirlo al JFrame que modifica, en caso de que vaya a modificar un venta
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CONFIRMAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PRODUCTOS = new javax.swing.JTable();
        ACTUALIZAR = new javax.swing.JButton();
        NombreDeTienda = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        CONFIRMAR.setBackground(new java.awt.Color(255, 255, 204));
        CONFIRMAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CONFIRMAR.setText("CONFIRMAR");
        CONFIRMAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CONFIRMARMouseClicked(evt);
            }
        });

        PRODUCTOS.setBackground(new java.awt.Color(0, 204, 204));
        PRODUCTOS.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PRODUCTOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad", "Precio"
            }
        ));
        PRODUCTOS.setCellSelectionEnabled(true);
        PRODUCTOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRODUCTOSMouseClicked(evt);
            }
        });
        PRODUCTOS.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                PRODUCTOSInputMethodTextChanged(evt);
            }
        });
        PRODUCTOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PRODUCTOSKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(PRODUCTOS);

        ACTUALIZAR.setBackground(new java.awt.Color(255, 255, 204));
        ACTUALIZAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ACTUALIZAR.setText("ACTUALIZAR");
        ACTUALIZAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACTUALIZARMouseClicked(evt);
            }
        });

        NombreDeTienda.setBackground(new java.awt.Color(255, 255, 255));
        NombreDeTienda.setFont(new java.awt.Font("Edwardian Script ITC", 1, 60)); // NOI18N
        NombreDeTienda.setForeground(new java.awt.Color(255, 255, 255));
        NombreDeTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreDeTienda.setText("Tienda La Moda");

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setText("VENTAS");

        EXIT.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 153));
        EXIT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EXIT.setText("X");
        EXIT.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITMouseClicked(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ACTUALIZAR)
                                .addGap(15, 15, 15)
                                .addComponent(CONFIRMAR))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(NombreDeTienda)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addComponent(EXIT)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreDeTienda)
                    .addComponent(EXIT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACTUALIZAR)
                    .addComponent(CONFIRMAR))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void PRODUCTOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRODUCTOSMouseClicked
        Update();
    }//GEN-LAST:event_PRODUCTOSMouseClicked

    private void CONFIRMARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONFIRMARMouseClicked
        Update();
        this.setVisible(false);
    }//GEN-LAST:event_CONFIRMARMouseClicked

    private void PRODUCTOSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PRODUCTOSKeyTyped
        Update();
    }//GEN-LAST:event_PRODUCTOSKeyTyped

    private void PRODUCTOSInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_PRODUCTOSInputMethodTextChanged
        Update();
    }//GEN-LAST:event_PRODUCTOSInputMethodTextChanged

    private void ACTUALIZARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACTUALIZARMouseClicked
        Update();
    }//GEN-LAST:event_ACTUALIZARMouseClicked

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        exit(0);
    }//GEN-LAST:event_EXITMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JButton CONFIRMAR;
    private javax.swing.JLabel EXIT;
    private javax.swing.JLabel NombreDeTienda;
    private javax.swing.JTable PRODUCTOS;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
