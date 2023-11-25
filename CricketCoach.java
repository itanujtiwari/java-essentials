package Interface;

public class CricketCoach implements Coach{

    @Override
    public String getDaliyWorkout() {
    
        return "Swing your bat 1000 times";
    }
    

    @Override
    public String getDaliyFortune() {
        Fortune fh = new HappyFortune();
        new AngryFortune();
        return fh.getFortune();
    }
    
}
