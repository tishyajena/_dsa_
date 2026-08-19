class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];

        Arrays.sort(strs);

        int i = 0;
        String s = strs[0];

        StringBuilder res = new StringBuilder();

        while(i<s.length()){
            for(int j = 1; j<strs.length; j++){
                if(s.charAt(i) != strs[j].charAt(i)) return res.toString();
            }
            res.append(s.charAt(i));
            i++;
            
        }
        return res.toString();

        // int k = 0;
        // StringBuilder sb = new StringBuilder();
        // String str = strs[0];

        // for(int i = 1; i<strs.length; i++){
        //     if(str.charAt(k) != strs[i].charAt(k)){
        //         return sb.toString();
        //     }
        //     else{
        //         sb.append(str.charAt(k));
        //         k++;
        //     }
        // }
        // return sb.toString();

    }
}