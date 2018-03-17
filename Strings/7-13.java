/*
 * Time (mm): 15 
 * Chapter/Problem: 7-13 
 * Page on EPI: 109
 * Self Evaluation: 2/3 there are better hashing methods
 * Assumptions:
 */

public static int search(String s, String t) {
  if(t == null || s == null || s == "" || t.length() < s.length())
    return -1;

  int tRollingHash, sRollingHash;

  for(int i=0; i<s.length(); i++) {
    tRollingHash += t.charAt(i);
    sRollingHash += s.charAt(i);
  }
  
  int len = s.length();
  int i = len;

  while(i<t.lenght()) { 
    if(sRollingHash == tRollingHash && t.substring(i-len, i+1).equals(s)) {
      return i-len;
    }
    tRollingHash = tRollingHash + t.charAt(i) - t.charAt(i-len);
    i++;
  }

  return -1;

}
