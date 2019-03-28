/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpoydiccionarios;

/**
 *
 * @author pc21
 */
public class Libro extends Publicacion implements Prestable {

    boolean prestado = false;


    public Libro(String i, String t, int f) {
        this.ISBN = i;
        this.titulo = t;
        this.fecha = f;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }


    @Override
    public void presta() {
        if (prestado) {
            System.out.println("ese libro ya esta prestado.");
        } else {
            prestado = true;
        }
    }

    @Override
    public void devuelve() {
        prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        String prestamo;
        if (prestado) {
            prestamo = " (prestado)";
        } else {
            prestamo = " (no prestado)";
        }
        String resultado = "ISBN: " + this.ISBN + ", titulo: " + this.titulo + ", año de publicacion: " + this.fecha + prestamo;
        return resultado;
    }

}
