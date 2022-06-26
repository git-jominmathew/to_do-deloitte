package com.deloitte.todo.repository;

import com.deloitte.todo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    Optional<User> findById(Integer userId);

    @Query("from User  where userName=:inp")
    User findByName(@Param("inp") String inp);
}
