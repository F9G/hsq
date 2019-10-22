package com.f9g.sonar.duplications;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InternationalOrder {

  private InternationalCustomer customer;
  private List<OrderLine> orderlines = new ArrayList<OrderLine>();

  /**
   * Adds a new order line to orderline List.
   * @param orderline Order Line to add.
   */
  public void addOrderLine(final OrderLine orderLine) {
    orderlines.add(orderLine);
  }

  public void removeOrderLine(final OrderLine orderLine) {
    orderlines.remove(orderLine);
  }

  public InternationalCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(InternationalCustomer customer) {
    this.customer = customer;
  }

  /**
   * Calculates total amount of an order.
   * @return total amount as a BigDecimal number
   */
  public BigDecimal getTotal() {
    BigDecimal total = BigDecimal.valueOf(0);
    for (OrderLine orderLine : orderlines) {
      total = total.add(orderLine.getOrderLineTotal());
    }
    BigDecimal discount = total.multiply(getDiscount());
    total = total.subtract(discount);
    // Multiply with tax number
    BigDecimal tax = total.multiply(getVat());
    total = total.add(tax);
//  total = total.add(tax);
    return total;
  }

  private BigDecimal getVat() {
    return (BigDecimal.valueOf(customer.getCountry().getVat()));
  }

  private BigDecimal getDiscount() {
    return BigDecimal.valueOf(0.10);
  }
}
