class Shape{
	int x;
	void draw(){
		int  x=0;//local variable must intialized before use
		System.out.println("draw of shape"+"x is"+x);//
	}
	void rotate(){
		System.out.println("rotate of shape");
	}}
	class Circle extends Shape{
		@Override
		void draw(){
			System.out.println("circle draw");
		}
		void radius(){
			System.out.println("radius of circle");
		}
	}
	class Square extends Shape{
		@Override
		void draw(){
			System.out.println("square draw");
		}
		void sides(){
			System.out.println("square sides");
		}
	}
	public class Game{
		void caller(Shape shape){
			// now we fix the dry principle here
			shape.draw();
			shape.rotate();
			if(shape instanceof Circle){//instance of to know the object is from which class
				Circle c=(Circle)shape;//downcasting
				//downcasting is possible only when there is upcasting
				c.radius();
			}
			if(shape instanceof Square){
				Square s=(Square)shape;
				s.sides();
			}
		}
	public static void main(String args[]){
		//upcasting that is narrowing from circle to shape
		//here we are breaking the dry principle; 
		/*Shape shape=new Circle();
		shape.draw();
		shape.rotate();
		Shape shape1=new Square(); 
		shape1.draw();
		shape1.rotate();*/
		Game game=new Game();
		game.caller(new Circle());
		game.caller(new Square());
		Shape s=new Shape();
		System.out.println("x is"+s.x);
		
	}
	}

	


