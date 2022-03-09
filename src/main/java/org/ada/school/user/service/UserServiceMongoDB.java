package org.ada.school.user.service;
import org.ada.school.user.controller.dto.UserDto;
import org.ada.school.user.model.User;
import org.ada.school.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceMongoDB
        implements UserService
{

    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user )
    {
        return userRepository.save(user);
    }

    @Override
    public User findById( String id )
    {
        return null;
    }

    @Override
    public List<User> all()
    {
        return null;
    }

    @Override
    public boolean deleteById( String id )
    {
        return false;
    }

    @Override
    public User update(UserDto userDto, String id )
    {
        return null;
    }
}