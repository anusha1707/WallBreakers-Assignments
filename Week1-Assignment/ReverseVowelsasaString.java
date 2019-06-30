class Solution {
public String reverseVowels(String s) {
    String vowels = "aeiouAEIOU";
    char[] c = s.toCharArray();
    int i = 0;
    int j = s.length()-1;
    
      while(i<j)
    {
          //i is incremented from the start till vowel is found
         while(i<j && !vowels.contains(c[i]+""))
            i++;
          //j is decremented from the end till vowel is found
        while(i<j && !vowels.contains(c[j]+""))
            j--;
  //swap the two
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
          //continue to iterate
        i++;
        j--;
    }
    return new String(c);
}
}