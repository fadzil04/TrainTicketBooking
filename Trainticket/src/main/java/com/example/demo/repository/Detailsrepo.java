package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Dataentity;

@Repository
public interface Detailsrepo extends JpaRepository<Dataentity,Integer>{

}
