package primeraclase.excepciones;

import primeraclase.Vehiculo;

public class PlacaInvalidaExepction extends Exception {

    public PlacaInvalidaExepction(String mensaje){
        super(mensaje);
    }

    public static class Motocicleta extends Vehiculo {

        public void lavarVehiculo() {
            System.out.println("lavando a mano motocicleta");
        }
        private String placa;

        public Motocicleta() {
            placa = "Desconocido";
            setNumeroLlantas(2);


        }

    }
}
