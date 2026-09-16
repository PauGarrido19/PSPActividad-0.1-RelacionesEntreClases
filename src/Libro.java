public class Libro extends Publicacion implements Comparable<Libro>{

    private DatosEdicion datosEdicion;

    public Libro(String titulo, int isbn, String editorial, int anio) {
        super(titulo);
        this.datosEdicion = new DatosEdicion(isbn, editorial, anio);
    }

    public String mostrar() {
        return "Libro: " + super.mostrar();
    }

    @Override
    public int calcularDiasPrestamo() {
        return 15;
    }

    public void prestar() {
        System.out.println("El libro \"" + getTitulo() + "\" ha sido prestado.");
    }

    @Override
    public int compareTo(Libro o) {
        return this.datosEdicion.getAnio() - o.datosEdicion.getAnio();
    }

    public DatosEdicion getDatosEdicion() {
        return datosEdicion;
    }
}
