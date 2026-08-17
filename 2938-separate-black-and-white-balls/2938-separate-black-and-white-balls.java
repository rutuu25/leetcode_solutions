class Solution {
    public long minimumSteps(String s) {
        long blackCount=0;
        long swaps=0;
        for(char ch: s.toCharArray()){
            if(ch=='1'){
                blackCount++;
            }else{
                swaps+=blackCount;  
            }
        }
        return swaps;
    }
}