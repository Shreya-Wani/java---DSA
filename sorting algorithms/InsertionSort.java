public class InsertionSort {

    public static void insertion_sort(int nums[]){
        int n = nums.length;
        
        for(int i=1; i<n; i++){
            int key = nums[i];
            int j = i-1;

                while(j>=0 && nums[j] > key){
                     nums[j+1] = nums[j];
                     j--;
                }

                nums[j + 1] = key;
            }
        }

    public static void main(String args[]) {
        int nums[] = {43, 7, 1, 9, 0, 6};

        insertion_sort(nums);

        // Print sorted array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
