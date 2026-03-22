public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Sistema de Gestión de Estudiantes ---");
        System.out.println("--- Prueba Optimizada de Herencia y Polimorfismo ---\n");
        
        // OPTIMIZACIÓN: Se usa un arreglo de la clase Base (Estudiante) que contiene
        // objetos de clases Hijas. Esto es el verdadero "Polimorfismo" (una misma interfaz, múltiples formas).
        Estudiante[] estudiantes = {
            new Estudiante("Ana López", "AL102030", "Ingeniería de Software"),
            new EstudianteBecado("Carlos Ruiz", "CR405060", "Administración", 2500.50),
            new EstudiantePosgrado("Elena Martínez", "EM708090", "Ciencias Computacionales", "Maestría")
        };

        // Recorremos la lista con un for-each. 
        // Java decide dinámicamente qué toString() ejecutar dependiendo del tipo real del objeto.
        for (Estudiante est : estudiantes) {
            System.out.println("Detalles del " + est.getClass().getSimpleName() + ":");
            est.mostrarDetalles();
            System.out.println(); // Salto de línea para que se vea más ordenado
        }
    }
}