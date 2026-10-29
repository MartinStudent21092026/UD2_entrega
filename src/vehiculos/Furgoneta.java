package vehiculos;

public class Furgoneta extends Vehiculo {
    private String fabricante;
    private double volumenCarga;

    public Furgoneta(String modelo, int numeroPlazas, double precioPorDia, String fabricante, double volumenCarga) {
        super(modelo, numeroPlazas, precioPorDia);
        this.fabricante = fabricante;
        this.volumenCarga = volumenCarga;
    }

    public Furgoneta() {

    }

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
    public boolean esGrande(){
        return this.volumenCarga>=20;
    }
    public boolean cabeVolumen(double volumen){
        return this.volumenCarga>volumen;
    }
    public String toString(){
        return "[Furgoneta]"+this.getModelo()+", de "+this.fabricante+"("+this.getPrecioPorDia()+" €/día)";
    }
}
