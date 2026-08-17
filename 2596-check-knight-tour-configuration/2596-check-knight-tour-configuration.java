class Solution {
    public boolean checkValidGrid(int[][] grid) {
        return isValid(grid,0,0,0);
    }
    static boolean isValid( int[][] grid,int r,int c, int expVal){
        if(r<0 || c<0|| r>grid.length-1|| c>grid.length-1 ||grid[r][c]!=expVal){
            return false;
        }

        if(expVal==grid.length *grid.length-1){
            return true;
        }

            boolean ans1= (isValid(grid,r-2,c+1,expVal+1));
            boolean ans2= (isValid(grid,r-1,c+2,expVal+1));
            boolean ans3= (isValid(grid,r+1,c+2,expVal+1));
            boolean ans4= (isValid(grid,r+2,c+1,expVal+1));
            boolean ans5= (isValid(grid,r+2,c-1,expVal+1));
            boolean ans6= (isValid(grid,r+1,c-2,expVal+1));
            boolean ans7= (isValid(grid,r-1,c-2,expVal+1));
            boolean ans8= (isValid(grid,r-2,c-1,expVal+1));

            return ans1 ||ans2||ans3||ans4||ans5||ans6||ans7||ans8;
    }
}