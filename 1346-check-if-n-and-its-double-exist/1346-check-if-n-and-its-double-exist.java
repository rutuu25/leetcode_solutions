class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while(i < arr.length && j<arr.length ){
            if(arr[i]==2*arr[j]){
                return true;
            }
            if(2*arr[j]<arr[i]){
                j++;
            }else{
                i++;
            }
            if(i==j){
                i++;
            }
        }
        return false;
    }
}