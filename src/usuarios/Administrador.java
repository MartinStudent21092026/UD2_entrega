package usuarios;

import vehiculos.Vehiculo;

import java.security.PublicKey;

public class Administrador extends Usuario{
    public enum Rol{JEFE,VENDEDOR}
    private Rol rol;

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
    public void asignarVehiculo(Cliente cliente, Vehiculo vehiculo){
        cliente.setVehiculo(vehiculo);
    }
    public void retirarVehiculo(Cliente cliente){
        cliente.setVehiculo(null);
    }
    public String toString(){
        return "Administrador "+this.getNombreUsuario()+"("+this.getId()+")";
    }
}
