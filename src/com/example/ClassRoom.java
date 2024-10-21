package com.example;

public class ClassRoom {
	
	private String standard;
	private int rollNo;
	private String Section;
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public ClassRoom(String standard, int rollNo, String section) {
		
		this.standard = standard;
		this.rollNo = rollNo;
		Section = section;
	}
	
	
	public ClassRoom() {
		
	}
	
	
	@Override
	public String toString() {
		return "ClassRoom [standard=" + standard + ", rollNo=" + rollNo + ", Section=" + Section + "]";
	}

}

