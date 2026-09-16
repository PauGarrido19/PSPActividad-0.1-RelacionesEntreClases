public class Bibliotecario implements Notificable{
    private String nombre;

    public Bibliotecario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void enviarAviso(String mensaje) {}

}