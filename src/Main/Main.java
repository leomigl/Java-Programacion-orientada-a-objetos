/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Main;

import Servicios.Servicioslibro;
import ejerc1.Libro;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Servicios.Servicioslibro a1=new Servicios.Servicioslibro();
        a1.cargardatosLibro();
        a1.Mostrar();
    }
    
}
