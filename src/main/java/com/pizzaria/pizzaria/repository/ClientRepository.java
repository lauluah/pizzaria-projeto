package com.pizzaria.pizzaria.repository;

import com.pizzaria.pizzaria.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByNameContainingIgnoreCase(String name);
}
