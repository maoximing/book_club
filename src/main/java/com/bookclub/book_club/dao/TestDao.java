package com.bookclub.book_club.dao;

import com.bookclub.book_club.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
    TestEntity getById(Integer id);
}
