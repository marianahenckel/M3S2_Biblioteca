package com.Modulo3Projeto2.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Modulo3Projeto2.Service.ServiceAuthor;
import com.Modulo3Projeto2.models.Author;


@RestController
@RequestMapping(value = "/author")
public class ControllerAuthor {
    
    @Autowired 
    private ServiceAuthor serviceAuthor;

    @GetMapping
    public List<Author> getAuthors(){
        return serviceAuthor.buscarAuthors();
    }
    @PostMapping
    public Author postAuthors(@RequestBody Author Author){
        return serviceAuthor.salvar(Author);
    }
    @PutMapping
    public Author putAuthors(@RequestBody Author Author){
        return serviceAuthor.salvar(Author);
    }
    @DeleteMapping
    public boolean deleteAuthor(@RequestBody Author Author){
        serviceAuthor.deletarAuthor(Author.getId());
        return true;
    }
}
