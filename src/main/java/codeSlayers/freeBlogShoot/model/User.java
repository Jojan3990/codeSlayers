package codeSlayers.freeBlogShoot.model;

// map to database
import codeSlayers.freeBlogShoot.dto.UserDTO;

import javax.persistence.*;

@Entity // as a object maps to database
@Table(name="user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //in user class identity tyoe is increased
    private int id; // this is as primary key
    private String username;
    private String password;
    private String email;
    private String firstname;
//    @Column(name="my_last_name")  we can also set like this but we don't normally use it
    private String lastname;
    private String address;


    public User() {
    }

    public User(int id,String username, String password, String email, String firstname, String lastname, String address) {
        this.id=id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public User(UserDTO userDTO){
        this.id=userDTO.getId();
        this.username=userDTO.getUsername();
        this.password=userDTO.getPassword();
        this.email=userDTO.getEmail();
        this.firstname=userDTO.getFirstname();
        this.lastname=userDTO.getLastname();
        this.address=userDTO.getAddress();
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
