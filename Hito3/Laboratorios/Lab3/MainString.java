package PILASHITO3;

import HIto3.PilaNumeros;
import jdk.dynalink.beans.StaticClass;

public class MainString {
    public static void main(String[] args) {

        PIlasDeCadenas pila1 = new PIlasDeCadenas(10);
        pila1.adicionar("William");
        pila1.adicionar("Andres");
        pila1.adicionar("Josias");
        pila1.adicionar("Iris");
        pila1.adicionar("Jonathan");
        pila1.adicionar("lilia");

       // pila1.mostrar();
//        pila1.llenar(11);
//        pila1.mostrar();

        //contarandres(pila1,"Andres");
//        //ingresarnuevonobreen3posicion(pila1,"Andres","Ana");
//        pila1.mostrar();
//        cambiodelugardeitems(pila1);
        pila1.mostrar();
        ingresarnuevonobreen3posicionjosias(pila1);
        pila1.mostrar();

    }
    public static void contarandres(PIlasDeCadenas pila, String nombre) {
        int cont=0;
        String nombreelim = "";
        PIlasDeCadenas aux = new PIlasDeCadenas(10);

        while (!pila.esVacio()){
            nombreelim = pila.eliminar();
            if(nombreelim.equals(nombre)){
                cont = cont+1;
            }
            aux.adicionar(nombreelim);
        }
        pila.vaciar(aux);
        System.out.println("hay: "+cont+" "+nombre);
    }
    public static void ingresarnuevonobreen3posicion(PIlasDeCadenas pila , String nombre, String newnombre){

        String nombreelim = "";
        PIlasDeCadenas aux = new PIlasDeCadenas(10);

        while (!pila.esVacio()){
            nombreelim = pila.eliminar();
            if(nombreelim.equals(nombre)){
              aux.adicionar(newnombre);
            }
            aux.adicionar(nombreelim);
        }
        pila.vaciar(aux);

    }

    public static void cambiodelugardeitems(PIlasDeCadenas pila){

        PIlasDeCadenas aux = new PIlasDeCadenas(10);
        String nombre1 = pila.eliminar();
        aux.vaciar(pila);
        String nombre2 = aux.eliminar();

        pila.adicionar(nombre1);
        pila.vaciar(aux);
        pila.adicionar(nombre2);


    }

    public static void ingresarnuevonobreen3posicionjosias(PIlasDeCadenas pila ){

        String nombreelim = "";
        String nombre = "";
        PIlasDeCadenas aux = new PIlasDeCadenas(10);

        while (!pila.esVacio()){
            System.out.println(pila.nroElem());
            nombreelim = pila.eliminar();

            if(pila.nroElem()==2){
                nombre = nombreelim;
            }
            else{
                aux.adicionar(nombreelim);
            }


        }

        pila.vaciar(aux);
        pila.adicionar(nombre);


    }



}