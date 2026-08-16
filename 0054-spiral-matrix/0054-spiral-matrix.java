class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int StartRow=0;
        int StartCol=0;
        int EndRow= matrix.length-1;
        int EndCol= matrix[0].length-1;
        List <Integer> array= new ArrayList<Integer>();

        while(StartRow <= EndRow && StartCol <= EndCol){
            //top
            for(int j=StartCol; j<=EndCol;j++){
                array.add(matrix[StartRow][j]);
            }

            //right
            for(int i=StartRow+1;i<=EndRow;i++){
                array.add(matrix[i][EndCol]);
            }

            //bottom
            for(int j=EndCol-1;j>=StartCol;j--){
                if (StartRow == EndRow) break;
                array.add(matrix[EndRow][j]);
            }

            //left
            for(int i=EndRow-1;i>=StartRow+1;i--){
                if (StartCol == EndCol) break;
                array.add(matrix[i][StartCol]);
            }
            StartRow++;
            EndRow--;
            StartCol++;
            EndCol--;
        }
        return array;
    }
}