package com.sateekot.codereview.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;

public class BikeRentalService {

  private static final Logger LOG = LoggerFactory.getLogger(BikeRentalService.class);

  private String bikeBrand;
  private int bikes_remaining;
  private static final int DEFAULT_DURATION = 30;
  private static final int total_no_of_bikes = 20;


  public void rentBike() {
    bikes_remaining--;
    LOG.info("Remaing bikes available="+bikes_remaining);
    LOG.info("Bike rented");
  }

  public void returnBike() {
    bikes_remaining++;
    LOG.debug("Remaing bikes available="+bikes_remaining);
    LOG.info("Bike returned");
  }

  public boolean checkAvailability() {

    try {
      return bikes_remaining != 0;
    } catch (Exception ex) {
      LOG.error("Exception occured");
    }
    return true;
  }

}
