package com.br.FuturoDEV.Modulo3Projeto2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FuturoDEV.Modulo3Projeto2.Repository.RepositoryBook;
import com.br.FuturoDEV.Modulo3Projeto2.models.Book;


@Service
public class ServiceBook {
    
    @Autowired
    private RepositoryBook repositoryBook;

    public List<Book> buscarBooks() {
        return repositoryBook.findAll();
    }

    public Book salvar(Book book) {
    return repositoryBook.save(book);   
    }

    public void deletarBook(Long ID){
        repositoryBook.delete(ID);
    }

    
}
