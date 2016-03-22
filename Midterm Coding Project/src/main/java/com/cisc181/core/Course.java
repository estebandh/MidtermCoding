package com.cisc181.core;
import java.util.UUID;
import com.cisc181.eNums.eMajor;
public class Course {
	private UUID courseID;
	private String courseName;
	private int gradePoints;
	private eMajor major;
	
	public Course(UUID courseID, String courseName, int gradePoints, eMajor major){
		this.courseID=courseID;
		this.courseName=courseName;
		this.gradePoints=gradePoints;
		this.major=major;
	}

	public UUID getCourseID() {
		return courseID;
	}
	

	public void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getGradePoints() {
		return gradePoints;
	}

	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}

	public eMajor getMajor() {
		return major;
	}

	public void setMajor(eMajor major) {
		this.major = major;
	}
	
}
