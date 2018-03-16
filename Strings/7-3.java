/*
 * Time (mm): 7
 * Chapter/Problem: 7-3
 * Page on EPI: 98
 * Self Evaluation: 2/3 Should be faster
 * Assumptions: Valid Characters
 */

public static int columnEncoding(String s) {
  int result = 0;

  for(char c : s.toCharArray()) {
    result = result * 26 + (ch - 'A' + 1);
  }
  return result;
}
