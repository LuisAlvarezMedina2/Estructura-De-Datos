package defensa_pilas_hito3;

import Libros.Libro;
import Libros.PilaLibros;

public class MainPilsaEstudiante {
    public static void main(String[] Args){

        ESTUDIANTE estu1 = new ESTUDIANTE("Luis","Alvarez",19,"El Alto",81,"13644437LP");
        ESTUDIANTE estu2 = new ESTUDIANTE("Juan","Mamani",21,"El Alto",70,"13644565SC");
        ESTUDIANTE estu3 = new ESTUDIANTE("Carolina","Paucara",22,"El Alto",50,"14654543LP");
        ESTUDIANTE estu4 = new ESTUDIANTE("Eddy","Apaza",22,"El Alto",60,"13644457CB");
        ESTUDIANTE estu5 = new ESTUDIANTE("Yamiley","Lipe",20,"El Alto",40,"16546543CB");


        PilaDeEstudiantes pila = new PilaDeEstudiantes();
        pila.adicionar(estu1);
        pila.adicionar(estu2);
        pila.adicionar(estu3);
        pila.adicionar(estu4);
        pila.adicionar(estu5);

       // pila.mostrar();
       // EstudaintesAprobados(pila,"El Alto");
        // pila.mostrar();
       //Kesimonumero(pila,10);
       //pila.mostrar();
        //determinarConMenorNota(pila);
      //  cambiodeestudainteconmenronotao(pila);
       // pila.mostrar();
        pila.mostrar();
        cambiodeestudaintescohcabmba(pila,"SC");
        pila.mostrar();
    }

    public static void EstudaintesAprobados(PilaDeEstudiantes pila, String sede ){

        PilaDeEstudiantes aux = new PilaDeEstudiantes();
        ESTUDIANTE estudaintesEliminados = null;
        int cont =0;
        while(!pila.esVacio()){

            estudaintesEliminados = pila.eliminar();
            if(estudaintesEliminados.getSede().equals(sede) && estudaintesEliminados.getNotaFinal()>=51) {
                cont = cont+1;
            }
            aux.adicionar(estudaintesEliminados);
        }
        pila.vaciar(aux);
        System.out.println("hay :"+cont);
    }

    public static void Kesimonumero(PilaDeEstudiantes pila, int poscion ){

        PilaDeEstudiantes aux = new PilaDeEstudiantes();
        ESTUDIANTE estudaintesEliminados=null;
        ESTUDIANTE almc = null;
    if(pila.nroElem() > poscion){
        while(!pila.esVacio()){

            estudaintesEliminados = pila.eliminar();
            if(pila.nroElem()+1 == poscion) {
                almc = estudaintesEliminados;
            }
            else{
                aux.adicionar(estudaintesEliminados);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(almc);
    }
    else{
        System.out.println("ESTAS MAL CHOQUITO HASTE CHEQUEAR");
    }

    }
    public static int determinarConMenorNota(PilaDeEstudiantes pila){

       PilaDeEstudiantes aux = new PilaDeEstudiantes();
       ESTUDIANTE Eliminar ;
        int min= Integer.MAX_VALUE;;
        while(!pila.esVacio()){

            Eliminar=pila.eliminar();

            if( Eliminar.getNotaFinal()<min ){

                min = Eliminar.getNotaFinal();
            }
            aux.adicionar(Eliminar);
        }
        pila.vaciar(aux);
        System.out.println(min);
        return min;

    }

    public static void cambiodeestudainteconmenronotao(PilaDeEstudiantes pila ){

        PilaDeEstudiantes aux = new PilaDeEstudiantes();
        ESTUDIANTE estudaintesEliminados=null;
        ESTUDIANTE almc = null;
        int min = determinarConMenorNota(pila);
        while(!pila.esVacio()){

            estudaintesEliminados = pila.eliminar();
            if(estudaintesEliminados.getNotaFinal() == min ) {
                almc = estudaintesEliminados;
            }
            else{
                aux.adicionar(estudaintesEliminados);
            }
        }
        pila.adicionar(almc);
        pila.vaciar(aux);

    }
    public static void cambiodeestudaintescohcabmba(PilaDeEstudiantes pila, String Ci){

        PilaDeEstudiantes auxLP = new PilaDeEstudiantes();
        PilaDeEstudiantes aux = new PilaDeEstudiantes();
        ESTUDIANTE estudaintesEliminados=null;
        ESTUDIANTE almc = null;
        while(!pila.esVacio()){

            estudaintesEliminados = pila.eliminar();
            if(estudaintesEliminados.getCi().toLowerCase().contains(Ci.toLowerCase())) {
                auxLP.adicionar(estudaintesEliminados);
            }
            else{
                aux.adicionar(estudaintesEliminados);
            }
        }
        pila.vaciar(aux);
        pila.vaciar(auxLP);

    }








}
