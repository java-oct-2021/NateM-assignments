public class BatTest {
    public static void main(String[] args) {
        Bat giantBat = new Bat(300);

        giantBat.fly();
        giantBat.fly();
        giantBat.eatHumans();
        giantBat.eatHumans();
        giantBat.attackTown();
        giantBat.attackTown();
        giantBat.attackTown();

        giantBat.displayEnergy();
    }
}