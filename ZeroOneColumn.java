public class ZeroOneColumn {
    
    public static void main(String[] args) {
        
        int row = 5; 
        int col = 5;

        for(int i = 1; i <=row ; i++){
            for(int j =1; j <= col ; j++){
                if(j%2==1){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
