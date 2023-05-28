package ManejoDeColas;

import PilaDeClientes.Cliente;
import PilaDeClientes.PilaCliente;

public class MainColas {

    public static void main(String[] Args){


        ColaDeNumeros cola = new ColaDeNumeros();
        cola.adicionar(4);
        cola.adicionar(6);
        cola.adicionar(8);
        cola.adicionar(3);
        cola.adicionar(4);
        cola.adicionar(3
        );

        cola.mostrarColas();
        //contadordemutilosde3(cola,3);
        //eliminartodosloselementosrepetidos(cola);

        //System.out.println(verificaSiExistenUnooMAs(cola,7));
        Eliminarepetidos(cola);
        //Eliminarepetidos(cola,3);
        cola.mostrarColas();
    }
    static public void contadordemutilosde3(ColaDeNumeros cola, int multilo){

        ColaDeNumeros aux = new ColaDeNumeros();
        int numeroeliminado = 0;
        int con=0;
        while(!cola.esVacia()){

            numeroeliminado = cola.eliminar();

            if(numeroeliminado%multilo == 0 ){

               con=con+1;
            }

            aux.adicionar(numeroeliminado);

        }
        System.out.println("hay :"+con);
        cola.vaciar(aux);

    }
   /* static public void eliminartodosloselementosrepetidos(ColaDeNumeros cola){

        ColaDeNumeros aux = new ColaDeNumeros();
        int numeroeliminado = 0;
        int con=0;
        int almacen=0;
        int nro=cola.nroElementos();

        while (nro>0){
            int numrocomparacion = cola.eliminar();
            while(!cola.esVacia()){

                numeroeliminado = cola.eliminar();

                if( numrocomparacion == numeroeliminado ){

                    con=con+1;
                    if(con>1){
                        almacen=numeroeliminado;
                    }

                }

                aux.adicionar(numeroeliminado);

            }
            cola.vaciar(aux);
            nro=nro-1;
        }
        while(!cola.esVacia()){

            numeroeliminado = cola.eliminar();

            if(numeroeliminado != almacen )
                aux.adicionar(numeroeliminado);
        }
        cola.vaciar(aux);
    }
    */
   


    



}



