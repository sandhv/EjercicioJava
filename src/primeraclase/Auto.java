package primeraclase;

import primeraclase.excepciones.PlacaInvalidaExepction;

public class Auto extends Vehiculo {



     private String placa;

   // Constructor sin parametros (default)
    public Auto(){
    placa = "Desconocido";
    setNumeroLlantas(4);

    }


    // Constructor que recibe num de placa
    public Auto(String placa) throws PlacaInvalidaExepction{
        placa = placa.trim();
        if (placa.length() == 7 || placa.length() == 8)
        {
            this.placa = placa;
        } else
        {
            throw new PlacaInvalidaExepction("PLACA INVALIDA");
        }

    }

    public void lavarVehiculo(){
        System.out.println("Entrando al car wash");
    }

    //Getter
    public String getPlaca() {
        return placa; }

     //Setter
     public void setPlaca(String placa) {
         this.placa = placa;
        }



    }



