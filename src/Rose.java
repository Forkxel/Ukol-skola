import java.util.Random;

public class Rose extends Flower{

    public Rose() {
        name = "rose";
        price = 50;
        neededArea = 10;
        chanceOfGrowth = 25;
    }

    public void watering(){
        Random rd = new Random();
        int water = rd.nextInt(76);
        chanceOfGrowth += water;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}
