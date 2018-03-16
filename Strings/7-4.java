/*
 * Time (mm): 17
 * Chapter/Problem: 7-4 
 * Page on EPI: 98
 * Self Evaluation: 1/3 There is a way to do it in o(1) space. Did not read the question correctly. 
 * Assumptions:
 */

public char[] String replaceRemove(char[] s, int n) {
  int newCount = 0;
  for(int i=0; i<n; i++){
    if(s[i] == 'a') newCount++;
    if(s[i] == 'b') newCount--;
    newCount++;
  }
  
  int i = newCount;
  int j = s.length;
  char[] result = new char[newCount];
  while(j>=0) {
    if(s[j] == 'a') {
      result[i--] = 'd';
      result[i--] = 'd';
    } else if(s[j] != 'b') {
      result[i--] = s[j];
    }
    j--;
  }
  return result.toString();
}
