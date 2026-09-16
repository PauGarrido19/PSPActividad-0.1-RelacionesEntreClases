public class Revista extends Publicacion{
    public Revista(String titulo) {
        super(titulo);
    }

    @Override
    public String mostrar() {
        return "Revista: " + super.mostrar();
    }

    @Override
    public int calcularDiasPrestamo() {
        return 7;
    }
}
