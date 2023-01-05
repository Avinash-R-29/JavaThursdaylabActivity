package com.lab_activity13.bookDaoImp;

import com.lab_activity13.bookDao.BooksDao;
import com.lab_activity13.bookentity.Books;

public class BooksDaoImp<HibernateTemplete> implements BooksDao {
	private HibernateTemplete ht;

	public HibernateTemplete getHt() {
		return ht;
	}

	public void setHt(HibernateTemplete ht) {
		this.ht = ht;
	}

	@Override
	public Books getBooksByID(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
