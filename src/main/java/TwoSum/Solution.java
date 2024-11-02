package TwoSum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapNumbers = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int index = mapNumbers.getOrDefault(target - nums[i], -1);
            if(index != -1) {
                return new int[]{index, i};
            } else {
                mapNumbers.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}