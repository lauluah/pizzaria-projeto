package com.pizzaria.pizzaria.service;

import com.pizzaria.pizzaria.exception.ClientNotFoundException;
import com.pizzaria.pizzaria.model.Client;
import com.pizzaria.pizzaria.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientFilterService {
    ClientRepository clientRepository;

    public ClientFilterService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getClientByName(String clientName) {
        List<Client> clients = clientRepository.findByNameContainingIgnoreCase (clientName);
        if (clients.isEmpty()) {
            throw new ClientNotFoundException(String.format("Não foi possível encontrar clientes com o nome: %s", clientName));
        }
        return clients;
    }
}
