package usuarios;

import vehiculos.Vehiculo;

public class Cliente extends Usuario{
    private Vehiculo vehiculo;
    private int numSocio;

    public Cliente(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Vehiculo vehiculo, int numSocio) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.vehiculo = vehiculo;
        this.numSocio = numSocio;
    }

    public Cliente() {

    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public double calcularPrecio(int numVehiculos, int dias){
         return numVehiculos*dias*this.vehiculo.getPrecioPorDia();
    }
    public String toString(){
        return "Cliente"+this.getNombreUsuario()+"("+this.getId()+")";
    }

}
