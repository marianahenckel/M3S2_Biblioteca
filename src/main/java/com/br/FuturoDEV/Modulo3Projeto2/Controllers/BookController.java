package com.br.FuturoDEV.Modulo3Projeto2.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.FuturoDEV.Modulo3Projeto2.Service.ServiceBook;
import com.br.FuturoDEV.Modulo3Projeto2.models.Book;

@RestController
@RequestMapping(value = "/book")
public class BookController {
  
    @Autowired 
    private ServiceBook serviceBook;

    @GetMapping
    public List<Book> getAuthors(){
        return serviceBook.buscarBooks();
    }
    @PostMapping
    public Book postBook(@RequestBody Book book){
        return serviceBook.salvar(book);
    }
    @PutMapping
    public Book putBook(@RequestBody Book book){
        return serviceBook.salvar(book);
    }
    @DeleteMapping
    public boolean deleteBook(@RequestBody Book book){
        serviceBook.deletarBook(book.getId());
        return true;
    }
}
