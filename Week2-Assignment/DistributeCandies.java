class Solution {
    public int distributeCandies(int[] candies) {
        //define hashset to store kinds of candies
        HashSet<Integer> map = new HashSet<>();
        for(int i=0; i<candies.length; i++)
            map.add(candies[i]);
        int n = candies.length/2;
        //if kinds is greater than or equal to n then return n
        if(n<=map.size())
            return n;
        //else sister can have only the number of kinds available
        else
          return map.size();
    }
}