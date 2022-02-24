
package ru.lebedevbars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lebedevbars.entity.Dogovor;
import ru.lebedevbars.entity.User;

import java.util.UUID;


public interface UserRepos extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

