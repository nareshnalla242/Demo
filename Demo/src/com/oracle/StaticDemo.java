package com.oracle;
class Emp{
	int rollno;
	double salary;
	
static	String ceo;

	public   void show() {
		
	}
}
public class StaticDemo{
	public static void main(String[] args) {
		Emp emp = new Emp();
        emp.rollno=73;
          emp.salary=40000;
           Emp.ceo="rakesh";
            Emp emp2 = new Emp();
            emp2.rollno=83;
            
            emp2.salary=9333;
            Emp.ceo="rajesh";
            //emp2.ceo="raju";
            emp.show();
            emp2.show();
            
	}
}