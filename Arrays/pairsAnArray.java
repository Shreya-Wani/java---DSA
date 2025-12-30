public class pairsAnArray {
    public static void pairsOfArray(int nums[]){
        int total_pairs = 0;
        for(int i=0; i<nums.length; i++){
            int current = nums[i]; 
            for(int j=i+1; j<nums.length; j++){
                System.out.print("(" + current + "," + nums[j] + ") " );
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs:" + total_pairs);
        // total no of pairs :- n(n-1) / 2
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        pairsOfArray(nums);
    }
}

// time complexity:- o(n^2)
//space complexity: o(1)