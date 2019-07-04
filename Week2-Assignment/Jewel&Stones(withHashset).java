class Solution {
    public int numJewelsInStones(String J, String S) {
        //converting both the strings to character arrays
       char[] j = J.toCharArray();
        char[] s = S.toCharArray();
        //define a set to store the characters of string J
        Set<Character> jewel = new HashSet();
        //initilise a variable to count
        int count=0;
        //iterate over the length of j 
        for(int x=0; x<j.length; x++)
        {
            jewel.add(j[x]);
        }
        for(int y=0; y<s.length; y++)
        {
            //increment count if a stone is jewel
            if(jewel.contains(s[y]))
                count++;
        }
        return count;
    }
}