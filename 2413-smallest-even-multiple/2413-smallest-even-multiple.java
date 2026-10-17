class Solution {
    public int smallestEvenMultiple(int n) {
        
        for(int i=1;i<=n;i++){
            int r= 2*i;
            if(r%n==0){
                return r;
            }
        }
        return 0;
    }
}