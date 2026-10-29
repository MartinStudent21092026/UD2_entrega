package vehiculos;

public class Patinete extends Vehiculo{
    private String marca;
    private int capacidadBateria;
    private boolean tieneLuces;

    public Patinete(String modelo, int numeroPlazas, double precioPorDia, String marca, int capacidadBateria, boolean tieneLuces) {
        super(modelo, numeroPlazas, precioPorDia);
        this.marca = marca;
        this.capacidadBateria = capacidadBateria;
        this.tieneLuces = tieneLuces;
    }

    public Patinete() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public boolean isTieneLuces() {
        return tieneLuces;
    }

    public void setTieneLuces(boolean tieneLuces) {
        this.tieneLuces = tieneLuces;
    }
    public double getAutonmia(double consumo){
        return this.capacidadBateria/consumo;
    }
    public String toString(){
        return "[Patinete]"+this.getModelo()+", de "+this.getMarca()+"("+this.getPrecioPorDia()+" €/día)";
    }
}
