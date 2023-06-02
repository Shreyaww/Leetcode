class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder(command.length());

        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                str.append('G');
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                str.append('o');
            }
            else if(command.charAt(i) == 'a' && command.charAt(i+1) == 'l'){
                str.append('a');
                str.append('l');
            }
        }
        return str.toString();
    }
}