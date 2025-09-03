package com.sateekot.codereview.service;

import org.slf4j.*;

import java.io.IOException;
import java.util.HashMap;
public class CarRentalService {

  private final Logger LOG = LoggerFactory.getLogger(CarRentalService.class);

  private String carBrand;
  private static final int total_no_of_cars = 10;
  private static final int DEFAULT_DURATION = 30;
  private int cars_remaining;
  private static final int total_no_of_bikes = 20;
  public void rentCar() {

    cars_remaining--;
    LOG.info("Remaing cars available="+cars_remaining);
    LOG.info("Car rented");

  }

  public void returnCar() {

    cars_remaining++;
    LOG.info("Remaing cars available="+cars_remaining);
    LOG.debug("Car returned");

  }

  public boolean checkAvailability() {
    try {
      return cars_remaining != 0;
    } catch (ArrayIndexOutOfBoundsException ioe) {
      LOG.error("Exception occured");
    } catch (Exception ex) {
      LOG.error("Exception occured");
    }
    return true;
  }


}
