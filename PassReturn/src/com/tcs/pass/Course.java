package com.tcs.pass;
	
public class Course{
	public void show(UI object){
		System.out.println("course id is"+ object.getCourdeId());
		System.out.println("course name is"+object.getCoursename());
		System.out.println("author is "+object.getAuthor());
		System.out.println("description is"+object.getDesc());
		
	}
	
	
	public TimeTable timeTable(){
		TimeTable object2=new TimeTable();
		object2.setCourseName("java");
		object2.setDuration((byte)4);
		object2.setRoomNo((byte)10);
		object2.setTeacherName("Amit Sir");
		object2.setTime("10 a.m");
		return object2;
		
	}
}

	
