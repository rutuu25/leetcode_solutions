class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        ArrayList<Integer> list=new ArrayList<>();

        int min=nums[0];
        int max=nums[0];
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        /*int freq[]= new int[max+1];
        for(int num:nums){
            freq[num]++;
        }
        for(int i=min;i<=max;i++){
            if(freq[i]==0){
                list.add(i);
            }
        }*/

        HashSet<Integer> set= new HashSet<>();
        
        for(int num:nums){
            set.add(num);
        }
        
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        
        return list;
    }
}