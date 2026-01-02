public class BubbleSort{

    public static void bubble_sort(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            
        }
    }
    public static void main(String args[]){
        int nums[] = {43, 7, 1, 9, 0, 6};
        bubble_sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}