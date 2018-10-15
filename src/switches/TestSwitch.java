package switches;

public class TestSwitch {

    public static void main(String[] args) {

        int x = 5;

        switch (x) {

            case 1:
                System.out.println("x es igual a 1");
                break;
            case 2:
                System.out.println("x es igual a 2");
                break;
            case 3:
                System.out.println("x es igual a 3");
                break;
            case 4:
                System.out.println("x es igual a 4");
                break;
            case 5:
                System.out.println("x es igual a 5");
                break;
            default:
                System.out.println("no se saabe el valor de x");


        }

        Color rosa = Color.ROSA;

        switch (rosa) {

            case ROJO:
                System.out.println("rosa es igual a Rojo");
                break;
            case VERDE:
                System.out.println("rosa es igual a Verde");
                break;
            case AZUL:
                System.out.println("rosa es igual a Azul");
                break;
            case AMARILLO:
                System.out.println("rosa es igual a Amarillo");
                break;
            case ROSA:
                System.out.println("rosa es igual a Rosa");
                break;
            default:
                System.out.println("se desconoce el color");
        }
    }
}
