package com.f9g.sonar.duplications;

import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.f9g.sonar.duplications.Order;
import com.f9g.sonar.duplications.OrderLine;

public class OrderTest {

  private final Order order = new Order();

  @Before
  public void setUp() {

    OrderLine orderLine = new OrderLine();
    orderLine.setPrice(BigDecimal.valueOf(10.50));
    orderLine.setQuantity(3L);
    OrderLine anotherOrderLine = new OrderLine();
    anotherOrderLine.setPrice(BigDecimal.valueOf(6.43));
    anotherOrderLine.setQuantity(1L);

    order.addOrderLine(orderLine);
    order.addOrderLine(anotherOrderLine);

  }

  @Test
  public void testGetTotal() {
    System.out.println("getTotal");

    BigDecimal expResult = BigDecimal.valueOf(40.9644);
    BigDecimal result = order.getTotal();
    assertEquals(expResult, result);

  }
}
