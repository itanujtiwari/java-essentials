public class SumArray {

    static int Sum(){

        int[] nums = {10, 11 , 12, 13 , 14};

        int sum = 0;
        int i;
        System.out.println("Sums of array: ");

        for (i = 0 ; i < nums.length; i++){
            System.out.print(nums[i] +" ");
            sum += nums[i]; 
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.print("is " +Sum());
    }

}


