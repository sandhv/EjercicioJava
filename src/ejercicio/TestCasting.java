package ejercicio;

class Animal {
    void hacerRuido(){
        System.out.println("Ruido genérico de animal");
    }
}

class Perro extends Animal {
    @Override
    void hacerRuido(){
        System.out.println("GUAU!"); }
        void levantarPata(){
            System.out.println("Perro levantando la pata");
        }
}

public class TestCasting{
    public static void main(String[] args){
     Animal[] animales = {new Animal(), new Perro(), new Animal()};
     for (Animal animal: animales){
         animal.hacerRuido();
         if (animal instanceof Perro){
             Perro p = (Perro) animal;
             p.levantarPata();
         }
     }
    }
}