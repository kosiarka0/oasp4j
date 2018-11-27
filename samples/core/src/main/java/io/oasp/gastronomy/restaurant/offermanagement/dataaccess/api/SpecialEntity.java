package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;

/**
 * @author PIBANAS
 *
 */
@Entity
@Table(name = "Special")
public class SpecialEntity extends ApplicationPersistenceEntity implements Special {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private String name;

  private OfferEntity offer;

  private WeeklyPeriodEmbeddable activePeriod;

  private Money specialPrice;

  /**
   * @return name
   */
  @Override
  @Column(unique = true)
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  @Override
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return offer
   */
  @ManyToOne
  @JoinColumn(name = "offerId")
  public OfferEntity getOffer() {

    return this.offer;
  }

  /**
   * @param offer new value of {@link #getoffer}.
   */
  public void setOffer(OfferEntity offer) {

    this.offer = offer;
  }

  /**
   * @return activePeriod
   */
  @Embedded
  public WeeklyPeriodEmbeddable getActivePeriod() {

    return this.activePeriod;
  }

  /**
   * @param activePeriod new value of {@link #getactivePeriod}.
   */
  public void setActivePeriod(WeeklyPeriod activePeriod) {

    this.activePeriod = new WeeklyPeriodEmbeddable();
    this.activePeriod.setEndingDay(activePeriod.getEndingDay());
    this.activePeriod.setEndingHour(activePeriod.getEndingHour());
    this.activePeriod.setStartingDay(activePeriod.getEndingDay());
    this.activePeriod.setStartingHour(activePeriod.getStartingHour());
  }

  /**
   * @return specialPrice
   */
  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  /**
   * @param specialPrice new value of {@link #getspecialPrice}.
   */
  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

}
