package springboot.service;


import springboot.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> findAll();

    public Book findById(int theId);

    public void save(Book theBook);

    public void deleteById(int theId);

    List<Book> findAllByCategory(String category);
}
