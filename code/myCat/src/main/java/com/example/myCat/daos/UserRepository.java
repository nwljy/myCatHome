package com.example.myCat.daos;

import com.example.myCat.entities.EUser;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract interface UserRepository
  extends JpaRepository<EUser, Integer>
{}
