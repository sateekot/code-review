package com.sateekot.codereview.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BikeRentalService {

  private final Logger log = LoggerFactory.getLogger(BikeRentalService.class);

  private String bikeBrand;
  private int bikesRemaining;
  private static final int DEFAULT_DURATION_MINUTES = 30;
  private static final int TOTAL_NO_OF_BIKES = 20;


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
    bikesRemaining++;
    log.debug("Remaining bikes available=" + bikesRemaining);
    log.info("Bike returned");
  }

  public boolean checkAvailability() {
    return bikesRemaining != 0;
  }

}