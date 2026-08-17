class Solution {

    int moves[][]={
        {2,1},
        {1,2},
        {-1,-2},
        {-2,-1},
        {-1,2},
        {-2,1},
        {1,-2},
        {2,-1}
    };

    Double dp[][][];

    public double knightProbability(int n, int k, int row, int column) {
     dp = new Double[n][n][k+1];
     return solve(n,k,row, column);   
    }
    double solve(int n,int k,int r,int c){
        if(r<0 || c<0 || r>=n || c>=n){
            return 0;
        }
        if(k==0){
            return 1;
        }

        if(dp[r][c][k]!=null){
            return dp[r][c][k];
        }
        double prob=0;
        for(int[] move:moves){
            int row= r+move[0];
            int col= c+move[1];

            prob+= solve(n,k-1,row,col);
        }

        dp[r][c][k]=prob/8.0;
        return dp[r][c][k];
    }
}