class Solution {
    public int equalPairs(int[][] grid) {
        int[] arr = new int[grid.length];
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                arr[j] = grid[i][j];
            }
            count += column(grid, arr);
        }

        return count;
    }

    public int column(int[][] grid, int[] arr){
        int count = 0;
        boolean is = false;
        for(int i = 0; i < grid[0].length; i++){
            for(int j = 0; j < grid.length; j++){
                if(arr[j] == grid[j][i]){
                    is = true;
                }
                else{
                    is = false;
                    break;
                }
            }
            if(is){
                count++;
            }
        }
        return count;
    }
}