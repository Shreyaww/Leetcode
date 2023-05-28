class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                // if(matrix.length == 1 && matrix[i].length == 1){
                //     if(matrix[0][0] == target){
                //         return true;
                //     }
                //     else{
                //         return false;
                //     }
                // }
                int low = 0, high = matrix[i].length-1;

                while(low < matrix.length && high >= 0){
                    if(matrix[low][high] == target){
                        return true;
                    }
                    else if(matrix[low][high] > target){
                        high--;
                    }
                    else{
                        low++;
                    }
                }
            }
        }
        return false;
    }
}