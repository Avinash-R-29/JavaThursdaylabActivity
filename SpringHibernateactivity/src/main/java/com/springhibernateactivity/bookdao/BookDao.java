package com.springhibernateactivity.bookdao;

import com.springhibernateactivity.bookentity.Book;

public interface BookDao {
	
	int insertBook(Book b);
	int updateBook(Book upbook);

}