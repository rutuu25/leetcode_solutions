class Solution {
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length-1);
        return nums;
    }
    static void merge(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        merge(nums,start,mid);
        merge(nums,mid+1,end);
        mergeSort(nums,start,mid,end);
    }
    static void mergeSort(int[] nums,int start,int mid,int end){
        int k=0;
        int i=start;
        int j=mid+1;
        int[] temp=new int[end-start+1];

        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                temp[k]=nums[i];
                i++;
            }
            else{
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=end){
            temp[k++]=nums[j++];
        }
        for(i=start,k=0;k<temp.length;i++,k++){
            nums[i]=temp[k];
        }
    }

}