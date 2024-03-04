package com.india.basics;

public class Variables_Ex {
	static	int code=91;//global variable,static   4 bytes
		int eid=123;	//global variable ,instance  4 bytes
	public static void main(String[] args) {
		int age=31;//local variable   method 
		System.out.println(Variables_Ex.code);//static variable accessing by using classname 
		Variables_Ex obj=new Variables_Ex();//instance property will get memory 
		System.out.println(obj.eid);//instance variable accessing by using obj reference
		System.out.println(age);
	}

}
