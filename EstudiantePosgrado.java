// Clase derivada de Estudiante
public class EstudiantePosgrado extends Estudiante {
    private String nivel; // "Maestría", "Doctorado", etc.

    // Constructor que utiliza super() para reutilizar el constructor de la clase base
    public EstudiantePosgrado(String nombre, String matricula, String carrera, String nivel) {
        super(nombre, matricula, carrera);
        this.nivel = nivel;
    }

    // Sobrescritura de método para reutilizar y extender la funcionalidad
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Reutilización del método de la clase base
        System.out.println("Nivel de Posgrado: " + nivel);
    }
}
