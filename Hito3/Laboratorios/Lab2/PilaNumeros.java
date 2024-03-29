package HIto3;

public class PilaNumeros {

    private int max;
    private int tope;
    private int[] numeros;

    public PilaNumeros(){
        this.max = 10;
        this.tope = 0;
        this.numeros = new int[this.max+1];

    }
    public boolean esVacio(){
        if (tope==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean esllena(){
        if (tope==max){
            return true;
        }
        else{
            return false;
        }

    }
    public int nroElem(){
        return tope;
    }

    public void adicionar(int nuevoNumero){

        if(esllena() == true){
            System.out.println("Pila llena");

        }
        else{
            tope= tope+1;
            numeros[tope] = nuevoNumero;
        }
    }
    public int eliminar(){
        int itemEliminado = 0;

        if(esVacio() == true){
            System.out.println("Pila Vacia");
        }
        else{
           itemEliminado = numeros[tope];
        }

        tope = tope-1;

        return itemEliminado;
    }

    public void llenar(){




    }
    public void vaciar(PilaNumeros pila){

        while (pila.esVacio()==false){ // o podemos usar !pila.esVacio

            adicionar(pila.eliminar());
        }

    }
    public void mostrar(){

        int item=0;
        if(esVacio()==true){
            System.out.println("No hay items a mostrar");
        }
        else {
            System.out.println("mostrando la Pila de elementos");
            PilaNumeros aux = new PilaNumeros();
            while(esVacio()==false){
                item = eliminar();
                System.out.println("Numero = "+ item);
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
// integer.Min_value
    // integer.MAX_value
}
