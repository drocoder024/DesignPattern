package AdapterDesignPattern.PUBG;

public class PlayerBotAdapter implements CommonPlayer{

    //Adapter design pattern makes two incompatible interface work together
    Bot bot;
    public  PlayerBotAdapter(Bot bot)
    { this.bot=bot;

    }
    @Override
    public void drive() {
        bot.move();
    }

    @Override
    public void shoot() {
      bot.smashHand();
    }
}
