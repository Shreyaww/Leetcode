class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> arr;
        for(int i = 0; i < nums.size(); i++){
            for(int j = i+1; j < nums.size(); j++){
                if(nums[i] + nums[j] == target){
                    arr.insert(arr.begin(), i);
                    arr.insert(arr.begin()+1, j);

                    return arr;
                }
            }
        }

        return arr;
    }
};