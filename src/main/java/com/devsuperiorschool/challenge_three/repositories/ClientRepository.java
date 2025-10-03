package com.devsuperiorschool.challenge_three.repositories;

import com.devsuperiorschool.challenge_three.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
