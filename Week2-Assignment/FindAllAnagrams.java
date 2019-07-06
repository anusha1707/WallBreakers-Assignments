public class Solution {
    public List<Integer> findAnagrams(String s, String t) {
        List<Integer> result = new LinkedList<>();
        if(t.length()> s.length()) return result;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = map.size();
        int start = 0, end = 0;
       while(end < s.length())
       {
            char c = s.charAt(end);
            if( map.containsKey(c) )
            {
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0) 
                    count--;
            }
            end++;
            
            while(count == 0)
            {
                char temp = s.charAt(start);
                if(map.containsKey(temp))
                {
                    map.put(temp, map.get(temp) + 1);
                    if(map.get(temp) > 0)
                    {
                        count++;
                    }
                }
                if(end-start == t.length()){
                    result.add(start);
                }
                start++;
            }
            
        }
        return result;
    }
}