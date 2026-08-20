class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int num:nums){
            if(num>0){
                pos.add(num);
            }else{
                neg.add(num);
            }
        }
        int k=0;
        int i=0;
        int j=0;
        int ans[]= new int[nums.length];
        while(i<pos.size() && j<neg.size()){
            ans[k++]=pos.get(i++);
            ans[k++]=neg.get(j++);
        }
        return ans;
    }
}