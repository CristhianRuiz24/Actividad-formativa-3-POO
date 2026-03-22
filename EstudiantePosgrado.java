public class EstudiantePosgrado extends Estudiante {
    private String nivel; // "Maestría", "Doctorado", etc.

    public EstudiantePosgrado(String nombre, String matricula, String carrera, String nivel) {
        super(nombre, matricula, carrera);
        this.nivel = nivel;
    }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }

    @Override
    public String toString() {
        return super.toString() + " | Nivel de Posgrado: " + nivel;
    }
}
