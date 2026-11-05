package usuarios;

import vehiculos.Vehiculo;

import java.security.PublicKey;

public class Administrador extends Usuario {
    //Se declara las variables
    public enum Rol {JEFE, VENDEDOR}

    private Rol rol;

    //Se declara los constructores
    public Administrador(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Rol rol) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.rol = rol;
    }

    public Administrador() {

    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    //Se asigna un vehiculo
    public void asignarVehiculo(Cliente cliente, Vehiculo vehiculo) {
        cliente.setVehiculo(vehiculo);
    }

    //Se retira un vehiculo
    public void retirarVehiculo(Cliente cliente) {
        cliente.setVehiculo(null);
    }

    //Se declaro este metodo para que devuelva en un String las caracteristicas del objeto
    public String toString() {
        return "Administrador " + this.getNombreUsuario() + "(" + this.getId() + ")";
    }
}
