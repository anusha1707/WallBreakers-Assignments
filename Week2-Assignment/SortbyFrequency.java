class Solution {
    public String frequencySort(String s) {
        //to store the letters along with the frequency
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) 
            map.put(c, map.getOrDefault(c, 0) + 1);
	    //list array to store the keys based on frequency
        List<Character> [] freqlist = new List[s.length() + 1];
        for (char key : map.keySet()) 
        {
            int freq = map.get(key);
            if (freqlist[freq] == null) 
                freqlist[freq] = new ArrayList<>();
          freqlist[freq].add(key);
        }
			//from highest frequency append the each character for its frequency times to sb	
        StringBuilder sb = new StringBuilder();
        for (int i = freqlist.length - 1; i >= 0; i--)
            if (freqlist[i] != null)
                for (char c : freqlist[i])
                    for (int j = 0; j < map.get(c); j++)
                        sb.append(c);
//convert to string
        return sb.toString();
    }
}