package Clases;
//arnold ggggg
public class Auto extends Vehiculo {

    public Auto(String marca, String modelo, Double tarifaBase) {

        super(marca, modelo, tarifaBase);

    }

    @Override
    public void calcularCostoAlquiler(int dias) {
        double costo = (tarifaBase * dias) + (10 * dias);
        System.out.println("Costo alquiler auto: $" + costo);
    }

}