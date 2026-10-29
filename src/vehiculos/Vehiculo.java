package vehiculos;

public class Vehiculo {
    private String modelo;
    private int numeroPlazas ;
    private double precioPorDia;

    public Vehiculo(String modelo, int numeroPlazas, double precioPorDia) {
        this.modelo = modelo;
        this.numeroPlazas = numeroPlazas;
        this.precioPorDia = precioPorDia;
    }
    public Vehiculo(){

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }
    public int calcularPrecio(int numeVehiculos, int dias){
        return numeVehiculos*dias;
    }
    public String toString(){
        return "[Vehiculo]"+this.modelo+" ("+this.precioPorDia+"€/día)";
    }
}
