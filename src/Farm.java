import java.util.ArrayList;

public class Farm {

    ArrayList<Animal> barn = new ArrayList<>();
    ArrayList<Flower> field = new ArrayList<>();
    private double sizeOfField = 0;

    public void addAnimal(Animal animal) throws Exception {
        if (barn.size() == 20){
            throw new Exception("You don't have enough room in the barn.");
        } else {
            barn.add(animal);
        }
    }

    public void removeAnimal(int index){
        System.out.println(barn.toString());
        barn.remove(index);
    }

    public void addFlower(Flower flower) throws Exception {
        if (sizeOfField < 100 && field.size() != 5){
            field.add(flower);
            sizeOfField += flower.getNeededArea();
        } else {
            throw new Exception("You don't have enough room in your field");
        }
    }

    public void removeFlower(int index){
        System.out.println(field.toString());
        field.remove(index);
        sizeOfField -= field.get(index).getNeededArea();
    }

    public void buy(){

    }
}
