class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        char[] c = s.toCharArray();
    
        for(int i = 0; i < s.length(); i++){
            if(c[i] == '(')
                stk.push(')');
            else if(c[i] == '[')
                stk.push(']');
            else if(c[i] == '{')
                stk.push('}');
            else if(stk.isEmpty() || stk.pop() != c[i]){
                return false;
            }    
        }
        return stk.isEmpty();
    }
}