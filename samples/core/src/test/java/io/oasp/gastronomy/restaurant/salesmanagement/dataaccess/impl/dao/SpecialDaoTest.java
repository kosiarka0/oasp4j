package io.oasp.gastronomy.restaurant.salesmanagement.dataaccess.impl.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Collection;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import io.oasp.gastronomy.restaurant.SpringBootApp;
import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.WeeklyPeriodEmbeddable;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.OfferDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.SpecialDao;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialSearchCriteriaTo;
import io.oasp.module.test.common.base.ComponentTest;

/**
 * @author PIBANAS
 *
 */
@Transactional
@SpringBootTest(classes = { SpringBootApp.class }, webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpecialDaoTest extends ComponentTest {

  @Inject
  private SpecialDao mSUT;

  @Inject
  private OfferDao offerDao;

  @Test
  public void checkCreate() {

    // given
    SpecialEntity entity = new SpecialEntity();
    WeeklyPeriod weeklyPeriod = new WeeklyPeriodEmbeddable();
    weeklyPeriod.setStartingDay(DayOfWeek.MONDAY);
    weeklyPeriod.setEndingDay(DayOfWeek.FRIDAY);
    weeklyPeriod.setStartingHour(0);
    weeklyPeriod.setEndingHour(24);
    entity.setActivePeriod(weeklyPeriod);
    entity.setName("Pizza & More Pizza");
    entity.setSpecialPrice(Money.ZERO);
    entity.setOffer(this.offerDao.find(1L));
    // when
    this.mSUT.save(entity);
    // then
    assertNotNull(entity.getId());
  }

  @Test
  public void canFindSpecialByTime() {

    // Given
    SpecialSearchCriteriaTo criteria = new SpecialSearchCriteriaTo();
    criteria.setSpecialDate(LocalDateTime.of(2018, 11, 26, 15, 00, 00));
    // When
    Collection<SpecialEntity> results = this.mSUT.findBySearchCriteria(criteria);
    // Then
    assertEquals(1, results.size());
    assertTrue(1L == results.stream().findFirst().get().getId());
  }

}
