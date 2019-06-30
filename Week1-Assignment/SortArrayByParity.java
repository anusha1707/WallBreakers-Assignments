class Solution {
    public int[] sortArrayByParity(int[] A) {
        //Defined a new array to store the result
        int[]  Result = new int[A.length];
        int j=0;
        //Case for even numbers
        for(int i=0; i<A.length; i++)
        {
            if(A[i]%2==0)
            {
               Result[j]=A[i];
                j++;
            }
        }
        //Case for odd numbers
        for(int i=0; i<A.length; i++)
        {
            if(A[i]%2!=0)
            {
               Result[j]=A[i];
                j++;
            }
        }
        return Result;
    }
}