class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            // is it first or previous is empty
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
            (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)){
                //is it last or next is empty
                n--;
                flowerbed[i]=1; //place flowers
            }
        }
        return n<=0; // if you want to place 2 flowers but you can place 3 therefore <= 0
    }
}