package Math_utils;

public class Math_utils {

    private String nameAPP;
    private String version;
    private int year;
    private String Ci;
    private int Limt;

    public  Math_utils(String nameAPP , String version, int year){
        this.nameAPP= nameAPP ;
        this.version= version;
        this.year = year;
    }

    public void printAPP(){

        System.out.println("APP:" + nameAPP + " - " + version + " - "+ year);

    }

 public void generarNumeroNatural(int Limt){

     for (int i = 1; i <= Limt; i++) {

         System.out.println("i:" + i);

     }

 }
    public void generarNumeroParNatural(int Limt){

        for (int i = 1; i <= Limt; i++) {

            if (i % 2 == 0) {
                System.out.println(i);

            }
        }


    }
    public void generarExtencionFromCI(String Ci){

        System.out.println("su CI : " + Ci);

    }



}
