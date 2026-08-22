class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(int num:map.keySet()){
            if(map.get(num)==2){
                ans^=num;
            }
        }
        return ans;
    }
}