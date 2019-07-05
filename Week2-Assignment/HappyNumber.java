class Solution {
    public boolean isHappy(int n) {
       Set<Integer> num = new HashSet<Integer>();
        //while adding the number to the set add the squares of digits in number
      while (num.add(n))
        {
            int sum = 0;
            while (n> 0)
            {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
        
      }
    //if n is 1 then it is happy number 
 if(n==1)
     return true;
        else 
            return false;
      
        }  
}