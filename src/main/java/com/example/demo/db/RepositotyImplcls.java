package com.example.demo.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public class RepositotyImplcls implements RepositoryImpl {
//	@Autowired
//	JdbcTemplate jdbcTemplate;
	@Autowired
	RepositoryImpl repo;
	
//	@Override
//	public String add() {
//		System.out.println("Safasfs");
//		employee e= new employee();
//		e.setName("samrat");
//		e.setSalary( 800000);
//		 jdbcTemplate.update("INSERT INTO Employee (name, Salary) VALUES ('"+e.getName()+"', '"+e.getSalary()+"')");
//		 return "SucessFully Saved";
//	}
	
	public String add() {
		System.out.println("Safasfs");
		employee e= new employee();
		e.setName("samrat");
		e.setSalary( 6855133);
		// jdbcTemplate.update("INSERT INTO Employee (name, Salary) VALUES ('"+e.getName()+"', '"+e.getSalary()+"')");
		//repo.save(e);
		 save(e);
	 return "SucessFully Saved";
	
	}
	public String updateDataInDb() {
		employee e= new employee();
////	e.setName("varma");
//	System.out.println(e.getName());
//	 //jdbcTemplate.update("update Employee set name='"+e.getName()+"' where id=2 ");
	employee edb= findByName("samrat");
	System.out.println("Before Updating"+edb.getName());
	edb.setName("varma");
	save(edb);
	employee edb2= findByName("varma");
	System.out.println("AfterUpdatoing"+edb2.getName());
	deleteById(1);
	return "SucessFully Upoated";
	}
	
	@Override
	public List<employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<employee> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<employee> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends employee> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends employee> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteInBatch(Iterable<employee> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public employee getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends employee> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends employee> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Page<employee> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends employee> S save(S e) {
		
		// jdbcTemplate.update("INSERT INTO Employee (name, Salary) VALUES ('"+e.getName()+"', '"+e.getSalary()+"')");
		repo.save(e);
		System.out.println("After Saving");
		employee e1=  findByName("samrat");
		System.out.println(e1);
		return e;
	}
	@Override
	public Optional<employee> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void deleteById(Integer id) {
		repo.deleteById(id);
		
	}
	@Override
	public void delete(employee entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll(Iterable<? extends employee> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends employee> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends employee> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends employee> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public <S extends employee> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public employee findByName(String name) {
		employee e=	repo.findByName(name);
		return e;
	}
	

}
