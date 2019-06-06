package pickYourTail;

import java.util.Scanner;

public class ShortestSubString {
	private static final int maxChars = 256;
	static int countDistinctChars(String str, int n) { 
        int count[] = new int[maxChars]; 
        for (int i = 0; i < n; i++) { 
            count[str.charAt(i)]++; 
        } 
        int max_distinct = 0; 
        for (int i = 0; i < maxChars; i++) { 
            if (count[i] != 0) { 
                max_distinct++; 
            } 
        } 
        return max_distinct; 
    } 
	public static int shortestSubstring(String s) {
		int strLen = s.length();
		int distinctCount = countDistinctChars(s, strLen); 
        int minlen = strLen;
        for (int i = 0; i < strLen; i++) { 
        	for (int j = 0; j < strLen; j++) { 
                String substr = null; 
                if(i<j) 
                    substr = s.substring(i, j); 
                else
                    substr = s.substring(j, i); 
                int substr_length = substr.length(); 
                int substr_dchar = countDistinctChars(substr, substr_length); 
                if (substr_length < minlen && distinctCount == substr_dchar) { 
                    minlen = substr_length; 
                } 
            } 
        } 
        return minlen; 
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int result = shortestSubstring(s);
		System.out.println(result);
	}
}
