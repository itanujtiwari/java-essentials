public class ZeroOneBorder {
    
    public static void main(String[] args) {
        
        int n = 5;
        int m = 5;

        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=m; j++){
                if(i == 1 || i == n || j == 1|| j == m){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
