package com.example.alkoholrechner.persistence;

import com.example.alkoholrechner.domain.AlkoholLog;
import org.springframework.data.repository.CrudRepository;


public interface SpringDataAlkoholRepository extends CrudRepository<AlkoholLog, Integer> {
}
