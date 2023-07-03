class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
            if(nums1[i] >= nums2[j]){
                arr[k++] = nums2[j++];
            }
            else{
                arr[k++] = nums1[i++];
            }
        }

        while(i < m){
            arr[k++] = nums1[i++];
        }
        while(j < n){
            arr[k++] = nums2[j++];
        }
        for(int a = 0; a < (m+n); a++){
            nums1[a] = arr[a];
        }
        // Soln1 : 
        // int k = 0, len1 = nums1.length, len2 = nums2.length;

        // for(int i = (len1 - len2); i < len1; i++){
        //     nums1[i] = nums2[k];
        //     k++;
        // }

        // Arrays.sort(nums1); 
    }
}