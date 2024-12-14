package com.xworkz.xworkzLogin.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.*;

@Data
@Entityu@Component
@RequiredArgsConstructor
@Table(name="xworkz_page")
public class LoginEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="confirmPassword")
    private String confirmPassword;

    @Column(name="phoneNo")
    private Long phoneNo;

}
