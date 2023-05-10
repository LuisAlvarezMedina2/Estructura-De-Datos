package defensa_pilas_hito3;

public class PilaDeEstudiantes {
    private int max;
    private int tope;
    private ESTUDIANTE[] estudiantes;

    public PilaDeEstudiantes(){
        this.max = 10;
        this.tope = 0;
        this.estudiantes = new ESTUDIANTE[max+1];

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

    public void adicionar(ESTUDIANTE nuevoEstudiante){

        if(esllena()){
            System.out.println("Pila llena");

        }
        else{
            tope= tope+1;
            estudiantes[tope] = nuevoEstudiante;
        }
    }
    public ESTUDIANTE eliminar(){
        ESTUDIANTE estudianteEliminado = null; /* es la forma de inicalizar un objeto*/

        if(esVacio()){
            System.out.println("Pila de Estudiantes Vacia");
        }
        else{
            estudianteEliminado= estudiantes[tope];
        }
        tope = tope-1;

        return estudianteEliminado;
    }

    public void vaciar(PilaDeEstudiantes pila){

        while (!pila.esVacio()){ // o podemos usar !pila.esVacio

            adicionar(pila.eliminar());
        }

    }
    public void mostrar(){

        ESTUDIANTE item = null;
        if(esVacio()){
            System.out.println("No hay Estudiantes que mostrar");
        }
        else {
            System.out.println("Mostrando los Estudiantes");
            PilaDeEstudiantes aux = new PilaDeEstudiantes();
            while(!esVacio()){
                item = eliminar();
                aux.adicionar(item);
                item.muestraEstudaintes();
            }
            vaciar(aux);
        }
    }




}
