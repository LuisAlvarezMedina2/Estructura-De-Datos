package Libros;

import PILASHITO3.PIlasDeCadenas;

import java.util.Scanner;

public class PilaLibros {

    private int max;
    private int tope;
    private Libro[] libros;

    public PilaLibros(){
        this.max = 10;
        this.tope = 0;
        this.libros = new Libro[max+1];

    }
    public boolean esVacio(){
        if (tope==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean esllena(){
        if (tope==max){
            return true;
        }
        else{
            return false;
        }

    }
    public int nroElem(){
        return tope;
    }

    public void adicionar(Libro nuevoLibro){

        if(esllena() == true){
            System.out.println("Pila llena");

        }
        else{
            tope= tope+1;
            libros[tope] = nuevoLibro;
        }
    }
    public Libro eliminar(){
        Libro libroEliminado = null; /* es la forma de inicalizar un objeto*/

        if(esVacio() == true){
            System.out.println("Pila de Libros Vacia");
        }
        else{
            libroEliminado = libros[tope];
        }
        tope = tope-1;

        return libroEliminado;
    }

    public void vaciar(PilaLibros pila){

        while (pila.esVacio()==false){ // o podemos usar !pila.esVacio

            adicionar(pila.eliminar());
        }

    }
    public void mostrar(){

        Libro item=null;
        if(esVacio()){
            System.out.println("No hay libros que mostrar");
        }
        else {
            System.out.println("mostrando los libros");
            PilaLibros aux = new PilaLibros();
            while(!esVacio()){
                item = eliminar();
                aux.adicionar(item);
                item.mostrarLibro();
            }
            vaciar(aux);
        }
    }

}
