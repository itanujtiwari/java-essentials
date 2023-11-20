public class Swap {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int vada;
        System.out.println("Before swap " + "n1 : " +n1  + " n2 : " +n2);

        vada = n2;
        n2 = n1;
        n1 = vada;
        
        System.out.println("After swap " + "n1 : " +n1  + " n2 : " +n2);

    }
}
