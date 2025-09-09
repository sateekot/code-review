package com.sateekot.codereview.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BikeRentalService {

  private static final int DEFAULT_DURATION_MINUTES = 30;
  private static final int TOTAL_NUMBER_OF_BIKES = 20;

  private final Logger log = LoggerFactory.getLogger(getClass());

  private String bikeBrand;
  private int bikes_remaining;

  public void rentBike() {
    if (bikes_remaining > 0) {
      bikes_remaining--;
      log.info("Remaining bikes available=" + bikes_remaining);
      log.info("Bike rented");
    } else {
      log.warn("No bikes available to rent");
    }
  }

  public void returnBike() {
    if (bikes_remaining < TOTAL_NUMBER_OF_BIKES) {
      bikes_remaining++;
      log.debug("Remaining bikes available=" + bikes_remaining);
      log.info("Bike returned");
    } else {
      log.warn("All bikes are already returned; cannot exceed total number of bikes");
    }
  }

  public boolean checkAvailability() {
    return bikes_remaining > 0;
  }

}