// Clase que contiene el método principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Sistema de Gestión de Estudiantes ---");
        System.out.println("--- Prueba de Herencia y Polimorfismo ---\n");
        
        // Instanciación de un objeto a partir de la clase base Estudiante
        Estudiante est1 = new Estudiante("Ana López", "AL102030", "Ingeniería de Software");
        
        // Instanciación de objetos a partir de las clases derivadas (Subclases)
        EstudianteBecado est2 = new EstudianteBecado("Carlos Ruiz", "CR405060", "Administración", 2500.50);
        EstudiantePosgrado est3 = new EstudiantePosgrado("Elena Martínez", "EM708090", "Ciencias Computacionales", "Maestría");

        // Prueba y uso de los métodos. 
        // El programa ejecutará la versión correspondiente de mostrarDetalles() según el tipo de objeto.
        System.out.println("Detalles del Estudiante Regular:");
        est1.mostrarDetalles();
        
        System.out.println("\nDetalles del Estudiante Becado:");
        est2.mostrarDetalles();
        
        System.out.println("\nDetalles del Estudiante de Posgrado:");
        est3.mostrarDetalles();
    }
}