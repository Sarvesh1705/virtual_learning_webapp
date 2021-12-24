package com.virtuallearning.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.virtuallearning.backend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findByNameContaining(String name);
	@Query("FROM User u WHERE u.email = :email")
	User findByEmail(String email);}