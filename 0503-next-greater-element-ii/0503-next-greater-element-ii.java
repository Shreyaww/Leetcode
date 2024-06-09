class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        Stack<Integer> stk = new Stack<>();
        Arrays.fill(arr, -1);

        for(int i = 0; i < nums.length*2; i++){
            while(!stk.isEmpty() && nums[i%nums.length] > nums[stk.peek()]){
                arr[stk.pop()] = nums[i%nums.length];
            }

            if(i < nums.length)
                stk.push(i);
        }
        
        return arr;
    }
}