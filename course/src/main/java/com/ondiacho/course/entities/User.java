package com.ondiacho.course.entities;

import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = 1L;    
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

    public User() {

    }

    public User(Long _id, String _name, String _email, String _phone, String _password) {
        super();
        this.id = _id;
        this.name = _name;
        this.email = _email;
        this.phone = _phone;
        this.password = _password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long _id) {
        this.id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        this.email = _email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String _phone) {
        this.phone = _phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String _password) {
        this.password = _password;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null){
            if(other.id !=  null)
                return false;
        }else if (!id.equals(other.id))
            return false;
        return true;
    }
    
    
}
