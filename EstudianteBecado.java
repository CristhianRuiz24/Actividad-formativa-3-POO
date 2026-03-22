// Clase derivada de Estudiante
public class EstudianteBecado extends Estudiante {
    private double montoBeca;

    // Constructor que utiliza super() para reutilizar el constructor de la clase base
    public EstudianteBecado(String nombre, String matricula, String carrera, double montoBeca) {
        super(nombre, matricula, carrera);
        this.montoBeca = montoBeca;
    }

    // Sobrescritura de método para reutilizar y extender la funcionalidad
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Reutilización del método de la clase base
        System.out.println("Monto de Beca: $" + montoBeca);
    }
}
