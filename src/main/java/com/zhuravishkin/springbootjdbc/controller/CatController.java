package com.zhuravishkin.springbootjdbc.controller;

import com.zhuravishkin.springbootjdbc.model.Cat;
import com.zhuravishkin.springbootjdbc.service.CatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "message")
public class CatController {
    private final CatService service;

    public CatController(CatService service) {
        this.service = service;
    }

    @GetMapping(value = "/get")
    public ResponseEntity<List<Cat>> getCats() {
        log.info("Get method start...");
        List<Cat> cats = service.findAll();
        return new ResponseEntity<>(cats, HttpStatus.OK);
    }
}
