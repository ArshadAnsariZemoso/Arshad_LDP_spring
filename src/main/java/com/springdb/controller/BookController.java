package com.springdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdb.bean.Book;
import com.springdb.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService service;
	
	@GetMapping("/getAllBooks")
	public String getAllBooks(Model model) {
        List<Book> books = service.getAllBooks();
        model.addAttribute("books", books);
        return "book-list"; // This is the name of the JSP view
    }
	
//	@GetMapping("/getBook/{bookId}")
//	public String getBookById(Model model,@PathVariable int bookId) {
//		Book book = service.getBookById(bookId);
//		model.addAttribute("bookById", book);
//		return "book";
//	}
}
