package com.springdb.service;

import java.util.List;

import com.springdb.bean.Book;

public interface BookService {

	public Book addBook(Book book);
	
	public Book getBookById(int bookId);
	
	public List<Book> getAllBooks();
	
	public void deleteBookById(int bookId);
}
