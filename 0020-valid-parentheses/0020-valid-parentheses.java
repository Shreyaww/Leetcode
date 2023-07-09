class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stk.push(s.charAt(i));
            }
            else if(!stk.isEmpty()){
                if(stk.peek() == '(' && s.charAt(i) == ')'){
                    stk.pop();
                }
                else if(stk.peek() == '[' && s.charAt(i) == ']'){
                    stk.pop();
                }
                else if(stk.peek() == '{' && s.charAt(i) == '}'){
                    stk.pop();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
            
        }

        return stk.isEmpty();

        // Stack<Character> stk = new Stack<Character>();
        // char[] c = s.toCharArray();
    
        // for(int i = 0; i < s.length(); i++){
        //     if(c[i] == '(')
        //         stk.push(')');
        //     else if(c[i] == '[')
        //         stk.push(']');
        //     else if(c[i] == '{')
        //         stk.push('}');
        //     else if(stk.isEmpty() || stk.pop() != c[i]){
        //         return false;
        //     }    
        // }
        // return stk.isEmpty();
    }
}