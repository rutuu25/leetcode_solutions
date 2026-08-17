class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for(int num: nums){
            int start= temp.size(); 
            while(num>0){
                temp.add(start,num%10);
                num/=10;
            }
        }
        int[] ans= new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
}