package com.cisc181.core;
import java.util.UUID;

public class Enrollment {
	private UUID sectionID;
	private UUID studentID;
	private UUID enrollmentID;
	private double grade;
	
	public UUID getSectionID() {
		return sectionID;
	}

	public void setSectionID(UUID sectionID) {
		this.sectionID = sectionID;
	}

	public UUID getStudentID() {
		return studentID;
	}

	public void setStudentID(UUID studentID) {
		this.studentID = studentID;
	}

	public UUID getEnrollmentID() {
		return enrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		this.enrollmentID = enrollmentID;
	}

	private Enrollment() {	

		enrollmentID= UUID.randomUUID();
	}
	
	public Enrollment(UUID section, UUID student) {
		this();
		studentID=student;
		sectionID=section;	
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public double getGrade() {
		return grade;
	}
	
	
	
}
