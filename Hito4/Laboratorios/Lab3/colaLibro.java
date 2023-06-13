package colalibros;

public class colaLibro {

        private int max;
        private int ini, fin;
        private Libro libros[];

        public colaLibro() {
            ini = fin = 0;
            max = 105;
            libros = new Libro[max + 1];
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

        public void adicionar(Libro nuevolibro) {
            if (!esLlena()) {
                fin++;
                libros[fin] = nuevolibro;
            } else
                System.out.println("Cola Simple llena");
        }

        public Libro eliminar() {
            Libro elem = null;
            if (!esVacia()) {
                ini++;
                elem = libros[ini];
                if (ini == fin) {
                    ini = fin = 0;
                }
            } else {
                System.out.println("Cola de libros vacia");
            }

            return (elem);
        }

        public void vaciar(colaLibro cola) {
            while (!cola.esVacia()) {
                adicionar(cola.eliminar());
            }
        }

        public void mostrar() {
            Libro elem;

            if (esVacia())
                System.out.println("Cola vacia");
            else {
                System.out.println(" Datos de la Cola ");
                colaLibro aux = new colaLibro();
                while (!esVacia()) {
                    elem = eliminar();
                    aux.adicionar(elem);
                    elem.mostrar();
                }

                vaciar(aux);
            }
        }


}
