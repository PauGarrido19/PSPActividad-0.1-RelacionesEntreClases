import java.util.ArrayList;

public class Socio implements Notificable{
    private String nombre;
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    public Socio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamos(Prestamo p){
            prestamos.add(p);
            p.setSocio(this);
    }

    @Override
    public void enviarAviso(String mensaje) {
        System.out.println("Aviso para el socio " + nombre + ": " + mensaje);
    }
}
