package com.stf.page.model.dao;

import java.util.List;

import com.stf.page.model.dto.Exercise;
import com.stf.page.model.dto.Program;

// 수업과 관련된 쿼리를 처리합니다.
public interface LectureDao {

	// 종목별 정보 조회
	Exercise selectExercise(int exercise_index);

	// 종목별 강의목록 조회
	List<Program> exerciseList(int exercise_index);

	// 강의 참가인원 1 증가
	void update_cnt(int lecture_index);

	// 강의 참가인원 1 감소
	void update_cnt2(int lecture_index);
}
