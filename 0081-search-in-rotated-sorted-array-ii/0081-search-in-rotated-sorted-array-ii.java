class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return true;
            
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low ++;
                high--;
                continue;
            }
            else if (nums[low] <= nums[mid]) { //left side sorted
                if (target >= nums[low] && target < nums[mid]) { //if target lies between low and mid
                    high = mid - 1;
                } else { //if target lies between mid and high
                    low = mid + 1;
                }
            } else { //right side sorted
                if (target > nums[mid] && target <= nums[high]) { //if target lies between mid and high
                    low = mid + 1;
                } else { //if target lies between low and mid
                    high = mid - 1;
                }
            }

        }
        return false;
    }
}
