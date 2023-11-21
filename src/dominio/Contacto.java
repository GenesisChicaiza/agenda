package dominio;

import java.io.Serializable;

public class Contacto implements Serializable{
    private String nombre;
    private int numeroDeTelefono;
    private Object nombres;


public boolean equals(Object obj){
    Contacto c = (Contacto)obj;
    return nombre.equals(c.nombres);
}
public Contacto (String n, int t){
 nombre = n;
 numeroDeTelefono = t;
}

public String getNombre(){
    return nombre;
}
public void setNombre(String n){
    nombre = n;
}

public int getnumeroDeTelefono(){
    return numeroDeTelefono;
}

public void setnumeroDeTelefono(int t){
    numeroDeTelefono = t;
}

@Override
public String toString(){
    String result =  (" Nombre " + nombre + " Numero de telefono " + numeroDeTelefono);
    return result;
}
public static void remove(Contacto c) {
}

}