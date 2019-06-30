class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        //defined a list to store the result
        List<Integer> result = new ArrayList();
        //Iterate within the given range 
      for(int i=left; i<=right; i++)
      {
          int j=0;
          for(j=i; j>0 ; j= j/10)
          {
              //considering two cases; one that it shouldn't contain zero and other is not self dividing 
              if((j%10 == 0) || (i%(j%10)!=0))
                  break;
          }
          if(j==0)
              //add number to list if it is self dividing
              result.add(i);
      }
        return result;
    }
}