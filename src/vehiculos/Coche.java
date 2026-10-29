package vehiculos;

public class Coche extends Vehiculo {
    private String marca;
    private int caballos;
    public enum Motor{GASOLINA,DIESEL,HIBRIDO,ELECTRICO};
    private Motor motor;


    public Coche(String modelo, int numeroPlazas, double precioPorDia, String marca, int caballos, Motor motor) {
        super(modelo, numeroPlazas, precioPorDia);
        this.marca = marca;
        this.caballos = caballos;
        this.motor = motor;
    }
    public Coche(String modelo, int numeroPlazas, double precioPorDia, String marca, Motor motor) {
        super(modelo, numeroPlazas, precioPorDia);
        this.marca = marca;
        this.caballos = 100;
        this.motor = motor;
    }

    public Coche() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public boolean esPotente(){
        return this.caballos>200;
    }
    public String toString(){
        return "[Coche]"+this.getModelo()+", de "+this.getMarca()+" ("+this.getPrecioPorDia()+"€/día)";
    }

}
