class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        List<List<Integer>> ls = new ArrayList<>();

        for(int i = 0; i < intervals.length; i++){
            if(ls.size() == 0 || ls.get(ls.size()-1).get(1) < intervals[i][0]){
                ls.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
            else if(intervals[i][0] <= ls.get(ls.size()-1).get(1)){
                ls.get(ls.size()-1).set(1,Math.max(ls.get(ls.size()-1).get(1), intervals[i][1]));
            }
        }

        int[][] arr = new int[ls.size()][2];

        for(int i = 0; i < ls.size(); i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = ls.get(i).get(j);
            }
        }

        return arr;
        // Arrays.sort(intervals, new Comparator<int[]>(){
        //     public int compare(int[] a, int[] b){
        //         return a[0] - b[0];
        //     }
        // });
        // List<List<Integer>> ls = new ArrayList<>();

        // for(int i = 0; i < intervals.length; i++){
        //     int start = intervals[i][0];
        //     int end = intervals[i][1];

        //     if(ls.size() != 0 && ls.get(ls.size()-1).get(1) >= end){
        //         continue;
        //     }

        //     for(int j = i+1; j < intervals.length; j++){
        //         if(intervals[j][0] <= end && intervals[j][1] > end) {
        //             end = intervals[j][1];
        //         }
        //     }
        //     ls.add(Arrays.asList(start,end));
        // }

        // int[][] arr = new int[ls.size()][2];

        // for(int i = 0; i < ls.size(); i++){
        //     for(int j = 0; j < 2; j++){
        //         arr[i][j] = ls.get(i).get(j);
        //     }
        // }

        // return arr;
    }
}