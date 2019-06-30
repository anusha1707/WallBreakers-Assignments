class Solution {
    public void reverseString(char[] s) {
      //iterate and swap 
           for(int j=0;j<s.length/2;j++)
           {
               char temp=s[j];
               s[j]=s[s.length-j-1];
               s[s.length-j-1]=temp;
           }
           }
          
}