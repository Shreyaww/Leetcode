class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len = word1.length()+ word2.length();
        char[] str = new char[len];
        int j = 0;

        for(int i = 0; (i < word1.length() || i < word2.length()); i++){
            if(word1.length() > i){
                str[j++] = word1.charAt(i);
            }
            if(word2.length() > i){
                str[j++] = word2.charAt(i);
            }
        }

        String str1 = new String(str);
        return str1;
    }
}