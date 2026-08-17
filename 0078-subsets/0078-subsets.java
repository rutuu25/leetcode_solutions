class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> result= new ArrayList<>();
        subset(nums,0,new ArrayList<>(),result);
        return result;
    }
    static void subset( int nums[],int index,List<Integer> temp,List<List<Integer>> result){
        if(index==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[index]);
        subset(nums,index+1,temp,result);

        temp.remove(temp.size()-1);
        subset(nums,index+1,temp,result);
    }
}