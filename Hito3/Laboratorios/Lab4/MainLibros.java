package Libros;

import H2Defensa.Pais;

public class MainLibros {

    public static void main(String[] Args){

        Libro libro1 = new Libro("Homer", 500,50,"la odisea", "Historia");
        Libro libro2 = new Libro("Homer", 300,20,"la iliada", "Historia");
        Libro libro3 = new Libro("Homer", 300,25,"CalculoI", "Matematica");
        Libro libro4 = new Libro("Homer", 300,30,"Electricidad", "Fiscia");

        PilaLibros pila = new PilaLibros();
        pila.adicionar(libro1);
        pila.adicionar(libro2);

        PilaLibros pila2 = new PilaLibros();
        pila2.adicionar(libro3);
        pila2.adicionar(libro4);


      // pila.mostrar();

        //determinarMinarCostoDeLivbroMAyora30bs(pila,25);
        //alosLibrosDEHIstoriaDescuentode10(pila,"Historia");
       // pila.mostrar();


        determinarMinarCostoMayor(pila);
        determinarMinarCostoMayor(pila2);
    }

    public static void determinarMinarCostoDeLivbroMAyora30bs(PilaLibros pila, int costo){

        PilaLibros aux = new PilaLibros();
        Libro Eliminar = null;
        int cont=0;
        while(!pila.esVacio()){

            Eliminar=pila.eliminar();
            if(Eliminar.getPrecio()>costo){
                cont=cont+1;
            }
            aux.adicionar(Eliminar);

        }
        System.out.println("hay :"+cont);
        pila.vaciar(aux);

    }

    public static void alosLibrosDEHIstoriaDescuentode10(PilaLibros pila, String categoria){

        PilaLibros aux = new PilaLibros();
        Libro Eliminar = null;
        double precio=0;
        double newprecio =0;
        while(!pila.esVacio()){

            Eliminar=pila.eliminar();
            if(Eliminar.getCategoria().equals(categoria)){
                precio = Eliminar.getPrecio();
                newprecio = precio-0.1*precio;
                Eliminar.setPrecio(newprecio);
            }
            aux.adicionar(Eliminar);

        }

        pila.vaciar(aux);

    }
    public static Double determinarMinarCostoMayor(PilaLibros pila){

        PilaLibros aux = new PilaLibros();
        Libro Eliminar ;
        double max=0;
        while(!pila.esVacio()){

            Eliminar=pila.eliminar();

            if( Eliminar.getPrecio()>max ){

             max = Eliminar.getPrecio();
            }

            aux.adicionar(Eliminar);

        }
        pila.vaciar(aux);
        return max;
    }
    public static void cambioDePilas(PilaLibros pilaA, PilaLibros pilaB){

        PilaLibros auxA = new PilaLibros();
        PilaLibros auxB = new PilaLibros();
        Double maxA = determinarMinarCostoMayor(pilaA);
        Double maxB = determinarMinarCostoMayor(pilaB);
        Libro EliminarA=null;
        Libro EliminarB=null;
        Libro libroA;
        Libro libroB;
        while (!pilaA.esVacio()){

            EliminarA = pilaA.eliminar();

            if(EliminarA.getPrecio() == maxA){
                libroA = EliminarA;
            }else {
                auxA.adicionar(EliminarA);
            }
        }



    }


}
