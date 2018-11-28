package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.module.basic.common.api.to.AbstractCto;

/**
 * @author PIBANAS
 *
 */
public class SpecialCto extends AbstractCto {

  SpecialEto special;

  OfferEto offer;

  /**
   * The constructor.
   */
  public SpecialCto() {

  }

  /**
   * @return special
   */
  public SpecialEto getSpecial() {

    return this.special;
  }

  /**
   * @param special new value of {@link #getspecial}.
   */
  public void setSpecial(SpecialEto special) {

    this.special = special;
  }

  /**
   * @return offer
   */
  public OfferEto getOffer() {

    return this.offer;
  }

  /**
   * @param offer new value of {@link #getoffer}.
   */
  public void setOffer(OfferEto offer) {

    this.offer = offer;
  }

}
