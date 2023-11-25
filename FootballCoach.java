package Interface;

public class FootballCoach implements Coach {

    @Override
    public String getDaliyWorkout() {

        return "Maintain ball control";
    }

    @Override
    public String getDaliyFortune() {
        Fortune fh = new HappyFortune();
        new AngryFortune();
        return fh.getFortune();
    }
    
}
