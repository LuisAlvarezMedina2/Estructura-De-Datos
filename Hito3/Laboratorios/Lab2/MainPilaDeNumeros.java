package HIto3;

public class MainPilaDeNumeros {

    public static void main(String[] args){

        PilaNumeros pila1 = new PilaNumeros();
        pila1.adicionar(10);
        pila1.adicionar(2);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(5);

        pila1.mostrar();
      //  muestraNumeroMaximo(pila1);
      //  determinarCuantosNumeros5HayEnLaPila(pila1,5);
       // cambioDePosiciones(pila1);
      //  pila1.mostrar();
      //  pares_impares(pila1);

      //  agregaralabaseelnum100(pila1,100);
        agregaralabaseelnum100v1(pila1,100);
        pila1.mostrar();

    }

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
        int max = Integer.MIN_VALUE;

        while (!pila.esVacio()){

            num = pila.eliminar();

            if(num > max){
                max = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);


        return max;
    }

    public static int muestraNumeroMinimo (PilaNumeros pila){

        PilaNumeros aux = new PilaNumeros();
        int num = 0,numaux=0;
        int min=Integer.MAX_VALUE;

        while (!pila.esVacio()){

            num = pila.eliminar();

            if(num < numaux  ){
                min = num;

            }
            numaux = num;
            aux.adicionar(num);
        }
        pila.vaciar(aux);


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
                num=min;
            }
            else{

                if(min == num){
                    num=max;
                }

            }
            aux.adicionar(num);

        }
        pila.vaciar(aux);

    }
    public static void pares_impares(PilaNumeros pila){

        PilaNumeros aux = new PilaNumeros();
        int imp =0;
        int par =0;
        int num =0;
        while (!pila.esVacio()){

            num = pila.eliminar();

            if(num % 2 !=0){
                imp = imp+1;
            }
            else{
                par=par+1;

            }
            aux.adicionar(num);

        }

        System.out.println("impar="+imp);
        System.out.println("par="+par);

    }


    public static void agregaralabaseelnum100(PilaNumeros pila,int agregar){

        PilaNumeros aux = new PilaNumeros();

        int num =0;

        while (!pila.esVacio()){

            num = pila.eliminar();
            aux.adicionar(num);
        }
        aux.adicionar(agregar);


        pila.vaciar(aux);


    }
    public static void agregaralabaseelnum100v1(PilaNumeros pila,int agregar){

        PilaNumeros aux = new PilaNumeros();

        aux.vaciar(pila);
        aux.adicionar(agregar);
        pila.vaciar(aux);


    }







}
