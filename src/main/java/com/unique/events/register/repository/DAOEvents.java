package com.unique.events.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unique.events.register.domain.Events;

@Repository
public interface DAOEvents extends JpaRepository<Events, Integer> {
   
}
