/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc1;

/**
 *
 * @author PC
 */
public class Libro {
    public int numerodepaginas;
    public int ISBN;
    public String Titulo;
    public String Autor;

    public Libro() {
    }

    public Libro(int numerodepaginas, int ISBN, String Titulo, String Autor) {
        this.numerodepaginas = numerodepaginas;
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public int getNumerodepaginas() {
        return numerodepaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setNumerodepaginas(int numerodepaginas) {
        this.numerodepaginas = numerodepaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }


    
        
    }
    

