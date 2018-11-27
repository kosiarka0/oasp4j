package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import java.time.LocalDateTime;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * @author PIBANAS
 *
 */
public class SpecialSearchCriteriaTo extends SearchCriteriaTo {

  /** UID for serialization. */
  private static final long serialVersionUID = 1L;

  private Long offerNumber;

  private String offerName;

  private LocalDateTime specialDate;

  /**
   * @return offerNumber
   */
  public Long getOfferNumber() {

    return this.offerNumber;
  }

  /**
   * @param offerNumber new value of {@link #getofferNumber}.
   */
  public void setOfferNumber(Long offerNumber) {

    this.offerNumber = offerNumber;
  }

  /**
   * @return offerName
   */
  public String getOfferName() {

    return this.offerName;
  }

  /**
   * @param offerName new value of {@link #getofferName}.
   */
  public void setOfferName(String offerName) {

    this.offerName = offerName;
  }

  /**
   * @return specialDate
   */
  public LocalDateTime getSpecialDate() {

    return this.specialDate;
  }

  /**
   * @param specialDate new value of {@link #getspecialDate}.
   */
  public void setSpecialDate(LocalDateTime specialDate) {

    this.specialDate = specialDate;
  }

  /**
   * The constructor.
   */
  public SpecialSearchCriteriaTo() {

    super();
  }

}
