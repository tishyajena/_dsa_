class Solution {
    public int[] scoreValidator(String[] events) {
        int[] res = new int[2];
        int score = 0;
        int counter = 0;

        for (String x : events) {
            if (counter == 10){
                break;
            }
                
            else {
                if (x.equals("0") || x.equals("1") || x.equals("2") || x.equals("3") || x.equals("4")
                        || x.equals("6")) {
                    int a = Integer.parseInt(x);
                    score += a;
                } else if (x.equals("W")) {
                    counter++;
                }

                else{
                    score++;
                }
            }

        }

        res[0] = score;
        res[1] = counter;
        return res;
    }
}