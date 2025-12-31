public class maxSubArraysSumByKadanesAlgo {

    // public static void kadanesAlgo(int nums[]){

    //     //when we have mixed values in array but it gives cs = 0,  when only negative values comes in array this approach gives directly cs = 0 and doesn't give maxsum in negative value so it fails our code and test case.
    //     int cs = 0; //currentsum
    //     int ms = Integer.MIN_VALUE; //maxsum

    //     for(int i=0; i<nums.length; i++){
    //         cs = cs + nums[i];
    //         if(cs < 0){
    //             cs = 0;
    //         }
    //         ms = Math.max(cs, ms);
    //     }
    //     System.out.println("max sum:" + ms);
    // }

    public static void kadanesAlgo2(int nums[]){
        int cs = nums[0];
        int ms = nums[0];

        for(int i=0; i<nums.length; i++){
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(cs, ms);
        }
        System.out.print("Max Sum: " + ms);
    }

    public static void main(String[] args) {
        int nums[] = {-2, -3, -1, -5};
        // kadanesAlgo1(nums);
        kadanesAlgo2(nums);
    }
    
}