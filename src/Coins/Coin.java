package Coins;

public class Coin {
    public double probabilityOfTails() {
        return 0.5;
    }


    public double probabilityOfNoTails() {
        return 1 - this.probabilityOfTails();
    }
}
