import java.util.ArrayList;

public class Farm {

//    Reuse your Animal class
//    Create a Farm class
//    it has list of Animals
//                    it has slots which defines the number of free places for animals
//    breed() -> creates a new animal if there's place for it
//    slaughter() -> removes the least hungry animal

    ArrayList<Animal> animals;
    int slots;

    public void breed(){
        if (slots>0){
            Animal babyAnimal = new Animal();
            animals.add(babyAnimal);
        }
    }

    public void slaughter() {

        int maxHunger = 0;
        Animal poorAnimal = new Animal();

        for (Animal a: animals) {

            if (a.hunger>maxHunger)
            {maxHunger = a.hunger;
            poorAnimal = a;}
        }

        animals.remove(poorAnimal);



    }



}
