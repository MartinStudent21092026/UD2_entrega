package vehiculos;

public class Moto extends Vehiculo {
    private String fabricante;
    private int cilindrada;

    public Moto(String modelo, int numeroPlazas, double precioPorDia, String fabricante, int cilindrada) {
        super(modelo, numeroPlazas, precioPorDia);
        this.fabricante = fabricante;
        this.cilindrada = cilindrada;
    }

    public Moto() {
    }

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

    public double getCilindradaLitros() {
        return (double) this.cilindrada / 1000;
    }

    public String getEquivalenciaCilindrada() {
        return this.cilindrada + " cc equivale a " + this.getCilindradaLitros();
    }

    public String toString() {
        return "[Moto]" + this.getModelo() + ", de " + this.fabricante + "(" + this.getPrecioPorDia() + " €/día)";
    }
}
