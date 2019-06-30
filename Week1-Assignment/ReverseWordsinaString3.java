class Solution {
   public String reverseWords(String s) 
{
       //define char array and convert the given string to char array
    char[] c = s.toCharArray();
    int i = 0;
       //swap letters in each word ending with space
    for(int j = 0; j < c.length; j++)
    {
        if(c[j] == ' ')
        {
            swap(c, i, j - 1);
            i = j+1;
        }
    }
       //swap last word separately as there is no space at the end
  swap(c, i, c.length - 1);
    return new String(c);
}
//method for swapping
public void swap(char[] ch, int start, int end)
{
	while(start<end)
	{
		char temp = ch[start];
		ch[start]=ch[end];
		ch[end] = temp;
		start++;
        end--;
	}
}
}