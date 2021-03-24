package io.javabrains;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SectionService {

	@Autowired
	private SectionRepository sectionRepository;
	
	
	
	public List<Sections> getAllSections(){
		
		List<Sections> sections = new ArrayList<>();
		sectionRepository.findAll().forEach(sections::add);
		 
		return sections;
	}

	public Optional<Sections> getSection(int id) {
	
		return sectionRepository.findById(id);
		
	}

	public void addSection(Sections section) {
		// TODO Auto-generated method stub
		sectionRepository.save(section);
		}

	public void updateSection(int id, Sections section) {
		// TODO Auto-generated method stub
		sectionRepository.save(section);

	}

	public void deleteSection(int id) {
		// TODO Auto-generated method stub
		sectionRepository.deleteById(id);
	}
	
	
	
}
