class Solution {
    public int countCommas(int n) {
        long count=0;
        //starts from 1000
        //1000-5000 have 4001 commas therefore 5000-1000+1= 4001
        for(long i= 1000;i<=n ;i*=1000){
            count+= n-i+1;
        }
        return (int)count;
    }
}