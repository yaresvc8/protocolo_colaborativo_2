// ==========================
// EJERCICIO 1: Uso incorrecto de super
// ==========================

class TestSuper {
    public static void main(String[] args) {
        // Esto dará error de compilación:

        System.out.println("Ejercicio 1: No se puede usar super fuera de una clase derivada.");
    }
}

// ==========================
// EJERCICIO 2: Acceso a atributo private con super
// ==========================

class Animal {
    private String especie; // privado, no accesible con super

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }
}

class Perro extends Animal {
    public Perro(String especie) {
        super(especie);
    }

    public void mostrarDetalles() {
        // ERROR si intentamos esto:
        // System.out.println("Especie: " + super.especie);

        // ✅ Forma correcta: usar el getter
        System.out.println("Especie (usando getter): " + super.getEspecie());
    }
}

// ==========================
// CLASE DE PRUEBA GENERAL
// ==========================

public class MainTest {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1");
        TestSuper.main(args); // ejecutamos el primer ejercicio

        System.out.println("EJERCICIO 2");
        Perro perro = new Perro("Canino");
        perro.mostrarDetalles();
    }
}
