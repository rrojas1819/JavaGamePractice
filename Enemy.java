public class Enemy extends Mob{


    public Enemy(int newHealth, int newDMG , int newBLOCK ){
        setAll(newHealth,newDMG,newBLOCK);

    }

    public void Attack(Player P1){


        if(super.Choice()){
            P1.SubtractHealth(DMG);

        }
        else{
            System.out.println("Failed to attack. ");
        }

    }

    public void Evade(){
        if(super.EvadeChance()){
            super.AddHealth(DMG);
            System.out.println("Enemy Evaded!!:  \nEnemy Healed! ");
        }
    }



}