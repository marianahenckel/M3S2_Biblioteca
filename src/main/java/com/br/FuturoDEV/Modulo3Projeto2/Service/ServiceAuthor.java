package com.br.FuturoDEV.Modulo3Projeto2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FuturoDEV.Modulo3Projeto2.Repository.RepositoryAuthor;
import com.br.FuturoDEV.Modulo3Projeto2.models.Author;

import java.util.List;

@Service
public class ServiceAuthor {

    @Autowired
    private RepositoryAuthor repositoryAuthor;

    public List<Author> buscarAuthors() {
        return repositoryAuthor.findAll();
    }

    public Author salvar(Author author) {
    return repositoryAuthor.save(author);   
    }

    public void deletarAuthor(Long ID){
        repositoryAuthor.delete(ID);
    }
}
