package codeSlayers.freeBlogShoot.dto;

//DTO:- value coming from database is used to map
// while we call API the response we see is DTO
// it helps to filter

import codeSlayers.freeBlogShoot.model.User;

public class UserDTO {
    private int id; // this is as primary key
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    private String address;
    //    e.g
//    private String fullname;

    public UserDTO() {
    }

    public UserDTO(User user){ //import User dont manually tyoe User but use tab which imports
        this.id=user.getId();
        this.username=user.getUsername();
        this.password=user.getPassword();
        this.email=user.getEmail();
        this.firstname=user.getUsername();
        this.lastname=user.getLastname();
        this.address=user.getAddress();
//        eg showing difference between user and userDTO
//        this.fullname=user.getFirstname()+" "+user.getLastname();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
