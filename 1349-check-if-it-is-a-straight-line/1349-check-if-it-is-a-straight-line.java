class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        int x1 = coordinates[0][0],  x2 = coordinates[1][0];
        int y1 = coordinates[0][1], y2 = coordinates[1][1];
        int dx = x1-x2, dy = y1-y2;

        // for(int i = 0; i < coordinates.length-1; i++){
        //     slope[i] = dy/dx;
        // }
       // System.out.println(Arrays.toString(slope));
        for(int i = 2; i < coordinates.length; i++){
            int y = coordinates[i][1], x = coordinates[i][0];
            if(dy*(x - x1) != dx*(y - y1)){
                return false;
            }
        }
        return true;
    }
}