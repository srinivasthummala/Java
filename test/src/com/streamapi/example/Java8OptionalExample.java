package com.streamapi.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8OptionalExample {

	public static void main(String[] args) {

		System.out.println(getBook2("srinu"));

		System.out.println(getBook("srinu"));
	}

	private static List<String> listOfBooks = Arrays.asList("Effective Java", "Clean Code", "Test Driven");

	/* * Return the first book start with a letter. */
	public static String getBook(String letter) {
		String found = null;
		for (String book : listOfBooks) {
			if (book.startsWith(letter)) {
				found = book;
				break;
			}
		}
		return found != null ? found : "Book not Found";
	}

	public static String getBook1(String letter) {
		Optional<String> book = listOfBooks.stream().filter(b -> b.startsWith(letter)).findFirst();
		return book.isPresent() ? book.get() : "Book Not Found";
	}

	public static String getBook2(String letter) {
		Optional<String> book = listOfBooks.stream().filter(s -> s.startsWith(letter)).findFirst();
		return book.orElse("Book not Found");
	}

}
