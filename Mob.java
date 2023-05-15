import java.util.Random;
public abstract class Mob {

    protected int HP;
    protected int DMG;
    protected int BLOCK;

    protected int BURN;
    protected int POISON;
    protected int BLEED;



    public void setAll(int newHP, int newDMG , int newBLOCK){
        HP = newHP;
        DMG = newDMG;
        BLOCK = newBLOCK;
    }







    public void subtractHealth(int newHP){
        HP -= newHP;
    }

    public void subtractDMG (int newDMG){
        DMG -= newDMG;
    }

    public void subtractBLOCK(int newBLOCK){
        BLOCK -= newBLOCK;
    }










    public void addHealth(int newHP){
        HP += newHP;
    }

    public void addDMG (int newDMG){
        DMG += newDMG;
    }

    public void addBLOCK(int newBLOCK){
        BLOCK += newBLOCK;
    }











    public int getHP(){
        return HP;
    }
    public int getDMG(){
        return DMG;
    }
    public int getBLOCK(){
        return BLOCK;
    }





    public void attack(Mob Mob1){
        if(Choice()){
            Mob1.subtractHealth(DMG);
        }
        else{
            System.out.println("Failed to attack. ");
        }
    }










    public boolean Choice(){
        Random ran = new Random();
        int randomInt = ran.nextInt(2);

        return randomInt == 1;


    }








    public boolean healthChecker(){
        return HP <= 0;

    }









    public String toString(){
        String result;

        result = "The attributes are: " + "\nHP: "  + HP + "\nDMG: "+ DMG + "\nBLOCK: " + BLOCK;

        return result;

    }



}