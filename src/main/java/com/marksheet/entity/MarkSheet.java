package com.marksheet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mark_sheet")
public class MarkSheet {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int  rollNumber, sem1Theory, sem1Practicals, sem2Theory, sem2Practicals, sem1Total,sem2Total;
	public MarkSheet() {
		super();
	}
	public MarkSheet(int id, int rollNumber, int sem1Theory, int sem1Practicals, int sem2Theory, int sem2Practicals,
			int sem1Total, int sem2Total) {
		super();
		this.id = id;
		this.rollNumber = rollNumber;
		this.sem1Theory = sem1Theory;
		this.sem1Practicals = sem1Practicals;
		this.sem2Theory = sem2Theory;
		this.sem2Practicals = sem2Practicals;
		this.sem1Total = sem1Total;
		this.sem2Total = sem2Total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getSem1Theory() {
		return sem1Theory;
	}
	public void setSem1Theory(int sem1Theory) {
		this.sem1Theory = sem1Theory;
	}
	public int getSem1Practicals() {
		return sem1Practicals;
	}
	public void setSem1Practicals(int sem1Practicals) {
		this.sem1Practicals = sem1Practicals;
	}
	public int getSem2Theory() {
		return sem2Theory;
	}
	public void setSem2Theory(int sem2Theory) {
		this.sem2Theory = sem2Theory;
	}
	public int getSem2Practicals() {
		return sem2Practicals;
	}
	public void setSem2Practicals(int sem2Practicals) {
		this.sem2Practicals = sem2Practicals;
	}
	public int getSem1Total() {
		return sem1Total;
	}
	public void setSem1Total(int sem1Total) {
		this.sem1Total = sem1Total;
	}
	public int getSem2Total() {
		return sem2Total;
	}
	public void setSem2Total(int sem2Total) {
		this.sem2Total = sem2Total;
	}
	@Override
	public String toString() {
		return "MarkSheet [id=" + id + ", rollNumber=" + rollNumber + ", sem1Theory=" + sem1Theory + ", sem1Practicals="
				+ sem1Practicals + ", sem2Theory=" + sem2Theory + ", sem2Practicals=" + sem2Practicals + ", sem1Total="
				+ sem1Total + ", sem2Total=" + sem2Total + "]";
	}
	

}
