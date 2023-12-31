public class HollowDiamond {
    
    public static void main(String[] args) {
        
        int n = 5;

        // upperpart
        for(int i = 1; i <= n ; i++){
            //stars
            for(int j = i; j<=n ;j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 1; j <= 2*i-2; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = i; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        // for(int i = 1; i <= n ; i++){
        //     //stars
        //     for(int j = 1; j<=i ;j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for(int j = 1; j <= 2*i-2; j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j = 1; j<=i ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
