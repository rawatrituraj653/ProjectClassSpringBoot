package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

	private Integer bookId;
	private String bookName;
	private String author;
	private Double bookPrice; 
}
