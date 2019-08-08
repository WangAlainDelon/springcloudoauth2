package com.wx.servicehi.repository;


import com.wx.servicehi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
