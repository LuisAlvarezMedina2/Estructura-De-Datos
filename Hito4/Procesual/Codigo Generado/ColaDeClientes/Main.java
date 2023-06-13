package ColaDeClientes;

public class Main {
    public static void main(String[] Args) {

        cliente cliente1 = new cliente("Saul","Alvarez",20,"Bolivia","Masculino","Gold");
        cliente cliente2 = new cliente("Luis","Alvarez",30,"Bolivia","Masculino","Silver");
        cliente cliente3 = new cliente("Saul","Paucara",90,"Colombia","Femenino","Gold");
        cliente cliente4 = new cliente("Juan","Apaza",30,"Peru","Masculino","Silver");
        cliente cliente5 = new cliente("Saul","Mamani",79,"España","Femenino","Gold");

        //CLiente B
        cliente cliente6 = new cliente("Miguel","Alvarez",20,"Bolivia","Masculino","Gold");
        cliente cliente7 = new cliente("Eddy","Alvarez",30,"Bolivia","Masculino","Silver");
        cliente cliente8 = new cliente("Ximena","Paucara",90,"Colombia","Femenino","Gold");
        cliente cliente9 = new cliente("Nilber","Apaza",30,"Peru","Masculino","Silver");
        cliente cliente0 = new cliente("Evelyn","Mamani",79,"España","Femenino","Gold");

        colaDeClientes colaA = new colaDeClientes();
        colaA.adicionar(cliente1);
        colaA.adicionar(cliente2);
        colaA.adicionar(cliente3);
        colaA.adicionar(cliente4);
        colaA.adicionar(cliente5);

        colaDeClientes colaB = new colaDeClientes();
        colaB.adicionar(cliente6);
        colaB.adicionar(cliente7);
        colaB.adicionar(cliente8);
        colaB.adicionar(cliente9);
        colaB.adicionar(cliente0);

        System.out.println("COLA A antes-----------------------------------------");
        colaA.mostrar();

        System.out.println("COLA B antes-----------------------------------------");
        colaB.mostrar();
       // convertidendoGoldenVip(cola,"Gold","Bolivia");
       // ordenarPorEdad(cola,60);
        moviendoClientesentredosColas(colaA,"Saul",colaB);

        System.out.println("Cola A DESPUES-----------------------------------------");
        colaA.mostrar();
        System.out.println("Cola B DESPUES-----------------------------------------");
        colaB.mostrar();
    }

    public static void convertidendoGoldenVip(colaDeClientes cola, String tipoCLiente, String nacionalidad){

        colaDeClientes aux = new colaDeClientes();
        cliente itemeliminado = null;
        while(!cola.esVacia()){

            itemeliminado = cola.eliminar();
            if(itemeliminado.getTipo().equals(tipoCLiente) && itemeliminado.getPais().equals(nacionalidad)){
                itemeliminado.setTipo("VIP");
            }

            aux.adicionar(itemeliminado);
        }

        cola.vaciar(aux);
    }
    public static void ordenarPorEdad(colaDeClientes cola,int edad){

        colaDeClientes aux = new colaDeClientes();
        colaDeClientes aux1 = new colaDeClientes();
        cliente itemeliminado = null;
        while(!cola.esVacia()) {

            itemeliminado = cola.eliminar();

            if (itemeliminado.getEdad() > edad) {
                aux1.adicionar(itemeliminado);
            }
            else{
                aux.adicionar(itemeliminado);

            }
        }
        cola.vaciar(aux1);
        cola.vaciar(aux);
    }
    public static void moviendoClientesentredosColas(colaDeClientes colaA, String nombre, colaDeClientes colaB){

        colaDeClientes aux = new colaDeClientes();
        colaDeClientes aux1 = new colaDeClientes();
        cliente itemeliminado = null;
        while(!colaA.esVacia()) {

            itemeliminado = colaA.eliminar();

            if (itemeliminado.getNombre().equals(nombre)) {
                aux1.adicionar(itemeliminado);
            }
            else{
                aux.adicionar(itemeliminado);

            }
        }
        colaA.vaciar(aux);
        aux.vaciar(colaB);
        colaB.vaciar(aux1);// Todos los Saules ALmanacenados se vacien en la cola B
        colaB.vaciar(aux);//Que todos registros anteriroes se vuelvan a insertar en orden

    }

}
