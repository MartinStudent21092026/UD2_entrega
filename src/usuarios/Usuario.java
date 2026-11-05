package usuarios;

public class Usuario {
    //Se declara las variables
    private String nombreUsuario;
    private String contrasenya;
    private int id;
    private int anyoNacimiento;
    //Se declara los construtores

    public Usuario(String nombreUsuario, String contrasenya, int id, int anyoNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.id = id;
        this.anyoNacimiento = anyoNacimiento;
    }

    public Usuario() {

    }

    //Se declara los metodos get y set
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    //Se declara un metodo para comprobar si es adulto
    public boolean esAdulto() {
        return (2026 - this.anyoNacimiento) >= 18;
    }

    //Se declara un metodo para comprobar que el numero de caracteres de contraseña es mayor a 10
    public boolean contrasenyaSegura() {
        return this.contrasenya.length() > 10;
    }

    //Se declaro este metodo para que devuelva en un String las caracteristicas del objeto
    public String toString() {
        return this.nombreUsuario + "(" + this.id + ")";
    }
}
