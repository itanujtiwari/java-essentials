public class MirroredHalfDiamond {

    public static void main(String[] args) {
        
        int n = 4;
        //upper part
        for(int i = 1; i <=n ; i++){
            //spaces
            for(int j = 1; j <=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int i = n-1; i >= 1 ; i--){
            //spacesṇ
            for(int j = 1; j <=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}