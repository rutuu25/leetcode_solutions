class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        int ans=0;
        for(int n:costs){
            max=Math.max(n,max);
        }
        int[] count=new int[max+1];
        for(int num:costs){
            count[num]++;
        }
        int i=0;
        for(int j=0;j<max+1;j++){
            while(count[j]>0){
                costs[i++]=j;
                count[j]--;
            }
        }
        for(int num:costs){
            if(coins<num) break;
            ans++;
            coins-=num;
        }
        return ans;
    }
}