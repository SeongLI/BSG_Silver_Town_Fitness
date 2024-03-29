package com.stf.page.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stf.page.model.dao.InstructorDao;
import com.stf.page.model.dto.Teacher;

@Service
public class InstructorServiceImpl implements InstructorService{

	@Autowired
	private InstructorDao instructorDao;
	
	// 종목 강사 조회
	public List<Teacher> selectList(int exercise_name){
		return instructorDao.selectList(exercise_name); 
	}
	
	

}
