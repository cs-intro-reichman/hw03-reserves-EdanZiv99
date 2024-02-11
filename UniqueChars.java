/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String ans = "" + (char) (s.charAt(0));
        int i = 1; 
        while (i < s.length()) {
            char ch = s.charAt(i); 
            if (ch == ' ') {
                ans = ans + ch; 
            }
            if (ans.indexOf(ch) == -1) {
                ans = ans + ch; 
                i++;
            }  else  { 
                i++;
            }
        }
        return ans;
    }
}