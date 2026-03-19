// Clase principal que define la entidad Estudiante
public class Estudiante {
    
    // Declaración de atributos privados (Encapsulamiento)
    private String nombre;
    private String matricula;
    private String carrera;

    // Constructor: Se ejecuta al instanciar un nuevo objeto para inicializar sus atributos
    public Estudiante(String nombre, String matricula, String carrera) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    // Método para mostrar los detalles del estudiante en consola
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + " | Matrícula: " + matricula + " | Carrera: " + carrera);
    }

    // Método Getter para obtener el nombre del estudiante si es necesario en otra parte del programa
    public String getNombre() {
        return nombre;
    }
}