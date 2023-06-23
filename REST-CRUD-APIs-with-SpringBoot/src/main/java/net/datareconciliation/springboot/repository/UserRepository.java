package net.datareconciliation.springboot.repository;


import java.util.List;
import java.util.Optional;

import net.datareconciliation.springboot.model.User;

public interface UserRepository {

     List<User> findAll();

     Optional<User> findById(Integer id);

     int deleteById(Integer id);

     int insert(User user);

     int update(User user);
}
