class Solution {
    public boolean isPalindrome(String s) {
        //Convert the letters to lowercase after removing other characers
       String rev = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
      // compare string
       for(int i=0;i<rev.length();i++)
       {
           if (rev.charAt(i)!=rev.charAt(rev.length()-1-i))
            return false;
       }
       
        return true;
    }
}