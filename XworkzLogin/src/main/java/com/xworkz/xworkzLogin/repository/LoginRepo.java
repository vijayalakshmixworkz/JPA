package com.xworkz.xworkzLogin.repository;

import com.xworkz.xworkzLogin.entity.LoginEntity;

public interface LoginRepo {
    boolean save(LoginEntity loginEntity);
}
