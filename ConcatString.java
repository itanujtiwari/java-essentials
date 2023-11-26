public class ConcatString {
    public static void main(String[] args) {
        
        String str1 = "HI, ";
        String str2 = "My name is ";

        // First method
        String str3 = str1.concat(str2);
        System.out.println(str3);

        // Second Method
        String s4 = str1 + str2 ;
        System.out.println(s4);
    }
}
