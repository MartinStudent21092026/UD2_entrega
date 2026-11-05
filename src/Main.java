import vehiculos.*;
import usuarios.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coche c1 = new Coche("3008B", 4, 40.5, "Toyota", 80, Coche.Motor.DIESEL);
        Coche c2 = new Coche("3007B", 4, 60.5, "Nissan", 90, Coche.Motor.HIBRIDO);
        Furgoneta f1 = new Furgoneta("Peugeot Rifter",6,80.7,"Peugeot",10.5);
        Furgoneta f2 = new Furgoneta("Renault Kangoo",6,50.7,"Kangoo",11.5);
        Moto m1 = new Moto("MT-07",1,20.7,"Yamaha",3);
        Moto m2 = new Moto("TMAX",1,15.7,"Yamaha",5);
        Patinete p1 = new Patinete("Electric Scooter 4 Pro",1,20.7,"Yamaha",4,true);
        Patinete p2 = new Patinete("Electric Scooter 3 Lite",1,15.7,"Yamaha",5,false);
        Cliente usuario1 = new Cliente("Pepito","pepito1234",34,2000,c1,23);
        Cliente usuario2 = new Cliente("Mario","mario1234",3,2004,m1,45);
        Administrador usuario3 = new Administrador("Andrea","Andrea1234",45,2003,Administrador.Rol.JEFE);
        usuario3.asignarVehiculo(usuario1,m2);




    }
}