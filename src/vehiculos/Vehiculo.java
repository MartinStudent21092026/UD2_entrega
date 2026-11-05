package vehiculos;

public class Vehiculo {
    //Se declara las variables
    private String modelo;
    private int numeroPlazas ;
    private double precioPorDia;
    //Se declara los constructores
    public Vehiculo(String modelo, int numeroPlazas, double precioPorDia) {
        this.modelo = modelo;
        this.numeroPlazas = numeroPlazas;
        this.precioPorDia = precioPorDia;
    }
    public Vehiculo(){

    }
    //Se declara los metodos get y set
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
    //Se declara un metodo para calcular el precio
    public int calcularPrecio(int numeVehiculos, int dias){
        return numeVehiculos*dias;
    }
    //Se declaro este metodo para que devuelva en un String las caracteristicas del objeto
    public String toString(){
        return "[Vehiculo]"+this.modelo+" ("+this.precioPorDia+"€/día)";
    }
}
