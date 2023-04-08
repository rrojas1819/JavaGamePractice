import java.util.Random;
public abstract class Mob {

protected int HP;
protected int DMG;
protected int BLOCK;


    public void setAll(int newHP, int newDMG , int newBLOCK){
        HP = newHP;
        DMG = newDMG;
        BLOCK = newBLOCK;
    }

    public void SubtractHealth(int newHP){
        HP -= newHP;
    }

    public void SubtractDMG (int newDMG){
        DMG -= newDMG;
    }

    public void SubtractBLOCK(int newBLOCK){
        BLOCK -= newBLOCK;
    }
    public void AddHealth(int newHP){
        HP += newHP;
    }

    public void AddDMG (int newDMG){
        DMG += newDMG;
    }

    public void AddBLOCK(int newBLOCK){
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


    public boolean Choice(){
        Random ran = new Random();
        int randomInt = ran.nextInt(2);

        if(randomInt == 1 ){
            return true;
        }
        else{
            return false;
        }


    }
    public boolean EvadeChance(){
        Random ran = new Random();
        int randomInt = ran.nextInt(100);

        if(randomInt <= 4 ){
            return true;
        }
        else{
            return false;
        }


    }





    public String toString(){
        String result;

        result = "The attributes are: " + "\nHP: "  + HP + "\nDMG: "+ DMG + "\nBLOCK: " + BLOCK;

                return result;

}



}
