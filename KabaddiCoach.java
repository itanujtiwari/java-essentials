package Interface;

public class KabaddiCoach implements Coach{

    @Override
    public String getDaliyWorkout() {
    
        return "Do 200 situps";
    }

    @Override
    public String getDaliyFortune() {
        Fortune fh = new HappyFortune();
        new AngryFortune();
        return fh.getFortune();
    }
    
}
