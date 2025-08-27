package com.sateekot.codereview.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodeReviewService {
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private static final String REPOSITORY = "code-review";
  private String template = "Please fix all the review comments";

  public String review() {
    logger.info("Reviewing code");
    return "Reviewing code";
  }
}
