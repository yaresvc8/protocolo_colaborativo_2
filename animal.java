public class animal {
    protected String especie;

    public animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

class Pez extends animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); 
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); 
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}

class pruebaAnimal {
    public static void main(String[] args) {
        
        animal animal1 = new animal("Mamífero");
        System.out.println("Detalles de Animal");
        animal1.mostrarEspecie();

        System.out.println();

        Pez pez1 = new Pez("Pez Payaso", "Agua Salada");
        System.out.println("=== Detalles de Pez ===");
        pez1.mostrarEspecie();
    }
}

