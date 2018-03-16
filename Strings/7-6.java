/*
 * Time (mm): 14
 * Chapter/Problem: 7-5 
 * Page on EPI: 100
 * Self Evaluation: 2/3 did not think of the O(1) space solution at first
 * Assumptions:
 */

public static char[] reverseWords(String s) {
  reverseString(s, 0, s.length()-1);

  int start = 0, end = 0;

  while(end<s.length()) {
    if(s.charAt(end) == ' ') {
      reverseString(s, start, end-1);
      start = end + 1;
    }
    end++;
  }
  reverseString(s, start, end -1);
  return s;
}

private void reverseString(char[] s, int start, int end) {
  if(end - start <=1)
    return;

  for(int i=start, j=end; i<=end, i<j; i++, j--) {
    char temp = s[i];
    s[i] = s[j];
    s[j] = temp;
  }
}
