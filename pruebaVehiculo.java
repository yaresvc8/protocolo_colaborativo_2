package transporte;

public class pruebaVehiculo{
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Toyota", 180);
        System.out.println("=== Información del vehículo ===");
        v1.mostrarInformacion();

        System.out.println();

        Coche c1 = new Coche("Mazda", 220, 4);
        System.out.println(" Información del coche ");
        c1.mostrarInformacion();
    }
}


