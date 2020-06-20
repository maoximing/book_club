package com.bookclub.book_club.service;

import com.bookclub.book_club.dao.TestDao;
import com.bookclub.book_club.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}
