package io.javabrains;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books,Integer> {

	public List<Books> findBySectionId(int sectionId);
	
	
	
}
