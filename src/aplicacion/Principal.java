package aplicacion;
import dominio.Libreta;
import interfaz.*;
import dominio.Contacto;

public class Principal{
    public static void main(String[] args) {
        Libreta libreta = new Libreta(" Mi Libreta");

        String[] instruccion1 = {"añadir", "Juan ", "654213456"};
        Interfaz.ejecutar(instruccion1,libreta);

        String[] instruccion2 = {"mostrar"};
        Interfaz.ejecutar(instruccion2,libreta);
    }
}
