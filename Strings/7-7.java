/*
 * Time (mm): 10 
 * Chapter/Problem: 7-6 
 * Page on EPI: 102
 * Self Evaluation: 3/3 
 * Assumptions:
 */

public static List<String> getMnemonics(String num) {
  String[] map = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

  List<String> result = new ArrayList<>();

  helper(result, new StringBuilder(), map, num, 0);
}

private static void helper(List<String> result, StringBuilder partial, String[] map, String num, int i) {
  
  if(i == num.length()) {
    result.add(partial.toString());
    return;
  }

  for(char c : map[Integer.parseInt(num.charAt(i))].toCharArray()) {
    partial.append(c);
    helper(result, partial, map, num, i+1);
    partial.deleteCharAt(partial.length()-1);
  }
} 
