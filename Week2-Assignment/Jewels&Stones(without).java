class Solution {
    public int numJewelsInStones(String J, String S) {
        //converting both the strings to character arrays
       char[] j = J.toCharArray();
        char[] s = S.toCharArray();
        //initilise a variable to count
        int count=0;
        //iterate over the length of each type 
        for(int x=0; x<j.length; x++)
        {
            for(int y=0; y<s.length; y++)
            {
                //increment count if a stone is jewel
                if(j[x]==s[y])
                    count++;
            }
        }
        return count;
    }
}