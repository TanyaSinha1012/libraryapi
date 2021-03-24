package io.javabrains;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	
	public List<Books> getAllBooks(int sectionId){
		
		List<Books> books = new ArrayList<>();
		bookRepository.findBySectionId(sectionId).forEach(books::add);
		 
		return books;
	}

	public Optional<Books> getBook(int id) {
	
		return bookRepository.findById(id);
		
	}

	public void addBook(Books book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
		}

	public void updateBook(int id, Books book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);

	}

	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);;
	}
	
	
	
}
