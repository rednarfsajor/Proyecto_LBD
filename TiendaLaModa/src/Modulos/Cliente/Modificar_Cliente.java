
package Modulos.Cliente;

//Librerias para conexion y modificar cliente
import Modulos.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList; //ArrayList
import javax.swing.JOptionPane;
import Clases.Cliente;
import static java.lang.System.exit;

public class Modificar_Cliente extends javax.swing.JFrame {

    Cliente client;
    public Modificar_Cliente(Cliente client) {
        this.client=client; //Al se crearse la ventana se asocia el cliente a modificar en el atributo
        initComponents();
        //Conexion db= new Conexion();
        //database=db.getConnection();
        getCliente(); //Obtiene los datos del objeto cliente para colocarlo en los TXT editables
    }

    //Atributos de conexion
    //Conexion db;
    //Connection database;
    
    public void getCliente(){ //Metodo para rellenar los TXT con los datos del objeto cliente obtenido al buscarlo
        
        try{
            TXT_CED.setText(client.getCedula());
            TXT_NOMBRE.setText(client.getNombre());
            TXT_TIPO.setText(client.getTipo());
            TXT_TELEFONO.setText(client.getTelefono());
            TXT_DIRECCION.setText(client.getDireccion());
            TXT_CORREO.setText(client.getCorreo());
        }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
    }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TXT_CED = new javax.swing.JTextField();
        TXT_NOMBRE = new javax.swing.JTextField();
        TXT_TELEFONO = new javax.swing.JTextField();
        TXT_CORREO = new javax.swing.JTextField();
        TXT_DIRECCION = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DESHACER = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        TXT_TIPO = new javax.swing.JTextField();
        NombreDeTienda = new javax.swing.JLabel();
        BACK = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        TXT_CED.setEnabled(false);

        TXT_NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NOMBREActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Cédula");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Tipo de Persona");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Nombre Completo");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Dirección");

        DESHACER.setBackground(new java.awt.Color(255, 255, 204));
        DESHACER.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DESHACER.setText("Deshacer");
        DESHACER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DESHACERMouseClicked(evt);
            }
        });
        DESHACER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESHACERActionPerformed(evt);
            }
        });

        MODIFICAR.setBackground(new java.awt.Color(255, 255, 204));
        MODIFICAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MODIFICAR.setText("Modificar");
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

        TXT_TIPO.setEnabled(false);
        TXT_TIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_TIPOActionPerformed(evt);
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
        BACK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setText("CLIENTES");

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
                .addContainerGap()
                .addComponent(BACK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(NombreDeTienda))
                .addGap(185, 185, 185)
                .addComponent(EXIT)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TXT_CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(TXT_DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(DESHACER)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MODIFICAR))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(TXT_CED, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(67, 67, 67))
                                .addComponent(TXT_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TXT_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(225, 225, 225))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreDeTienda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(BACK))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_CED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXT_TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DESHACER)
                    .addComponent(MODIFICAR))
                .addContainerGap(200, Short.MAX_VALUE))
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

    private void TXT_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NOMBREActionPerformed

    private void DESHACERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESHACERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DESHACERActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void MODIFICARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFICARMouseClicked
      if(TXT_CED.getText().length()==9&&!TXT_NOMBRE.getText().isBlank()){
          //Array list para facilitar a la hora de escribir la sentebcia SQL
        ArrayList<String> cliente = new ArrayList();
       
        cliente.add(TXT_NOMBRE.getText());
        cliente.add(TXT_TELEFONO.getText());
        cliente.add(TXT_DIRECCION.getText());
        cliente.add(TXT_CORREO.getText());
          try{
              //Se prepara sentencia SQL
             PreparedStatement modificar = General.database.prepareStatement("UPDATE clientes SET nombre='" + cliente.get(0)+"', telefono='"+ cliente.get(1)+"', direccion='"+ cliente.get(2)+"', correo='"+ cliente.get(3)+"' WHERE cedula='"+ client.getCedula()+"'");
             //Se ejecuta el SQL
             modificar.executeUpdate();
             JOptionPane.showMessageDialog(null, "Cliente modificado con exito");
            //Se devuelve a la ventana de busqueda
            modificar.close(); 
            Clientes ventana = new Clientes();
             ventana.setVisible(true);
             this.setVisible(false);

         }
         catch(Exception EX){
             System.out.println("ERROR AL MODIFICAR CLIENTE "+EX);
         }
      }
      else{
          JOptionPane.showMessageDialog(null, "Los datos ingresados no son válidos", "AVISO", JOptionPane.WARNING_MESSAGE);
      }
        
    }//GEN-LAST:event_MODIFICARMouseClicked

    private void TXT_TIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_TIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_TIPOActionPerformed

    private void DESHACERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DESHACERMouseClicked
        getCliente();
    }//GEN-LAST:event_DESHACERMouseClicked

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        Clientes ventana = new Clientes();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BACKMouseClicked

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        exit(0);
    }//GEN-LAST:event_EXITMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JButton DESHACER;
    private javax.swing.JLabel EXIT;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JLabel NombreDeTienda;
    private javax.swing.JTextField TXT_CED;
    private javax.swing.JTextField TXT_CORREO;
    private javax.swing.JTextField TXT_DIRECCION;
    private javax.swing.JTextField TXT_NOMBRE;
    private javax.swing.JTextField TXT_TELEFONO;
    private javax.swing.JTextField TXT_TIPO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
