package com.pizzaria.pizzaria.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class ClientDTOrequest {

    @NotBlank(message = "O nome é obrigatório.")
    private String name;

    @Past(message = "A data de nascimento deve estar no passado.")
    private LocalDate birthDate;

    @NotBlank(message = "O telefone é obrigatório.")
    private String phone;

    @NotBlank(message = "O endereço é obrigatório.")
    private String address;

    public ClientDTOrequest(String name, LocalDate birthDate, String phone, String address) {
        this.name = name;
        this.birthDate = birthDate;
        this.phone = phone;
        this.address = address;
    }

    public ClientDTOrequest() {
    }
}
