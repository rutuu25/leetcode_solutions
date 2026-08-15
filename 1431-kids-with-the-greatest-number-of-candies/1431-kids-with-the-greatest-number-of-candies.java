class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans= new ArrayList<>();
        int max=0;
        for(int num:candies){
            max=Math.max(max,num);
        }
        for(int num:candies){
            if(num+extraCandies >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return  ans;
    }
}