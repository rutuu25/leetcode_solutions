class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]%2==0){
                ans=ans|nums[i];
            }
            i++;
        }
        return ans;
    }
}