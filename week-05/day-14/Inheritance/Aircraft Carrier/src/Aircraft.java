public class Aircraft {

//    Aircrafts
//    Create a class that represents an aircraft
//            There are 2 types of aircrafts: F16 and F35
//    Both aircraft should track how many ammo it has
//            F16
//    Max ammo: 8
//    Base damage: 30
//    F35
//    Max ammo: 12
//    Base damage: 50
//    All the aircrafts should be created with empty ammo store
//
//    Methods:
//    fight
//    It should use all the ammos (set it to 0) and it should return the damage it deals
//    The damage is the multiplication of the base damage and the ammos
//    refill
//    It should take a number as parameter and substract as much ammo as possibe
//    It can't have more ammo than the number or the max ammo
//    It should return the remaining ammo
//    Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
//    getType
//    It should return it's type as a string
//    getStatus
//    It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500
//    isPriority
//    It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16

    String type;
    int maxAmmo;
    int baseDamage;
    int ammo;
    boolean priority;

    public Aircraft() {
        this.ammo = 0;
    }

    public int fight()
    {
        int damage = baseDamage * ammo;
        this.ammo = 0;

        return damage;
    }

    public int refill(int ammoFilled) {

        int leftoverAmmo;

        if (ammoFilled <= (maxAmmo - ammo)) {
            ammo += ammoFilled;
            leftoverAmmo = 0;
        }
        else{
            ammo = maxAmmo;
            leftoverAmmo = (maxAmmo - ammo) - ammoFilled;
        }

        return leftoverAmmo;

    }

    public String getType()
    {
        return this.type;
    }

    public String getStatus(){

        StringBuilder sb = new StringBuilder();

        sb.append("Type: " + type +", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + ammo*baseDamage + "\n");

        String status = sb.toString();

        return status;
    }

    public boolean isPriority() {
         return priority;
    }
}
