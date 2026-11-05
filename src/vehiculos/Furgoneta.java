package vehiculos;

public class Furgoneta extends Vehiculo {
    //Se declara las variables
    private String fabricante;
    private double volumenCarga;

    //Se declara los constructores
    public Furgoneta(String modelo, int numeroPlazas, double precioPorDia, String fabricante, double volumenCarga) {
        super(modelo, numeroPlazas, precioPorDia);
        this.fabricante = fabricante;
        this.volumenCarga = volumenCarga;
    }

    public Furgoneta() {

    }

    //Se declara los metodos get y set
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getVolumenCarga() {
        return volumenCarga;
    }

    public void setVolumenCarga(double volumenCarga) {
        this.volumenCarga = volumenCarga;
    }

    //Se crea un metodo para confirmar si el volumen de carga supera un determinado valor
    public boolean esGrande() {
        return this.volumenCarga >= 20;
    }

    //Se creo un metodo para comparar el volumen dado como parametro con el del objeto
    public boolean cabeVolumen(double volumen) {
        return this.volumenCarga > volumen;
    }

    //Se declaro este metodo para que devuelva en un String las caracteristicas del objeto
    public String toString() {
        return "[Furgoneta]" + this.getModelo() + ", de " + this.fabricante + "(" + this.getPrecioPorDia() + " €/día)";
    }
}
