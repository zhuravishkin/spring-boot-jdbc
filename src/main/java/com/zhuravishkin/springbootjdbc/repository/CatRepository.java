package com.zhuravishkin.springbootjdbc.repository;

import com.zhuravishkin.springbootjdbc.model.Cat;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends CrudRepository<Cat, Long> {
    @Query("select * from public.big_data")
    @Override
    Iterable<Cat> findAll();
}
