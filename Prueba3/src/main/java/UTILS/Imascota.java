/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILS;

import com.mycompany.prueba3.Veterinaria.Mascota;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danil
 */
public class Imascota {
    List<Mascota> lista = new ArrayList<>();
    
    public void Guardar(Mascota obj){
        lista.add(obj);
    }
    
    public List<Mascota> Listar(){
        return lista;
    }
    
    public Mascota Buscar(int id){
        for(Mascota e : lista){
            if(e.getCodigoMicrochip()== id){
                return e;
            }
        }
        return null;
    }
}
