public class Main {
    static void main(String[] args) {
        Publicacion p = new Libro("Hola");
        Publicacion r = new Revista("Adios");

        System.out.println(p.mostrar());
        System.out.println(r.mostrar());
    }
}
