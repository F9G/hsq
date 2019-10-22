
package com.f9g.sonar.duplications;

import java.math.BigDecimal;

public class OrderLine {
  
  private String itemDescription;
  private Long quantity;
  private BigDecimal price;

  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }
 
  public BigDecimal getOrderLineTotal(){
    return price.multiply(BigDecimal.valueOf(quantity.longValue()));
  }
}
