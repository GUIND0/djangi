package ml.djangi.app.Djangi.service;

import ml.djangi.app.Djangi.model.User;
import ml.djangi.app.Djangi.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto userRegistrationDto);
}
