package com.deloitte.todo.service;

import com.deloitte.todo.inputs.UserInput;
import com.deloitte.todo.model.User;
import com.deloitte.todo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String saveUser(UserInput userInput){
        User user = new User(userInput.getName(),userInput.getPassword());
        userRepository.save(user);
        Integer userId = getUser(userInput.getName());
        return "User id created is -> "+userId;
    }

    public User getUser(Integer userId){
        return userRepository.findById(userId).orElseThrow(()-> new RuntimeException("user does not exists"));
    }

    public Integer getUser(String name) {
        User user = userRepository.findByName(name);
        return user.getId();
    }
}
