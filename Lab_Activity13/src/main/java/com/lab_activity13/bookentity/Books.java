package com.lab_activity13.bookentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int Book_Id;
	public String Book_Name;
	@Column(name="Author_Name",length=50)
	public String Book_Author;
	

}