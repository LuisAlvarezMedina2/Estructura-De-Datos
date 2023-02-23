import Math_utils.Math_utils;
import ejercisio.Ejercisios;

public class Main {
    public static void main(String[] args) {

        Ejercisios eje1 = new Ejercisios();
        eje1.mostrarMensaje();

        eje1.generarNumerosNaturales();

        eje1.generarNumerosPares();

        eje1.generarNumerosNaturalesWhile();


        Math_utils lab1 = new Math_utils("HP","0.1v",2022 );
        lab1.printAPP();
        lab1.generarExtencionFromCI("15465");
        lab1.generarNumeroParNatural(10 );
        lab1.generarNumeroNatural(21);
        /*System.out.println("Hello world!");*/

        /*for (int i = 1; i < 11; i++){


            System.out.println("i:"+i);


        }
        for (int i = 1; i < 11; i++){


            System.out.print(i+",");


        }

        for (int i = 1; i <= 20; i++){

         if(i % 2 == 0){
            System.out.println(i);

            }
        }
        int i;
        i=0;
        while (i<=5){

            System.out.println(i);
            i=i+1;
        }

        int i;
        i=2;
        while (i<=10){

            System.out.println(i);
            i=i+2;
        }
*/




    }
}