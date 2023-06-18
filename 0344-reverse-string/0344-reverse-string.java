class Solution {
    public void reverseString(char[] s) {
        char[] arr = new char[s.length];
        int k = 0;
        for(int i = s.length-1; i >= 0; i--){
            arr[k++] = s[i];
        }

        for(int i = 0; i < s.length; i++){
            s[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}