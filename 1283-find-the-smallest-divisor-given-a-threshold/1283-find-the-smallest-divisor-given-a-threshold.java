class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       int low=1;
       int max=nums[0];
       for(int num:nums){
            max=Math.max(max,num);
       }
       int high=max;
       while(low<=high){
            int mid=low+(high-low)/2;
            if(findSum(nums,mid)<=threshold){
                high=mid-1;
            }else{
                low=mid+1;
            }
       } 
       return low;
    }
    int findSum(int[] arr,int mid){
        int sum=0;
        for(int num: arr){
            sum+=(int)Math.ceil((double)num/mid);
        }
        return sum;
    }
}