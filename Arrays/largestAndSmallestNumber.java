import java.util.*;

public class largestAndSmallestNumber {

    public static int largest_number(int nums[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i=0; i<nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
            if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        System.out.println("smallest value is "+ smallest);
        return largest;
    }
    public static void main(String args[]){
        int nums[] = {1, 2, 6, 3, 5};
        System.out.println("largest number is " + largest_number(nums));
    }
}
