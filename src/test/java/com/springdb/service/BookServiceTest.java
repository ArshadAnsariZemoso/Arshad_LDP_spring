package com.springdb.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.springdb.bean.Book;
import com.springdb.repository.BookRepository;
import com.springdb.serviceimpl.BookServiceImpl;

@SpringBootTest
public class BookServiceTest {

    @InjectMocks
    private BookServiceImpl bookService;

    @Mock
    private BookRepository bookRepository;

    @BeforeEach
    public void setUp() {
        // Initialize Mockito annotations
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllBooks() {
        // Mock the behavior of the bookRepository
        List<Book> mockBooks = new ArrayList<>();
        mockBooks.add(new Book(001, "Book 1", "Author 1"));
        mockBooks.add(new Book(002, "Book 2", "Author 2"));

        when(bookRepository.findAll()).thenReturn(mockBooks);

        // Call the service method
        List<Book> books = bookService.getAllBooks();

        // Verify the result
        assertEquals(2, books.size());
    }

    @Test
    public void testAddBook() {
        // Create a new book
        Book newBook = new Book(001, "New Book", "New Author");

        // Call the service method to add the book
        bookService.addBook(newBook);

        // Verify that the book was added to the repository
        verify(bookRepository).save(newBook);
    }
}
