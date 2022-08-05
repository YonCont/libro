/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poolibros;

/**
 *
 * @author StudioOne
 */
public class Libro {

        // atributos
        private String titulo;
        private String autor;
        private int Ejemplares;
        private int prestados;
        // constructor

    public Libro() {
    }

    public Libro(String titulo, String autor, int Ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.Ejemplares = Ejemplares;
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return Ejemplares;
    }

    public void setEjemplares(int Ejemplares) {
        this.Ejemplares = Ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", Ejemplares=" + Ejemplares + ", prestados=" + prestados + '}';
    }
       
    // metodo para realizar prestamo de un libro
    
    public boolean prestamo() {
        boolean prestado = true;

        if (prestados < Ejemplares) {
            prestados++;

        } else {
            prestado = false;
        }
        return prestado;
    }
    
    // metodo para realizar devolucion de libro
 public boolean devolucion(){

        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }
    
    
}
