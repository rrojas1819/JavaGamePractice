

public class testSite {
    public static void main(String[] args) {
        Events game = new Events();
        LayOut tab = new LayOut();




        Mob Knight = new Player(10,10,10);
        Mob Goblin = new Enemy(10,1,10);


        while (game.getEventAvail()){
            game.eventOne(Goblin,Knight,tab);
        }



    }
}