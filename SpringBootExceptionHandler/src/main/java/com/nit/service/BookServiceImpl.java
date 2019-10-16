package com.nit.service;

import org.springframework.stereotype.Service;

import com.nit.custom.exception.NoBookFoundException;
import com.nit.model.Book;
@Service
public class BookServiceImpl implements BookService{

	@Override
	public Book getBookById(Integer id) throws NoBookFoundException {
		if(id==123) {
			
			return new Book(123, "Spring", "Ashok", 890.00);
		}
		else {
			throw new NoBookFoundException("No Book Found");
		}
		
	}

}

