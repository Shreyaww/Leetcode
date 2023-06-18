class Solution {
    public void reverseString(char[] s) {
        // char[] arr = new char[s.length];
        // int k = 0;
        // for(int i = s.length-1; i >= 0; i--){
        //     arr[k++] = s[i];
        // }

        // for(int i = 0; i < s.length; i++){
        //     s[i] = arr[i];
        // }

        int start = 0, end = s.length-1;

        while(start <= end){
            swap(s, start++, end--);
        }
    }

    public void swap(char[] s, int start, int end){
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }
}