class Solution {
    public int[][] transpose(int[][] A) {
        //Assign variables for order of matrix
        int row = A.length, col = A[0].length;
        //Define new matrix with the reverse order of matrix A
        int[][] result = new int[col][row];
        //Assign the values like in transpose matrix
        for(int i=0; i< row; i++)
        {
            for(int j=0; j< col; j++)
            {
              result[j][i] = A[i][j];
            }
        }
        return result;
    }
}