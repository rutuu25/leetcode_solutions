class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }else{
                break;
            }
        }

        while(contains(sum,nums)){
            sum++;
        }
        return sum;
    }
    boolean contains(int n,int[] arr){
        for(int num:arr){
            if(num==n){
                return true;
            }
        }
        return false;
    }
}