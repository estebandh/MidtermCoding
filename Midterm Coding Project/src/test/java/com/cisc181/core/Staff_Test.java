package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	static Staff staff1 = null;
	static Staff staff2 = null;
	static Staff staff3 = null;
	static Staff staff4 = null;
	static Staff staff5 = null;
	static Staff badNumberStaff = null;
	static Staff badDOBStaff = null;
	@BeforeClass
	public static void setup() {
		try {
			staff1= new Staff("Don", "Juan", "Carlos Senior", new Date(1990, 4, 12), "Candy Cane Lane"
					, "(310)-555-9200", "udel.edu@udel.edu","lots",10, 10000.00, new Date(2000, 5, 10), eTitle.MR);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			staff2=new Staff("Don", "Juan", "Carlos Junior", new Date(1990, 4, 12), "Candy Cane Lane"
					, "(310)-555-9103", "udel.edu@udel.edu","lots",10, 7700.00, new Date(2000, 5, 10), eTitle.MRS);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			staff3=new Staff("Don", "Juan", "Carlos the Third", new Date(1990, 4, 12), "Candy Cane Lane"
					, "(310)-555-0099", "udel.edu@udel.edu","lots",10, 8000, new Date(2000, 5, 10), eTitle.MS);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			staff4=new Staff("Don", "Juan", "Carlos the Fourth", new Date(1990, 4, 12), "Candy Cane Lane"
					, "(310)-555-8222", "udel.edu@udel.edu","lots",10, 15000, new Date(2000, 5, 10), eTitle.MR);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			staff5=new Staff("John", "Graham", "Smith", new Date(1990, 4, 12), "Candy Cane Lane"
					, "(310)-555-1929", "udel.edu@udel.edu","lots",10, 30000, new Date(2000, 5, 10), eTitle.MR);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		staffList.add(staff1);
		staffList.add(staff2);
		staffList.add(staff3);
		staffList.add(staff4);
		staffList.add(staff5);
	}
	
	@Test
	public void Salarytest() {

		double average= (staff1.getSalary()+staff2.getSalary()+staff3.getSalary()+staff4.getSalary()+staff5.getSalary())/5;
		assertEquals(average,14140,0);
	}	
	
	@Test
	public void invalidNumberTest() {
		boolean thrown=false;
		try {
			badNumberStaff= new Staff("Don", "Juan", "Carlos Senior the Slow", new Date(1990, 4, 12), "Candy Cane Lane"
					, "this is a phone number", "udel.edu@udel.edu","lots",10, 10000.00, new Date(2000, 5, 10), eTitle.MR);
		} catch (PersonException e) {
			thrown=true;
			e.printStackTrace();
		}
		assertTrue(thrown);
	}
	
	@Test
	public void invalidDOBTest() {
		boolean thrown=false;
		try {
			badDOBStaff= new Staff("Don", "Juan", "Carlos Senior the Undying", new Date(1800, 4, 12), "Candy Cane Lane"
					, "(301)-555-9012", "udel.edu@udel.edu","lots",10, 10000.00, new Date(2000, 5, 10), eTitle.MR);
		} catch (PersonException e) {
			thrown=true;
			e.printStackTrace();
		}
		assertTrue(thrown);
	}

}
