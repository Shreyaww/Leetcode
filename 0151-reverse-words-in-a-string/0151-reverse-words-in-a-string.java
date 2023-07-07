class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+", " ").trim();
        String[] words = s.split(" ");
        String str = "";

        for(int i = words.length-1; i >= 0; i--){
            str += " " + words[i];
        }

        str = str.trim();

        return str;

        // Stack<String> stk = new Stack<>();
        // s = s.replaceAll("\\s+", " ").trim();
        // String[] words = s.split(" ");

        // for(int i = 0; i < words.length; i++){
        //     stk.push(words[i]);
        // }

        // String str = "";
        // for(int i = 0; i < words.length; i++){
        //     str = str + " " + stk.pop();
        // }

        // str = str.trim();
       
        // return str;
    }
}