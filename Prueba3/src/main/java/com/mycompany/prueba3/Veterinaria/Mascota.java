
package com.mycompany.prueba3.Veterinaria;

public class Mascota extends Cliente{
    private int codigoMicrochip;
    private String nombre;
    private String fechaNacimiento;
    private String raza;
    private String especie;
    private String descripcionMascota;

    public Mascota(int codigoMicrochip, String nombre, String fechaNacimiento, String raza, String especie, String descripcionMascota, boolean empresa, String rut, String nombreCompleto, String direccion, String comuna, String telefono, String correo) {
        super(empresa, rut, nombreCompleto, direccion, comuna, telefono, correo);
        this.codigoMicrochip = codigoMicrochip;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.raza = raza;
        this.especie = especie;
        this.descripcionMascota = descripcionMascota;
    }
    
    public Mascota (){
        super();
        this.codigoMicrochip = 0;
        this.nombre = "";
        this.fechaNacimiento = "";
        this.raza = "";
        this.especie = "";
        this.descripcionMascota = "";
    }

    public int getCodigoMicrochip() {
        return codigoMicrochip;
    }

    public void setCodigoMicrochip(int codigoMicrochip) {
        this.codigoMicrochip = codigoMicrochip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDescripcionMascota() {
        return descripcionMascota;
    }

    public void setDescripcionMascota(String descripcionMascota) {
        this.descripcionMascota = descripcionMascota;
    }
    @Override
    public String toString(){
        return
                "La mascota llamada"+
                this.getNombre()+
                ",Nacido el:"+
                this.getFechaNacimiento()+
                ", De raza:"+
                this.getRaza()+
                ",De especie:"+
                this.getEspecie()
                ;
    
    
    }
}
    
    

    

