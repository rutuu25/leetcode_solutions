class Solution {
    public void duplicateZeros(int[] arr) {
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]==0){
                
                for(int i=arr.length-1;i>j;i--){
                    arr[i]=arr[i-1];
                }
                arr[j+1]=0;

                j++;
            }
        }
    }
}