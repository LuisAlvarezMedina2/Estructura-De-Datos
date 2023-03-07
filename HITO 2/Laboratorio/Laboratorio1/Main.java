import java.io.PrintStream;
import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args) {
/*
        Ejercisio eje1 = new Ejercisio();
        eje1.mostrarMensaje();
        eje1.generarNumerosNaturales();
        eje1.generarNumerosPares();
        eje1.generarNumerosNaturalesWhile();
*/
        Math_utils lab1 = new Math_utils("HP","0.1v",2022 );
        lab1.printAPP();
        lab1.generarExtencionFromCI("15465");
        lab1.generarNumeroParNatural(10 );
        lab1.generarNumeroNatural(21);

         /*
        System.out.println("HOLA MUNDO");

        for(int i = 1; i<11;i++){
            System.out.println("-"+ i);
        }

        for(int i = 2; i<11; i = i+2){
            System.out.println("-"+i);
        }
        int i=0;

        while(i<=5){
            System.out.println(i);
            i++;

        }

        int i=2;
        while(i<=10){
            System.out.println(i);
            i=i+2;
        }
*/

    }
}