package com.tcs.pass;

public class TimeTable {
	String courseName;
	String time;
	String TeacherName;
	byte roomNo;
	byte duration;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public byte getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(byte roomNo) {
		this.roomNo = roomNo;
	}
	public byte getDuration() {
		return duration;
	}
	public void setDuration(byte i) {
		this.duration = i;
	}
	
}

