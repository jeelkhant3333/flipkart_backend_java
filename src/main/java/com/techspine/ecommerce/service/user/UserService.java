package com.techspine.ecommerce.service.user;

import com.techspine.ecommerce.entity.User;
import com.techspine.ecommerce.exception.UserException;
import jdk.jshell.spi.ExecutionControl;

public interface UserService {

    public User findUserById(long userId) throws UserException;
    public User findUserProfileById(String jwt) throws UserException;
}
