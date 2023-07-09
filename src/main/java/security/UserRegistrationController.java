package security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequestMapping("/register")
@Validated
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String registerUser(@Valid @RequestBody UserRegistrationDto registrationDto) {
        // Check if the email is already registered
        if (userService.findByEmail(registrationDto.getEmail()) != null) {
            return "Email already registered";
        }

        // Create a new user and save it
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(),
                registrationDto.getEmail(), registrationDto.getPassword());
        userService.save(registrationDto);

        return "User registered successfully";
    }
}
