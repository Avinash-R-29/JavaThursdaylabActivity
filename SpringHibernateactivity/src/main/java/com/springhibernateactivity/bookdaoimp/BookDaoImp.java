package com.springhibernateactivity.bookdaoimp;


import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springhibernateactivity.bookdao.BookDao;
import com.springhibernateactivity.bookentity.Book;

public class BookDaoImp implements BookDao
{
	private HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Transactional
	public int insertBook(Book b) {
		ht.save(b);
		return 1;
	}

	@Transactional
	public int updateBook(Book upbook) {
		ht.update(upbook);
		return 1;
	}

}

