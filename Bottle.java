package HomeWorck7;

public class Bottle {
    private int totalCapacity = 500;
    private int availableliquid = 400;
    private boolean open = true;

    public boolean hasLiqiud() {
        return availableliquid < 0;
    }

    public int availableLiqiud() {
        return this.availableliquid;
    }

    public int emptyCapacity() {
        return this.totalCapacity - this.availableliquid;
    }

    public Bottle(boolean open){
        this.open = open;
    }

    public void openBottle() {
        if (this.open == false) {
            System.out.println("Bottle opend");
            this.open = true;
        } else {
            System.out.println("The bottle is all ready open");
        }
    }

    public void clouseBottle() {
        if (this.open == false) {
            System.out.println("This bottle is all ready clouse");
        } else {
            System.out.println("Bottle clouse");
            this.open = false;
        }
    }

    public void drinkFromBottle(int howMuch) {
        if (open == false) {
            System.out.println("Please open first the bottle");
        } else {
            if (howMuch > this.availableliquid) {
                System.out.println("you gave to much , the bottle has: " + this.availableliquid + " avelibel liqiud");
            } else if (howMuch < this.availableliquid && howMuch != 0) {
                System.out.println("left in bottle " + (this.availableliquid - howMuch));
            } else if (howMuch == 0) {
                System.out.println("We drank nothing , we still have in bottle: " + this.availableliquid);
            }
        }
    }

}
