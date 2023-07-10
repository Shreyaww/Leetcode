class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums2.length; i++){
            while(!stk.isEmpty() && nums2[i] > stk.peek()){
                map.put(stk.pop(), nums2[i]);
            }
            stk.add(nums2[i]);
        }
        
        for(int i = 0; i < nums1.length; i++){
            if(map.containsKey(nums1[i])){
                ans[i] = map.get(nums1[i]);
            }
            else{
                ans[i] = -1;
            }
        }
       
        return ans;

        // int[] ans = new int[nums1.length];

        // for(int i = 0; i < nums1.length; i++){
        //     ans[i] = -1;
        //     for(int j = 0; j < nums2.length; j++){
        //         if(nums1[i] == nums2[j]){
        //             for(int k = j+1; k < nums2.length; k++){
        //                 if(nums2[k] > nums2[j]){
        //                     ans[i] = nums2[k];
        //                     break;
        //                 }
        //             }
        //         }
        //     }
        // }
        // return ans;
    }
}