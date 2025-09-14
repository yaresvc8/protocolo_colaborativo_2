package herencia;

public class pruebaHerencia {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Carlos", 20, "2025A123");
        Estudiante est2 = new Estudiante("María", 22, "2025B456");

        System.out.println("Detalles del estudiante 1");
        est1.mostrarDetalles();

        System.out.println(" Detalles del estudiante 2");
        est2.mostrarDetalles();
    }
}

