public class PlayerTester {
    public static void main(String[] args) {

        Player p1 = new Player();
        p1.displayPlayerDetails();
        Player p2 = new Player(2, "Rohit", 21);
        p2.displayPlayerDetails();

        Player p3 = new Player("Nitesh", 1);
        p3.displayPlayerDetails();

        System.out.println(Player.getPlayercount());
    }
}
