package com.pet.registry.exception;

import lombok.Data;

@Data
public class ErrorMessage {
  private int statusCode;
  private String message;
  private String description;

  public ErrorMessage(int statusCode, String message, String description) {
    this.statusCode = statusCode;
    this.message = message;
    this.description = description;
  }

}
