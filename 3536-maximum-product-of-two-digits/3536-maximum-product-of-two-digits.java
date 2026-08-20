class Solution {
    public int maxProduct(int n) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MAX_VALUE;
        while(n>0){
            int x=n%10;
            if(x>first){
                second=first;
                first=x;
            }else if(x>second){
                second=x;
            }
            n/=10;
        }
        return first*second;
    }
}