package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;
import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.OfferEntity;

/**
 * @author PIBANAS
 *
 */
public interface Special extends ApplicationEntity {

  /**
   * @return
   */
  String getName();

  /**
   * @param Name
   */
  void setName(String Name);

  /**
   * @return
   */
  OfferEntity getOffer();

  /**
   * @param offer
   */
  void setOffer(OfferEntity offer);

  /**
   * @return
   */
  WeeklyPeriod getActivePeriod();

  /**
   *
   */
  void setActivePeriod(WeeklyPeriod activePeriod);

  /**
   * @return
   */
  Money getSpecialPrice();

  /**
   * @param price
   */
  void setSpecialPrice(Money price);
}
