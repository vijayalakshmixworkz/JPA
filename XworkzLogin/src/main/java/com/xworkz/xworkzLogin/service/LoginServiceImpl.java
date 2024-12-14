package com.xworkz.xworkzLogin.service;

import com.xworkz.xworkzLogin.dto.LoginDTO;
import com.xworkz.xworkzLogin.entity.LoginEntity;
import com.xworkz.xworkzLogin.repository.LoginRepo;
import com.xworkz.xworkzLogin.repository.LoginRepoImpl;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Override
    public boolean save(LoginDTO loginDTO) {
        if (loginDTO == null) {
            System.out.println("DTO is null.");
        return false;
    }
        boolean isValid = true;
        if (loginDTO.getName() == null || !loginDTO.getName().matches("^[a-zA-Z\\s]{10,}$")) {
            System.out.println("Invalid name. It must be at least 10 characters and contain no special characters.");
            isValid = false;
        }
        if (loginDTO.getAge() <= 18) {
            System.out.println("Invalid age. Age must be greater than 18.");
            isValid = false;
        }
        if (loginDTO.getEmail() == null || !loginDTO.getEmail().matches("^[\\w.-]+@gmail\\.com$")) {
            System.out.println("Invalid email. It must be a valid Gmail address.");
            isValid = false;
        }
        if (loginDTO.getPassword() == null || !loginDTO.getPassword().matches("^(?=.*[!@#$%^&*()_+])[A-Za-z\\d!@#$%^&*()_+]{7,}$")) {
            System.out.println("Invalid password. It must be at least 7 characters long and contain at least 2 special characters.");
            isValid = false;
        }
        if (!loginDTO.getPassword().equals(loginDTO.getConfirmPassword())) {
            System.out.println("Password and confirm password do not match.");
            isValid = false;
        }

        if (loginDTO.getPhoneNo() == null || !loginDTO.getPhoneNo().toString().matches("^9\\d{9}$")) {
            System.out.println("Invalid phone number. It must start with 9 and be exactly 10 digits long.");
            isValid = false;
        }

        if (isValid) {
            LoginEntity loginEntity = new LoginEntity();
//            loginEntity.setName(loginDTO.getName());
//            loginEntity.setAge(loginDTO.getAge());
//            loginEntity.setEmail(loginDTO.getEmail());
//            loginEntity.setPassword(loginDTO.getPassword());
//            loginEntity.setConfirmPassword(loginDTO.getConfirmPassword());
//            loginEntity.setPhoneNo(loginDTO.getPhoneNo());

            LoginRepo loginRepo = new LoginRepoImpl();
            loginRepo.save(loginEntity);
            System.out.println("loginEntity: " + loginEntity.toString());
        }

        return isValid;
    }

}

