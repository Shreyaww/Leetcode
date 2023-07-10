class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            ans[i] = -1;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    for(int k = j+1; k < nums2.length; k++){
                        if(nums2[k] > nums2[j]){
                            ans[i] = nums2[k];
                            break;
                        }
                    }
                }
            }
        }
        return ans;
        // int[] ans = new int[nums1.length];

        // for(int i = 0; i < nums1.length; i++){
        //     for(int j = 0; j < nums2.length; j++){
        //         if(nums1[i] == nums2[j] && j == nums2.length-1){
        //             ans[i] = -1;
        //         }
        //         else if(nums1[i] == nums2[j]){
        //             if(nums2[j] < nums2[j+1]){
        //                 ans[i] = nums2[j+1];
        //             }
        //             else{
        //                 ans[i] = -1;
        //             }
        //         }
        //     }
        // }

        // return ans;
    }
}