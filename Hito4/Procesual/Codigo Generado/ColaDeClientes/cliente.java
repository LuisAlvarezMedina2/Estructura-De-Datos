package ColaDeClientes;

public class cliente {
    private String nombre;
    private String apellidos;
    private int edad;
    private String pais;
    private String genero;
    private String tipo;


    public cliente(String nombre, String apellidos, int edad, String pais, String genero, String tipo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.pais = pais;
        this.genero = genero;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void muestraCliente(){
        System.out.println("Mostrando Cliente");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellidos());
        System.out.println("Edad: "+getEdad());
        System.out.println("Pais: "+getPais());
        System.out.println("Genero: "+getGenero());
        System.out.println("Tipo: "+getTipo());
    }


}
