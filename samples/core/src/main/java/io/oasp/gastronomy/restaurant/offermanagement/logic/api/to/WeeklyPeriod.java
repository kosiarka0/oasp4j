package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import java.time.DayOfWeek;

public interface WeeklyPeriod {

  public DayOfWeek getStartingDay();

  public void setStartingDay(DayOfWeek startingDay);

  public int getStartingHour();

  public void setStartingHour(int startingHour);

  public DayOfWeek getEndingDay();

  public void setEndingDay(DayOfWeek endingDay);

  public int getEndingHour();

  public void setEndingHour(int endingHour);

}
