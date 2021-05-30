package com.vkstech.elasticsearchdemo.repository;

import com.vkstech.elasticsearchdemo.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CustomerRepository extends ElasticsearchRepository<Customer, Long> {
    List<Customer> findByFirstName(String firstName);
}
