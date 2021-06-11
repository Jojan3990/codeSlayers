package codeSlayers.freeBlogShoot.service.impl;

import codeSlayers.freeBlogShoot.dto.UserDTO;
import codeSlayers.freeBlogShoot.model.User;
import codeSlayers.freeBlogShoot.repository.UserRepository;
import codeSlayers.freeBlogShoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
@RestController
@Component
@Configuration
public class UserServiceImpl implements UserService {

    @Autowired //this is also dependency injection to use userrepository we need autowired
    private UserRepository userRepository;

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        User user=new User(userDTO); // copy user data to user
        User savedUser = userRepository.save(user) ; // save to database
        UserDTO savedUserDTO=new UserDTO(savedUser); //copy user data to user
        return savedUserDTO;
    }

    @Override
    public UserDTO findById(int id) {
        return null;
    }

    @Override
    public List<UserDTO> findAll() {
        List<User> users=userRepository.findAll();
        List<UserDTO> userDTOS=new ArrayList<>();

        for(User user : users){
            UserDTO userDTO=new UserDTO(user);//copy user to user DTO
            userDTOS.add(userDTO);//adding each uer data to list
        }
        return  userDTOS;
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
