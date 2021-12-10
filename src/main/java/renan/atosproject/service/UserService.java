package renan.atosproject.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import renan.atosproject.model.User;
import renan.atosproject.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}