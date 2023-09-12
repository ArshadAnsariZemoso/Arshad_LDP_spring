package com.springdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdb.bean.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
