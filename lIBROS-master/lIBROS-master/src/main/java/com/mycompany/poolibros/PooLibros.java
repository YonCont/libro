/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poolibros;

import java.util.Scanner;

/**
 *
 * @author StudioOne
 */
public class PooLibros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;

        // creamos los libros
        Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);

        Libro libro2 = new Libro();

        System.out.println("Ingrese el titulo del libro");
        titulo = entrada.nextLine();
        System.out.println("Ingrese el autor");
        autor = entrada.nextLine();
        System.out.println("Número de ejemplares");
        ejemplares = entrada.nextInt();

        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);

        // se realiza el prestamoa del libro1
        if (libro1.prestamo()) {
            System.out.println("se ha prestado el libro" + libro1.getTitulo());
        } else {
            System.out.println("nO QUEDAN Ejemplares por prestar" + libro1.getTitulo());
        }

        // mostrar los datos del libro 1
        System.out.println("Libro 1");
        System.out.println("Titulo :" + libro1.getTitulo());
        System.out.println("Autor");
        System.out.println("Titulo :" + libro1.getAutor());
        System.out.println("Ejemplares :" + libro1.getEjemplares());
        System.out.println("Titulo :" + libro1.getPrestados());

       System.out.println("Libro 1");
        System.out.println("Titulo :" + libro2.getTitulo());
        System.out.println("Autor");
        System.out.println("Titulo :" + libro2.getAutor());
        System.out.println("Ejemplares :" + libro2.getEjemplares());
        System.out.println("Titulo :" + libro2.getPrestados());


        
    }
}
