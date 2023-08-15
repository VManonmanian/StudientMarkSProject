package com.marksheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.marksheet.entity.MarkSheet;

public interface MarkSheetRepository extends JpaRepository<MarkSheet,Integer>{
	@Query(value="select * from mark_sheet where roll_number like ?",nativeQuery=true)
	public MarkSheet getByRollNo(int rollNo);

}
