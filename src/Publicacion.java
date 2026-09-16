public abstract class Publicacion {
    private String titulo;

    public Publicacion(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String mostrar(){
        return this.titulo;
    }
    public abstract int calcularDiasPrestamo();
}
