package com.br.FuturoDEV.Modulo3Projeto2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FuturoDEV.Modulo3Projeto2.Repository.RepositoryClient;
import com.br.FuturoDEV.Modulo3Projeto2.models.Client;


@Service
public class ServiceClient {

    @Autowired
    private RepositoryClient repositoryClient;

    public Client salvar(Client client) {
        //create / update
       return repositoryClient.save(client);
    }
    public List<Client> buscarClients(){
        //read
        return repositoryClient.findAll();
    }
    public void excluir(Long id){
        //delete
        repositoryClient.delete(id);
    }

}
