class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";

        int i = 0;
        while(i<word1.length() || i<word2.length()){

            if(i<word1.length()){
                ans += word1.charAt(i);
            }
             if(i<word2.length()){
               ans += word2.charAt(i);
            }

            i++;
        }
        return ans;
        // int len = word1.length()+ word2.length();
        // char[] str = new char[len];
        // int j = 0;

        // for(int i = 0; (i < word1.length() || i < word2.length()); i++){
        //     if(word1.length() > i){
        //         str[j] = word1.charAt(i);
        //         j++;
        //     }
        //     if(word2.length() > i){
        //         str[j] = word2.charAt(i);
        //         j++;
        //     }
        // }

        // String str1 = new String(str);
        // return str1;
    }
}