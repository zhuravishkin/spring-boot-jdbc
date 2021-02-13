package com.zhuravishkin.springbootjdbc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cat {
    @Column("name")
    @JsonProperty("name")
    private String name;

    @Id
    @Column("age")
    @JsonProperty("age")
    private Long age;

    @Column("uri")
    @JsonProperty("uri")
    private String uri;

    @Column("date_time")
    @JsonProperty("date_time")
    private LocalDateTime dateTime;
}
