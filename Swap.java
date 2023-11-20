public class Swap {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        System.out.println("Before swap " + "n1 : " +n1  + " n2 : " +n2);
        
        n1 = n1 + n2; //10 + 20
        n2 = n1 - n2; //30 - 20
        n1 = n1 - n2; //30 - 10
        
        System.out.println("After swap " + "n1 : " +n1  + " n2 : " +n2);

    }
}
