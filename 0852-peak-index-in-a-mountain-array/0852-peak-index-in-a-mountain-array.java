class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length -1;
        if(arr.length == 1) return 0;
        else if(arr[low] > arr[low+1]) return low;
        else if(arr[high] > arr[high-1]) return high;
        else{
            low = 1;
            high = arr.length -2;
            while(low<= high){
                int mid = low + (high-low)/2;
                if(arr[mid]> arr[mid-1] && arr[mid]> arr[mid+1]){
                    return mid;
                }
                else if(arr[mid] < arr[mid+1]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return low;
    }
}