package Clases;

public class Main {

    public static void main(String[] args) {

        Vehiculo auto = new Auto("Toyota", "Prado", 30.0);
        Vehiculo moto = new Moto("MRX", "Arizona", 15.0);

        int dias = 5;

        System.out.println("Detalle de alquiler (" + dias + " dias)\n");

        double costoAuto = auto.calcularCostoAlquiler(dias);

        System.out.println("Tipo: Auto");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Tarifa base/dia: $" + auto.getTarifaBase());
        System.out.println("Costo total de alquiler: $" + costoAuto);

        System.out.println("\n");

        double costoMoto = moto.calcularCostoAlquiler(dias);

        System.out.println("Tipo: Moto");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Tarifa base/dia: $" + moto.getTarifaBase());
        System.out.println("Costo total de alquiler: $" + costoMoto);
    }
}