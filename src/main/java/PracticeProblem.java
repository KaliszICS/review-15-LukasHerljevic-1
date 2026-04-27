public class PracticeProblem {

    public static int goodString(String s) {
        int n = s.length();
        int maxGoodLength = -1;

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                if (s.charAt(i) == s.charAt(j)) {
                    int currentLength = j - i + 1;
                    maxGoodLength = Math.max(maxGoodLength, currentLength);
                }
            }
        }

        
        if (maxGoodLength == -1) {
            return -1;
        }

        
        return n - maxGoodLength;
    }

    public static void main(String[] args) {
        
        System.out.println(goodString("abcda"));          // Output: 0
        System.out.println(goodString("abcdefghiab"));    // Output: 1
        System.out.println(goodString("pqr"));            // Output: -1
        System.out.println(goodString("bacdefghipalop")); // Output: 4
    }
}


