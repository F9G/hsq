
package com.f9g.sonar.duplications;

import java.math.BigDecimal;
import org.junit.*;

import com.f9g.sonar.duplications.OrderLine;

import static org.junit.Assert.*;

public class OrderLineTest {
 
  @Test
  public void testGetOrderLineTotal() {
    System.out.println("getOrderLineTotal");
    OrderLine orderLine = new OrderLine();
    BigDecimal expResult = BigDecimal.valueOf(41.2);
    
    orderLine.setQuantity(4L);
    orderLine.setPrice(BigDecimal.valueOf(10.3));
    BigDecimal result = orderLine.getOrderLineTotal();
    assertEquals(expResult, result);
   
  }
}
