package com.example.alkoholrechner.persistence;

import com.example.alkoholrechner.domain.AlkoholLog;
import org.springframework.stereotype.Repository;


@Repository
public class AlkoholRepository {

  SpringDataAlkoholRepository springDataAlkoholRepository;

  public AlkoholRepository(SpringDataAlkoholRepository springDataAlkoholRepository) {
    this.springDataAlkoholRepository = springDataAlkoholRepository;
  }

  public void save(AlkoholLog alkoholLog) {
    springDataAlkoholRepository.save(alkoholLog);
  }
}
