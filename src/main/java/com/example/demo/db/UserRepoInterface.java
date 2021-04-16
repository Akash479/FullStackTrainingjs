package com.example.demo.db;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepoInterface extends  JpaRepository<UserModel, Integer> {
	
	//@Query("select u from UserModel u where u.userName = :userName and u.passWord = :Password")
	@Query(value="select *  from user_model um  where um.user_name = :userName and um.pass_word = :Password",nativeQuery = true)
	public UserModel getByUserNameAndPassWord(String userName,String Password);

	
	@Query("select u from UserModel u where u.userName = :userName")
	public UserModel findByUserName(String userName);



	

	

}
