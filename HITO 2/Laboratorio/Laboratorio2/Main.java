import ejercicios.Ejercicios;
import ejercicios.Math_utils;
import ejercicios.Student;

public class Main {
    public static void main(String[] args) {

       // Ejercicios ejercicios = new Ejercicios();
        //ejercicios.mostrarMensaje();
        //ejercicios.GenerarNumerosParesFOR();
        //ejercicios.generarNumerosNaturalesFOR();
        //ejercicios.GenerarNumerosNaturalesWHILE();
/*
        Math_utils mu = new Math_utils("WWEAPP","0.1V", 2023);
        mu.printAPP();
        mu.generateNaturalNumbers(10);
        mu.generatePairNumbers(20);
        mu.getExtensionFromCI("12345678CB");
*/
        Student k = new Student("pepito", "pep",25 );
// mostrando nombre completo y cambiando nombre
       // k.getFullName();
        String nombre = k.getFullName();
        System.out.println(nombre);

        k.setFullName("pepito1");
        String Cambionombre = k.getFullName();
        System.out.println(Cambionombre);

// mostrando apellido y cambiando apellido
       // k.getLastName();
        String Apellido = k.getLastName();
        System.out.println(Apellido);

        k.setLastName("pep1");
        String CambioApellido = k.getLastName();
        System.out.println(CambioApellido);
 // mostrando año y  cambiando año
      //  k.getAge();
        int año = k.getAge();
        System.out.println(año);

        k.setAge(30);
        int CambioAño = k.getAge();
        System.out.println(CambioAño);
    }


}
