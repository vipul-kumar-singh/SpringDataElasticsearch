package com.vkstech.elasticsearchdemo.controller;

import com.vkstech.elasticsearchdemo.model.Bank;
import com.vkstech.elasticsearchdemo.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bank")
public class BankController {

    @Autowired
    private BankRepository bankRepository;

    @PostMapping("save")
    public Bank saveBank(@RequestBody Bank bank){
        return bankRepository.save(bank);
    }

    @GetMapping("findAll")
    public Iterable<Bank> findAllBanks(){
        return bankRepository.findAll();
    }

    @GetMapping("findByName/{name}")
    public List<Bank> findByName(@PathVariable String name){
        return bankRepository.findByName(name);
    }

}
