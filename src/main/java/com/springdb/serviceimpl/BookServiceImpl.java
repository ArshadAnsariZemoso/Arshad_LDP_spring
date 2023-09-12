package com.springdb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdb.bean.Book;
import com.springdb.repository.BookRepository;
import com.springdb.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository repository;

	@Override
	public Book addBook(Book book) {
		return repository.save(book);
	}

	@Override
	public Book getBookById(int bookId) {
		Book book = repository.findById(bookId).get();
		return book;
	}

	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	@Override
	public void deleteBookById(int bookId) {
		repository.deleteById(bookId);
	}

}
