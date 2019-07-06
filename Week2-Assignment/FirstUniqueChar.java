class Solution {
    public int firstUniqChar(String s)
    {
        int[] c = new int[26];
        //increment value at particular index for its occurance
        for(int i = 0; i < s.length(); i ++)
             c[s.charAt(i) - 97] ++;
        //if occured only once return index
        for(int i = 0; i < s.length(); i ++)
            if(c[s.charAt(i) - 97] == 1)
                return i;
        return -1;
                
        }
    }