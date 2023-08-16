package com.arieljtyson.rest.Repo;

import com.arieljtyson.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
