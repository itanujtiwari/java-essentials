import java.util.Scanner;

public class CopyString {
    
    public static void main(String[] args) {
        
        String str, copystr;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        str = sc.nextLine();

        copystr = str;

        System.out.println("Entered String : " +str);
        System.out.println("Copy of entered string: " +copystr);

        sc.close();

    }
}
