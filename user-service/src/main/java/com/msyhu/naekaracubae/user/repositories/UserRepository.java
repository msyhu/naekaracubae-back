package com.msyhu.naekaracubae.user.repositories;

import com.msyhu.naekaracubae.user.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}