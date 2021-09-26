package by.antonov.util;

import by.antonov.utils.StringUtil;

public class Utils {
  public static boolean isAllPositiveNumbers(String... str) {
    boolean result = false;
    for (String strNumber : str) {
      result = StringUtil.isPositiveNumber(strNumber);

      if (!result) {
        break;
      }
    }
    return result;
  }
}
