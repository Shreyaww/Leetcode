class Solution {
    public String reverseWords(String s) {
        Stack<String> stk = new Stack<>();
        s = s.replaceAll("\\s+", " ").trim();
        String[] words = s.split(" ");

        for(int i = 0; i < words.length; i++){
            stk.push(words[i]);
        }

        String str = "";
        for(int i = 0; i < words.length; i++){
            str = str + " " + stk.pop();
        }

        str = str.trim();
       // System.out.println(stk.pop());
        return str;
    }
}