/*
 * Time (mm): 10
 * Chapter/Problem: 7-5 
 * Page on EPI: 100
 * Self Evaluation: 3/3
 * Assumptions:
 */

public static boolean isPalindromic(String s) {
  for(int i=0, j=s.length()-1; i<j; i++,j--) {
    while(!isAlphaNumeric(s.charAt(i) && i<j) {
      i++;
    }

    while(!isAlphaNumeric(s.charAt(j) && i<j){
      j--;
    }

    if(i<j && !equalNoCase(s.charAt(i), s.charAr(j)))
      return false; 
  }

  return true;

}

private boolean isAlphaNumeric(char c) {
  return (c<='Z' && c>='A') || (c<='z' && c>='a') || (c<='9' && c>='0');
}

private boolean equalNoCase(char c1, char c2) {
  if(c1>='A' && c1<='Z') {
    c1 = c1 - 'A' + 'a';
  }

  if(c2>= 'A' && c2<='Z') {
    c2 = c2 - 'A' + 'a';
  }

  return c1 == c2;
}
