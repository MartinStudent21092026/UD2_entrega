package vehiculos;

public class Coche extends Vehiculo {
    //Se declaran las variables
    private String marca;
    private int caballos;

    public enum Motor {GASOLINA, DIESEL, HIBRIDO, ELECTRICO}

    ;
    private Motor motor;

    //Se declara los constructores
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

    //Se declara los metodos set y get
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

    //Se un metodo para valide si el vehiculo es potente
    public boolean esPotente() {
        return this.caballos > 200;
    }

    //Se declaro este metodo para que devuelva en un String las caracteristicas del objeto
    public String toString() {
        return "[Coche]" + this.getModelo() + ", de " + this.getMarca() + " (" + this.getPrecioPorDia() + "€/día)";
    }

}
