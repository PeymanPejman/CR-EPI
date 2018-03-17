/*
 * Time (mm): 
 * Chapter/Problem: 
 * Page on EPI:
 * Self Evaluation:
 * Assumptions:
 */

public static List<String> allValidIP(String s) {
  List<String> res = new ArrayList<>();

  for(int i=1; i<4 && i<s.length(); i++) {
    String part1 = s.substring(0,i);
    if(!isValid(part1))
      continue;
    for(int j=i+1; j <i+4 && j<s.length(); j++) {
      String part2 = s.substring(i, j);
      if(!isValid(part2))
        continue;
      for(int k=j+1; k<j+4 && k<s.length(); k++) {
        String part3 = s.substring(j, k);
        if(!isValid(part3))
          continue;
        if(k<s.length()-1)
          String part4 = s.substring(k+1);
        else
          continue;
        if(isValid(part4))
          res.add(part1 + "." + part2 + "." + part3 + "." + part4);
      }
    }
  }

  return res; 
}

private static boolean isValid(String s) {
  if(s.length() >3)
    return false; 

  if(s.charAt(0) == "0" && s.length >1)
    return false;

  if(Integer.parseInt(s)>256)
    return false;

  return true;
}
