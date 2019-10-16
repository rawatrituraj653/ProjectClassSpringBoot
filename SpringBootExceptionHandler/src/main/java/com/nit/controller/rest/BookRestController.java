package com.nit.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.custom.exception.NoBookFoundException;
import com.nit.error.pojo.ApiError;
import com.nit.model.Book;
import com.nit.service.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService service;
		
	@GetMapping("/getBook")
	public ResponseEntity<Book> getbook(@RequestParam("bid") Integer bid) throws NoBookFoundException{
		Book book = service.getBookById(bid);
		return new ResponseEntity<>(book,HttpStatus.OK);
	}
	@ExceptionHandler(value = NoBookFoundException.class) 	
	public ResponseEntity<ApiError> ifException(){
			
			ApiError apiError=new ApiError();
			apiError.setErrorCode(12282);
			apiError.setErrorMsg("No Book Found in this code");
			apiError.setStatus(400);
		
		return new ResponseEntity<ApiError>(apiError,HttpStatus.BAD_REQUEST);
	}
	
}
