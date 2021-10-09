public class HumanTest {
    public static void main(String[] args) {
        Ninja player1 = new Ninja();
        Wizard player2 = new Wizard();
        Samurai player3 = new Samurai();

        player2.fireball(player1);
        player3.deathBlow(player2);
    }
}