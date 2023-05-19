package com.stf.page.model.dao;

import java.util.List;

import com.stf.page.model.dto.Teacher_career;

// 강사와 관련된 쿼리를 처리합니다.
public interface InstructorDao {
	
	// 종목 강사 조회
	List<Teacher_career> selectList(String exercise);
		
	// 강사 이력 조회
	Teacher_career selectCareer(String exercise);
	
}
