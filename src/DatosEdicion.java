public class DatosEdicion {
    private int isbn;
    private String editorial;
    private int anio;

    public DatosEdicion(int isbn, String editorial, int anio) {
        this.isbn = isbn;
        this.editorial = editorial;
        this.anio = anio;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
