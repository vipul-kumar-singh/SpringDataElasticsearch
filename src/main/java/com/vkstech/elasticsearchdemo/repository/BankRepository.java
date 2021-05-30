package com.vkstech.elasticsearchdemo.repository;

import com.vkstech.elasticsearchdemo.model.Bank;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BankRepository extends ElasticsearchRepository<Bank, Long> {
    List<Bank> findByName(String name);
}
