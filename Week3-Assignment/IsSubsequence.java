class Solution {
    public boolean isSubsequence(String s, String t) {
    
        if (s.length() == 0) 
            return true;
        int sc = 0, tc = 0;
        while (tc < t.length()) 
        {
            if (t.charAt(tc) == s.charAt(sc)) 
            {
                sc++;
                if (sc == s.length()) 
                    return true;
            }
            tc++;
        }
        return false;
    }
}