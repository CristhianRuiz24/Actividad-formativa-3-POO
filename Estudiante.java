public class Estudiante {
    
    // Encapsulamiento: atributos privados
    private String nombre;
    private String matricula;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, String matricula, String carrera) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    // Getters y Setters para buenas prácticas de encapsulamiento
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    
    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    // Método que delega la impresión al método toString
    public void mostrarDetalles() {
        System.out.println(this.toString());
    }

    // Uso de toString() para estandarizar cómo se convierte a texto el objeto
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Matrícula: " + matricula + " | Carrera: " + carrera;
    }
}