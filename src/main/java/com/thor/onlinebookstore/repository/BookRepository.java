package com.thor.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thor.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
