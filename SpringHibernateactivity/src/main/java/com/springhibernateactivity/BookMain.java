package com.springhibernateactivity;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springhibernateactivity.bookdao.BookDao;
import com.springhibernateactivity.bookdao.LibraryDao;
import com.springhibernateactivity.bookentity.Book;
import com.springhibernateactivity.bookentity.Library;

public class BookMain {


		public static void main(String[] args) {
			
			ApplicationContext app =new ClassPathXmlApplicationContext("Beanactivity.xml");
			BookDao bdao=(BookDao) app.getBean("BookDao");
	
			
			Book b1=new Book(1, "Java-Book", "James-gosling");
			Book b2=new Book(2,"Java-Script","Brendan-Eich");
			Book b3=new Book(3,"Advance-java","James");
			
			bdao.insertBook(b1);
			bdao.insertBook(b2);
			bdao.insertBook(b3);
			
			LibraryDao ldao=(LibraryDao) app.getBean("LibraryDao");
			
			Library l1=new Library(1,"Public-Library", b2);
			Library l2=new Library(2,"College-Library",b2);	
			
			ldao.insertLibrary(l1);
			ldao.insertLibrary(l2);
			
			
			
			
			
		}
}
	