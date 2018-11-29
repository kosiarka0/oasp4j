package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;
import io.oasp.module.basic.common.api.to.AbstractEto;

public class SpecialEto extends AbstractEto implements Special {

  private static final long serialVersionUID = -4457788068370871480L;

  private String name;

  private OfferEto offer;

  private WeeklyPeriod activePeriod;

  private Money specialPrice;

  private Long offerId;

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public OfferEto getOffer() {

    return this.offer;
  }

  public void setOffer(OfferEto offer) {

    this.offer = offer;
  }

  public WeeklyPeriod getActivePeriod() {

    return this.activePeriod;
  }

  public void setActivePeriod(WeeklyPeriod activePeriod) {

    this.activePeriod = activePeriod;
  }

  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

  public Long getOfferId() {

    return this.offerId;
  }

  public void setOfferId(Long offerId) {

    this.offerId = offerId;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());

    result = prime * result + ((this.offerId == null) ? 0 : this.offerId.hashCode());
    result = prime * result + ((this.activePeriod == null) ? 0 : this.activePeriod.hashCode());
    result = prime * result + ((this.specialPrice == null) ? 0 : this.specialPrice.hashCode());
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
    SpecialEto other = (SpecialEto) obj;
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }

    if (this.offerId == null) {
      if (other.offerId != null) {
        return false;
      }
    } else if (!this.offerId.equals(other.offerId)) {
      return false;
    }
    if (this.activePeriod == null) {
      if (other.activePeriod != null) {
        return false;
      }
    } else if (!this.activePeriod.equals(other.activePeriod)) {
      return false;
    }
    if (this.specialPrice == null) {
      if (other.specialPrice != null) {
        return false;
      }
    } else if (!this.specialPrice.equals(other.specialPrice)) {
      return false;
    }
    return true;
  }

}
