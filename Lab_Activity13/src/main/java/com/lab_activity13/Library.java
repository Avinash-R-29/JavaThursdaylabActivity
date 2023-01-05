package com.lab_activity13;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int Lib_Id;
	@Column(name="Library_Name", length=30)
	public String Lib_Name;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Library_Id")
	List<Books> list;
}
