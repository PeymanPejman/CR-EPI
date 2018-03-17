/*
 * Time (mm): 12 
 * Chapter/Problem:7-8 
 * Page on EPI: 104
 * Self Evaluation: 3/3
 * Assumptions:
 */

public static String lookAndSay(int n) {
  String prev = "1";
  String next = "";
  n--;
  
  while(n>0) {
    
    int i=0;
    while(i<prev.length()) {
      char curr = prev.charAt(i);
      int count = 0;
      while(i<prev.length() && prev.charAt(i) == curr) {
        count++;
        i++;
      }
      next += Integer.toString(count) + curr;
    }

    n--;
  }

  return next;
}
