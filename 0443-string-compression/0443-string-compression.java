class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1)
            return 1;
        int left = 0;
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int right = 1; right < chars.length; right++) {
            if (chars[left] != chars[right]) {
                sb.append(chars[left]);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
                left = right;
            } else {
                count++;
            }
        }
        if (count >= 1) {
            sb.append(chars[left]);
            if (count > 1) {
                sb.append(count);
            }
        }

        int k = 0;
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
            k++;
        }
        return k;

    }
}