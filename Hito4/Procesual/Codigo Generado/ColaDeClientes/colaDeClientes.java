package ColaDeClientes;
public class colaDeClientes {

    private int max;
    private int ini, fin;
    private cliente clientes[];

    public colaDeClientes() {
        ini = fin = 0;
        max = 105;
        clientes = new cliente[max+1];
    }

    public boolean esVacia() {
        if (ini == 0 && fin == 0)
            return true;
        return false;
    }

    public boolean esLlena() {
        if (fin == max)
            return true;
        return false;
    }

    public int nroElementos() {
        return (fin - ini);
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }

    public void adicionar(cliente nuevocliente) {
        if (!esLlena()) {
            fin++;
            clientes[fin] = nuevocliente;
        } else
            System.out.println("Cola CLientes llena");
    }

    public cliente eliminar() {
        cliente elem = null;
        if (!esVacia()) {
            ini++;
            elem = clientes[ini];
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("Cola de CLIENTES VACIA");
        }

        return (elem);
    }

    public void vaciar(colaDeClientes cola) {
        while (!cola.esVacia()) {
            adicionar(cola.eliminar());
        }
    }

    public void mostrar() {
        cliente elem;

        if (esVacia())
            System.out.println("No hay Clientes");
        else {
            System.out.println(" CLIENTES ");
            System.out.println(" ");

            colaDeClientes aux = new colaDeClientes();
            while (!esVacia()) {
                elem = eliminar();
                aux.adicionar(elem);
                elem.muestraCliente();
                System.out.println(" ");
            }

            vaciar(aux);
        }
    }


}
