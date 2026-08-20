class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
        int sr=0;
        int sc=0;
        int er=n-1;
        int ec=n-1;
        int num=1;
        while(sr<=er && sc<=ec){
            for(int j=sc;j<=ec;j++){
                mat[sr][j]=num++;
            }
            for(int i=sr+1;i<=er;i++){
                mat[i][ec]=num++;
            }
            for(int j=ec-1;j>=sc;j--){
                if(sr==er) break;
                mat[er][j]=num++;
            }
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec) break;
                mat[i][sc]=num++;
            }

            sr++;
            er--;
            sc++;
            ec--;
        }
        return mat;
    }
}