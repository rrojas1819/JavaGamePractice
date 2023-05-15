public class Events {

    private boolean EventAvailability = true;

    public Events(){

    }


    public void eventOne(Mob E1, Mob P1, LayOut tab){
        E1.attack(P1);
        if(P1.healthChecker()){
            tab.getTextLabel().setText("You have Died!!!!");
            EventAvailability = false;

        }



    }

    public boolean getEventAvail(){
        return EventAvailability;
    }
    public void setEventAvail(boolean bool){
        EventAvailability = bool;
    }

}
