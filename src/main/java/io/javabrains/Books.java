package io.javabrains;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Books {

	
	@Id
	private int id;
	private String name;
	private String author;
	
	@ManyToOne
	private Sections section;
	
	
	
	
	
	public Sections getSection() {
		return section;
	}
	public void setSection(Sections section) {
		this.section = section;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Books(int id, String name, String author, int sectionId) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.section=new Sections(sectionId,", ");
		
	}
	
	
	public Books() {
		
	}
	
	
	
}
