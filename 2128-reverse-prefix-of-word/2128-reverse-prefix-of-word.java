class Solution {
    public String reversePrefix(String word, char ch) {
        String str = "";
        int count = 0;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                count = i;
                break;
            }
        }
        System.out.println(count);
        for(int i = count; i >= 0; i--){
            str += word.charAt(i);
        }
        for(int i = count+1; i < word.length(); i++){
            str += word.charAt(i);
        }


        return str;
    }
}