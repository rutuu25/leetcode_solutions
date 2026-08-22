class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int ans[][]= new int[m][n];
        if(original.length != m*n) return new int[0][0];
        int row=0;
        int col=0;
        for(int i=0;i<original.length;i++){
            ans[row][col]=original[i];
            col++;
            if(col==n){
                col=0;
                row++;
            }
        }
        return ans;
    }
}