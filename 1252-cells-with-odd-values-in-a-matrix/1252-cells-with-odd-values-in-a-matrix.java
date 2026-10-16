class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int row[]= new int[m];
        int col[]= new int[n];
        for(int[] index:indices ){
            int r= index[0];
            int c= index[1];

            row[r]++;
            col[c]++;
        }
        
        int odd=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((row[i]+col[j]) % 2!=0){
                    odd++;
                }
            }
        }
        return odd;
    }
}