class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
    //     int sum=0;
    //     for(int i=0;i<nums.size();i++){
    //         int count=bitCount(i);

    //         if(count==k){
    //             sum+=nums.get(i);
    //         }
    //     }
    //     return sum;
    // }
    //  int bitCount(int n){
    //     int count=0;
    //     while(n>0){
    //         if((n&1)==1){
    //             count++;
    //         }
    //         n=n>>1;
    //     }
    //     return count;
    // }
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {

            // count set bits in index i
            int count = Integer.bitCount(i);

            if (count == k) {
                sum += nums.get(i);
            }
        }

       return sum;
    
}
}