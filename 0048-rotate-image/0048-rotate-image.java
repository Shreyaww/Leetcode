class Solution {
    public void rotate(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            // int[] arr1 = new int[matrix.length];
            // for(int j = 0; j < matrix[0].length; j++){
            //     arr1[j] = matrix[i][j];
            // }

            // int k = 0;
            // for(int j = 0; j < matrix[0].length; j++){
            //     arr[j][matrix[0].length - i-1] = arr1[k++];
            // }

            for(int j = 0; j < matrix[0].length; j++){
                arr[j][matrix[0].length - i-1] = matrix[i][j];
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = arr[i][j];
            }
        }
    }
}