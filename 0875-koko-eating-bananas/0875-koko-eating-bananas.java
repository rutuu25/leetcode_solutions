class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long left=1;
        long right=findMax(piles);
        int ans=0;
        while(left<=right){
            long mid=left+(right-left)/2;
            long total=CalculateTotal(piles,mid);
            if(total<=h){
                ans=(int)mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
    long CalculateTotal(int[] arr,long mid){
        long total=0;
        for(int num:arr){
            total+=(long) Math.ceil( (double)num/mid);
        }
        return total;
    }
    long findMax(int[] arr){
        long max=0;
        for(int num:arr){
            max=(long)Math.max(num,max);
        }
        return max;
    }
}