package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
    @Id
    private int id;
    @Column(length =50,name="user")
    private String username;
    @Column(length = 20,name="pwd")
    private String password;

    public User() { }


    public void setId(int id) {
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public String getPassword() {
        return password;
    }
}
