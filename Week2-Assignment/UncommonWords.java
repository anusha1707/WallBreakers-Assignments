class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        //define hashmap to store words in sentence and occurance of each word
        HashMap<String, Integer> map = new HashMap<>();
        //define arraylist to store result
        List<String> result = new ArrayList<>();
        //split the sentence into words using space
        for(String s : A.split(" "))
            map.put(s, map.getOrDefault(s, 0) + 1);
         for(String s : B.split(" "))
            map.put(s, map.getOrDefault(s, 0) + 1);
       //iterate for every key in map
        for(String s : map.keySet())
        {
            //add all the uncommon words to result
            if(map.get(s)==1)
            {
                result.add(s);
            }
        }
        //convert the list to string array
    String[] res = new String[result.size()];
        return result.toArray(res); 
    }
}