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
public class SectionController {
	
	
	@Autowired
	private SectionService sectionService;
	
	
	//GET books info
	@RequestMapping("/section")
	public List<Sections> getAllSections()
	{
	return sectionService.getAllSections();
	}
	
	//GET a particular book info
	@RequestMapping("/section/{id}")
	public Optional<Sections> getSection(@PathVariable int id)
	{
		return sectionService.getSection(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/section")
	public void addSection(@RequestBody Sections section)
	{
		sectionService.addSection(section);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/section/{id}")
	public void updateSection(@RequestBody Sections section, @PathVariable int id)
	{
		sectionService.updateSection(id,section);
		
	}	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/section/{id}")
	public void deleteSection(@PathVariable int id)
	{
		sectionService.deleteSection(id);
		
	}	
	
	
	
	
	

}
