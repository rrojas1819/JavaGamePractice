public class testSite {
    public static void main(String args[]){
/*
Array of attacks and evades and run away?

 */
        Enemy goblin = new Enemy(10 ,  50 ,  5);
        Player Knight = new Player(15,15,15);

        System.out.println(goblin + "\n");

        goblin.Attack(Knight);


        System.out.println(Knight + "\n");

        System.out.println(goblin);

        Knight.healthChecker(Knight.getHP(), Knight);


    }

}