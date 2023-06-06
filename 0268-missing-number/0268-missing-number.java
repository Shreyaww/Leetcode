class Solution {
    public int missingNumber(int[] nums) {
        int[] arr = new int[nums.length+1];
        System.arraycopy(nums, 0, arr, 0, arr.length-1);

        int i = 0;
        while(i < nums.length){
            //int correct = arr[i];
            if(nums[i] < nums.length && nums[i] != nums[nums[i]]){
                swap(nums, i, nums[i]);
            }
            else{
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j){
                return j;
            }
        }

        System.out.println(Arrays.toString(nums));
    
        // for(int j = 0; j < arr.length; j++){
        //     if(arr[j] == 0 && j != 0){
        //         return j;
        //     }
        // }
        
        return nums.length;
       // return search(nums);
    }

    public void swap(int[] nums, int i, int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    } 

    // public int search(int[] nums){
    //     int start = 0;
    //     int end = nums.length;
    //     Arrays.sort(nums);
        
    //     while(start <= end){
    //         for(int i = 0; i < nums.length; i++){
    //             if(nums[start] != i){
    //                 return i;
    //             }
    //             else if(nums[end-1] == nums.length-i){
    //                 start++;
    //                 end--;
    //             }
    //             else{
    //                 return (nums.length-i);
    //             }   
    //         }
    //     }
    //     return 0;
    // }
}