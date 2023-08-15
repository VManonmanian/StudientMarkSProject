package com.marksheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marksheet.Dao.MarkSheetDao;
import com.marksheet.entity.MarkSheet;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao markSheetDao;
	public String setMark(MarkSheet markSheet) {
		// TODO Auto-generated method stub
		markSheet.setSem1Total(markSheet.getSem1Theory()+markSheet.getSem1Practicals());
		markSheet.setSem2Total(markSheet.getSem2Practicals()+markSheet.getSem2Theory());
		return markSheetDao.setMark(markSheet);
	}
	public String setAllMarks(List<MarkSheet> marks) {
		marks.forEach(x-> {x.setSem1Total(x.getSem1Theory()+x.getSem1Practicals());
			x.setSem2Total(x.getSem2Practicals()+x.getSem2Theory());
		});
		return markSheetDao.setAllMarks(marks);		
	}
	public List<MarkSheet> getAllMark() {
		// TODO Auto-generated method stub
		return markSheetDao.getAllMark();
	}
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		return markSheetDao.deleteById(id);
	}
	public MarkSheet getByRollNo(int rollNo) {
		return markSheetDao.getByRollNo(rollNo);
	}

}
