public class persona {
    protected String nombre;
    protected int edad;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

class Empleado extends persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); 
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Departamento: " + departamento);
    }
}

class pruebaEmpleado {
    public static void main(String[] args) {
        persona p1 = new persona("Carlos", 30);
        System.out.println("=== Detalles de Persona ===");
        p1.mostrarDetalles();

        System.out.println();

        Empleado e1 = new Empleado("Ana", 28, "Recursos Humanos");
        System.out.println("=== Detalles de Empleado ===");
        e1.mostrarDetalles();
    }
}
