public class HollowInvertedPyramid {
    
    public static void main(String[] args) {
        
        int n = 5 ;

        for(int i = n; i >= 1; i--){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= 2*i-1; j++){
                if(i == n || j == 1 || j == 2*i-1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
