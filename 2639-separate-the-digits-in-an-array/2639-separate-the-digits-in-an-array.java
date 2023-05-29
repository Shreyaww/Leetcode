class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            sb.append(nums[i]);
        }
        System.out.println(sb);

        int[] arr = new int[sb.length()];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sb.charAt(i) - '0';
        }
        return arr;
    }
}