package com.ducat.uad;
class Shape{
	void draw(){
		System.out.println("draw of shape");
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
	public static void main(String args[]){
		
	}
	}

	


