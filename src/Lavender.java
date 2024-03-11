import java.util.Random;

public class Lavender extends Flower{

    public Lavender() {
        name = "lavender";
        price = 100;
        neededArea = 60;
        chanceOfGrowth = 10;
    }

    public void watering(){
        Random rd = new Random();
        int water = rd.nextInt(76);
        chanceOfGrowth += water;
    }

    @Override
    public String toString() {
        return "Lavender{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }
}
