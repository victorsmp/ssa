package es.gorka.edu.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class AuthorDTO implements IEntityDTO {

	private String nameAuthor;
	private Date dateOfBirth;

	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}
}
