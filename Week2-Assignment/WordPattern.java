class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map map = new HashMap();
        //convert sentence to words
        String[] s = str.split(" ");
        //if lengths differ return false
        if(pattern.length() != s.length)
            return false;
        for(Integer i=0; i< s.length; i++)
        {
            if(map.put(pattern.charAt(i), i)!=map.put(s[i], i))
                return false;
        }
        return true;
    }
}