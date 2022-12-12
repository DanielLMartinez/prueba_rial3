
package com.mycompany.prueba3.Veterinaria;

public class Animal {
    private int codigoMicrochip;
    private String nombre;
    private String fechaNacimiento;
    private String raza;
    private String especie;

    public Animal(int codigoMicrochip, String nombre, String fechaNacimiento, String raza, String especie) {
        this.codigoMicrochip = codigoMicrochip;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.raza = raza;
        this.especie = especie;
    }
    
    public Animal(){
        this.codigoMicrochip = 0;
        this.nombre = "";
        this.fechaNacimiento = "";
        this.raza = "";
        this.especie = "";
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
    
}
