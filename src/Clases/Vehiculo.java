
package Clases;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected Double tarifaBase;
        public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Double tarifaBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getTarifaBase() {
        return tarifaBase;
    }
    public abstract void calcularCostoAlquiler(int dias);

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", tarifaBase=" + tarifaBase + '}';
    }
    
}

