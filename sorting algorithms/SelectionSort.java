public class SelectionSort {

    public static void selection_sort(int nums[]) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String args[]) {
        int nums[] = {43, 7, 1, 9, 0, 6};

        selection_sort(nums);

        // Print sorted array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
