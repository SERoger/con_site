package com.con_site.repository;

import com.con_site.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User,String> {
    Optional<User> findByUserName(String userName);
}
