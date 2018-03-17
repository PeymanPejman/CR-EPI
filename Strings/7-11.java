/*
 * Time (mm): 5 
 * Chapter/Problem: 7-11
 * Page on EPI: 107
 * Self Evaluation: 3/3
 * Assumptions:
 */

public static String getSinusoidal(String S) {
  if( s == null || s.length() == 0)
    return "";

  StringBuilder result = new StringBuilder();

  addLine(s, result, 1, 4);
  addLine(s, result, 0, 2);
  addLine(s, result, 3, 4);

  return result.toString();
}

private static void addLine(String s, StringBuilder result, int start, int period) {
  for(int i=start; i<s.length(); i=i+period) {
    result.append(s.charAt(i);
  }
}
