public class LengthString{
    
    public static void main(String[] args) {

        String sen = "Hello , How are you?";

        System.out.println("String's length whitespace included : " +sen.length() );

        sen = sen.replace(" ", "");

        System.out.println("String's length without whitespace : " +sen.length());


    }
}