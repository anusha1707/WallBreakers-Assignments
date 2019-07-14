class Solution {
    public boolean isAnagram(String s, String t) {
        //convert the strings to char array
        char[] x= s.toCharArray();
        char[] y = t.toCharArray();
        //compare the lengths
        if(x.length != y.length) 
            //for unequal lengths return false
            return false;
        //sort the arrays and compare
        Arrays.sort(x);
        Arrays.sort(y);
       for(int i=0; i<s.length(); i++)
       {
           if(x[i]!=y[i])
               return false;
       }
        return true;
    }
}