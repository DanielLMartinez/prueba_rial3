
package com.mycompany.prueba3.Veterinaria;

public abstract class Persona  {
    private String rut;
    private String nombreCompleto;
    private String direccion;
    private String comuna;
    private String telefono;
    private String correo;

    public Persona(String rut, String nombreCompleto, String direccion, String comuna, String telefono, String correo) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public Persona(){
        this.rut = "";
        this.nombreCompleto = "";
        this.direccion = "";
        this.comuna = "";
        this.telefono = "";
        this.correo = "";
    
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
