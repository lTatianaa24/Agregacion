public class Biblioteca {
    private String nombre;
    private Libro[] catalogo;
    private int cantidad;

    // Constructor

    public Biblioteca(String nombre, int capacidad) {
<<<<<<< HEAD
        this.nombre = nombre; //el nombre como atributo de la clase Biblioteca toma el valor de lo que entra como parametro en el constructor
=======
        this.nombre = nombre; //el nombre como atrubuto de la clase Biblioteca toma el valor de lo que entra como parametro en el constructor
>>>>>>> 35d2f1c5cfe63a5d90756580bd510c3163a86820
        this.catalogo = new Libro[10]; // Se crea una instancia new para que en la clase de Biblioteca se pueda crear un arreglo de libros
        this.cantidad = 0;                              //  con una capacidad de 10 libros
        
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

<<<<<<< HEAD
=======
    public Libro[] getCatalogo() {
        return catalogo;
    }

    public int getCantidad() {
        return cantidad;
    }

>>>>>>> 35d2f1c5cfe63a5d90756580bd510c3163a86820
    // Metodos
    //Agregacion, agrega un libro que ya existe (creado afuera)
    public void agregarLibro(Libro libro) {
        if (cantidad < catalogo.length) { //Si la cantidad de libros es menor a la capacidad del arreglo
            catalogo[cantidad] = libro; //Se agrega el libro al arreglo en la posición cantidad
            cantidad++; //Se incrementa la cantidad de libros
            System.out.println("Libro \"" + libro.getTitulo() + "\" agregado al catálogo.");
        } else {
<<<<<<< HEAD
            System.out.println("El catálogo está lleno. No se puede agregar más libros. ");
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




=======
            System.out.println("El catálogo está lleno. No se puede.");
        }
    }




}
>>>>>>> 35d2f1c5cfe63a5d90756580bd510c3163a86820
