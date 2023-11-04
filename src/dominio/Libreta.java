package dominio;
import java.util.ArrayList;
import java.util.List;
public class Libreta {
    private String nombre;
    private List<Contacto> contactos;
//es una funcion
public void add(Contacto c){
    contactos.add(c);
}
public List<Contacto> getContactos(){
    return contactos;
}

public int contarContactos(){
    return contactos.size();
}
public Libreta borrarContacto(Contacto c){
    contactos.remove(c);
    return this;
}
   public Libreta(String nombre){
        //nuevo contacto
        this.nombre = nombre;
       contactos = new ArrayList<>();
    }
//tambien se puede pasar objetos, void te crea te crea una funcion q no te obliga a devolver un valor

    public void anadirContacto(Contacto contacto){
        this.contactos.add(contacto);
    }

    @Override
    public String toString() {
        String result = ( "Libreta [nombre=" + nombre + ", contactos=" + contactos + "]");
        return result;
    }
 

    

    
}


