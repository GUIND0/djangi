package ml.djangi.app.Djangi.service;

import ml.djangi.app.Djangi.model.User;
import ml.djangi.app.Djangi.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
