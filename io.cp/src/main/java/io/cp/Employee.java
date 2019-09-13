package io.cp;

import java.util.ArrayList;
import java.util.List;

public class Employee {
 private String Name;
 private String dept;
 private String sal;
 private List<Employee> sub;
	
	// i am composite pattern
 public Employee(String Name,String dept,String sal) {
	 sub = new ArrayList<Employee>();
     this.dept = dept;
     this.Name = Name;
     this.sal = sal;
     }
 public void add(Employee e) {
	 sub.add(e);
		 
	 
 }
 public void remove(Employee e) {
	 sub.remove(e);
		 
	 
 }
 
 List<Employee> getSub(){
	 return sub;
 }
 public String toString() {
	
	 return ("name"+Name+"\n Dept"+ dept+"saly"+sal);
 }
 
 
}
