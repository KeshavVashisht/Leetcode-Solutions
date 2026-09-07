#include <vector>
class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        vector<int> ans;
        for(int i=0 ; i < size(nums) ; i=i+1 ){
            ans.push_back(nums[nums[i]]);
        }
        return ans;


    }
};