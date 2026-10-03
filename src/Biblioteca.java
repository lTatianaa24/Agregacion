public class Biblioteca {
    private String nombre;
    private Libro[] catalogo;
    private int cantidad;

    // Constructor

    public Biblioteca(String nombre, int capacidad) {
        this.nombre = nombre; //el nombre como atrubuto de la clase Biblioteca toma el valor de lo que entra como parametro en el constructor
        this.catalogo = new Libro[10]; // Se crea una instancia new para que en la clase de Biblioteca se pueda crear un arreglo de libros
        this.cantidad = 0;                              //  con una capacidad de 10 libros
        
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
        if (cantidad < catalogo.length) { //Si la cantidad de libros es menor a la capacidad del arreglo
            catalogo[cantidad] = libro; //Se agrega el libro al arreglo en la posición cantidad
            cantidad++; //Se incrementa la cantidad de libros
            System.out.println("Libro \"" + libro.getTitulo() + "\" agregado al catálogo.");
        } else {
            System.out.println("El catálogo está lleno. No se puede.");
        }
    }




}
