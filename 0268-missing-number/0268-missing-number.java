class Solution {
    public int missingNumber(int[] nums) {
        int[] arr = new int[nums.length+1];
        for(int i = 0; i < arr.length-1; i++){
            arr[i] = nums[i];
        }

        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    
        for(int j = 0; j < arr.length; j++){
            if(arr[j] == 0 && j != 0){
                return j;
            }
        }
        
        return 0;
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