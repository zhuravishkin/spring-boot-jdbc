package com.zhuravishkin.springbootjdbc.controller;

import com.zhuravishkin.springbootjdbc.service.CatService;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CatController.class)
class CatControllerTest {
    @Autowired
    MockMvc mockMvc;

    @SpyBean
    CatController controller;

    @MockBean
    CatService catService;

    @SneakyThrows
    @Test
    void getCatsOk() {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .pathSegment("message/get")
                .build()
                .encode();
        mockMvc.perform(get(uriComponents.toUri()))
                .andExpect(status().isOk())
                .andExpect(content().string("[]"))
                .andReturn();
    }
}