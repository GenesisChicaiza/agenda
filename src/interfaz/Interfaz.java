package interfaz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List; 
import dominio.Contacto;
import dominio.Libreta;

public class Interfaz{

  //  public Interfaz(){
   /*  ObjectInputStream obj;
    File file = new File("contactos.txt");
    try{
        obj = new ObjectInputStream(new FileInputStream(file));
        try{contactos = (ArrayList<Contacto>)obj.readObject();}catch(Exception e){System.out.println(e);}
        obj.close();
        System.out.println("leido");
    } catch(Exception e){
        System.out.println("no leido");
        contactos = new ArrayList<>();
    }
ObjectOutputStream obj;
            File file = new File("contactos.txt");
            try{
            obj = new ObjectOutputStream(new FileOutputStream(file));
                    obj.writeObject(contactos);
                    obj.close();
                    System.out.println("Guardado");
                } catch(Exception e){
                System.out.println("Error al guardar");
                System.out.println(e);
                };
*/
 //   }
    public static void ejecutar(String[] instruccion, Libreta libreta) {
        if (instruccion[0].equalsIgnoreCase("mostrar" )&& instruccion.length == 1){
            mostrarLibreta(libreta);
        } else if (instruccion[0].equalsIgnoreCase("añadir") && instruccion.length == 3) {
            Contacto nuevoContacto = new Contacto(instruccion[1], Integer.parseInt(instruccion[2]));
            libreta.add(nuevoContacto);
            System.out.println("Contacto añadido correctamente");

        }else {
            System.out.println("Error en la instruccion");
        }
   
    }  
    private static void mostrarLibreta(Libreta libreta) {
        List<Contacto> contactos = libreta.getContactos();

        for(Contacto contacto : contactos) { 
            System.out.println("Nombre: " + contacto.getNombre() + "numero de Telefono: " + contacto.getnumeroDeTelefono());

        }
        System.out.println("El número total de contactos: "+ libreta.contarContactos());
    }


}
