package AdapterDesignPattern.PUBG;

public class Main {
    public static void main(String[] args) {
        CommonPlayer player= new Player();
        player.drive();
        player.shoot();

        ArtificialPlayer artificialPlayer = new Bot();
        artificialPlayer.move();
        artificialPlayer.smashHand();

        CommonPlayer playerBot = new PlayerBotAdapter((Bot) artificialPlayer);
        playerBot.shoot();
        playerBot.drive();
    }
}
