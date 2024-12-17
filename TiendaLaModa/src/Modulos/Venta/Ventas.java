
package Modulos.Venta;

//Librerias necesarias para la conexion y lectura de datos de la base de datos

import Modulos.*;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; //Para editar nuestro JTable
import Clases.Venta; //Lllamar a la clase Cliente para instanciar un objeti de tipo Cliente
import java.sql.CallableStatement;
import java.io.*;
public class Ventas extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Ventas() {
        initComponents();
        //Conexion
        //Conexion db= new Conexion();
        //database=db.getConnection();
    }

    //Atributos de conexion
    //Conexion db;
    //Connection database;
    
    //Atributo de consulta
    String SQL;
    
    //Atributo cedula que almacena la cedula buscada
    String ID=null;
    
    //Objeto venta creado al consultar una cedula/venta en especifico, es para transmitirlo al JFrame que modifica, en caso de que vaya a modificar un venta
    Venta sell;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TXT_ID = new javax.swing.JTextField();
        TODO = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        INSERTAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VENTAS = new javax.swing.JTable();
        IMPRIMIR = new javax.swing.JButton();
        NombreDeTienda = new javax.swing.JLabel();
        BACK = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        TODO.setBackground(new java.awt.Color(255, 255, 204));
        TODO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TODO.setText("Ver Todo");
        TODO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TODOMouseClicked(evt);
            }
        });

        BUSCAR.setBackground(new java.awt.Color(255, 255, 204));
        BUSCAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BUSCAR.setText("Buscar");
        BUSCAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BUSCARMouseClicked(evt);
            }
        });
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        MODIFICAR.setBackground(new java.awt.Color(255, 255, 204));
        MODIFICAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MODIFICAR.setText("Modificar");
        MODIFICAR.setVisible(false);
        MODIFICAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MODIFICARMouseClicked(evt);
            }
        });
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });

        ELIMINAR.setBackground(new java.awt.Color(255, 255, 204));
        ELIMINAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ELIMINAR.setText("Eliminar");
        ELIMINAR.setVisible(false);
        ELIMINAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ELIMINARMouseClicked(evt);
            }
        });
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        INSERTAR.setBackground(new java.awt.Color(255, 255, 204));
        INSERTAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        INSERTAR.setText("Insertar");
        INSERTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INSERTARMouseClicked(evt);
            }
        });
        INSERTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTARActionPerformed(evt);
            }
        });

        VENTAS.setBackground(new java.awt.Color(0, 204, 204));
        VENTAS.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        VENTAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Monto", "Productos", "Cantidades", "Método de Pago", "Comprador", "Vendedor", "Fecha"
            }
        ));
        VENTAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VENTASMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(VENTAS);

        IMPRIMIR.setBackground(new java.awt.Color(255, 255, 204));
        IMPRIMIR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        IMPRIMIR.setText("Imprimir");
        IMPRIMIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IMPRIMIRMouseClicked(evt);
            }
        });

        NombreDeTienda.setBackground(new java.awt.Color(255, 255, 255));
        NombreDeTienda.setFont(new java.awt.Font("Edwardian Script ITC", 1, 60)); // NOI18N
        NombreDeTienda.setForeground(new java.awt.Color(255, 255, 255));
        NombreDeTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreDeTienda.setText("Tienda La Moda");

        BACK.setFont(new java.awt.Font("Bell MT", 0, 40)); // NOI18N
        BACK.setForeground(new java.awt.Color(255, 255, 153));
        BACK.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BACK.setText("«");
        BACK.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BACK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("VENTAS");

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

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MODIFICAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ELIMINAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IMPRIMIR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(INSERTAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TODO))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BACK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(NombreDeTienda)
                            .addComponent(jLabel3))
                        .addGap(169, 169, 169)
                        .addComponent(EXIT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TXT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BUSCAR)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreDeTienda)
                    .addComponent(EXIT)
                    .addComponent(BACK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUSCAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MODIFICAR)
                    .addComponent(ELIMINAR)
                    .addComponent(TODO)
                    .addComponent(IMPRIMIR)
                    .addComponent(INSERTAR))
                .addGap(12, 12, 12))
        );

        IMPRIMIR.setVisible(false);

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

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void TODOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TODOMouseClicked
        ID=null; //Cedula null al mostrar todos los ventas
        
        
        String []datos=new String[8]; //Vector/lista para insertarlas en el JTable
        try{
            //Creación del modelo del JTable
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Monto");
            modelo.addColumn("Productos");
            modelo.addColumn("Cantidades");
            modelo.addColumn("Método de Pago");
            modelo.addColumn("Comprador");
            modelo.addColumn("Vendedor");
            modelo.addColumn("Fecha");
            
            CallableStatement ver = General.database.prepareCall("{call VER_VENTAS(?)}");
            ver.registerOutParameter(1, Types.REF_CURSOR);
            ver.execute();
            ResultSet rs=(ResultSet)ver.getObject(1);
            
            while(rs.next()){ //Se repite hasta que no haya ventas
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(8);
                datos[4]=rs.getString(4);
                datos[5]=rs.getString(5);
                datos[6]=rs.getString(6);
                datos[7]=rs.getString(7);
                modelo.addRow(datos); //Añadimos fila al modelo del Jtable
            }
            //Al finalizar bucle insertar el modelo en el Jtable
            VENTAS.setModel(modelo);
            
            //Ocultamos los botones de modificar/eliminar ya que se muestran todos los ventas
            MODIFICAR.setVisible(false);
            ELIMINAR.setVisible(false);
            IMPRIMIR.setVisible(false);
            //Cierro lo utilizado
            rs.close();
            ver.close();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al actualizar tabla", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_TODOMouseClicked

    private void BUSCARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUSCARMouseClicked
        ID= TXT_ID.getText();
        
        
        String []datos=new String[8]; //Vector de datos
        try{
            //Jtable
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Monto");
            modelo.addColumn("Productos");
            modelo.addColumn("Cantidades");
            modelo.addColumn("Método de Pago");
            modelo.addColumn("Comprador");
            modelo.addColumn("Vendedor");
            modelo.addColumn("Fecha");
            
            CallableStatement buscar = General.database.prepareCall("{call BUSCAR_VENTA(?,?)}");
            buscar.setInt(1, Integer.parseInt(ID));
            buscar.registerOutParameter(2, Types.REF_CURSOR);
            buscar.execute();
            ResultSet rs=(ResultSet)buscar.getObject(2);
            while(rs.next()){ 
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(8);
                datos[4]=rs.getString(4);
                datos[5]=rs.getString(5);
                datos[6]=rs.getString(6);
                datos[7]=rs.getString(7);
                //Creo objeto de clase Cliente con los datos obtenidos
                sell= new Venta(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
                modelo.addRow(datos); //Inserto fila al modelo
            }
            //Actualizo modelo de JTable
            VENTAS.setModel(modelo);
            
            //Muestro botones de modificar/eliminar
            MODIFICAR.setVisible(true);
            ELIMINAR.setVisible(true);
            IMPRIMIR.setVisible(true);
            
            //Cierro lo utilizado
            rs.close();
            buscar.close();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al actualizar tabla", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BUSCARMouseClicked

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BUSCARActionPerformed

    private void MODIFICARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFICARMouseClicked
        Modificar_Venta ventana=new Modificar_Venta(sell); //Al instanciar la ventana se le pasa un objeto venta (El creado al buscar)
        ventana.setVisible(true); 
        ventana.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_MODIFICARMouseClicked

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void ELIMINARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELIMINARMouseClicked
        int opt= JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar a esta venta?", "ADVERTENCIA",JOptionPane.YES_NO_OPTION);
        if (opt==JOptionPane.YES_OPTION) {
            try{
            //Preparar consulta de eliminar usuario
           CallableStatement eliminar = General.database.prepareCall("{call ELIMINAR_VENTA("+ID+")}");
           eliminar.executeUpdate(); //Ejecución de consulta
           JOptionPane.showMessageDialog(null, "Venta eliminada con exito");
           this.TODOMouseClicked(evt); //Aplica lo que sucede al precionar mostrar todos
       }
       catch(Exception EX){
           System.out.println("ERROR AL ELIMINAR "+EX);
       }
        }
        
        
    }//GEN-LAST:event_ELIMINARMouseClicked

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void INSERTARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INSERTARMouseClicked
       Insertar_Venta ventana = new Insertar_Venta();
       
       ventana.setVisible(true);
       ventana.setLocationRelativeTo(null);
       this.setVisible(false);
    }//GEN-LAST:event_INSERTARMouseClicked

    private void VENTASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VENTASMouseClicked
        try{
           ID=VENTAS.getValueAt(VENTAS.getSelectedRow(), 0).toString();
           
           CallableStatement buscar = General.database.prepareCall("{call BUSCAR_VENTA(?,?)}");
           buscar.setInt(1, Integer.parseInt(ID));
           buscar.registerOutParameter(2, Types.REF_CURSOR);
           buscar.execute();
           ResultSet rs=(ResultSet)buscar.getObject(2);
           
           rs.next();
           sell= new Venta(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
           MODIFICAR.setVisible(true);
           ELIMINAR.setVisible(true);
           IMPRIMIR.setVisible(true);
            }
            catch(Exception ex){
                System.out.println("fallo" + ex);
                MODIFICAR.setVisible(false);
                ELIMINAR.setVisible(false);
                IMPRIMIR.setVisible(false);
            }
    }//GEN-LAST:event_VENTASMouseClicked

    private void IMPRIMIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMPRIMIRMouseClicked
        String ruta="Facturas/"+ID+".txt";
        String contenido="FACTURA "+ID+"\n";
       
        
        try{
            FileWriter F= new FileWriter(ruta,false);
            BufferedWriter B= new BufferedWriter(F);
            PrintWriter P= new PrintWriter(B);
            CallableStatement buscar = General.database.prepareCall("{call BUSCAR_VENTA(?,?)}");
            buscar.setInt(1, Integer.parseInt(ID));
            buscar.registerOutParameter(2, Types.REF_CURSOR);
            buscar.execute();
            ResultSet rs=(ResultSet)buscar.getObject(2);
            rs.next();
            B.write(contenido);
            B.newLine();B.newLine();
            B.write("\nMonto: "+rs.getString(2)); B.newLine();
            B.write("\nProductos: \n"+rs.getString(3)); B.newLine();
            B.write("\nMetodo de pago: "+rs.getString(4)); B.newLine(); B.newLine();
            B.write("\n\nComprador: "+rs.getString(5)); B.newLine();
            String vendedor=rs.getString(6); 
            String fecha=rs.getString(7); 
            CallableStatement buscar2 = General.database.prepareCall("{call BUSCAR_CLIENTE(?,?)}");
            buscar2.setInt(1, Integer.parseInt(rs.getString(5)));
            buscar2.registerOutParameter(2, Types.REF_CURSOR);
            buscar2.execute();
            ResultSet rs2=(ResultSet)buscar2.getObject(2);
            rs.close();
            buscar.close();
            
            
            rs2.next();
            B.write("\nNombre: "+rs2.getString(1));B.newLine();
            B.write("\nTelefono: "+rs2.getString(2));B.newLine();
            B.write("\nCorreo: "+rs2.getString(3));B.newLine();B.newLine();
            rs2.close();
            buscar2.close();
            B.write("\n\nVendedor: "+vendedor);B.newLine();
            CallableStatement buscar3 = General.database.prepareCall("{call BUSCAR_EMPLEADO(?,?)}");
            buscar3.setInt(1, Integer.parseInt(vendedor));
            buscar3.registerOutParameter(2, Types.REF_CURSOR);
            buscar3.execute();
            ResultSet rs3=(ResultSet)buscar3.getObject(2);
            rs3.next();
            B.write("\nNombre: "+rs3.getString(1));B.newLine();
            B.write("\nPuesto: "+rs3.getString(2));B.newLine();B.newLine();
            rs3.close();
            buscar3.close();
            
            B.write("\n\nFecha: "+fecha);
            B.close();
        }
        catch(Exception ex){
            System.out.println("ERROR AL GENERAR FACTURA "+ex);
        }
    }//GEN-LAST:event_IMPRIMIRMouseClicked

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        Main_Menu ventana = new Main_Menu();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BACKMouseClicked

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        exit(0);
    }//GEN-LAST:event_EXITMouseClicked

    private void INSERTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INSERTARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JLabel EXIT;
    private javax.swing.JButton IMPRIMIR;
    private javax.swing.JButton INSERTAR;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JLabel NombreDeTienda;
    private javax.swing.JButton TODO;
    private javax.swing.JTextField TXT_ID;
    private javax.swing.JTable VENTAS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
