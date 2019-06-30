class Solution {
    public List<String> fizzBuzz(int n) {
        //define array list of type string
        List<String> result = new ArrayList();
        //iterate from 1 to n
        for(int i=1; i<=n; i++)
        {
            // First check for divisible by 15
            if(i%15==0)
             result.add("FizzBuzz");
            //Similarly for 3 
             else if(i%3==0)
               result.add("Fizz"); 
            //Similarly for 5
            else if(i%5==0)
            result.add("Buzz"); 
            else
                //Before adding a number convert it to string
                result.add(Integer.toString(i));
        }
        return result;
    }
}