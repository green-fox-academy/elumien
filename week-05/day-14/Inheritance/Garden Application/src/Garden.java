import java.util.ArrayList;

public class Garden {
//    The Garden
//    is able to hold unlimited amount of flowers or trees
//    when watering it should only water those what needs water with equally divided amount amongst them
//    eg. watering with 40 and 4 of them need water then each get watered with 10

ArrayList<Plant> plants;

    public Garden() {
        plants = new ArrayList<>();
    }

    public void water(int waterAmount)
{
    int divisor = 0;

    for (Plant p : plants) {
        if (p.waterLevel < p.waterNeed) {
            divisor += 1;
        }
    }

    double waterPerPlant = waterAmount/divisor;

    for (Plant p : plants) {
        if (p.waterLevel < p.waterNeed) {
            p.absorb(waterPerPlant);
        }
    }

    System.out.println("Watering with "+ waterAmount+ "\n");
}

public void status()
{
    StringBuilder stringBuilder = new StringBuilder();

    for (Plant p : plants) {

        stringBuilder.append("The " + p.name);

        if (p.waterLevel < p.waterNeed) {
            stringBuilder.append(" needs water. \n");
        }
        else
        {
            stringBuilder.append(" doesnt need water. \n");
        }
    }

    System.out.println(stringBuilder);
}


}
