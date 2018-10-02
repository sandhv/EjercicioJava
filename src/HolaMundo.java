import loops.Loops;
import primeraclase.Auto;
import primeraclase.Vehiculo;
import primeraclase.excepciones.Motocicleta;
import primeraclase.excepciones.PlacaInvalidaExepction;

/**
 * Autor: Sandra Hernández Valero
 * Fecha: 27/09/18
 * Hora: 11:45am
 * Project Ejercicios Java
 */

public class HolaMundo {
    // Este es el método main
    public static void main(String[] args)throws Exception{
        System.out.println("Hola mundo cruel!");

        Loops loops = new Loops();
        loops.iterarConFor();

        Auto auto = new Auto();
        System.out.println(auto.getPlaca());
        System.out.println("Llantas: " + auto.getNumeroLlantas());


        Motocicleta moto = new Motocicleta();
        System.out.println("Llantas: " + moto.getNumeroLlantas());
        moto.lavarVehiculo();

        try {
            Auto auto2 = new Auto("ULD7727");
            System.out.println(auto2.getPlaca());
        } catch (PlacaInvalidaExepction e){
            System.out.println("OCURRIO UN PROBLEMA AL CREAR AUTO: " + e.getMessage());
            throw e;
        } catch (RuntimeException re) {
            // liberar recursos

        }


    }
}
