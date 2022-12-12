
package UTILS;

import com.mycompany.prueba3.Veterinaria.Cliente;
import com.mycompany.prueba3.Veterinaria.Mascota;
import com.mycompany.prueba3.Veterinaria.Persona;
import java.util.ArrayList;
import java.util.List;

public class Icliente {
     List<Persona> lista = new ArrayList<>();
    
    public void Guardar(Cliente obj){
        lista.add(obj);
    }
    
    public List<Persona> Listar(){
        return lista;
    }
    
    public Persona Buscar(int id){
        for(Persona e : lista){
            if(e.getRut()== id){
                return e;
            }
        }
        return null;
    }
}
}
