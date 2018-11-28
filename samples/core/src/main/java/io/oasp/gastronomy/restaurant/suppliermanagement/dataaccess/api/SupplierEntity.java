package io.oasp.gastronomy.restaurant.suppliermanagement.dataaccess.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.gastronomy.restaurant.suppliermanagement.common.api.Supplier;

@Entity
@Table(name = "Supplier")
public class SupplierEntity extends ApplicationPersistenceEntity implements Supplier {

  private static final long serialVersionUID = 1L;

  private String name;

  private String description;

  private int rate;

  /**
   * @return name
   */
  @Column
  public String getName() {

    return this.name;
  }

  /**
   * @return description
   */
  @Column
  public String getDescription() {

    return this.description;
  }

  /**
   * @return rate
   */
  @Column
  public int getRate() {

    return this.rate;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @param description new value of {@link #getdescription}.
   */
  public void setDescription(String description) {

    this.description = description;
  }

  /**
   * @param rate new value of {@link #getrate}.
   */
  public void setRate(int rate) {

    this.rate = rate;
  }

}
