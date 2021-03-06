package com.lxmajs.library.service;

import com.lxmajs.library.entity.Book;

import java.util.List;

public interface BookService {

    /**
     *
     * @return
     */
    List<Book> getBookList();

    /**
     *
     * @param bookId
     * @return
     */
    Book getBookById(int bookId);

    /**
     *
     * @param authorId
     * @return
     */
    Book queryBookByAuthorId(int authorId);

    /**
     *
     * @param book
     * @return
     */
    boolean addBook(Book book);

    /**
     *
     * @param book
     * @return
     */
    boolean modifyBook(Book book);

    /**
     *
     * @param bookId
     * @return
     */
    boolean deleteBook(int bookId);
}
