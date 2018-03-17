/*
 * Time (mm): 16 
 * Chapter/Problem: 7-12 
 * Page on EPI: 108
 * Self Evaluation: 2/3 too slow
 * Assumptions:
 */

public static String encodingRLE(String s) {
  if(s == null || s.length() == 0)
    return s;

  StringBuilder result = new StringBuilder();
  
  int i=0;
  char curr;
  while(i<s.length()) {
    curr = s.charAt(i);
    count = 1;

    while(i<s.length()-1 && curr == charAt(i+1)) {
      i++;
    }

    result.append(Integer.toString(count));
    result.append(curr);
    i++;
  }

  return result.toString();

}

public static String decodingRLE(String s) {
  if(s == null || s.length() == 0)
    return s;

  StringBuilder result = new StringBuilder();
  
  
  int count, i=0;
  char curr;

  while(i<s.length()) {
    curr = s.charAt(i);
    count = 0;
    while(Character.isdigit(curr)) {
      count = count*10 + (curr - '0');
      curr = s.charAt(++i);
    }
    
    for(int j=0; j<count; j++)
      result.append(curr);
    
    i++;
  }

  return result.toString();
}
