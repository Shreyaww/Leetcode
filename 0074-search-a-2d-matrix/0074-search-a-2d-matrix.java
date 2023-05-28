class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix[0].length-1;

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
        return false;
    }
}