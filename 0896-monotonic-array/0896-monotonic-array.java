class Solution {
    public boolean isMonotonic(int[] nums) {
     boolean increase= true;
     boolean decrease = true;
    //  for(int i=0;i<nums.length-1;i++){
    //     if(nums[i]>nums[i+1]){
    //         increase=false;
    //     }
    //     if(nums[i]<nums[i+1]){
    //         decrease=false;
    //     }
    //  }
    //  return increase|decrease;

    int left=0;
    int right=1;
    while(right<nums.length){
        if(nums[left]>nums[right]){
            increase=false;
        }
        if(nums[left]<nums[right]){
            decrease=false;
        }
        left++;
        right++;
    }
    return increase||decrease;
    }
}