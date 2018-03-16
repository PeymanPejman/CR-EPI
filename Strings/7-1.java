/*
 * Time(mm:ss): 9:20
 * Chapter/Problem: 7.1
 * Page on EPI: 95
 * Self Evaluation: 3/3
 * Assumptions: The input only contains valid integer numbers as problem statement suggests. 
 */

public int static toInt(String s) {
  boolean isPositive = true;
  int i=0;
  
  if(s.charAt(i) == '-') {
    isPositive = false; 
    i++;
  }
  
  int result = 0;

  while(i<s.length()) {
    result = result * 10 + (s.charAt(i++) - '0');
  }

  return isPositive? result : result*-1;
}
