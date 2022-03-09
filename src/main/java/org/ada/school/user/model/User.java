package org.ada.school.user.model;


import org.ada.school.user.controller.dto.UserDto;

import java.util.Date;
import java.util.UUID;

public class User

{

    String id;

    String name;

    String email;

    String lastName;

    Date createdAt;


    public User( UserDto userDto )
    {
        id = UUID.randomUUID().toString();
        name = userDto.getName();
        lastName = userDto.getLastName();
        email = userDto.getEmail();
        createdAt = new Date();
    }

    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public String getLastName() { return lastName; }

    public String getEmail() {return  email;}

    public Date getCreatedAt() { return createdAt;}

    public void update( UserDto userDto )
    {
        name = userDto.getName();
        lastName = userDto.getLastName();
        email = userDto.getEmail();
    }
}
