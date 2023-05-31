class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0; i < names.length -1; i++){
            for(int j = i+1; j < names.length; j++){
                if(heights[j] > heights[i]){
                    names = swap_str(names, i, j);
                    heights = swap_int(heights, i, j);
                }
            }
        }
        return names;
    }

    public static int[] swap_int(int[] heights, int i, int j){
        int int_temp = 0;

        int_temp = heights[j];
        heights[j] = heights[i];
        heights[i] = int_temp;

        return heights;
    }

    public static String[] swap_str(String[] names, int i, int j){
        String temp = "";

        temp = names[j];
        names[j] = names[i];
        names[i] = temp;

        return names;
    }
}