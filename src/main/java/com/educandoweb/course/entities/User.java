package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;
//5 passo serializable
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    //1 passo
    private Long Id;
    private String name;
    private String email;
    private String  phone;
    private String password;

    // 2 passo
    public User(){

    }

    public User(Long id, String email, String name, String password, String phone) {
        super();
        this.Id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }
    //3 passo
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    // 4 passo
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(Id, user.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }
}
