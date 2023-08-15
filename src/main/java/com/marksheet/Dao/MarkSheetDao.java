package com.marksheet.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marksheet.entity.MarkSheet;
import com.marksheet.repository.MarkSheetRepository;

@Repository
public class MarkSheetDao {	
	@Autowired	
	MarkSheetRepository markSheetRepo;
	public String setMark(MarkSheet markSheet) {
		// TODO Auto-generated method stub
		markSheetRepo.save(markSheet);
		return "mark detals saved successfully";
	}
	public String setAllMarks(List<MarkSheet> marks) {
		markSheetRepo.saveAll(marks);
		return "All the marks are saved successfully";		
	}
	public List<MarkSheet> getAllMark() {
		// TODO Auto-generated method stub
		return markSheetRepo.findAll();
	}
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		markSheetRepo.deleteById(id);
		return "marks deleted successfully";
	}
	public MarkSheet getByRollNo(int rollNo) {
		return markSheetRepo.getByRollNo(rollNo);
	}

}
