class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        int left = 0;

        char[] ch = s.toCharArray();

        for(int right = 0; right<ch.length; right++){
            while(set.contains(ch[right])){
                set.remove(ch[left]);
                left++;
            }

            set.add(ch[right]);

            count = Math.max(count, right-left+1);
    
        }
        return count;
    }
}