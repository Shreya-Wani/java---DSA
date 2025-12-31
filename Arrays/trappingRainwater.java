public class trappingRainwater {

    public static int trappingWater(int height[]){
        int n = height.length;

        //maxLeft boundary - array
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];

        for(int i=1; i<n; i++){
            maxLeft[i] = Math.max(height[i], maxLeft[i-1]);
        }

        //maxRight boundary - array
        int maxRight[] = new int[n];
        maxRight[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            maxRight[i] = Math.max(height[i], maxRight[i+1]);
        }

        int trapwater = 0;
        //for loop
        for(int i=0; i<n; i++){
            
            //Water level --> min(maxleft , maxRight)
            int wl = Math.min(maxLeft[i], maxRight[i]);

            //trappingWater --> (waterlevel - block size) * weight
            trapwater += wl - height[i];

        }
        return trapwater;
        
    }
    public static void main(String[] args) {
        int heights[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappingWater(heights));
    }
}
