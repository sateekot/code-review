package com.sateekot.codereview.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BikeRentalService {

  private static final int DEFAULT_DURATION = 30;
  private static final int TOTAL_NO_OF_BIKES = 20;

  private final Logger log = LoggerFactory.getLogger(getClass());

  private String bikeBrand;
  private int bikesRemaining;

  public void rentBike() {
    if (bikesRemaining > 0) {
      bikesRemaining--;
      log.info("Remaining bikes available=" + bikesRemaining);
      log.info("Bike rented");
    } else {
      log.warn("No bikes available to rent");
    }
  }

  public void returnBike() {
    if (bikesRemaining < TOTAL_NO_OF_BIKES) {
      bikesRemaining++;
      log.debug("Remaining bikes available=" + bikesRemaining);
      log.info("Bike returned");
    } else {
      log.warn("All bikes are already returned");
    }
  }

  public boolean checkAvailability() {
    return bikesRemaining != 0;
  }

}