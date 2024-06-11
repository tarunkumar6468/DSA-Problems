package Program_With_DP;

public class Longest_Subsequence {
    public static void main(String[] args){
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";

        String lcsRes = charLCS(s1,s2);
        System.out.println("The length of the longest common subsequence is " + lcsRes.length());
        System.out.println("The longest common subsequence is " + lcsRes);

        System.out.println("The longest common subSequence "+lcs(s1,s2));
    }
    public static int lcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        int [][]dp =  new int[n+1][m+1];
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    System.out.println(dp[i][j]);
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }

        }
        return dp[n][m];
}
    public static String charLCS(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        // Create a 2D array to store the lengths of the longest common subsequence
        int[][] dp = new int[n + 1][m + 1];

        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // If characters match, add 1 to the result from the previous characters
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // If characters do not match, take the maximum value from previous subsequences
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Backtracking to find the actual LCS
        StringBuilder lcs = new StringBuilder();
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                lcs.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // The lcs is constructed backwards, so reverse it
        return lcs.reverse().toString();
    }
    }
