package PILASHITO3;

import HIto3.PilaNumeros;

import java.util.Scanner;

public class PIlasDeCadenas {

    private int max;
    private int tope;
    private String[] cadenas;

    public PIlasDeCadenas(int max){
        this.max = max;
        this.tope = 0;
        this.cadenas = new String[max+1];

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

    public void adicionar(String nuevoNombre){

        if(esllena() == true){
            System.out.println("Pila llena");

        }
        else{
            tope= tope+1;
            cadenas[tope] = nuevoNombre;
        }
    }
    public String eliminar(){
        String itemEliminado = " ";

        if(esVacio() == true){
            System.out.println("Pila Vacia");
        }
        else{
            itemEliminado = cadenas[tope];
        }

        tope = tope-1;

        return itemEliminado;
    }

    public void llenar(int nroitems){

        Scanner leer =  new Scanner(System.in);
        String nombre="";
            System.out.println("llenando la pila de nombres(CADENAS)");
            for(int i =0;i<nroitems;i++){
                System.out.println("ingrese nombre"+(i+1)+": ");
                nombre = leer.nextLine();
                adicionar(nombre);
                System.out.println();
            }

    }
    public void vaciar(PIlasDeCadenas pila){

        while (pila.esVacio()==false){ // o podemos usar !pila.esVacio

            adicionar(pila.eliminar());
        }

    }
    public void mostrar(){

        String item="";
        if(esVacio()==true){
            System.out.println("No hay items a mostrar");
        }
        else {
            System.out.println("mostrando la Pila de elementos");
            PIlasDeCadenas aux = new PIlasDeCadenas(max);
            while(esVacio()==false){
                item = eliminar();
                System.out.println("NOMBRE = "+ item);
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
// integer.Min_value
    // integer.MAX_value
}




