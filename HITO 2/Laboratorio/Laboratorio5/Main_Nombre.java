package Pilas;

import java.security.SecureRandom;

public class Main_Nombre {

    //PSVM
    public static void main(String[] args) {

        String [] NombresEDD = new String[5];
        NombresEDD[0] = "Ana";
        NombresEDD[1] = "Juan";
        NombresEDD[2] = "Pepito";
        NombresEDD[3] = "Carla";
        NombresEDD[4] = "Freddy";


        Nombres edd =new Nombres("EDD",NombresEDD);
      // int c= determinarNombrePepito(edd,"Pepito");
       //agregarNombre(edd,"Luis");
       agregarNombreFinal(edd,"Luis");
       edd.mostraNombres();




        // crear un metodo estatico que determine cuantas personas del paralelo EDD tienen el nombre pepito

    }
/*
    public static void determinarNombrePepito(Nombres edd){

        String [] nombre = edd.getNombres();
        int c=0;

        for (int i=0; i<nombre.length;i++){
            if(nombre[i] == "Pepito"){
                c = c+1;
            }
        }
        System.out.println(c);
    }
*/

    public static int determinarNombrePepito(Nombres edd, String nomBreBuscar){

        String [] nombre = edd.getNombres();
        int c=0;

        for (int i=0; i<nombre.length;i++){
            if(nombre[i] == nomBreBuscar){
                c = c+1;
            }
        }
        return c;
    }
    public static void agregarNombre(Nombres edd, String nomBreAgregar){

        String [] nombresOri = edd.getNombres();
        String [] nombresNuevos = new String[nombresOri.length+1];

        nombresNuevos[0]=nomBreAgregar;

        for(int i=0; i< nombresOri.length;i++){

            nombresNuevos[i+1] = nombresOri[i];
        }
        edd.setNombres(nombresNuevos);

    }
    public static void agregarNombreFinal(Nombres edd, String nomBreAgregar){

        String [] nombresOri = edd.getNombres();
        String [] nombresNuevos = new String[nombresOri.length+1];

        nombresNuevos[nombresOri.length] = nomBreAgregar;

        for(int i=0; i< nombresOri.length;i++){

            nombresNuevos[i] = nombresOri[i];

        }

        edd.setNombres(nombresNuevos);

    }


}








