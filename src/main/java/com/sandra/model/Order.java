package com.sandra.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.CreditCardNumber;

public class Order {

  @NotBlank(message = "el nombre es obligatorio")
  private String name;

  @CreditCardNumber(message = "obligatoriooo")
  private String ccNumber;

  @Pattern(regexp = "expresión regular aquí", message = "debe ser dd/mm/aaaa")
  private String ccExpiration;

  @Digits(integer = 3, message = "CVV inválido", fraction = 0)
  private String ccCVV;
}
