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

    @NotBlank(message = "The name is required and cannot be blank.")
    @Size(min = 3, max = 50, message = "The name must be between 3 and 50 characters.")
    private String name;

    @Past(message = "The birth date must be in the past.")
    private LocalDate birthDate;

    @NotBlank(message = "The phone number is required and cannot be blank.")
    private String phone;

    @NotBlank(message = "The address is required and cannot be blank.")
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
