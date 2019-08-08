package com.wx.authservice.dao;


import com.wx.authservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
