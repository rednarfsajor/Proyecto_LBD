package Clases;

public class EmpleadoU extends Empleado implements Interfaz {

    protected String login, password;

    public EmpleadoU(String tipo, String cedula, String nombre, String telefono, String direccion, String correo, String puesto, String salario, String login, String password) {
        super(tipo, cedula, nombre, telefono, direccion, correo, puesto, salario);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

}
