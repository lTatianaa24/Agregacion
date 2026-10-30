public class Biblioteca {
    private String nombre;
    private Libro[] catalogo;
    private int cantidad;

    // Constructor

    public Biblioteca(String nombre, int capacidad) {
        this.nombre = nombre;
        this.catalogo = new Libro[capacidad];
        this.cantidad = 0;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public Libro[] getCatalogo() {
        return catalogo;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Metodos
    //Agregacion, agrega un libro que ya existe (creado afuera)
    public void agregarLibro(Libro libro) {
        if (cantidad < catalogo.length) {
            catalogo[cantidad] = libro;
            cantidad++;
            System.out.println("Libro \"" + libro.getTitulo() + "\" agregado al catálogo.");
        } else {
            System.out.println("El catálogo está lleno. No se puede agregar más libros.");
        }
    }

    // Imprime todos los libros del catálogo
    public void mostrarCatalogo() {
        System.out.println("=== Catálogo: " + nombre + " ===");
        if (cantidad == 0) {
            System.out.println("El catálogo está vacío.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                catalogo[i].mostrarInfo();
                System.out.println();
            }
        }

    }

    // Busca libros por auntor e imprime los resultados
    public void buscarPorAutor(String autor) {
        System.out.println("=== Resultados de búsqueda por autor: " + autor + " ===");
        boolean encontrado = false;
        for (int i = 0; i < cantidad; i++) {
            if (catalogo[i].getAutor().equalsIgnoreCase(autor)) {
                catalogo[i].mostrarInfo();
                System.out.println();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros del autor \"" + autor + "\".");
        }
    }

}
