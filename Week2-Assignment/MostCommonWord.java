class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
       //split the words 
        String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        //to store word and its occurance
        HashMap<String, Integer> map = new HashMap<>();
        //put words in map
        for(String s : words) 
            map.put(s, map.getOrDefault(s, 0) + 1);
        //if word is banned then remove
        for(String s : banned) if(map.containsKey(s)) 
            map.remove(s);
        String result = null;
        // return the word with max occurances
        for(String s : map.keySet())
            if(result == null || map.get(s) > map.get(result))
                result = s;
        return result;
  
    }
}