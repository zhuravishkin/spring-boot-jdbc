package com.zhuravishkin.springbootjdbc.service;

import com.zhuravishkin.springbootjdbc.model.Cat;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
class CatServiceTest {
    @SpyBean
    CatService catService;

    @Test
    void findAllOk() {
        List<Cat> cats = catService.findAll();
        cats.forEach(cat -> log.info(cat.toString()));
        assertNotNull(cats);
    }
}