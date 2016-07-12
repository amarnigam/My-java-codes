import com.tcs.pass.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UI object=new UI();
		object.setAuthor("jhon");
		object .setCourdeId(101);
		object.setCoursename("java");
		object .setDesc("core java");
		Course object1=new Course();
		object1.show(object);
	Course obj=new Course();
	TimeTable table=obj.timeTable();
	UI object2=new UI();
	object2.show(table);
		

	}

}
