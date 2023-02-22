package com.example.alkoholrechner.appservice;

import com.example.alkoholrechner.controller.Data;
import com.example.alkoholrechner.controller.Gender;
import com.example.alkoholrechner.domain.AlkoholLog;
import com.example.alkoholrechner.persistence.AlkoholRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AlkoholService {

  private final AlkoholRepository alkoholRepository;

  public AlkoholService(AlkoholRepository alkoholRepository) {
    this.alkoholRepository = alkoholRepository;
  }

  public String berechneAlkoholWert(Data data) {
    double gesamt;
    double r;
    gesamt = data.beer() * 0.05 +
            data.wine() * 0.12 +
            data.corn() * 0.32 +
            data.vodka() * 0.4 +
            data.whiskey() * 0.43;
    if (data.gender() == Gender.MALE) {
      r = 0.7;
    } else {
      r = 0.6;
    }
    String result = String.format("%.2f", gesamt / (data.weight() * r));

    AlkoholLog log = new AlkoholLog(data.name(), result, LocalDateTime.now());

    alkoholRepository.save(log);

    return result;

  }
}
