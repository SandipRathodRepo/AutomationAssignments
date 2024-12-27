package com.java.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignmen3_CollectionsFramework_copy {

	public static void main(String[] args) {
		
		//********  student Details ****************************************************************
		System.out.println("**************  Start of  Student Map  *************** ");
		
		Map<String, String> student1Map = new LinkedHashMap<String, String>();
		Map<String, String> student2Map = new LinkedHashMap<String, String>();
		Map<String, String> student3Map = new LinkedHashMap<String, String>();
		
		System.out.println(student1Map);
		System.out.println(student2Map);
		System.out.println(student3Map);

		//Map To Store All information/Data of Student1
		student1Map.put("Name", "John Doe");
		student1Map.put("age", "20");
		student1Map.put("Gender", "Male");
		student1Map.put("RollNumber", "S12345");
		student1Map.put("grade", "A");
		student1Map.put("Major", "Computer	Science");
		student1Map.put("GPA", "3.8");
		student1Map.put("Email", "John@example.com");
		student1Map.put("Contact Number", "9999997777");
		student1Map.put("Address", "123 Elm St");
		
		System.out.println(student1Map);
		System.out.println(student2Map);
		System.out.println(student3Map);

		//Map To Store All information/Data of Student2
		student2Map.put("Name", "JaneSmith");
		student2Map.put("age", "21");
		student2Map.put("Gender", "Female");
		student2Map.put("RollNumber", "S12346");
		student2Map.put("grade", "B");
		student2Map.put("Major", "Mathematics");
		student2Map.put("GPA", "3.5");
		student2Map.put("Email", "jane@example.com");
		student2Map.put("Contact Number", "9999996666");
		student2Map.put("Address", "456 Oak St");

		System.out.println(student1Map);
		System.out.println(student2Map);
		System.out.println(student3Map);
		
		//Map To Store All information/Data of Student3
		student3Map.put("Name", "MikeBrown");
		student3Map.put("age", "22");
		student3Map.put("Gender", "Male");
		student3Map.put("RollNumber", "S12347");
		student3Map.put("grade", "A");
		student3Map.put("Major", "Physics");
		student3Map.put("GPA", "3.9");
		student3Map.put("Email", "mike@example.com");
		student3Map.put("Contact Number", "9999991111");
		student3Map.put("Address", "789 Pine St");
		
		System.out.println(student1Map);
		System.out.println(student2Map);
		System.out.println(student3Map);
		System.out.println("                          ");
		System.out.println(" End of Student Map  ======================================================== ");
		
		//********   Employee Details ****************************************************************
		System.out.println("**************  Start of  Employee Map  *************** ");
		
		Map<String, String> employee1Map = new LinkedHashMap<String, String>();
		Map<String, String> employee2Map = new LinkedHashMap<String, String>();
		Map<String, String> employee3Map = new LinkedHashMap<String, String>();

		System.out.println(employee1Map);
		System.out.println(employee2Map);
		System.out.println(employee3Map);

		//Map To Store All information/Data of Employee1 
		employee1Map.put("Employee Id", "E001");
		employee1Map.put("Name", "Alice Green");
		employee1Map.put("age", "30");
		employee1Map.put("Gender", "Female");
		employee1Map.put("Department", "Engineering Marketing");
		employee1Map.put("position", "Software Engineer ");
		employee1Map.put("Salary", "75000");
		employee1Map.put("Email", "alice@example.com");
		employee1Map.put("Contact Number", "9876544613");
		
		System.out.println(employee1Map);
		System.out.println(employee2Map);
		System.out.println(employee3Map);
		
		//Map To Store All information/Data of Employee2
		employee2Map.put("Employee Id", "E002");
		employee2Map.put("Name", "Bob Johnson");
		employee2Map.put("age", "35");
		employee2Map.put("Gender", "Male");
		employee2Map.put("Department", "Marketing");
		employee2Map.put("position", "Marketing Manager");
		employee2Map.put("Salary", "85000");
		employee2Map.put("Email", "bob@example.com");
		employee2Map.put("Contact Number", "9876544614");
		
		System.out.println(employee1Map);
		System.out.println(employee2Map);
		System.out.println(employee3Map);

		//Map To Store All information/Data of Employee3
		employee3Map.put("Employee Id", "E003");
		employee3Map.put("Name", "Carol White");
		employee3Map.put("age", "28");
		employee3Map.put("Gender", "Female");
		employee3Map.put("Department", "Sales");
		employee3Map.put("position", "Sales Executive");
		employee3Map.put("Salary", "65000");
		employee3Map.put("Email", "carol@example.com");
		employee3Map.put("Contact Number", "9876544615");
		
		System.out.println(employee1Map);
		System.out.println(employee2Map);
		System.out.println(employee3Map);
		System.out.println(" End of  Employee Map  ==================================================== ");

		//********   Product Details ****************************************************************
		
		System.out.println("**************  Start of  Product Map  *************** ");
		Map<String, String> product1Map = new LinkedHashMap<String, String>();
		Map<String, String> product2Map = new LinkedHashMap<String, String>();
		Map<String, String> product3Map = new LinkedHashMap<String, String>();
		
		System.out.println(product1Map);
		System.out.println(product2Map);
		System.out.println(product3Map);
		
		//Map To Store All information/Data of  Product1 Details
		product1Map.put("ProducID", "P001");
		product1Map.put("Name", "Laptop");
		product1Map.put("Category", "Electronics");
		product1Map.put("Price", "$1,200");
		product1Map.put("Stock Quantity", "50");
		product1Map.put("Supplier", "Tech Supplier");
		product1Map.put("Warranty", "2 years");
		product1Map.put("Rating", "4.5");
		product1Map.put("Manufacturing Date", "15-03-2023");
		product1Map.put("Expiry Date", "15-01-2025");

		System.out.println(product1Map);
		System.out.println(product2Map);
		System.out.println(product3Map);
		
		//Map To Store All information/Data of Product2 Details
		product2Map.put("ProducID", "P002");
		product2Map.put("Name", "Desk chair");
		product2Map.put("Category", "Furniture");
		product2Map.put("Price", "$150");
		product2Map.put("Stock Quantity", "200");
		product2Map.put("Supplier", "Office Details");
		product2Map.put("Warranty", "1 years");
		product2Map.put("Rating", "4");
		product2Map.put("Manufacturing Date", "10-02-2023");
		product2Map.put("Expiry Date", "NA");
		
		System.out.println(product1Map);
		System.out.println(product2Map);
		System.out.println(product3Map);
		
		//Map To Store All information/Data of Product3 Details
		product3Map.put("ProducID", "P003");
		product3Map.put("Name", "Cofee Maker");
		product3Map.put("Category", "Kitchen");
		product3Map.put("Price", "$75");
		product3Map.put("Stock Quantity", "100");
		product3Map.put("Supplier", "KitchenWorld");
		product3Map.put("Warranty", "6 Months");
		product3Map.put("Rating", "4.2");
		product3Map.put("Manufacturing Date", "20-03-2023");
		product3Map.put("Expiry Date", "20-03-2024");
		
		System.out.println(product1Map);
		System.out.println(product2Map);
		System.out.println(product3Map);
		System.out.println("  End of  product Map  ================================================= ");

		// List to Store All the Maps of Student Details, employee details, product details
		
		List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
		System.out.println(studentList);
		studentList.add(student1Map);
		studentList.add(student2Map);
		studentList.add(student3Map);
		System.out.println(studentList);
		
		System.out.println("............................ studentList  ....................... ");
		System.out.println(studentList.get(0));
		System.out.println(studentList.get(1));
		System.out.println(studentList.get(2));
		//System.out.println(studentList.get(0).get("Name"));
		
		List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();
		
		employeeList.add(employee1Map);
		employeeList.add(employee2Map);
		employeeList.add(employee3Map);
		
		System.out.println(" ............................employeeList  ....................... ");
		System.out.println(employeeList.get(0));
		System.out.println(employeeList.get(1));
		System.out.println(employeeList.get(2));
		
		List<Map<String, String>> productList = new ArrayList<Map<String, String>>();
		productList.add(product1Map);
		productList.add(product2Map);
		productList.add(product3Map);
		
		System.out.println(" .............................productList  ....................... ");
		System.out.println(productList.get(0));
		System.out.println(productList.get(1));
		System.out.println(productList.get(2));
		
		Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
		System.out.println("::::::::::::::::::::::: data map ::::::::::::::::::::::::::::::::" +data);
		System.out.println(data);
		
		data.put("StudentData", studentList);
		data.put("EmployeeData", employeeList);
		data.put("ProductData", productList);
		
		System.out.println(data.get("StudentData"));
		System.out.println(data.get("EmployeeData"));
		System.out.println(data.get("ProductData"));
		
		
		System.out.println(data.get("ProductData").get(1).get("Supplier"));
		
	}
	
	

}
