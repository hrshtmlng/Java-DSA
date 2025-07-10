public class LT151 {

    public String reverseWords(String s) {
        int n = s.length();
        String ans = "";
        int i = 0;
        String reversed = new StringBuilder(s).reverse().toString();

        for (i = 0; i < n; i++) {
            String word = "";
            while (i < n && reversed.charAt(i) != ' ') {
                word += reversed.charAt(i);
                i++;
            }

            if (word.length() > 0) {
                ans += " " + new StringBuilder(word).reverse().toString();
            }
        }
        return ans.trim();
    }
}
