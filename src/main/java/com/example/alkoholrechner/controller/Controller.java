package com.example.alkoholrechner.controller;

import com.example.alkoholrechner.appservice.AlkoholService;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@org.springframework.stereotype.Controller
public class Controller {

  @GetMapping
  public String index(Model model, @ModelAttribute Data data) {
    return "index";
  }

  @PostMapping
  public String post(AlkoholService service,
                     Model model,
                     @Valid Data data,
                     BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "index";
    }
    String alkoholWert = service.berechneAlkoholWert(data);

    model.addAttribute("result", alkoholWert);
    return "index";
  }
}
