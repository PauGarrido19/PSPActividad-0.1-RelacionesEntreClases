public class Biblioteca {
    private String nombre;
    private Bibliotecario encargado;

    public Biblioteca(String nombre, Bibliotecario encargado) {
        this.nombre = nombre;
        this.encargado = encargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Bibliotecario getEncargado() {
        return encargado;
    }

    public void setEncargado(Bibliotecario encargado) {
        this.encargado = encargado;
    }


}
