class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();

        int i = 0, j = s.length()-1;
        List<Character> ls = new ArrayList<>();
        ls.add('a');
        ls.add('e');
        ls.add('i');
        ls.add('o');
        ls.add('u');
        ls.add('A');
        ls.add('E');
        ls.add('I');
        ls.add('O');
        ls.add('U');

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

        s = new String(str);
        return s;

        //  char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        //  char[] arr = s.toCharArray();

        // int left = 0, right = arr.length - 1;
        // char temp = '\0';

        // while(left <= right){
        //     for(int i = 0; i < vowels.length; i++){
        //         if(arr[left] != vowels[i]){
        //             left++;
        //         }
        //         if(arr[right] != vowels[i]){
        //             right--;
        //         }
        //         else{
        //             temp = arr[left];
        //             arr[left] = arr[right];
        //             arr[right] = temp;
        //         }
        //     }
        // }
        // s = String.copyValueOf(arr);
        //  return s;
    }
}