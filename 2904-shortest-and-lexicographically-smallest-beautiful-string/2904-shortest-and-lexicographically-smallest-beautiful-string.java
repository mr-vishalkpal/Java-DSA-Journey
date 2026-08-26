class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int n = s.length();

        // Store positions of all 1s
        int[] ones = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones[count++] = i;
            }
        }

        // Not enough 1s
        if (count < k) {
            return "";
        }

        String answer = "";

        for (int i = 0; i <= count - k; i++) {

            int start = ones[i];
            int end = ones[i + k - 1];

            String current = s.substring(start, end + 1);

            if (answer.equals("")
                    || current.length() < answer.length()
                    || (current.length() == answer.length()
                        && current.compareTo(answer) < 0)) {

                answer = current;
            }
        }

        return answer;
    }
}