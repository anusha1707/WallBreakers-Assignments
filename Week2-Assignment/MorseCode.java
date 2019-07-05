class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> morsecode = new HashSet<>();
        //iterate for each word in the string array
        for(String s : words)
        {
            //define a string variable to store appended code
            String trans = "";
            //iterate for each character in a word
            for(char c : s.toCharArray())
            {
                //append each letter code to variable trans 
                trans += code[c-97];
            }
            //add the appended code of each word to set
            morsecode.add(trans);
        }
        return morsecode.size();
    }
}