class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int n:nums){
            sum1+=n;
            while(n>0){
                sum2+=(n%10);
                n/=10;
            }
        }
        return sum1-sum2;
    }
}