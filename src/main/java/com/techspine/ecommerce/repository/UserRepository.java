package com.techspine.ecommerce.repository;

import com.techspine.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User,Long > {

    public User findByEmail(String email);
}
