package org.ada.school.user.service;

import org.ada.school.user.controller.dto.UserDto;
import org.ada.school.user.model.User;

import java.util.List;


public interface UserService
{
    User create( User user );

    User findById( String id );

    List<User> all();

    boolean deleteById( String id );

    User update( UserDto userDto, String id );
}
