package empresa;

public class pruebaHerencia {
    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado("Carlos Pérez", 1500000);
        System.out.println("Detalles del empleado");
        emp1.mostrarDetalles();

        System.out.println();

        Gerente ger1 = new Gerente("Ana Gómez", 3500000, "Recursos Humanos");
        System.out.println("Detalles del gerente");
        ger1.mostrarDetalles();
    }
}

