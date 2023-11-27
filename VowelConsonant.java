import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {

        int vowel = 0, consonant = 0;
        String s = "HiHelloYOu";

        System.out.println("Entered string is : " +s);

        for(int i = 0; i <s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("Vowel: " +vowel  + " Consonant : " +consonant);
    }
}