class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        HashSet<Integer> n1 = new HashSet<>();
        for(int x:nums1){
            n1.add(x);

        }
        HashSet<Integer> n2 = new HashSet<>();
        for(int x:nums2){
            n2.add(x);
        }
        for(int x: n1){
            if(!n2.contains(x)){
                a.add(x);
            }
        }
        for(int x: n2){
            if(!n1.contains(x)){
                b.add(x);
            }
        }
        
        ans.add(a);
        ans.add(b);

        return ans;
        
    }
}