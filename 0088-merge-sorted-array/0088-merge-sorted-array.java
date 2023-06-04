class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = 0, len1 = nums1.length, len2 = nums2.length;

        for(int i = (len1 - len2); i < len1; i++){
            nums1[i] = nums2[k];
            k++;
        }

        Arrays.sort(nums1); 
    }
}