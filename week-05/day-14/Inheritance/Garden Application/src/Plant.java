public class Plant {

    boolean isThirsty;
    double waterLevel;
    double waterNeed;
    double absorbPercentage;
    String color;
    String name;

    public Plant(String color) {
        this.isThirsty = true;
        this.waterLevel = 0;
        this.color = color;
    }

    public void absorb(double addedWater)
    {
        this.waterLevel += absorbPercentage * addedWater;
    }
}
