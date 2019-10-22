package com.f9g.sonar.duplications;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

  private Customer customer;
  private List<OrderLine> orderlines = new ArrayList<OrderLine>();

  public void addOrderLine(final OrderLine orderLine) {
    orderlines.add(orderLine);
  }

  public void removeOrderLine(final OrderLine orderLine) {
    orderlines.remove(orderLine);
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public BigDecimal getTotal() {
    BigDecimal total = BigDecimal.valueOf(0);
    for (OrderLine orderLine : orderlines) {
      total = total.add(orderLine.getOrderLineTotal());
    }
    BigDecimal discount = total.multiply(getDiscount());
    total = total.subtract(discount);

    BigDecimal tax = total.multiply(getVat());
    total = total.add(tax);

    return total;
  }

  private BigDecimal getVat() {
    return BigDecimal.valueOf(0.20);
  }

  private BigDecimal getDiscount() {
    return BigDecimal.valueOf(0.10);
  }
}
