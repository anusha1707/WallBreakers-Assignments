class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int i = 0, j= A.length-1, mid =0;
        while(i<j)
        {
            mid = (i+j)/2;
            if(A[mid]>A[mid+1])
                j= mid;
            else
            i= mid+1;
            
        }
      return i;
    }
}