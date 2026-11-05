package usuarios;

import vehiculos.Vehiculo;

public class Cliente extends Usuario {
    //Se declara las variables
    private Vehiculo vehiculo;
    private int numSocio;

    //Se declara los constructores
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

    //Se declara los metodos get y set
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    //Se declara un metodo para calcular el precio
    public double calcularPrecio(int numVehiculos, int dias) {
        return numVehiculos * dias * this.vehiculo.getPrecioPorDia();
    }

    //Se declaro este metodo para que devuelva en un String las caracteristicas del objeto
    public String toString() {
        return "Cliente" + this.getNombreUsuario() + "(" + this.getId() + ")";
    }

}
