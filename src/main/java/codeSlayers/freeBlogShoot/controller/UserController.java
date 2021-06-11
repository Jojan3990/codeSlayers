package codeSlayers.freeBlogShoot.controller;

import codeSlayers.freeBlogShoot.dto.UserDTO;
import codeSlayers.freeBlogShoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") //if in port you do /user it goes here and some operation is performed in UserController
public class UserController {

    @Autowired
    private UserService userService;

//    service we have created from server we map URL here in controller or also providing API or create API
    @PostMapping //to add new data from controller you can also use @PostMapping("/addUser")
    public UserDTO addUser( @RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }

    @GetMapping // to get data from database
    public List<UserDTO> getAll(){
        return userService.findAll();
    }
}
