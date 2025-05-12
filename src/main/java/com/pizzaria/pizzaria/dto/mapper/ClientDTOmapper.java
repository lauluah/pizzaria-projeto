package com.pizzaria.pizzaria.dto.mapper;

import com.pizzaria.pizzaria.dto.request.ClientDTOrequest;
import com.pizzaria.pizzaria.dto.response.ClientDTOResponse;
import com.pizzaria.pizzaria.model.Client;

public class ClientDTOmapper {

    public static Client toEntity(ClientDTOrequest clientDTOrequest) {
        Client client = new Client();
        client.setName(clientDTOrequest.getName());
        client.setBirthDate(clientDTOrequest.getBirthDate());
        client.setPhone(clientDTOrequest.getPhone());
        client.setAddress(clientDTOrequest.getAddress());
        return client;
    }

    public static ClientDTOResponse toResponse(Client client) {
        ClientDTOResponse clientResponse = new ClientDTOResponse();
        clientResponse.setPhone(client.getPhone());
        clientResponse.setName(client.getName());
        clientResponse.setBirthDate(client.getBirthDate());
        return clientResponse;
    }
}
