package mx.edu.utez.GEINMA.user.controller;

import mx.edu.utez.GEINMA.user.model.User;
import mx.edu.utez.GEINMA.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"*"})
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public ResponseEntity<Message>getAll(){
        return userService.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Message>save(@RequestBody UserDTO userDTO){
        return userService.save(new User(
                userDTO.getEmail(),
                passwordEncoder.encode(userDTO.getPassword()),
                userDTO.getPerson(),
                userDTO.getRole()
        ));
    }

    @PutMapping("/")
    public ResponseEntity<Message>update(@RequestBody UserDTO userDTO){
        return userService.update(new User(userDTO.getId(), userDTO.getEmail(), userDTO.getPassword(), userDTO.getPerson(), userDTO.getRole()));
    }
}