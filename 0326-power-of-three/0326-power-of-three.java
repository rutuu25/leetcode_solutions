class Solution {
    public boolean isPowerOfThree(int n) {
    //   if(n<=0) return false;

    //   while(n%3==0){
    //     n/=3;
    //   } 
    //   return n==1;  //returns true

        return n > 0 && 1162261467 % n == 0;  //max power of the 3 in 32bit integer(3^19)
    }
}