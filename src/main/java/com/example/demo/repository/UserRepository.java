package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;


@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Integer> {

	
}
