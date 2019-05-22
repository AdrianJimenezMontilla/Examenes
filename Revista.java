/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso.poo;

/**
 *
 * @author pc21
 */
public class Revista extends Publicacion {

  int numero;

  public Revista(String i, String t, int f, int n) {
    this.ISBN = i;
    this.titulo = t;
    this.fecha = f;
    this.numero = n;
  }

  @Override
  public String toString() {
    String resultado;
    resultado = "ISBN: " + this.ISBN + ", titulo: " + this.titulo + ", año de publicacion: " + this.fecha;
    return resultado;
  }

}
