class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int max=weights[0];
       int sum=0;
       for(int num:weights){
            max=Math.max(num,max);
            sum+=num;
       }
       int low=max;
       int high=sum;
       while(low<=high){
            int mid=low+(high-low)/2;
            if(findDays(weights,mid)<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
       }
       return low; 
    }
    int findDays(int arr[],int cap){
        int days=1;
        int load=0;
        for(int num:arr){
            if(load+num>cap){
                days++;
                load=num;
            }else{
                load+=num;
            }
        }
        return days;
    }
}