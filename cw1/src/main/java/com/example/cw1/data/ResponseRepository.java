package com.example.cw1.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository
        extends JpaRepository<Response, Integer> {
}
