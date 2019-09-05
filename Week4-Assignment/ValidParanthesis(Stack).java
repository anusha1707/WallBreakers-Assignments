class Solution {
    public boolean isValid(String s) {
       HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for(int i=0; i<s.length(); i++)
        {
         char c = s.charAt(i);
         
            if(c=='('||c=='['||c=='{')
                stack.push(c);
            else
            {
                if(!stack.empty() && map.get(c)==stack.peek())
                    stack.pop();
                else
                    return false;
            }
            
        }
        if(!stack.empty())
            return false;
        else
            return true;
        }
}
