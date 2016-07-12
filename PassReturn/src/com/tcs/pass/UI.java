package com.tcs.pass;

public class UI {
	String coursename;
	int courdeId;
	String author;
	String desc;
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCourdeId() {
		return courdeId;
	}
	public void setCourdeId(int courdeId) {
		this.courdeId = courdeId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void show(TimeTable object){
		System.out.println("course name is:"+object.getCourseName());
		System.out.println("teacher name is:"+object.getTeacherName());
		System.out.println("room no is:"+object.getRoomNo());
		System.out.println("time is :"+object.getTime());
		System.out.println("duration is:"+object.getDuration());
		
	}
}


