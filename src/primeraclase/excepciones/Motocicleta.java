package primeraclase.excepciones;

import primeraclase.Vehiculo;

public class Motocicleta extends Vehiculo {

    public String placa;

    public Motocicleta() {

        setNumeroLlantas(2);
    }

    public void lavarVehiculo() {
        System.out.println("Lavado a mano");
    }

    public Motocicleta(String placa) throws PlacaInvalidaExepction {
        placa = placa.trim();
        if (placa.length() == 5 || placa.length() == 6) {
            this.placa = placa;
        } else {
            throw new PlacaInvalidaExepction("PLACA INVALIDA");
        }

        }

    //Getter
    public String getPlaca() {
        return placa;
    }

    //Setter
    public void setPlaca (String placa) {
        this.placa = placa;
    }


}
