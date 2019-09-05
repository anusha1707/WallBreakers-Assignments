class Solution {
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=0; i<S.length(); i++)
        {
         char c = S.charAt(i);
         
            if(c=='(')
                stack.push(0);
            else
            {
                int k = stack.pop();
                int j = stack.pop();
                stack.push(j + Math.max(2*k,1));
            }        
        }
      return stack.pop();
    }
}