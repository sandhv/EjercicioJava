package operadorternario;

public class TestTernario {

    public static void main(String[] args) {

        validarAcceso(10,9,22,18,17,21);

    }

    public static void validarAcceso (int... valor) {

        for (int val: valor){
            if (val>=18 ){
                System.out.println("Acceso permitido");

            }
            else
                System.out.println("Acceso denegado");

        }




    }

}
