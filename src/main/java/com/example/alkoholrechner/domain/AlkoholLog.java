package com.example.alkoholrechner.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

import java.time.LocalDateTime;

public class AlkoholLog {

  @Id
  private Integer id;
  private String name;
  private String alkoholImBlut;
  private LocalDateTime zeitpunkt;

  @PersistenceCreator
  public AlkoholLog(Integer id, String name, String alkoholImBlut, LocalDateTime zeitpunkt) {
    this.id = id;
    this.name = name;
    this.alkoholImBlut = alkoholImBlut;
    this.zeitpunkt = zeitpunkt;
  }

  public AlkoholLog(String name, String alkoholImBlut, LocalDateTime zeitpunkt) {
    this(null, name, alkoholImBlut, zeitpunkt);
  }
}
