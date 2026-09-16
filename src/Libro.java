public class Libro extends Publicacion implements Comparable<Libro>{

    private DatosEdicion datosEdicion;

    public Libro(String titulo) {
        super(titulo);
    }

    public String mostrar() {
        return "Libro: " + super.mostrar();
    }

    @Override
    public int calcularDiasPrestamo() {
        return 15;
    }
    @Override
    public int compareTo(Libro o) {
        return this.datosEdicion.getAnio() - o.datosEdicion.getAnio();
    }

}
