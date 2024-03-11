import java.util.Random;

public class Tulip extends Flower{

    public Tulip() {
        name = "tulip";
        price = 20;
        neededArea = 2;
        chanceOfGrowth = 50;
    }

    public void watering(){
        Random rd = new Random();
        int water = rd.nextInt(51);
        chanceOfGrowth += water;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}
