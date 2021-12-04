package com.unique.events.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import antlr.Version;

@Repository
public interface DAOVersion extends JpaRepository<Version, Integer> {

}
