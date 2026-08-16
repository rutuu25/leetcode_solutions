class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in the decreasing part of the array
                //mid may be the peak element 
                //that whi end!=mid-1
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        //hence, start== end break the loop
        //start and end pointers try to find the max element in 2 checks
        //when they are pointing to only one element, that is the peak element
        return start; //or return end both are equal
    }
}