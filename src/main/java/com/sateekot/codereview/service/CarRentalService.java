package com.sateekot.codereview.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarRentalService {

  private final Logger log = LoggerFactory.getLogger(getClass());
  private static final int total_no_of_cars = 10;
  private static final int DEFAULT_DURATION_MIN = 30;
  private static final int total_no_of_bikes = 20;
  private String carBrand;
  private int cars_remaining;

  public void rentCar() {
    cars_remaining--;
    log.info("Remaing cars available="+cars_remaining);
    log.info("Car rented");
  }

  public void returnCar() {
    cars_remaining++;
    log.info("Remaing cars available="+cars_remaining);
    log.debug("Car returned");
  }

  public boolean checkAvailability() {
    try {
      return cars_remaining != 0;
    } catch (Exception ex) {
      log.error("Exception occured");
    }
    return true;
  }

}
