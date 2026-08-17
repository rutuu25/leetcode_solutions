class Solution {
    public int maxArea(int[] height) {
        int Lp =0;  //left pointer
        int Rp= height.length-1;  //Right pointer
        int maxWater=0;

        while(Lp<Rp){
            int ht=  Math.min(height[Lp],height[Rp]);
            int wd= Rp-Lp;
            int currWater= ht*wd;

            maxWater= Math.max(currWater,maxWater);

            if(height[Lp]<height[Rp]){
                Lp++;
            }else{
                Rp--;
            }
        }

        return maxWater;
    }
}