package equals;

public class EqualsTest {
    public static void main(String[] args){

        Persona p1 = new Persona();
        Persona p2 = new Persona() ;

        p1.setNombre("pedro");
        p1.setEdad(26);

        p2.setNombre("pedro");
        p2.setEdad(26);


        System.out.println(p1.equals(p2));
    }
}
