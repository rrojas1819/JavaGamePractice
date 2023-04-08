public class testSite {
    public static void main(String arg[]){
/*
Array of attacks and evades and run away?

 */
        Enemy goblin = new Enemy(10 ,  4 ,  5);
        Player Knight = new Player(15,15,15);
    System.out.println(goblin + "\n");

    goblin.Attack(Knight);


    System.out.println(Knight + "\n");

    System.out.println(goblin);


    }

}
