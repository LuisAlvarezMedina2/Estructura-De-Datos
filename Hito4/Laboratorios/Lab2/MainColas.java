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
   static public void eliminartodosloselementosrepetidos(ColaDeNumeros cola){

       int nroElem = cola.nroElementos();
        int item = 0;
       for(int i=1;i<= nroElem;i++){
           item = cola.eliminar();
           System.out.println("num = "+item);
           cola.adicionar(item);
       }
       cola.ini();
       cola.fin();


   }
   static public boolean verificaSiExistenUnooMAs(ColaDeNumeros cola, int num){
       int cont = 0;
       int item ;
       int nroElem = cola.nroElementos();

       for(int i=1; i<=nroElem;i++){

           item = cola.eliminar();
           if(item == num){
               cont = cont+1;
           }
           cola.adicionar(item);


       }
       if(cont >= 1){
           return true;
       }
       else{
           return false;
       }


   }

    static public void Eliminarepetidos(ColaDeNumeros cola){
           int nuero = 1;
        int item  ;
        int nroElem = cola.nroElementos();
    while(nuero > 0){
        nuero = 0;
        for(int i=1; i<=nroElem;i++){

            item = cola.eliminar();
            if(verificaSiExistenUnooMAs(cola,item)== true){
                nuero = item;
                System.out.println("claro"+nuero);
            }
            cola.adicionar(item);

        }
        for(int i=1; i<=nroElem;i++){

            item = cola.eliminar();
            if(nuero !=item){
                cola.adicionar(item);
            }

        }

    }



    }



}



