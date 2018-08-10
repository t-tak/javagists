package com.javagists.learn.interview.questions;
/**
 * 
 * @author javagists.com
 *
 */
public class LongestPalindromeSubsequence {
	public int longestPalindromeSubseq(String input) {
		int[][] dp = new int[input.length()][input.length()];
		for (int i = input.length() - 1; i >= 0; i--) {
			dp[i][i] = 1;
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					dp[i][j] = dp[i + 1][j - 1] + 2;
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[0][input.length() - 1];
	}

	public static void main(String[] args) {
		LongestPalindromeSubsequence longestPalindromeSubsequence = new LongestPalindromeSubsequence();
		System.out.println(longestPalindromeSubsequence.longestPalindromeSubseq("bbbaabbgghj"));
	}
}