
package Modulos.Venta;

//Librerias para crear conexion y para insertar datos en la base de datos

import Modulos.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static java.lang.System.exit;

public class Insertar_Venta extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Insertar_Venta() {
        initComponents();
        //Lo siguiente siempre si va a hacer igual para cada JFrame que se conectará a la base de datos
        //Conexion db= new Conexion();
        //database=db.getConnection();
        productos();
    }

    //Atributos de conexion utilizados al iniciar el JFrame
    //Conexion db;
    //Connection database;
    
    private void productos(){
        
            try{
            Statement state=General.database.createStatement();
            
            ResultSet result=state.executeQuery("SELECT codigo FROM productos"); //Ejecución de consulta
            while(result.next()){
                PRODUCTOS.add(result.getString(1));
            }
            result.close();
            }
            catch(Exception EX){
                
            }
    }
    int Inventario[];
    private boolean Validar(){
        int i=0;
        boolean val=false;
        Inventario=new int[Productos.length];
        for (String item:Productos) {
            try{
                Statement state=General.database.createStatement();
            
                ResultSet result=state.executeQuery("SELECT cantidad FROM productos WHERE(codigo='"+item+"')");
                result.next();
                int cant=Integer.parseInt(result.getString(1));
                Inventario[i]=cant;
                if(cant>=Cantidades[i]){
                    val=true;
                }
                else{
                    return false;
                }
            }
            catch(Exception ex){
                return false;
            }
            i++;
        }
        return val;
    }
    public void setMonto(){
        int monto=0;
        for (int num:Precios) {
            monto+=num;
        }
        TXT_MONTO.setText(String.valueOf(monto));
    }
    String[] Productos=null;
    int[] Precios=null;
    int[] Cantidades=null;
    
    public String[] getProductos() {
        return Productos;
    }

    public void setProductos(String[] Productos) {
        this.Productos = Productos;
    }

    public int[] getPrecios() {
        return Precios;
    }

    public void setPrecios(int[] Precios) {
        this.Precios = Precios;
    }
    
    
    private void getComprador(){
        try{
        String SQL = "SELECT nombre,telefono,correo FROM clientes WHERE (cedula='"+TXT_COMPRADOR.getText()+"')";
        Statement state=General.database.createStatement();
        ResultSet result=state.executeQuery(SQL);
        result.next();
            if (result.getString(1).isBlank()) {
                TXT_NOMBRE_COMPRADOR.setText("");
                TXT_TELEFONO.setText("");
                TXT_CORREO.setText("");
            }
            else{
                TXT_NOMBRE_COMPRADOR.setText(result.getString(1));
                TXT_TELEFONO.setText(result.getString(2));
                TXT_CORREO.setText(result.getString(3));
            }
        
        }
        catch(Exception ex){
            TXT_NOMBRE_COMPRADOR.setText("");
            TXT_TELEFONO.setText("");
            TXT_CORREO.setText("");
        }
    }
    
    private void getVendedor(){
        try{
        String SQL = "SELECT nombre,puesto FROM empleados WHERE (cedula='"+TXT_VENDEDOR.getText()+"')";
        Statement state=General.database.createStatement();
        ResultSet result=state.executeQuery(SQL);
        result.next();
            if (result.getString(1).isBlank()) {
                TXT_NOMBRE_VENDEDOR.setText("");
                TXT_PUESTO.setText("");
            }
            else{
                TXT_NOMBRE_VENDEDOR.setText(result.getString(1));
                TXT_PUESTO.setText(result.getString(2));
            }
        
        }
        catch(Exception ex){
            TXT_NOMBRE_VENDEDOR.setText("");
            TXT_PUESTO.setText("");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TXT_MONTO = new javax.swing.JTextField();
        TXT_COMPRADOR = new javax.swing.JTextField();
        TXT_FECHA = new javax.swing.JTextField();
        TXT_VENDEDOR = new javax.swing.JTextField();
        COMBO_PAGO = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LIMPIAR = new javax.swing.JButton();
        CREAR = new javax.swing.JButton();
        PRODUCTOS = new java.awt.List();
        jLabel7 = new javax.swing.JLabel();
        TXT_NOMBRE_COMPRADOR = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TXT_PUESTO = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TXT_NOMBRE_VENDEDOR = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TXT_TELEFONO = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TXT_CORREO = new javax.swing.JTextField();
        VER = new javax.swing.JButton();
        CANTIDADES = new javax.swing.JButton();
        NombreDeTienda = new javax.swing.JLabel();
        BACK = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        TXT_MONTO.setEditable(false);
        TXT_MONTO.setEnabled(false);

        TXT_COMPRADOR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_COMPRADORFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_COMPRADORFocusLost(evt);
            }
        });
        TXT_COMPRADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_COMPRADORActionPerformed(evt);
            }
        });
        TXT_COMPRADOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_COMPRADORKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_COMPRADORKeyTyped(evt);
            }
        });

        TXT_VENDEDOR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXT_VENDEDORFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_VENDEDORFocusLost(evt);
            }
        });
        TXT_VENDEDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_VENDEDORActionPerformed(evt);
            }
        });
        TXT_VENDEDOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_VENDEDORKeyReleased(evt);
            }
        });

        COMBO_PAGO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "SINPE" }));
        COMBO_PAGO.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Monto");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Método de Pago");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Seleccione los Productos");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Cédula del Comprador");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Fecha(dd/mm/aaaa)");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Cédula del Vendedor");

        LIMPIAR.setBackground(new java.awt.Color(255, 255, 204));
        LIMPIAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LIMPIAR.setText("Limpiar");
        LIMPIAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LIMPIARMouseClicked(evt);
            }
        });
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        CREAR.setBackground(new java.awt.Color(255, 255, 204));
        CREAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CREAR.setText("Crear");
        CREAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CREARMouseClicked(evt);
            }
        });

        PRODUCTOS.setMultipleMode(true);
        PRODUCTOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRODUCTOSMouseClicked(evt);
            }
        });
        PRODUCTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRODUCTOSActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Nombre Completo");

        TXT_NOMBRE_COMPRADOR.setEditable(false);
        TXT_NOMBRE_COMPRADOR.setEnabled(false);
        TXT_NOMBRE_COMPRADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NOMBRE_COMPRADORActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 204));
        jLabel9.setText("Puesto");

        TXT_PUESTO.setEditable(false);
        TXT_PUESTO.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Nombre Completo");

        TXT_NOMBRE_VENDEDOR.setEditable(false);
        TXT_NOMBRE_VENDEDOR.setEnabled(false);
        TXT_NOMBRE_VENDEDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NOMBRE_VENDEDORActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 204));
        jLabel10.setText("Teléfono");

        TXT_TELEFONO.setEditable(false);
        TXT_TELEFONO.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 204));
        jLabel11.setText("Correo");

        TXT_CORREO.setEditable(false);
        TXT_CORREO.setEnabled(false);

        VER.setBackground(new java.awt.Color(255, 255, 204));
        VER.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        VER.setText("Ver Lista de Productos");
        VER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VERMouseClicked(evt);
            }
        });
        VER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VERActionPerformed(evt);
            }
        });

        CANTIDADES.setBackground(new java.awt.Color(255, 255, 204));
        CANTIDADES.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CANTIDADES.setText("Definir Cantidades");
        CANTIDADES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CANTIDADESMouseClicked(evt);
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

        jLabel12.setFont(new java.awt.Font("Bell MT", 1, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 153));
        jLabel12.setText("VENTAS");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(COMBO_PAGO, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(TXT_MONTO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(VER))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CANTIDADES))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(TXT_NOMBRE_COMPRADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(TXT_COMPRADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel11))
                                            .addGap(12, 12, 12)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TXT_CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TXT_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(LIMPIAR))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(TXT_FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(12, 12, 12)
                                        .addComponent(TXT_NOMBRE_VENDEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXT_VENDEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXT_PUESTO, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CREAR, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 134, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BACK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EXIT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(NombreDeTienda)
                            .addComponent(jLabel12))
                        .addGap(212, 212, 212)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreDeTienda)
                    .addComponent(EXIT)
                    .addComponent(BACK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_MONTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(VER))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(PRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(CANTIDADES)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COMBO_PAGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_COMPRADOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_NOMBRE_COMPRADOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TXT_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TXT_CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TXT_VENDEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_NOMBRE_VENDEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_PUESTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(TXT_FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CREAR)
                    .addComponent(LIMPIAR))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        TXT_MONTO.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
    }//GEN-LAST:event_jPanel1MouseClicked

    private void CREARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CREARMouseClicked
       if(PRODUCTOS.getSelectedItems().length!=0&&!TXT_NOMBRE_COMPRADOR.getText().isBlank()&&!TXT_NOMBRE_VENDEDOR.getText().isBlank()&&!TXT_FECHA.getText().isBlank()&&!TXT_MONTO.getText().matches("0")){
           if (Validar()) {
              try{
                //Insertar sera la variable de tipo Prepared Statemnte obtenida de la conexin de base de datos con la consulta INSERT INTO
               PreparedStatement insertar= General.database.prepareStatement("INSERT INTO ventas(monto,productos,pago,comprador,vendedor,fecha,cantidades) VALUES (?,?,?,?,?,?,?)");
               //Tomo los datos de cada TXT para insertarlo en la base de datos junto con la sentencia SQL
               insertar.setString(1, TXT_MONTO.getText());
               String productos="";
               String[] lista = PRODUCTOS.getSelectedItems();
               for (String i:lista) {
                    productos+=i+",";
                    
               }
               insertar.setString(2, productos);
               insertar.setString(3, COMBO_PAGO.getSelectedItem().toString());
               insertar.setString(4, TXT_COMPRADOR.getText());
               insertar.setString(5, TXT_VENDEDOR.getText());
               insertar.setString(6, TXT_FECHA.getText());
               productos="";
                  for (int i:Cantidades) {
                      productos+=String.valueOf(i)+",";
                  }
               insertar.setString(7, productos); 
               //Variable para saber si la ejecución se realiza correctamente
               int A=insertar.executeUpdate(); //ExecuteUpdate() realiza la sentencia INSERT INTO + datos de TXT en la base de datos y la actualiza y retorna un valor de acuerdo al exito 
               if (A>0) { //Si fue exitoso
                   insertar.close();
                   int i=0;
                   for (int num:Cantidades) {
                       num=Inventario[i]-num;
                       PreparedStatement modificar = General.database.prepareStatement("UPDATE productos SET cantidad='"+num+"' WHERE codigo='"+Productos[i]+"'");
                       modificar.executeUpdate();
                       modificar.close();
                       i++;
                   }
                   JOptionPane.showMessageDialog(null, "Registro exitoso");
                   this.BACKMouseClicked(evt);
               }
               else{//Si fallo el insertar cliente
                   JOptionPane.showMessageDialog(null, "Registro fallido");
               }
           }

           catch(Exception ex){
              JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR VENTA (" + ex + ")", "AVISO", JOptionPane.ERROR_MESSAGE); 
           } 
           }
           else{
               JOptionPane.showMessageDialog(null, "Se ha ingresado cantidades de productos que excenden el inventario", "AVISO", JOptionPane.WARNING_MESSAGE);
           }
       }
       else{
           JOptionPane.showMessageDialog(null, "Los datos ingresados no son válidos", "AVISO", JOptionPane.WARNING_MESSAGE);
       }
        
        
    }//GEN-LAST:event_CREARMouseClicked

    private void LIMPIARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIMPIARMouseClicked
        TXT_MONTO.setText("0");
        int[] S =PRODUCTOS.getSelectedIndexes();
        for (int i:S) {
            PRODUCTOS.deselect(i);
        }
        TXT_COMPRADOR.setText("");
        TXT_VENDEDOR.setText("");
        TXT_FECHA.setText("");
        COMBO_PAGO.setSelectedIndex(0);
        Productos=null;
        Precios=null;
        Cantidades=null;
    }//GEN-LAST:event_LIMPIARMouseClicked

    private void TXT_NOMBRE_COMPRADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NOMBRE_COMPRADORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NOMBRE_COMPRADORActionPerformed

    private void TXT_NOMBRE_VENDEDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NOMBRE_VENDEDORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NOMBRE_VENDEDORActionPerformed

    private void TXT_COMPRADORFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_COMPRADORFocusLost
        getComprador();
    }//GEN-LAST:event_TXT_COMPRADORFocusLost

    private void TXT_COMPRADORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_COMPRADORKeyTyped
        getComprador();
    }//GEN-LAST:event_TXT_COMPRADORKeyTyped

    private void TXT_COMPRADORKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_COMPRADORKeyReleased
        getComprador();
    }//GEN-LAST:event_TXT_COMPRADORKeyReleased

    private void TXT_COMPRADORFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_COMPRADORFocusGained
        getComprador();
    }//GEN-LAST:event_TXT_COMPRADORFocusGained

    private void TXT_VENDEDORFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_VENDEDORFocusGained
        getVendedor();
    }//GEN-LAST:event_TXT_VENDEDORFocusGained

    private void TXT_VENDEDORFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_VENDEDORFocusLost
        getVendedor();
    }//GEN-LAST:event_TXT_VENDEDORFocusLost

    private void TXT_VENDEDORKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_VENDEDORKeyReleased
        getVendedor();
    }//GEN-LAST:event_TXT_VENDEDORKeyReleased

    private void TXT_VENDEDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_VENDEDORActionPerformed
        getVendedor();
    }//GEN-LAST:event_TXT_VENDEDORActionPerformed

    private void TXT_COMPRADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_COMPRADORActionPerformed
        getComprador();
    }//GEN-LAST:event_TXT_COMPRADORActionPerformed

    private void VERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VERMouseClicked
        Lista_Productos ventana  = new Lista_Productos();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_VERMouseClicked

    private void PRODUCTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRODUCTOSActionPerformed
        
        
    }//GEN-LAST:event_PRODUCTOSActionPerformed

    private void PRODUCTOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRODUCTOSMouseClicked
        
        Productos=PRODUCTOS.getSelectedItems();
    }//GEN-LAST:event_PRODUCTOSMouseClicked

    private void CANTIDADESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CANTIDADESMouseClicked
        
        if (Productos!=null) {
            Carrito ventana = new Carrito(this);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_CANTIDADESMouseClicked

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        Main_Menu ventana = new Main_Menu();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BACKMouseClicked

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        exit(0);
    }//GEN-LAST:event_EXITMouseClicked

    private void VERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VERActionPerformed

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
            java.util.logging.Logger.getLogger(Insertar_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Insertar_Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JButton CANTIDADES;
    private javax.swing.JComboBox<String> COMBO_PAGO;
    private javax.swing.JButton CREAR;
    private javax.swing.JLabel EXIT;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JLabel NombreDeTienda;
    private java.awt.List PRODUCTOS;
    private javax.swing.JTextField TXT_COMPRADOR;
    private javax.swing.JTextField TXT_CORREO;
    private javax.swing.JTextField TXT_FECHA;
    private javax.swing.JTextField TXT_MONTO;
    private javax.swing.JTextField TXT_NOMBRE_COMPRADOR;
    private javax.swing.JTextField TXT_NOMBRE_VENDEDOR;
    private javax.swing.JTextField TXT_PUESTO;
    private javax.swing.JTextField TXT_TELEFONO;
    private javax.swing.JTextField TXT_VENDEDOR;
    private javax.swing.JButton VER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
