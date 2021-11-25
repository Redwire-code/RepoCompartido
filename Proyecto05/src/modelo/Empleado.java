package modelo;

import java.util.GregorianCalendar;


public class Empleado {
    
    private int numero;
    private String nombre;
    private String apellido;
    private String foto;
    private float sueldo;
    private float sueldoMaximo;
    private GregorianCalendar fechaAlta;

    public Empleado() {
    }

    public Empleado(int numero, String nombre, String apellido, String foto, float sueldo, float sueldoMaximo, GregorianCalendar fechaAlta) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
        this.sueldo = sueldo;
        this.sueldoMaximo = sueldoMaximo;
        this.fechaAlta = fechaAlta;
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldoMaximo() {
        return sueldoMaximo;
    }

    public void setSueldoMaximo(float sueldoMaximo) {
        this.sueldoMaximo = sueldoMaximo;
    }

    public GregorianCalendar getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(GregorianCalendar fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    
}
