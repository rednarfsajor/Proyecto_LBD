package Clases;

public class Persona {

    protected String tipo;
    protected String cedula, nombre;

    public Persona(String tipo, String cedula, String nombre) {
        this.tipo = tipo;
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}
