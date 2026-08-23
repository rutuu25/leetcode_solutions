class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int avg[]= new int[n];
        Arrays.fill(avg,-1);

        //take 1 from left and right of the element 2*1+1
        int window= 2*k+1;
        if(window>n){
            return avg;
        }

        long sum=0;
        for(int i=0;i<window;i++){
            sum+=nums[i];
        }
        avg[k]=(int)(sum/window);

        for(int i= window;i < n;i++){
            sum+=nums[i];
            sum-=nums[i-window];
            int center= i-k;
            avg[center] =(int)(sum/window);  
        }

        return avg;
    }
}