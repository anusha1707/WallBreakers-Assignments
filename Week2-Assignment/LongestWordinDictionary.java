class Solution {
    public String longestWord(String[] words) {
        //To store string
        Set<String> set = new HashSet<String>();
        String result = "";
        //sort array
        Arrays.sort(words);
        //for each word check if the substring of word is already present
        for (String s : words) {
            if (s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) 
            {
                //if present check the length
               if(s.length() > result.length()) 
                   //store the one with max length to result
                    result =  s;
                set.add(s);
            }
        }
        return result;
    }
}