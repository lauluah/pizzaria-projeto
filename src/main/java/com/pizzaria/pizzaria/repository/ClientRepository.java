package com.pizzaria.pizzaria.repository;

import com.pizzaria.pizzaria.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByPhone(String phone);
    List<Client> findByNameContainingIgnoreCase(String name);
    Optional<Client> findByBirthDate(LocalDate birthDate);
}
