package enumces;

public class TestCafe {

    public static void main(String[] args) {

        Cafe uno = new Cafe();
        uno.setTamanoCafe(TamanoCafe.ALTO);
        System.out.println(uno.getTamanoCafe());
        System.out.println(uno.getTamanoCafe().getOnzas());
        System.out.println(uno.getTamanoCafe().getTipoTapa());

        Cafe dos = new Cafe();
        dos.setTamanoCafe(TamanoCafe.GRANDE);
        System.out.println(dos.getTamanoCafe());
        System.out.println(dos.getTamanoCafe().getOnzas());
        System.out.println(dos.getTamanoCafe().getTipoTapa());

        Cafe tres = new Cafe();
        tres.setTamanoCafe(TamanoCafe.VENTI);
        System.out.println(tres.getTamanoCafe());
        System.out.println(tres.getTamanoCafe().getOnzas());
        System.out.println(tres.getTamanoCafe().getTipoTapa());

    }
}
