class Solution {
    public void reverseString(char[] s) {
        //Method 1:
        // char[] arr = new char[s.length];
        // int k = 0;
        // for(int i = s.length-1; i >= 0; i--){
        //     arr[k++] = s[i];
        // }

        // for(int i = 0; i < s.length; i++){
        //     s[i] = arr[i];
        // }

        //Method 2:
        // int start = 0, end = s.length-1;

        // while(start <= end){
        //     swap(s, start++, end--);
        // }


        //Method 3 : recursion
        recursion(s, 0, s.length-1);
    }

    public void recursion(char[] s, int start, int end){
        if(start >= end){
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        recursion(s, start+1, end-1);
    }

    // public void swap(char[] s, int start, int end){
    //     char temp = s[start];
    //     s[start] = s[end];
    //     s[end] = temp;
    //}
}