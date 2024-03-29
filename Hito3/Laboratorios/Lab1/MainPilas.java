package Pilas;

public class MainPilas {
    public static void main(String[] args){

        PilaNumeros pila1 = new PilaNumeros();
        pila1.adicionar(10);
        pila1.adicionar(2);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(5);
/*
        pila1.mostrar();

        muestraNumeroMaximo(pila1);
        pila1.mostrar();
        determinarCuantosNumeros5HayEnLaPila(pila1,5);
*/
        //muestraNumeroMinimo(pila1);
        //muestraNumeroMaximo(pila1);

        pila1.mostrar();
        cambioDePosiciones(pila1);
        pila1.mostrar();
    }
    /*
    public static void muestraNumeroMaximo (PilaNumeros pila){

        PilaNumeros aux = new PilaNumeros();
        int num = 0;
        int max = 0;

        while (!pila.esVacio()){

            num = pila.eliminar();

            if(num > max){
                max = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);

        System.out.println("Mayor = "+max);

    }

     */
    public static void determinarCuantosNumeros5HayEnLaPila(PilaNumeros pila, int numeroABuscar){

        PilaNumeros aux = new PilaNumeros();
        int num =0;
        int cont = 0;
        while (!pila.esVacio()){

            num = pila.eliminar();

            if(num == numeroABuscar){
                cont=cont+1;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);

        System.out.println("Hay = "+cont);


    }
    public static int muestraNumeroMaximo (PilaNumeros pila){

        PilaNumeros aux = new PilaNumeros();
        int num = 0;
        int max = 0;

        while (!pila.esVacio()){

            num = pila.eliminar();

            if(num > max){
                max = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);

        System.out.println("Mayor = "+max);
        return max;
    }

    public static int muestraNumeroMinimo (PilaNumeros pila){

        PilaNumeros aux = new PilaNumeros();
        int num = 0,numaux=0;
        int min=0;

        while (!pila.esVacio()){

            num = pila.eliminar();

            if(num < numaux  ){
                min = num;

            }
            numaux = num;
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("Menor = "+min);

        return min;

    }

    public static void cambioDePosiciones(PilaNumeros pila){

        PilaNumeros aux = new PilaNumeros();
        int max = muestraNumeroMaximo(pila);
        int min = muestraNumeroMinimo(pila);
        int num =0;
        while (!pila.esVacio()){

            num = pila.eliminar();

            if(max ==num){
                aux.adicionar(min);
            }
            else{

                if(min == num){
                    aux.adicionar(max);
                }
                else{
                    aux.adicionar(num);
                }

            }



        }
        pila.vaciar(aux);

    }


}
