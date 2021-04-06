package com.example.demo.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceInterface {
	
	@Autowired
	RepositotyImplcls RepoClass;
	@Override
	public String add() {
		return RepoClass.add();
	}

}
