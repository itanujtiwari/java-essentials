public class CopyArray {
    
    public static void main(String[] args) {
        int arr1[] = { 1, 6, 9 , 5, 10, -7};

        int size = arr1.length;

        int arr2[] = new int[arr1.length];
        int i;

        System.out.println("First array : ");
        for(i = 0 ; i < size ; i++){
            System.out.print(arr1[i] +" ");
        }

        for(i = 0 ; i< size; i++){
            arr2[i] = arr1[i];
        }
        
        System.out.println(" ");

        System.out.println("Second Array :");
        for(i = 0 ; i <arr2.length ; i++){
            System.out.print(arr2[i] +" ");
        }
        
    }
}
