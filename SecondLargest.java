import java.util.Arrays;

public class SecondLargest {

    public static void point2large(int arr[]){
        int size = arr.length;
        int i;
        if ((size < 2)) {
            System.out.println("Invalid Input");
            return;
        }

        Arrays.sort(arr);
        // we can print second number using this if we dont have repeating nos
        // int SecondNum = arr[size - 2];
        // System.out.println("Second largest number : " +SecondNum);

        // we can use this method if we have repeating nos
        // 1, 5, 8, 15, 76, 90, 50, 89, 45, 90
        for(i  = size - 2; i >= 0; i--){
            if(arr[i] != arr[size - 1]){
                System.out.println("Second largest no is : " + arr[i]);
                return;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {1 , 5, 8, 90, 15, 76, 90, 50, 89, 45, 90};
        point2large(arr);
    }
}
