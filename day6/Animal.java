
public class Animal{
    String name , species;
    Animal(String name, String species){
        this.name = name;
        this.species = species;

    }

}
public class Dog extends Animal{
    String breed;
    Dog(String name, String species, String breed){
        super(name, species);
        this.breed = breed;
    }
    }



class Mains{
   public static void main(String[] args){
   }
}
