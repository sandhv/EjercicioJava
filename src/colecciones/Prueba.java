package colecciones;

public class Prueba {

    public static void main(String[] args) {

        Dvd venom = new Dvd ("Venom");
        Dvd megalodon = new Dvd ("Megalodon", "Accion");
        Dvd anabelle = new Dvd ("Anabelle", "Terror", "Vera Farmiga");

        System.out.println("Titulo: " + venom.getTitulo());
        System.out.println("Genero: " + venom.getGenero());
        System.out.println("Protagonista: " + venom.getProtagonista());

        System.out.println("Titulo: " + megalodon.getTitulo());
        System.out.println("Genero: " + megalodon.getGenero());
        System.out.println("Protagonista: " + megalodon.getProtagonista());

        System.out.println("Titulo: " + anabelle.getTitulo());
        System.out.println("Genero: " + anabelle.getGenero());
        System.out.println("Protagonista: " + anabelle.getProtagonista());
    }
}
