package org.ada.school.user.repository;


import org.ada.school.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>
{
  User save (User user);

}