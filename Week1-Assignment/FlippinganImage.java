class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length, col = A[0].length;
        int temp =0;
        //For flipping swap elements in a row 
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<(col+1)/2; j++)
            {
               temp = A[i][j];
               A[i][j] = A[i][col-1-j];
               A[i][col-1-j] = temp;
            }
        }
        // to invert assign 1 for 0 and vice versa
       for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
              if(A[i][j]==0)
                  A[i][j]=1;
                else
                    A[i][j]=0;
            }
        }
       return A;
    }
}