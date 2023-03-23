package pilas;

public class Main {
    public static void main(String[] args) {
/*
       int [] edades = new int[5];
       edades[0]=33;
       edades[1]=20;
       edades[2]=19;
       edades[3]=22;
       edades[4]=25;

       Edades obj1 = new Edades("Unifranz","EDD",edades);
        obj1.mostrar();
       determinarEdadMayor(obj1);
       determinarPar5(obj1);
        obj1.mostrar();
    }
    public static void determinarEdadMayor(Edades obj1){

        int[] edades =  obj1.getEdades();
        int myr = edades [0];
        for(int i=1;i<edades.length;i++){

            if( edades[i]>myr){
                myr = edades[i];
            }
        }
        System.out.println("resultado: "+ myr);
    }

    public static void determinarPar5(Edades obj1){

        int[] edades = obj1.getEdades();
        for(int i = 1; i<edades.length;i++){
            if(edades[i]%2==0){
                edades[i]=edades[i]+5;
            }
        }
        obj1.setEdades(edades);
    }
*/

        int[] edades1 = new int[5];
        edades1[0] = 33;
        edades1[1] = 20;
        edades1[2] = 19;
        edades1[3] = 42;
        edades1[4] = 25;
        int[] edades2 = new int[5];
        edades2[0] = 30;
        edades2[1] = 20;
        edades2[2] = 19;
        edades2[3] = 15;
        edades2[4] = 25;
        Edades obj1 = new Edades("Unifranz", "ADD", edades1);
        Edades obj2 = new Edades("Unifranz", "DBA_III", edades2);
/*
        obj1.mostrar();
        obj2.mostrar();
        intercambioValores(obj1, obj2);
        obj1.mostrar();
        obj2.mostrar();

 */
        obj1.mostrar();
        obj2.mostrar();
        CambioDeLugares(obj1,obj2);
        obj1.mostrar();
       obj2.mostrar();

    }

    public static int determinarEdadMayor(Edades obj1) {
        int[] edades = obj1.getEdades();
        int myr = edades[0];
        for (int i = 1; i < edades.length; i++) {

            if (edades[i] > myr) {
                myr = edades[i];
            }
        }

        return myr;
    }

    public static int determinarEdadMayor2(Edades obj2) {
        int[] edades = obj2.getEdades();
        int myr = edades[0];
        for (int i = 1; i < edades.length; i++) {

            if (edades[i] > myr) {
                myr = edades[i];
            }
        }

        return myr;
    }

    public static int determinarEdadMenor(Edades obj1) {
        int[] edades = obj1.getEdades();
        int mnr = edades[0];
        for (int i = 1; i < edades.length; i++) {

            if (edades[i] < mnr) {
                mnr = edades[i];
            }
        }

        return mnr;
    }

    public static int determinarEdadMenor2(Edades obj2) {
        int[] edades = obj2.getEdades();
        int mnr = edades[0];
        for (int i = 1; i < edades.length; i++) {

            if (edades[i] < mnr) {
                mnr = edades[i];
            }
        }

        return mnr;
    }

    public static void intercambioValores(Edades obj1, Edades obj2) {

        int[] edades1 = obj1.getEdades(), edades2 = obj2.getEdades();
        int myr1 = determinarEdadMayor(obj1), mnr1 = determinarEdadMenor(obj1);
        int myr2 = determinarEdadMayor2(obj2), mnr2 = determinarEdadMenor2(obj2);


        for (int i = 0; i < edades1.length; i++) {
            if (edades1[i] == mnr1) {
                edades1[i] = mnr2;
            }
            if (edades1[i] == myr1) {
                edades1[i] = myr2;
            }
        }
        obj1.setEdades(edades1);
        for (int i = 0; i < edades2.length; i++) {
            if (edades2[i] == mnr2) {
                edades2[i] = mnr1;
            }
            if (edades2[i] == myr2) {
                edades2[i] = myr1;
            }
        }
        obj2.setEdades(edades2);
    }


        public static void CambioDeLugares(Edades obj1,Edades obj2) {


            int mayorEdd = determinarEdadMayor(obj1);
            int menorEdd = determinarEdadMenor(obj1);
            int a = 0, c = 0, d = 0, e = 0;


            int[] edadesEDD = obj1.getEdades();

            for (int i = 0; i < edadesEDD.length; i++) {
                if (edadesEDD[i] == menorEdd) {
                    a = i;
                }


            }
            System.out.println(a);
            for (int i = 0; i < edadesEDD.length; i++) {

                if (edadesEDD[i] == mayorEdd) {

                    c = i;

                    edadesEDD[a] = mayorEdd;

                }
            }
            System.out.println(c);
            for (int i = 0; i < edadesEDD.length; i++) {

                if (edadesEDD[i] == mayorEdd) {

                    edadesEDD[c] = menorEdd;


                }
            }
        ///////////////////////
            a = 0;
            c = 0;

            int mayorBDA = determinarEdadMayor2(obj2);
            int menorBDA = determinarEdadMenor2(obj2);

            int[] edadesBDA = obj2.getEdades();

            for (int i = 0; i < edadesBDA.length; i++) {
                if (edadesBDA[i] == mayorBDA) {
                    a = i;
                }


            }
            System.out.println(a);
            for (int i = 0; i < edadesBDA.length; i++) {

                if (edadesBDA[i] == menorBDA) {

                    c = i;

                    edadesBDA[a] = menorBDA;

                }
            }
            System.out.println(c);
            for (int i = 0; i < edadesBDA.length; i++) {

                if (edadesBDA[i] == menorBDA) {

                    edadesBDA[c] = mayorBDA;


                }
            }


        }

    }




