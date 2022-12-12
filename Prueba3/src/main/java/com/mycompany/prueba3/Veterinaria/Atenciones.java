
package com.mycompany.prueba3.Veterinaria;

public class Atenciones extends Mascota{
    
    private String fecha;
    private String medico;
    private String mascota;
    private String procedimiento;
    private String observaciones;
    private int valor;

    public Atenciones(String fecha, String medico, String mascota, String procedimiento, String observaciones, int valor, int codigoMicrochip, String nombre, String fechaNacimiento, String raza, String especie, String descripcionMascota, boolean empresa, String rut, String nombreCompleto, String direccion, String comuna, String telefono, String correo) {
        super(codigoMicrochip, nombre, fechaNacimiento, raza, especie, descripcionMascota, empresa, rut, nombreCompleto, direccion, comuna, telefono, correo);
        this.fecha = fecha;
        this.medico = medico;
        this.mascota = mascota;
        this.procedimiento = procedimiento;
        this.observaciones = observaciones;
        this.valor = valor;
    }

   public Atenciones(){
       super();
       this.fecha = "";
       this.medico = "";
        this.mascota = "";
        this.procedimiento = "";
        this.observaciones = "";
        this.valor = 0;
   
   }
    
    
    
}
