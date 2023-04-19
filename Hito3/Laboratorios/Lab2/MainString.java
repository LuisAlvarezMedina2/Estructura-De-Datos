package PILASHITO3;

public class MainString {
    public static void main(String[] args) {

        PIlasDeCadenas pila1 = new PIlasDeCadenas(10);
        pila1.adicionar("William");
        pila1.adicionar("Andres");
        pila1.adicionar("Josias");
        pila1.adicionar("Iris");
        pila1.adicionar("Jonathan");
        pila1.adicionar("lilia");

        pila1.mostrar();



    }
}