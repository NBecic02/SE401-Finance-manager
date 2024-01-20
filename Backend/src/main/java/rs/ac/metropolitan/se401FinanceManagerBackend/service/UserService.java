package rs.ac.metropolitan.se401FinanceManagerBackend.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.User;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.UserDto;


public interface UserService extends UserDetailsService {

    UserDto registerUser(UserDto user);

    User findUserByUsername(String username);
}
