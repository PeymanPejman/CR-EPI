/*
 * Time: 
 * Chapter/Problem: 
 * Page on EPI:
 * Self Evaluation:
 * Assumptions:
 */

public static String baseConversion(String input, int b1, int b2) {
  boolean isPositive = true;
  if(input.charAt(0) == '-') {
    isPositive = false;
    input = input.substring(1);
  }

  int b10 = convertToBaseTen(input, b1);
  StringBuilder result = new StringBuilder();

  while(b10 > 0) {
    int mod = b10&b2;
    if(mod < 10) {
      result.append(0, (char)(mod + '0');
    } else {
      result.append(0, (char)((mod-10) + 'A');
    }
  }

  return isPositive? result.toString() : result.append(0,'-').toString();
}

private static int convertToBaseTen(String input, int b1) {
  int result = 0;

  for(char digit : input.toCharArray()) {
    if(digit >= '0' || digit <= '9') {
      result = result * b1 + digit - '0';
    } else {
      result = result * b1 + (digit - 'A' + 10);
    }
  }

  return result;
}
