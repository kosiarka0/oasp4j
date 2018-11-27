package io.oasp.gastronomy.restaurant.offermanagement.common.api;

import java.time.DayOfWeek;

/**
 * @author PIBANAS
 *
 */
public interface WeeklyPeriod {

  /**
   * @return
   */
  int getStartingHour();

  /**
   * @param startingHour
   */
  void setStartingHour(int startingHour);

  /**
   * @return
   */
  int getEndingHour();

  /**
   * @param endingHour
   */
  void setEndingHour(int endingHour);

  /**
   * @return
   */
  DayOfWeek getStartingDay();

  /**
   * @param startingDay
   */
  public void setStartingDay(DayOfWeek startingDay);

  /**
   * @return
   */
  DayOfWeek getEndingDay();

  /**
   * @param endingDay
   */
  void setEndingDay(DayOfWeek endingDay);
}
