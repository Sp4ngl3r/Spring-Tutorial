package com.chat.app.ChattingApp.model;

import javax.persistence.*;
import static javax.persistence.GenerationType.*;

@Entity
@Table(
        name="user_details",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "user_email_unique",
                        columnNames = "email"
                )
        }
)
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "user_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    Long uid;

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    String name;

    @Column(
            name = "password",
            nullable = false,
            columnDefinition = "TEXT"
    )
    String password;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
//            unique = true
    )
    String email;

    @Column(
            name = "phone_no",
            nullable = false
    )
    Long phoneNo;

    public User(String name, String password, Long phoneNo, String email) {
        this.name = name;
        this.password = password;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public User() {

    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
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

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}
