package com.zhuravishkin.springbootjdbc.service;

import com.zhuravishkin.springbootjdbc.model.Cat;
import com.zhuravishkin.springbootjdbc.repository.CatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {
    private final CatRepository repository;

    public CatService(CatRepository repository) {
        this.repository = repository;
    }

    public List<Cat> findAll() {
        return (List<Cat>) repository.findAll();
    }
}
