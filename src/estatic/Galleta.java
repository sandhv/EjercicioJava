package estatic;

public class Galleta {

    private String sabor;
    private String tamano;
    private String forma;
    private String color;
    private static int cantidad =0;

    Galleta(String sabor, String tamano, String forma) {


        this.sabor = sabor;
        this.tamano = tamano;
        this.forma = forma;
        this.cantidad ++;
    }

    public static int getCantidad(){
        return cantidad;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
