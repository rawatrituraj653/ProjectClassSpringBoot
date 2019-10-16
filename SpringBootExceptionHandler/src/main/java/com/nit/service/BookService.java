package com.nit.service;

import com.nit.custom.exception.NoBookFoundException;
import com.nit.model.Book;

public interface BookService {

	public Book getBookById(Integer id) throws NoBookFoundException;
}
