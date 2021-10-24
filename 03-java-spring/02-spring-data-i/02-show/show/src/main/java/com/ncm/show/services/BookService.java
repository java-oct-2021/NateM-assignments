package com.ncm.show.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ncm.show.models.Book;
import com.ncm.show.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
        }
        // assignment
    // updates a book // use the setter methods from the domain model (.models) and then call w save method
     public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    		Optional<Book> optionalBook = bookRepository.findById(id);
    		if(optionalBook.isPresent()) {
    			Book updateBook = optionalBook.get();
    			updateBook.setTitle(title);
    			updateBook.setDescription(desc);
    			updateBook.setLanguage(lang);
    			updateBook.setNumPages(numOfPages);
    			
    			return bookRepository.save(updateBook);
    		} else {
    			return null;
    		}
        }
    	// delete a book
    	public void deleteBook(Long id) {
    		bookRepository.deleteById(id);
    	}
    }