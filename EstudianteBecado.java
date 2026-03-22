public class EstudianteBecado extends Estudiante {
    private double montoBeca;

    public EstudianteBecado(String nombre, String matricula, String carrera, double montoBeca) {
        super(nombre, matricula, carrera);
        this.montoBeca = montoBeca;
    }

    public double getMontoBeca() { return montoBeca; }
    public void setMontoBeca(double montoBeca) { this.montoBeca = montoBeca; }

    @Override
    public String toString() {
        // Llama a toString() de la clase padre para obtener los datos base y le añade los propios
        return super.toString() + " | Monto de Beca: $" + String.format("%.2f", montoBeca);
    }
}
