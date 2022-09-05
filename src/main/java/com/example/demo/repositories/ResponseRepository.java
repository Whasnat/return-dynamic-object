package com.example.demo.repositories;

import com.example.demo.service.ResponseObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<ResponseObject, Object> {
}
