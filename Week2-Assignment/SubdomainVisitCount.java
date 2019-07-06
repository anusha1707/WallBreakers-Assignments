class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        //define array list to store result
       List<String> result = new ArrayList<>();
        //define hashmap to store websites along with the number of times visited
         Map<String, Integer> map = new HashMap();
        //for each string divide it into numbers and website domain
        for (String st: cpdomains) 
        {
            String[] brk = st.split(" ");
            int num = Integer.valueOf(brk[0]);
            String[] web = brk[1].split("\\.");
            String s = "";
            //for number of website domains
            for (int i = web.length - 1; i >= 0; --i) 
            {
                //for complete domain
                if(i < web.length-1)
                    s= web[i] +"."+ s;
                //for parent domain
                else
                s = web[i] +""+ s;
                //add to map with number of times visited
                map.put(s, map.getOrDefault(s, 0) + num);
            }
        }
//add the result as required i.e number with domain
        for (String s1: map.keySet())
            result.add(map.get(s1) + " " + s1);
        return result;
    }
}