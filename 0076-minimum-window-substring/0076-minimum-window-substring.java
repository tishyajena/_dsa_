class Solution {
    public String minWindow(String s, String t) {
        if(s== null || t == null|| t.length()>s.length()) return "";
        int [] freq2 = new int [128];
        for(char c: t.toCharArray()){
            freq2[c]++;
        }

        //to find the unique character in t
        int required = 0;
        for(int count : freq2){
            if(count >0){
                required++;
            }
        }

        int [] windowCount = new int[128];
        int left = 0;
        int right = 0;
        int formed = 0;

        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while(right<s.length()){
            char c = s.charAt(right);
            windowCount[c]++;

            //compare with t string if the char is present in t or not
            if(freq2[c]>0 && windowCount[c] == freq2[c]){
                formed++;
            }

            //if formed substring is equal to the unique elements counted in t
            while(left<=right && formed == required){
                c = s.charAt(left);

                //new window is updated
                if(right-left+1 <minLen){
                    minLen = right-left+1;
                    startIndex = left;
                }

                //shrinking the window
                windowCount[c]--;
                if(freq2[c] >0 && windowCount[c] < freq2[c]){
                    formed--;
                }

                left++;
            }

            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex+minLen);

    }
}