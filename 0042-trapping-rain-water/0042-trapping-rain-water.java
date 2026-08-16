class Solution {
    public int trap(int[] height) {
        int n= height.length;
        //for left maximum bar
        int leftMax[]= new int[n];
        leftMax[0]=height[0]; // no left for start element
        for(int i=1;i<n;i++){
            leftMax[i]= Math.max(height[i],leftMax[i-1]);
        }

        //for right maximum bar
        int rightMax[]= new int[n];
        rightMax[n-1]= height[n-1]; //no right for last element
        for(int i=n-2;i>=0;i--){
            rightMax[i]= Math.max(height[i],rightMax[i+1]);
        }

        int trapeWater=0;
        for(int i=0;i<n;i++){
            int waterLevel= Math.min(leftMax[i],rightMax[i]);
            trapeWater+= waterLevel-height[i];
        } 
        return trapeWater; 
    }
}