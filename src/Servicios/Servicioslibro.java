/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ejerc1.Libro;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Servicioslibro {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    Libro a1 = new Libro();
    public void cargardatosLibro() {
        
        System.out.println("Ingrese le nombre del autor: ");
        a1.setAutor(leer.next());
        System.out.println("Ingrese el ISBN: ");
        a1.setISBN(leer.nextInt());
        System.out.println("Ingrese el Tìtulo: ");
        a1.setTitulo(leer.next());
        System.out.println("Ingrese el numero de paginas: ");
        a1.setNumerodepaginas(leer.nextInt());
        
    }
   public void Mostrar() {
       System.out.println("El nombre del Autor es: "+a1.getAutor());
       System.out.println("El numero de ISBN es: "+a1.getISBN());
       System.out.println("El Titulo es: "+a1.getTitulo());
       System.out.println("El numero de paginas es: "+a1.getNumerodepaginas());
    }

    
}
