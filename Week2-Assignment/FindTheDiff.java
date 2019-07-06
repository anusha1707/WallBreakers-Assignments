class Solution {
    public char findTheDifference(String s, String t) {
       int[] letter = new int[26];
        //increment if letter is present in s
        for(char c : s.toCharArray())
        {
            letter[c-97]++;
        }
        //decrement if letter is present in t
        for(char c : t.toCharArray())
        {
            letter[c-97]--;
            //if the value is 0 then it is present in both else not present
            if(letter[c-97]<0)
                return c;
        }
       return 0; 
    }
}