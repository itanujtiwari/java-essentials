import java.util.Scanner;

public class AlphaNumberSpecial {
    
    public static void main(String[] args) {
        
        System.out.println("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        int upper = 0, lower = 0, number = 0, special = 0;
        
        String s = sc.next();
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= 'A'  && ch <= 'Z'){
                upper++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                lower++;
            }
            else if(ch >= '0' && ch <= '9'){
                number++;
            }
            else{
                special++;
            }
        }

        System.out.println("UpperCase : " +upper +" LowerCase : " +lower +" Number : " +number +" Special : " +special);
    }
}
