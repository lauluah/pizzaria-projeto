package com.pizzaria.pizzaria.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class ClientDTOResponse {
    private String name;
    private LocalDate birthDate;
    private String phone;

    public ClientDTOResponse(String name, LocalDate birthDate, String phone) {
        this.name = name;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public ClientDTOResponse() {
    }

}
