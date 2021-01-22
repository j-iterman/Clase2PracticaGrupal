package clase2;

public class Libro {
    private String nombre;
    private int isbn;
    private String autor;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String nombre, int isbn, String autor) {
        this.nombre = nombre;
        this.isbn = isbn;
        this.autor = autor;
        this.disponible = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return  nombre + ", " + isbn + ", " + autor;
    }

    public void prestamo(){
        if (estaDisponible()) this.disponible = false;
    }

    public void devolucion(){
        if(!estaDisponible()) this.disponible = true;
    }
}
