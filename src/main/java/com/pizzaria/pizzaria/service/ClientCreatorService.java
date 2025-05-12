package com.pizzaria.pizzaria.service;

import com.pizzaria.pizzaria.dto.mapper.ClientDTOmapper;
import com.pizzaria.pizzaria.dto.request.ClientDTOrequest;
import com.pizzaria.pizzaria.dto.response.ClientDTOResponse;
import com.pizzaria.pizzaria.model.Client;
import com.pizzaria.pizzaria.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientCreatorService {
    ClientRepository clientRepository;

    public ClientCreatorService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientDTOResponse createClientService(ClientDTOrequest clientDTO) {
        Client clientEntity = ClientDTOmapper.toEntity(clientDTO);
        Client createdClient = clientRepository.save(clientEntity);
        return ClientDTOmapper.toResponse(createdClient);
    }
}