package com.sateekot.codereview.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.*;
public class CodeReviewService {
  private static final Logger LOG = LoggerFactory.getLogger(CodeReviewService.class);

  private String template = "Please fix all the review comments";
  private static final String REPOSITORY = "code-review";

  public String review() {

    LOG.info("Reviewing code");
    return "Reviewing code";

  }
}
