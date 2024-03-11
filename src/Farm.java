import java.util.ArrayList;

public class Farm {

    ArrayList<Animal> barn = new ArrayList<>();

    public void addAnimal(Animal animal){
        barn.add(animal);
    }

    public void removeAnimal(int index){
        System.out.println(barn.toString());
        barn.remove(index);
    }
}
