package com.example.demoDraft.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/users")

public class UserController {

    @Autowired

    private UserRepository userRepository;

    @GetMapping

    public List<User> getAllUsers() {

        return userRepository.findAll();

    }

    @GetMapping("/{id}")

    public User getUserById(@PathVariable Long id) {

        return userRepository.findById(id)

                .orElse(null); // Return null if user not found

    }

    @DeleteMapping("/{id}")

    public String deleteUser(@PathVariable Long id) {

        userRepository.deleteById(id);

        return "User with ID " + id + " deleted successfully";

    }

    @PostMapping

    public String createUser(@RequestBody User user) {

        userRepository.save(user);

        return "User created successfully";

    }

    @PutMapping("/{id}")

    public String updateUser(@PathVariable Long id, @RequestBody User userDetails) {

        User user = userRepository.findById(id)

                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));

        user.setFirstName(userDetails.getFirstName());

        user.setLastName(userDetails.getLastName());

        user.setEmail(userDetails.getEmail());

        userRepository.save(user);

        return "User updated successfully";

    }

}