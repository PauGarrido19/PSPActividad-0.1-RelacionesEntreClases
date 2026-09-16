import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ---- Parte A.1: asociación bidireccional Socio <-> Prestamo ----
        Socio socio = new Socio("Ana");
        Prestamo prestamo1 = new Prestamo();
        socio.addPrestamos(prestamo1);
        System.out.println("El socio del préstamo es: " + prestamo1.getSocio().getNombre());
        System.out.println("Nº de préstamos del socio: " + socio.getPrestamos().size());

        // ---- Parte A.2: agregación Biblioteca -> Bibliotecario ----
        Bibliotecario bibliotecario = new Bibliotecario("Carlos");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", bibliotecario);
        System.out.println("Encargado: " + biblioteca.getEncargado().getNombre());
        // Aunque "eliminemos" la biblioteca, el bibliotecario sigue vivo:
        biblioteca = null;
        System.out.println("El bibliotecario sigue existiendo: " + bibliotecario.getNombre());

        // ---- Parte A.3: composición Libro -> DatosEdicion ----
        Libro elQuijote = new Libro("El Quijote", 111, "Espasa", 1605);
        System.out.println("ISBN del libro: " + elQuijote.getDatosEdicion().getIsbn());

        // ---- Parte B: polimorfismo ----
        Publicacion p = new Libro("Hola", 222, "Anaya", 2001);
        Publicacion r = new Revista("Adios");
        System.out.println(p.mostrar());
        System.out.println(r.mostrar());

        // Pregunta de profundización Parte B:
        // p.prestar(); // <-- NO COMPILA. Descomenta esta línea para ver el error:
        // "cannot find symbol: method prestar()"
        // El compilador solo conoce el tipo DECLARADO de "p" (Publicacion),
        // no el tipo real del objeto en tiempo de ejecución (Libro).
        // Como Publicacion no tiene prestar(), el compilador lo rechaza,
        // aunque en tiempo de ejecución el objeto real sí lo tenga.
        // Para llamarlo haría falta un casting explícito: ((Libro) p).prestar();
        ((Libro) p).prestar();

        // ---- Parte C: clase abstracta ----
        // new Publicacion("x"); // <-- NO COMPILA:
        // "Publicacion is abstract; cannot be instantiated"
        System.out.println("Días de préstamo del libro: " + elQuijote.calcularDiasPrestamo());
        System.out.println("Días de préstamo de la revista: " + r.calcularDiasPrestamo());

        // ---- Parte D: interfaz Notificable ----
        socio.enviarAviso("Tu préstamo vence mañana");
        bibliotecario.enviarAviso("Reunión de personal a las 10:00");

        // ---- Parte E: Comparable ----
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Libro A", 1, "Ed1", 1999));
        libros.add(new Libro("Libro B", 2, "Ed2", 1950));
        libros.add(new Libro("Libro C", 3, "Ed3", 2015));
        libros.add(new Libro("Libro D", 4, "Ed4", 1978));

        Collections.sort(libros);

        System.out.println("Libros ordenados por año (de más antiguo a más reciente):");
        for (Libro l : libros) {
            System.out.println(l.getTitulo() + " - " + l.getDatosEdicion().getAnio());
        }
    }
}