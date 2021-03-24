package io.javabrains;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	
	@Autowired
	private BookService bookService;
	
	
	//GET books info
	@RequestMapping("/section/{id}/book")
	public List<Books> getAllBooks(@PathVariable int id)
	{
	return bookService.getAllBooks(id);
	}
	
	//GET a particular book info
	@RequestMapping("/section/{sectionid}/book/{id}")
	public Optional<Books> getBook(@PathVariable int id)
	{
		return bookService.getBook(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/section/{id}/book")
	public void addBook(@RequestBody Books book,@PathVariable int sectionId)
	{
		book.setSection(new Sections(sectionId,", "));
		bookService.addBook(book);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/section/{id}/book/{id}")
	public void updateBook(@RequestBody Books book, @PathVariable int id)
	{
		bookService.updateBook(id,book);
		
	}	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/section/{id}/book/{id}")
	public void deleteBook(@PathVariable int id)
	{
		bookService.deleteBook(id);
		
	}	
	
	
	
	
	

}
