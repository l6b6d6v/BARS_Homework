package ru.lebedevbars.security.details;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.lebedevbars.entity.User;
import ru.lebedevbars.repository.UserRepos;


@Component(value = "customUserDetailsService")
//@Primary
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepos userRepos;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepos.findByEmail(email);

        if (user != null) {
            return new UserDetailsImpl(user);
        } else
            throw new UsernameNotFoundException("User not found!");
        }
}
