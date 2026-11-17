class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int [][] ans = new int [rows][rows];
        for(int i = 0; i<rows;i++){
            int num = rows-1;
            for(int j = 0; j<rows;j++){
                ans[i][j] = matrix[num][i];
                num--;
            }
        }
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<rows;j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
}