package com.example.demoDraft.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    <UserInfo> UserInfo findByUsername(String username);
    // You can define additional query methods here if needed
}
