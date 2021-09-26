package by.antonov.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {
  @Test
  void positiveTest() {
    assertTrue(Utils.isAllPositiveNumbers("20", "5"), "It's not a positive number");
  }
}
