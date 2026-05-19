class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet<Character> set = new HashSet<>();
        // int maxLen = 0;
        // for(int i = 0; i<s.length(); i++){
        //     int l = 0;
        //     for(int j = i; j<s.length();j++){
        //         if(set.contains(s.charAt(j))){
        //             break;
        //         }
        //         else{
        //             set.add(s.charAt(i));
        //         }
        //         l++;
        //     }
        //     maxLen = Math.max(maxLen, l);
        // }
        // return maxLen;

        int count =0;
        int left = 0;
        Set<Character> set = new HashSet<>();

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