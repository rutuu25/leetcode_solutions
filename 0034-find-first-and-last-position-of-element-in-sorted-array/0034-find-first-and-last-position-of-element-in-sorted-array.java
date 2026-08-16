class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        int start = search(nums,target,true);
        int end= search(nums,target,false);
        result[0]=start;
        result[1]=end;

        return result;
    }
    public int search(int[] nums,int target,boolean firstStartIndex){
        int result=-1;
        int start =0;
        int end= nums.length-1;

        while(start<=end){
            int mid= start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start= mid+1;
            }
            else{
                result= mid;
                if(firstStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return result;
    }
}