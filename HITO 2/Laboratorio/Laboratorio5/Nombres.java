package Pilas;

public class Nombres {
    /* parametro*/

    private String paraleo;
    private String[] nombres;

    /* CONSTRUCTOR*/
    public Nombres (String paraleo, String[] nombres){

        this.paraleo = paraleo;
        this.nombres = nombres;
    }
/* Objetos*/
    public String getParaleo() {
        return paraleo;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setParaleo(String paraleo) {
        this.paraleo = paraleo;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
    public void mostraNombres(){
        for (int i=0;i<this.nombres.length;i++){
            System.out.println(nombres[i]+"");
        }
        System.out.println();
    }

}
