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

import com.br.FuturoDEV.Modulo3Projeto2.Service.ServiceClient;
import com.br.FuturoDEV.Modulo3Projeto2.models.Client;


@RestController
@RequestMapping(value = "/client")
public class ClientController {
    
    @Autowired
    private ServiceClient serviceClient;

    @GetMapping
    public List<Client> getClients(){
        return serviceClient.buscarClients();
    }
    
    @PostMapping
    public Client postClient(@RequestBody Client client){
        return serviceClient.salvar(client);
    }
    
    @PutMapping
    public Client putClient(@RequestBody Client client){
        return serviceClient.salvar(client);
    }
    @DeleteMapping
    public boolean deleteClient(@RequestBody Long id){
        serviceClient.excluir(id);
        return true;
    }
    @GetMapping
    public String getCPF(@RequestBody String cpf){
        return cpf;
    }
}
