package com.xworkz.xworkzLogin.service;

import com.xworkz.xworkzLogin.dto.LoginDTO;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    boolean save(LoginDTO loginDTO);
}
