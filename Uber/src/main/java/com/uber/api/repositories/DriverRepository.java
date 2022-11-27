package com.uber.api.repositories;

import com.uber.api.models.Driver;
import com.uber.api.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findFirstByAccount_PhoneNumber(String phoneNumber);
    // I want a function that gets me the account
    // that account should have a password of xyz

    // CRUD, find-by-attribute, find-by-attribute-of-attribute

}

// DAO - about a single object
// Repo - DAL for a collection of similar objects