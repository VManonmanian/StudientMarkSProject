package com.marksheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marksheet.entity.MarkSheet;
import com.marksheet.service.MarkSheetService;

@RestController
public class MarkSheetController {
	@Autowired
	MarkSheetService markSheetSer;
	@PostMapping("/postMark")
	public String setMark(@RequestBody MarkSheet mark) {
		return markSheetSer.setMark(mark);
	}
	@PostMapping("/PostAllMarks")
	public String setAllMarks(@RequestBody List<MarkSheet> marks) {
		return markSheetSer.setAllMarks(marks);		
	}
	@GetMapping("/GetAllMarks")
	public List<MarkSheet> getAllMark() {
		return markSheetSer.getAllMark();
	}
	@DeleteMapping("/DeletById/{id}")
	public String deletById(@PathVariable int id) {
		return markSheetSer.deleteById(id);
	}
	@GetMapping("/getByRollNo/{rollNo}")
	public MarkSheet getByRollNo(@PathVariable int rollNo) {
		return markSheetSer.getByRollNo(rollNo);
	}

}
			