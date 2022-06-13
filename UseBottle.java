package HomeWorck7;

public class UseBottle {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(true);

        System.out.println(bottle1.hasLiqiud());
        System.out.println(bottle1.availableLiqiud());
        System.out.println(bottle1.emptyCapacity());
        bottle1.clouseBottle();
        bottle1.clouseBottle();
        bottle1.openBottle();
        bottle1.openBottle();
        bottle1.drinkFromBottle(0);


    }
}
