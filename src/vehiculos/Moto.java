package vehiculos;

public class Moto extends Vehiculo {
    //Se declara las variables
    private String fabricante;
    private int cilindrada;
    //Se declaran los constructores
    public Moto(String modelo, int numeroPlazas, double precioPorDia, String fabricante, int cilindrada) {
        super(modelo, numeroPlazas, precioPorDia);
        this.fabricante = fabricante;
        this.cilindrada = cilindrada;
    }

    public Moto() {
    }
    //Se declara los metodos set y get
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    //Se declara un metodo que calcula la cilindrada por litro
    public double getCilindradaLitros() {
        return (double) this.cilindrada / 1000;
    }
    //Se declara un metodo para devolver un String con informacion de la cilindrada
    public String getEquivalenciaCilindrada() {
        return this.cilindrada + " cc equivale a " + this.getCilindradaLitros();
    }
    //Se declaro este metodo para que devuelva en un String las caracteristicas del objeto
    public String toString() {
        return "[Moto]" + this.getModelo() + ", de " + this.fabricante + "(" + this.getPrecioPorDia() + " €/día)";
    }
}
