package cn.hjmao.dao.minor;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 3/24/16.
 */
public class MainTest {

  @Test
  public void testAdd() throws Exception {
    int a = 3;
    int b = 4;
    assertEquals(Main.add(a, b), a + b);
  }
}