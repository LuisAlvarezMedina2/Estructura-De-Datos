package pilas;

public class Main_Nombre {


    public static void main(String[] args ){
        String [] NombresEDD = new String[5];
        NombresEDD [0] = "Ana";
        NombresEDD [1] = "Juan";
        NombresEDD [2] = "Pepito";
        NombresEDD [3] = "Carla";
        NombresEDD [4] = "Freddy";
        Nombres edd = new Nombres("EDD",NombresEDD );
    }
    public static int DeterminarNombresdePersonaPepito(Nombres edd){
        String [] nombre = edd.getNombres();
         int c=0;
         for (int i=0; i<nombre.length;i++){
             if(nombre[i]== "pepito"){
                 c=c+1;

             }
         }
         System.out.println(c);
    }
}
