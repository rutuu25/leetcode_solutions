class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[]= new int[num_people];
        int give=1;
        int i=0;
        while(candies>0){
            int candy= Math.min(candies,give);
            arr[i]+=candy;
            candies-=candy;

            give++;
            i=(i+1)%num_people;
        }
        return arr;
    }
}