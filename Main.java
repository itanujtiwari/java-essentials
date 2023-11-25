package Interface;

public class Main {
    
    public static void main(String[] args) {
        
        Coach tc = new KabaddiCoach();
        System.out.println(tc.getDaliyWorkout());
        System.out.println(tc.getDaliyFortune());
    }
}
