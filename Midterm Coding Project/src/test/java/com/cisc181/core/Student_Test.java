package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	static ArrayList<Enrollment> enrollmentList;
	static Section spanishSection1;
	static Section spanishSection2;
	static Section econSection1;
	static Section econSection2;
	static Section chemSection1;
	static Section chemSection2;
	@BeforeClass
	public static void setup() {
		Course spanish101= new Course(UUID.randomUUID(), "Spanish101", 100, eMajor.SPANISH);
		Course econ103= new Course(UUID.randomUUID(), "econ103", 100, eMajor.BUSINESS);
		Course chem350= new Course(UUID.randomUUID(), "chem350", 100, eMajor.CHEM);
		
		ArrayList<Course> courseList=new ArrayList<Course>();
		courseList.add(spanish101);
		courseList.add(econ103);
		courseList.add(chem350);
		
		Semester fall = new Semester(UUID.randomUUID(), new Date(2015, 8, 30), new Date(2015, 12, 20));
		Semester spring = new Semester(UUID.randomUUID(), new Date(2016, 2, 3), new Date(2016, 5, 20));
		
		ArrayList<Semester> year= new ArrayList<Semester>();
		year.add(fall);
		year.add(spring);
		
		spanishSection1= new Section(spanish101.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 25);
		spanishSection2= new Section(spanish101.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 30);
		econSection1= new Section(econ103.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 50);
		econSection2= new Section(econ103.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 312);
		chemSection1= new Section(chem350.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 44);
		chemSection2= new Section(chem350.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 32);
		
		ArrayList<Section> sectionList= new ArrayList<Section>();
		sectionList.add(chemSection1);
		sectionList.add(chemSection2);
		sectionList.add(econSection1);
		sectionList.add(econSection2);
		sectionList.add(spanishSection1);
		sectionList.add(spanishSection2);
		Student stu1 = null;
		Student stu2 = null;
		Student stu3 = null;
		Student stu4 = null;
		Student stu5 = null;
		Student stu6 = null;
		Student stu7 = null;
		Student stu8 = null;
		Student stu9 = null;
		Student stu10 = null;
		try {
			 stu1 = new Student("John", "Graham", "Smith", new Date(1996, 5, 19)
					, eMajor.BUSINESS, "Plumdrop Place", "(520)-555-1234", "fakeEmail@udel.edu");
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 stu2 = new Student("Juan", "Pablo", "Enojosa", new Date(1997, 5, 19)
					, eMajor.COMPSI, "Plumdrop Place", "(520)-555-4312", "fakeEmail@udel.edu");
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 stu3 = new Student("Bob", "John", "Snow", new Date(1997, 10, 19)
					, eMajor.NURSING, "Plumdrop Place", "(310)-555-0912", "fakeEmail@udel.edu");
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 stu4 = new Student("Haley", "Anne", "Birdoes", new Date(1997, 1, 7)
					, eMajor.NURSING, "Plumdrop Place", "(310)-555-1234", "fakeEmail@udel.edu");
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 stu5 = new Student("Tyler", "Tom", "Heintz", new Date(1997, 8, 10)
					, eMajor.BUSINESS, "Plumdrop Place", "(310)-555-1224", "fakeEmail@udel.edu");
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 stu6 = new Student("Bobbby", "Almahenejad", "Gerami", new Date(1996, 7, 25)
					, eMajor.COMPSI, "Plumdrop Place", "(310)-555-5432", "fakeEmail@udel.edu");
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 stu7 = new Student("Emilia", "Lynn", "Delgado", new Date(1995, 12, 9)
					, eMajor.PHYSICS, "Plumdrop Place", "(310)-654-5432", "fakeEmail@udel.edu");
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 stu8 = new Student("Luisa", "Irene", "Delgado", new Date(1999, 6, 20)
					, eMajor.SPANISH, "Plumdrop Place", "(310)-654-5343", "fakeEmail@udel.edu");
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 stu9 = new Student("Michael", "Mary", "Cervantes", new Date(1995, 3, 20)
					, eMajor.SPANISH, "Plumdrop Place", "(310)-654-0909", "fakeEmail@udel.edu");
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 stu10 = new Student("Ben", "Graham", "Gillingham", new Date(1997, 4, 13)
					, eMajor.CHEM, "Plumdrop Place", "(310)-654-1602", "fakeEmail@udel.edu");
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		studentList.add(stu4);
		studentList.add(stu5);
		studentList.add(stu6);
		studentList.add(stu7);
		studentList.add(stu8);
		studentList.add(stu9);
		studentList.add(stu10);
		
		
		enrollmentList= new ArrayList<Enrollment>();
		
		for(Student s: studentList){
			for(Section sec: sectionList){
				enrollmentList.add(new Enrollment(sec.getSectionID(), s.getStudentID()));
			}
		}
		
		for(Enrollment e: enrollmentList){
			e.setGrade(95);
		}
		/*
		 * Change of Major
		 */
		stu7.setMajor(eMajor.NURSING);
		
		
	}
	@Test
	public void gpaTest(){
		double gpa=0;
		if(enrollmentList.get(0).getGrade()>=92) gpa=4.0;
		else if(enrollmentList.get(0).getGrade()>=82) gpa=3.0;
		else if(enrollmentList.get(0).getGrade()>=72) gpa=2.0;
		else if(enrollmentList.get(0).getGrade()>=62) gpa=1.0;
		else gpa=0;
		
		assertEquals(gpa, 4.0,0);
	}
	
	@Test
	public void averageTest(){
		double spanishAverage=0;
		double econAverage=0;
		double chemAverage=0;
		for(Enrollment e: enrollmentList){
			if(e.getSectionID()==chemSection1.getSectionID() || e.getSectionID()==chemSection2.getSectionID()) chemAverage+=e.getGrade();
			if(e.getSectionID()==econSection1.getSectionID() || e.getSectionID()==econSection2.getSectionID()) econAverage+=e.getGrade();
			if(e.getSectionID()==spanishSection1.getSectionID() || e.getSectionID()==spanishSection2.getSectionID()) spanishAverage+=e.getGrade();
		}
		
		spanishAverage=spanishAverage/20;
		econAverage=econAverage/20;
		chemAverage=chemAverage/20;
		
		assertEquals(95, spanishAverage, 0);
		assertEquals(95, econAverage, 0);
		assertEquals(95, chemAverage, 0);
	}
}
	




