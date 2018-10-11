package estatic;

import colecciones.Dvd;

import java.util.ArrayList;
import java.util.List;

public class GalletaTest {

    public static void main(String[] args) {

        Dvd dvd = new Dvd();

        Galleta v1 = new Galleta ("chocolate","chico","redonda");
        Galleta v2 = new Galleta ("vainilla","chico","cuadrada");
        Galleta v3 = new Galleta ("fresa","mediano","plana");
        Galleta v4 = new Galleta ("nuez","grande","redonda");
        Galleta v5 = new Galleta ("limon","chico","cuadrada");
        Galleta v6 = new Galleta ("napolitano","chico","redonda");
        Galleta v7 = new Galleta ("oreo","mediano","redonda");
        Galleta v8 = new Galleta ("naranja","mediano","plana");
        Galleta v9 = new Galleta ("mani","chico","redonda");
        Galleta v10 = new Galleta ("canela","mediano","cuadrada");
        Galleta v11= new Galleta ("cafe","grande","redonda");
        Galleta v12 = new Galleta ("coco","mediano","redonda");
        Galleta v13 = new Galleta ("almendras","chico","cuadrada");
        Galleta v14 = new Galleta ("azucaradas","chico","´plana");
        Galleta v15 = new Galleta ("chocolate","chico","redonda");

        List<Galleta> galletas = new ArrayList<>();

        galletas.add(v1);
        galletas.add(v2);
        galletas.add(v3);
        galletas.add(v4);
        galletas.add(v5);
        galletas.add(v6);
        galletas.add(v7);
        galletas.add(v8);
        galletas.add(v9);
        galletas.add(v10);
        galletas.add(v11);
        galletas.add(v12);
        galletas.add(v13);
        galletas.add(v14);
        galletas.add(v15);

        for (Galleta galleta:galletas){
            System.out.println(Galleta.getCantidad()+ " - "  + galleta);
        }




    }
}
