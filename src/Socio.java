import java.util.ArrayList;

public class Socio implements Notificable{
    private String nombre;
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    public Socio(String nombre, ArrayList<Prestamo> prestamos) {
        this.nombre = nombre;
        this.prestamos = prestamos;
    }

    public void addPrestamos(Prestamo p){
            prestamos.add(p);
    }

    @Override
    public void enviarAviso(String mensaje) {}
}
