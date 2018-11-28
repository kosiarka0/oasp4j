package io.oasp.gastronomy.restaurant.suppliermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.to.AbstractEto;
import io.oasp.gastronomy.restaurant.suppliermanagement.common.api.Supplier;

/**
 * Entity transport object of Supplier
 */
public class SupplierEto extends AbstractEto implements Supplier {

  private static final long serialVersionUID = 1L;

  private String name;

  private String description;

  private int rate;

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result;
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    SupplierEto other = (SupplierEto) obj;
    return true;
  }

  @Override
  public String getName() {

    return name;
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public String getDescription() {

    return description;
  }

  @Override
  public void setDescription(String description) {

    this.description = description;
  }

  @Override
  public int getRate() {

    return rate;
  }

  @Override
  public void setRate(int rate) {

    this.rate = rate;
  }

}
