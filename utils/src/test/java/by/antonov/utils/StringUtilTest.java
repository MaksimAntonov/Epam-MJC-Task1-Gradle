package by.antonov.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {
  @Test
  void positiveTest() {
    assertTrue(StringUtil.isPositiveNumber("20"), "It's not a positive number");
  }
}
