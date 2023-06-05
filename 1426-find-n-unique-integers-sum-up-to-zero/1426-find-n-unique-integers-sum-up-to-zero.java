class Solution {
    public int[] sumZero(int n) {
        if(n == 1){
            return new int[]{0};
        }
        int[] arr = new int[n];
        int k = n/2;

        for(int i = -1; i < n-2; i++){
            arr[++i] = k;
            arr[i+1] = -k;
            k--;
        }
       // Arrays.sort(arr);
        return arr;
    }
}