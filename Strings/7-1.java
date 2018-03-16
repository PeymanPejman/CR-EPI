/*
 * Time(mm:ss): 9:20
 * Chapter/Problem: 7.1
 * Page on EPI: 95
 * Self Evaluation: 3/3
 * Assumptions: The input only contains valid integer numbers as problem statement suggests. 
 */

public static int toInt(String s) {
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

public static String toString(int n) {
  boolean isPositive = true;

  if(n<0) {
    isPositive = false;
  }
  n = Math.abs(n);
  
  StringBuilder result = new StringBuilder();
  while (n>0) {
    result.append(0,(char)((n%10) + '0'));
    n /= 10;
  }

  return isPositive? result.toString() : result.append(0,'-').toString();
}
