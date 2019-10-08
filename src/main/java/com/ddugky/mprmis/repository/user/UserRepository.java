package com.ddugky.mprmis.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ddugky.mprmis.model.user.UserMaster;

public interface UserRepository extends JpaRepository<UserMaster, String> {
	UserMaster findByLoginId(String loginId);
}
