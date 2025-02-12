package library.service;

import library.aggregate.Book;
import section02.library.repository.BookRepository;

import java.util.ArrayList;

public class BookService {

    private BookRepository bs = new BookRepository();

    public BookService() {
    }

    public void findAllBooks() {
        ArrayList<Book> findBooks = bs.selectAllBooks();

        System.out.println("Service에서 조회 확인: ");
        for (Book book : findBooks) {
            System.out.println(book);
        }
    }

}
