package Clases;
public class Moto extends Vehiculo{
    public Moto(String marca, String modelo, Double tarifaBase){
    
    super(marca,modelo,tarifaBase);
    
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costo = (tarifaBase * dias) + 5;
        return costo;
    }
    
}