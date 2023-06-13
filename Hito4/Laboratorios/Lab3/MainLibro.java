package colalibros;

import Pilas.PilaNumeros;

public class MainLibro {
    public static void main(String[] Args) {

        colaLibro colaLibro = new colaLibro();
        Libro libro1 = new Libro(1,"Juan","masculino","manga",80);
        Libro libro2 = new Libro(2,"Saul","masculino","manga",100);
        Libro libro3 = new Libro(3,"Ana","femenino","historia",40);
        Libro libro4 = new Libro(4,"Micaela","femenino","historia",30);
        Libro libro5 = new Libro(5,"Pepito","otro","novela",20);
        Libro libro6 = new Libro(6,"Pep","otro","novela",20);
        Libro libro7 = new Libro(7,"Carlsos","masculino","arte",200);

        colaLibro.adicionar(libro1);
        colaLibro.adicionar(libro2);
        colaLibro.adicionar(libro3);
        colaLibro.adicionar(libro4);
        colaLibro.adicionar(libro5);
        colaLibro.adicionar(libro6);
        colaLibro.adicionar(libro7);

        //colaLibro.mostrar();
        //libroConMenorPaginas(colaLibro);
        //oredenarColaDeLibrosEnbaseAlGenero(colaLibro);
        oredenarColaDeLibrosPornroPaginas(colaLibro);
        colaLibro.mostrar();

        //rear un metodo esta
    }
    public static int muestraNumeroMinimo (colaLibro cola){

        colaLibro aux = new colaLibro();
        Libro libro = null;
        int numeromax = Integer.MAX_VALUE;
        int numeropagnias = 0;

        while (!cola.esVacia()){

            libro = cola.eliminar();

            if(libro.getPaginas() < numeromax ){
                numeropagnias = libro.getPaginas();

            }
            numeromax = libro.getPaginas();
            aux.adicionar(libro);
        }
        cola.vaciar(aux);
        System.out.println("Menor = "+numeropagnias);

        return numeropagnias;

    }
    public static void libroConMenorPaginas(colaLibro cola ){

        colaLibro aux = new colaLibro();
        int numerpPaginas = muestraNumeroMinimo(cola);
        Libro libro = null;

        while (!cola.esVacia()){

            libro = cola.eliminar();

            if(libro.getPaginas() == numerpPaginas ){
                 libro.mostrar();

            }

            aux.adicionar(libro);
        }
        cola.vaciar(aux);
    }
//public static Libro determinarLibroConMenojarPoaignas(colaLibro cola){
//
//        colaLibro aux = new colaLibro();
//        Libro libroMenor= null;
//        int paginasMEnor = Integer.MAX_VALUE;
//    while (!cola.esVacia()){
//
//        Libro item = cola.eliminar();
//
//        if(item.getPaginas() <paginasMEnor ){
//            paginasMEnor = item.getPaginas();
//            libroMenor = item;
//        }
//
//        aux.adicionar(item);
//        cola.vaciar(aux);
//
//    }

    public static void oredenarColaDeLibrosEnbaseAlGenero(colaLibro cola){
        colaLibro auxM = new colaLibro();
        colaLibro auxF = new colaLibro();
        colaLibro auxO = new colaLibro();
        Libro libro = null;

        while (!cola.esVacia()){

            libro = cola.eliminar();

            if(libro.getGenero().equals("femenino") ){
               auxF.adicionar(libro);
            }
            if(libro.getGenero().equals("masculino") ){
                auxM.adicionar(libro);
            }
            if(libro.getGenero().equals("otro") ){
                auxO.adicionar(libro);
            }
        }
        cola.vaciar(auxF);
        cola.vaciar(auxM);
        cola.vaciar(auxO);
}

    public static void oredenarColaDeLibrosPornroPaginas(colaLibro cola){
        colaLibro aux = new colaLibro();
        colaLibro aux1 = new colaLibro();
        int limite = cola.getFin();
        int nroPag = 0;
        Libro libro = null;
    for(int i=1 ; i<= limite;i++ ){

       nroPag = muestraNumeroMinimo(cola);
       System.out.println(nroPag);

        while (!cola.esVacia()){

            libro = cola.eliminar();

            if(libro.getPaginas()==nroPag ){
                aux.adicionar(libro);
            }
            else{
                aux1.adicionar(libro);
            }
        }
        cola.vaciar(aux1);

    }
    cola.vaciar(aux);


    }




}