class Solution {
    public int findMin(int[] nums) {
        int bp=0;
        int start=0;
        int end= nums.length-1;

        if(nums.length==1){
            return nums[0];
        }
        if(nums[start]<nums[end]){
            return nums[0];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(mid>start && nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}