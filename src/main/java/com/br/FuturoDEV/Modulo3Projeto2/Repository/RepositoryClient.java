package com.Modulo3Projeto2.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Modulo3Projeto2.models.Client;

@Repository
public class RepositoryClient {

    private static int indice = 1;
    private static List<Client> clients = new ArrayList<>();

    private int gerarID(){
        return indice++;
    }

    public Client save(Client client){
        if (client == null) {                   //Criação de client
            client.setId(gerarID());
            validaCPF(null);
        } else {                                //edição de client
            Client clientOld = findByID(client.getId());
            delete(client.getId());

        }
        clients.add(client);
        return client;
    }

    public Client findByID(Long id){
        if (id == null)
            return null;
        for (Client client : clients) {
            if (id.equals(client.getId())) {
                return client;
            }
        }
        return null;
    }

    public List<Client> findAll(){
        return clients;
    }
    public void delete(Long id){
        Client clientOld = findByID(id);
        clients.remove(clientOld);
    } 

    public Boolean validaCPF(String cpf){
        if (cpf.length()!=11)
            return false;
            for (Client client : clients) {
                if (cpf.equals(client.getCpf())) {
                    return true; 
        }
    }
    return null;
}
    }

