class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int i = 0, j = s.length()-1;
        List<Character> ls = new ArrayList<>();
        ls = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        while(i < j){
            if(!ls.contains(str[i])){
                i++;
            }
            if(!ls.contains(str[j])){
                j--;
            }

            if(ls.contains(str[i]) && ls.contains(str[j])){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
        }

        return new String(str);
    }
}