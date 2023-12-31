package com.sandra.web;

import com.sandra.model.Order;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

  @GetMapping("/current")
  public String showOrderForm(Model model){
    model.addAttribute("order", new Order());

    return "orderForm";
  }

  public String processOrder(@Valid Order order, Errors error, Model model) {

    if(error.hasErrors()){
      model.addAttribute("order", new Order());
      return "orderForm";
    }
    return null;
  }

}
