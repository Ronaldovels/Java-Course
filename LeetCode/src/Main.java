public class Main {
    public static void main (String[] args) {
        String s = "aab";
        StringBuilder fancyString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int len = fancyString.length();

            if (len < 2 || fancyString.charAt(len - 1) != currentChar || fancyString.charAt(len - 2) != currentChar) {
                fancyString.append(currentChar);
            }

        }
        System.out.println(fancyString.toString());
    }
}
