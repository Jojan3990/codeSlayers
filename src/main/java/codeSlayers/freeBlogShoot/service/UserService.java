package codeSlayers.freeBlogShoot.service;

import codeSlayers.freeBlogShoot.dto.UserDTO;

import java.util.List;

//functionality releated to user
public interface UserService {
    UserDTO addUser(UserDTO userDTO);//create
    UserDTO findById(int id);
    List<UserDTO> findAll(); // Retrieve
    UserDTO updateUser(UserDTO userDTO); //update
    void deleteUser(int id); //delete
}
