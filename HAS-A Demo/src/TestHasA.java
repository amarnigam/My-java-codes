class Student{
	// 1.this type of HASA relationship is called composition
	// we do not know when finalize will call
	/*Course mca;
	Student(){
		 mca=new Course();
		
	}
	void takeCourse(){
		mca.getCourse();
	}*/
	//2..this is a type of HASA relationship is called aggregation
	Student(Course course){
	course.getCourse();
	}
	protected void finalize(){
		System.out.println("student object destroyed");
	}
	
}
class Course {
	void getCourse(){
		System.out.println("this is course bca");
			}
	@Override
	protected void finalize(){
	//super.finalize();
	System.out.println("course object destroyed");
	
	}

}
public class TestHasA {

	public static void main(String[] args) {
		Course mca=new Course();
		Student ram=new Student(mca);
		//ram.takeCourse();
		ram=null;
		System.gc();
		for(int i=0;i<10;i++){
			System.out.println("I is "+i);
		}

	}

}
