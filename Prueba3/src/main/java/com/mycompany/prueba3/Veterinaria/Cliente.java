
package com.mycompany.prueba3.Veterinaria;

public class Cliente extends Persona{
    private boolean empresa;

    public Cliente(boolean empresa, String rut, String nombreCompleto, String direccion, String comuna, String telefono, String correo) {
        super(rut, nombreCompleto, direccion, comuna, telefono, correo);
        this.empresa = empresa;
    }
    
    public Cliente(){
        super();
        this.empresa=false;
    }

    public boolean isEmpresa() {
        return empresa;
    }

    public void setEmpresa(boolean empresa) {
        this.empresa = empresa;
    }
    
}
