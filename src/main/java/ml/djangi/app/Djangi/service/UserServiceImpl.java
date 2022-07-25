package ml.djangi.app.Djangi.service;

import ml.djangi.app.Djangi.model.Role;
import ml.djangi.app.Djangi.model.User;
import ml.djangi.app.Djangi.repository.UserRepository;
import ml.djangi.app.Djangi.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto userRegistrationDto) {
        User user = new User(
                userRegistrationDto.getFirstname(),
                userRegistrationDto.getLastname(),
                userRegistrationDto.getEmail(),
                userRegistrationDto.getPassword(),
                Arrays.asList(new Role("ROLE_USER"))
                );
        return userRepository.save(user);
    }
}
