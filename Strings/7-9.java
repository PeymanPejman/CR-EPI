/*
 * Time (mm): 
 * Chapter/Problem: 
 * Page on EPI:
 * Self Evaluation:
 * Assumptions:
 */

public static int romanToInt(String s) {
  Map<Character, Integer> mapping = new HashMap<>();
  mapping.put('M', 1000);
  mapping.put('D', 500);
  mapping.put('C', 100);
  mapping.put('L', 50);
  mapping.put('X', 10);
  mapping.put('V', 5);
  mapping.put('I', 1);
  
  int res = mapping.get(s.charAr(s.length()-1));
  
  for(int i=s.length()-2; i>=0; i--) {
    if(i != 0 && mapping.get(s.charAt(i)) < mapping.get(s.charAt(i+1))) {
      res -= mapping.get(s.charAt(i));
    } else {
      res += mapping.get(s.charAt(i));
    }
  }

  return res;
}
