import java.util.ArrayList;

public class Farm {

    ArrayList<Animal> barn = new ArrayList<>();

    public void addAnimal(Animal animal){
        if (barn.size() == 20){
            System.out.println("You don't have enough room in the barn.");
        } else {
            barn.add(animal);
        }
    }

    public void removeAnimal(int index){
        System.out.println(barn.toString());
        barn.remove(index);
    }
}
